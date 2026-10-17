package ew;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private b() {
    }

    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return i;
    }

    public static EGLSurface b(EGLDisplay eglDisplay, EGLConfig eglConfig, Surface surface, int[] attributes, a eglApi) {
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(attributes, "surfaceAttrib");
        Intrinsics.checkNotNullParameter(eglApi, "eglApi");
        eglApi.getClass();
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglDisplay, eglConfig, surface, attributes, 0);
        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface.equals(EGL14.EGL_NO_SURFACE)) {
            throw new IllegalStateException(j6.a.q("Unable to create window surface: EGL error: 0x", Integer.toHexString(EGL14.eglGetError())));
        }
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int c(EGLDisplay eglDisplay, EGLSurface eglSurface, int i, a aVar) {
        int[] value = new int[1];
        aVar.getClass();
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        Intrinsics.checkNotNullParameter(value, "value");
        EGL14.eglQuerySurface(eglDisplay, eglSurface, i, value, 0);
        return value[0];
    }
}
