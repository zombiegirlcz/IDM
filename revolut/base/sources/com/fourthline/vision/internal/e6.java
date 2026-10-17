package com.fourthline.vision.internal;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EGLConfig f36141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f36142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f36143c;
    private EGLSurface d;

    public e6(@NotNull EGLContext sharedContext, @NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(sharedContext, "sharedContext");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f36142b = EGL14.EGL_NO_CONTEXT;
        this.f36143c = EGL14.EGL_NO_DISPLAY;
        this.d = EGL14.EGL_NO_SURFACE;
        tryInitEglDisplay();
        tryInitEgl();
        tryInitConfig();
        tryInitEglContext(sharedContext);
        this.d = createWindowSurface(surface);
        makeCurrent();
    }

    private final EGLConfig buildConfig() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f36143c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12610, 1, 12344, 12344, 12344, 12344, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("chooseConfig failed");
    }

    private final EGLContext createContext(EGLContext eGLContext) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f36143c, this.f36141a, eGLContext, new int[]{12440, 2, 12344}, 0);
        if (EGL14.eglGetError() != 12288) {
            throw new RuntimeException("eglCreateContext: EGL error");
        }
        Intrinsics.h(eGLContextEglCreateContext);
        return eGLContextEglCreateContext;
    }

    private final EGLSurface createWindowSurface(Surface surface) {
        int[] iArr = {12344};
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        try {
            return EGL14.eglCreateWindowSurface(this.f36143c, this.f36141a, surface, iArr, 0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return eGLSurface;
        }
    }

    private final void destroyContext() {
        EGL14.eglDestroyContext(this.f36143c, this.f36142b);
        this.f36142b = EGL14.EGL_NO_CONTEXT;
    }

    private final void destroyWindowSurface() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface != null) {
            EGLDisplay eGLDisplay = this.f36143c;
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f36143c, eGLSurface);
        }
    }

    private final void makeCurrent() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface != null) {
            EGL14.eglMakeCurrent(this.f36143c, eGLSurface, eGLSurface, this.f36142b);
        }
    }

    private final void makeDefault() {
        EGLDisplay eGLDisplay = this.f36143c;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    private final void tryInitConfig() {
        this.f36141a = buildConfig();
    }

    private final void tryInitEgl() {
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f36143c, iArr, 0, iArr, 1)) {
            throw new RuntimeException("eglInitialize failed");
        }
    }

    private final void tryInitEglContext(EGLContext eGLContext) {
        this.f36142b = createContext(eGLContext);
    }

    private final void tryInitEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f36143c = eGLDisplayEglGetDisplay;
        if (Intrinsics.f(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("eglGetDisplay failed");
        }
    }

    public final void release() {
        makeDefault();
        destroyWindowSurface();
        this.d = EGL14.EGL_NO_SURFACE;
        EGLDisplay eGLDisplay = this.f36143c;
        if (eGLDisplay != null) {
            destroyContext();
            EGL14.eglTerminate(eGLDisplay);
            EGL14.eglReleaseThread();
        }
        this.f36143c = EGL14.EGL_NO_DISPLAY;
        this.f36142b = EGL14.EGL_NO_CONTEXT;
    }

    public final void swap() {
        EGL14.eglSwapBuffers(this.f36143c, this.d);
    }
}
