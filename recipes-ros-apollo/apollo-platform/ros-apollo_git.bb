SUMMARY = "Apollo ROS, which is Apollo-platform"

DESCRIPTION = "The Apollo-platform will cover all the platform level \
support. In the first release, we add the most popular solution \
Robot Operating System (ROS) under ros directory."

#LICENSE = "BSD & Apache-2.0"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/ros/LICENSE;md5=adeed431453d2d5eb74d66ee1239118c"

PV = "2.1.1+gitr${SRCPV}"

DEPENDS = "python-catkin-pkg"

# Still under development
EXCLUDE_FROM_WORLD = "1"

SRC_URI = "git://github.com/ApolloAuto/apollo-platform.git"
SRC_URI += "\
    file://fix-rt-library.patch \
"

SRCREV = "86d9dc6743b496ead18d597748ebabd34a513289"
S = "${WORKDIR}/git"

inherit cmake

do_configure() {
  cd ${S}/ros/
  #TODO
}

do_compile() {
  cd ${S}/ros/
  ./build.sh build
}

do_install() {
  echo "install..."
  #TODO
}
