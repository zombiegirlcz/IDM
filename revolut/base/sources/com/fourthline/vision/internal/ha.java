package com.fourthline.vision.internal;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.view.Surface;
import com.fourthline.vision.internal.camera.view.glutils.GLDrawer2D;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ha implements Runnable {
    public static final a k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f36324l = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLContext f36326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f36327c;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36329h;
    private e6 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GLDrawer2D f36330j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f36325a = new ReentrantLock();
    private int d = -1;
    private final float[] e = new float[32];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ha createHandler() {
            ha haVar = new ha();
            new Thread(haVar, "FourthlineVision.RenderHandler").start();
            return haVar;
        }

        private a() {
        }
    }

    public static /* synthetic */ void draw$default(ha haVar, int i, float[] fArr, float[] fArr2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            fArr = null;
        }
        if ((i2 & 4) != 0) {
            fArr2 = null;
        }
        haVar.draw(i, fArr, fArr2);
    }

    private final void internalPrepare() {
        internalRelease();
        EGLContext eGLContext = this.f36326b;
        if (eGLContext == null) {
            Intrinsics.r("eglContext");
            throw null;
        }
        Surface surface = this.f36327c;
        if (surface == null) {
            Intrinsics.r("surface");
            throw null;
        }
        this.i = new e6(eGLContext, surface);
        this.f36330j = new GLDrawer2D();
    }

    private final void internalRelease() {
        GLDrawer2D gLDrawer2D = this.f36330j;
        if (gLDrawer2D != null) {
            gLDrawer2D.release();
        }
        e6 e6Var = this.i;
        if (e6Var != null) {
            e6Var.release();
        }
        this.f36330j = null;
        this.i = null;
    }

    public final void draw() {
        draw$default(this, 0, null, null, 7, null);
    }

    public final void release() {
        this.f36328g = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        e6 e6Var;
        GLDrawer2D gLDrawer2D;
        this.f36329h = 0;
        while (!this.f36328g) {
            if (this.f) {
                this.f = false;
                internalPrepare();
            }
            int i = this.f36329h;
            if (i > 0) {
                this.f36329h = i - 1;
                if (this.d >= 0 && (e6Var = this.i) != null && (gLDrawer2D = this.f36330j) != null) {
                    gLDrawer2D.setMatrix(this.e, 16);
                    gLDrawer2D.draw(this.d, this.e);
                    e6Var.swap();
                }
            }
        }
        internalRelease();
    }

    public final void setEglContext(@NotNull Surface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f36328g) {
            return;
        }
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        Intrinsics.checkNotNullExpressionValue(eGLContextEglGetCurrentContext, "eglGetCurrentContext(...)");
        this.f36326b = eGLContextEglGetCurrentContext;
        this.f36327c = surface;
        this.f = true;
        Matrix.setIdentityM(this.e, 0);
        Matrix.setIdentityM(this.e, 16);
    }

    public final void draw(int i) {
        draw$default(this, i, null, null, 6, null);
    }

    public final void draw(int i, float[] fArr) {
        draw$default(this, i, fArr, null, 4, null);
    }

    public final void draw(int i, float[] fArr, float[] fArr2) {
        ReentrantLock reentrantLock = this.f36325a;
        reentrantLock.lock();
        try {
            if (this.f36328g) {
                reentrantLock.unlock();
                return;
            }
            if (fArr != null && fArr.length >= 16) {
                System.arraycopy(fArr, 0, this.e, 0, 16);
            } else {
                Matrix.setIdentityM(this.e, 0);
            }
            if (fArr2 != null && fArr2.length >= 16) {
                System.arraycopy(fArr2, 0, this.e, 16, 16);
            } else {
                Matrix.setIdentityM(this.e, 16);
            }
            this.d = i;
            this.f36329h++;
            reentrantLock.unlock();
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }
}
