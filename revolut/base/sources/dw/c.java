package dw;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Size;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ew.a f118166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EGLDisplay f118167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLContext f118168c;
    public EGLConfig d;
    public EGLSurface e;
    public Surface f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f118169g;

    public c() {
        this(0);
    }

    public final k a() {
        k kVar;
        ew.a eglApi = this.f118166a;
        k kVar2 = this.f118169g;
        if (kVar2 != null) {
            return kVar2;
        }
        Surface surface = this.f;
        if (surface == null) {
            return null;
        }
        EGLDisplay eglDisplay = this.f118167b;
        if (eglDisplay == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EGLConfig eGLConfig = this.d;
        if (eGLConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        try {
            EGLSurface eglSurface = ew.b.b(eglDisplay, eGLConfig, surface, new int[]{12344}, eglApi);
            Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
            Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
            Intrinsics.checkNotNullParameter(eglApi, "eglApi");
            Size size = new Size(ew.b.c(eglDisplay, eglSurface, 12375, eglApi), ew.b.c(eglDisplay, eglSurface, 12374, eglApi));
            kVar = new k(eglSurface, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException unused) {
            ow.a.a("Unable to create EGL output surface; will retry it");
            kVar = null;
        } catch (IllegalStateException unused2) {
            ow.a.a("Unable to create EGL output surface; will retry it");
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        this.f118169g = kVar;
        try {
            d(kVar.f118193a);
            return kVar;
        } catch (IllegalArgumentException unused3) {
            b();
            return null;
        } catch (IllegalStateException unused4) {
            b();
            return null;
        }
    }

    public final void b() {
        k kVar = this.f118169g;
        if (kVar != null) {
            try {
                ew.a aVar = this.f118166a;
                EGLDisplay eglDisplay = this.f118167b;
                if (eglDisplay == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                EGLSurface eglSurface = kVar.f118193a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
                Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
                EGL14.eglDestroySurface(eglDisplay, eglSurface);
            } catch (RuntimeException e) {
                ow.a.a("Failed to destroy EGL output surface: " + e.getMessage());
            }
        }
        this.f118169g = null;
    }

    public final void c() {
        ew.a eglApi = this.f118166a;
        eglApi.getClass();
        EGLDisplay eglDisplay = EGL14.eglGetDisplay(0);
        this.f118167b = eglDisplay;
        if (eglDisplay == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (eglDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Can't get EGL14 display");
        }
        int[] version = new int[2];
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(version, "version");
        if (!EGL14.eglInitialize(eglDisplay, version, 0, version, 1)) {
            this.f118167b = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Can't initialize EGL14");
        }
        int[] attributes = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, -1, 12339, 5, 12344};
        EGLConfig[] configs = new EGLConfig[1];
        int[] numConfigs = {1};
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(numConfigs, "numConfigs");
        if (!EGL14.eglChooseConfig(eglDisplay, attributes, 0, configs, 0, 1, numConfigs, 0)) {
            throw new IllegalStateException("Can't find a EGLConfig");
        }
        EGLConfig eglConfig = configs[0];
        int[] attributes2 = {12440, 2, 12344};
        if (eglConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(attributes2, "attributes");
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eglDisplay, eglConfig, eGLContext, attributes2, 0);
        this.d = eglConfig;
        this.f118168c = eGLContextEglCreateContext;
        EGLDisplay eglDisplay2 = this.f118167b;
        if (eglDisplay2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(eglDisplay2, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(eglApi, "eglApi");
        int[] attributes3 = {12375, 1, 12374, 1, 12344};
        eglApi.getClass();
        Intrinsics.checkNotNullParameter(eglDisplay2, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(attributes3, "attributes");
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglDisplay2, eglConfig, attributes3, 0);
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("Surface was null");
        }
        this.e = eGLSurfaceEglCreatePbufferSurface;
        d(eGLSurfaceEglCreatePbufferSurface);
    }

    public final void d(EGLSurface eGLSurface) {
        EGLDisplay eglDisplay = this.f118167b;
        if (eglDisplay == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EGLContext eGLContext = this.f118168c;
        if (eGLContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f118166a.getClass();
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        if (!EGL14.eglMakeCurrent(eglDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void e() {
        if (!Intrinsics.f(this.f118167b, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eglDisplay = this.f118167b;
            if (eglDisplay == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            ew.a aVar = this.f118166a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
            EGL14.eglMakeCurrent(eglDisplay, eGLSurface, eGLSurface, eGLContext);
            b();
            EGLSurface eglSurface = this.e;
            if (eglSurface != null && !eglSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGLDisplay eglDisplay2 = this.f118167b;
                if (eglDisplay2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar.getClass();
                Intrinsics.checkNotNullParameter(eglDisplay2, "eglDisplay");
                Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
                EGL14.eglDestroySurface(eglDisplay2, eglSurface);
            }
            this.e = EGL14.EGL_NO_SURFACE;
            EGLDisplay eglDisplay3 = this.f118167b;
            if (eglDisplay3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            EGLContext eglContext = this.f118168c;
            if (eglContext == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(eglDisplay3, "eglDisplay");
            Intrinsics.checkNotNullParameter(eglContext, "eglContext");
            EGL14.eglDestroyContext(eglDisplay3, eglContext);
            this.f118168c = EGL14.EGL_NO_CONTEXT;
            aVar.getClass();
            EGL14.eglReleaseThread();
            EGLDisplay eglDisplay4 = this.f118167b;
            if (eglDisplay4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(eglDisplay4, "eglDisplay");
            EGL14.eglTerminate(eglDisplay4);
            this.f118167b = EGL14.EGL_NO_DISPLAY;
        }
        this.d = null;
        this.f = null;
    }

    public final void f() {
        k kVar = this.f118169g;
        if (kVar == null) {
            return;
        }
        EGLDisplay eglDisplay = this.f118167b;
        if (eglDisplay == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EGLSurface eglSurface = kVar.f118193a;
        ew.a aVar = this.f118166a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        if (EGL14.eglSwapBuffers(eglDisplay, eglSurface)) {
            return;
        }
        aVar.getClass();
        ow.a.a("Failed to swap EGL output surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
        EGLSurface eGLSurface = this.e;
        if (eGLSurface == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d(eGLSurface);
        b();
    }

    public c(int i) {
        ew.a eglApi = ew.a.f129980a;
        Intrinsics.checkNotNullParameter(eglApi, "eglApi");
        this.f118166a = eglApi;
        this.f118167b = EGL14.EGL_NO_DISPLAY;
        this.f118168c = EGL14.EGL_NO_CONTEXT;
        this.e = EGL14.EGL_NO_SURFACE;
    }
}
