package j4;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.StuckPlayerDetector;
import b9.w2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.effect.particles.ParticlesEglException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mv0.i;
import up0.g0;
import up0.i0;
import up0.n0;
import up0.p0;
import up0.r;
import up0.t;
import up0.w;
import zhm.h0;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171262b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f171261a = i;
        this.f171262b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        AtomicBoolean atomicBoolean;
        float f;
        boolean z3 = true;
        switch (this.f171261a) {
            case 0:
                return ((StuckPlayerDetector) this.f171262b).handleMessage(message);
            case 1:
                i iVar = (i) this.f171262b;
                Intrinsics.checkNotNullParameter(message, "message");
                try {
                    int i = message.what;
                    if (i == 1) {
                        iVar.c(message);
                    } else if (i == 2) {
                        iVar.b();
                    } else if (i == 3) {
                        w2 w2Var = iVar.d;
                        if (w2Var != null) {
                            EGL10 egl10 = (EGL10) w2Var.f13500c;
                            EGLDisplay eGLDisplay = (EGLDisplay) w2Var.d;
                            EGLSurface eGLSurface = (EGLSurface) w2Var.f13501g;
                            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                            if (eGLSurface != eGLSurface2) {
                                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                                egl10.eglDestroySurface(eGLDisplay, (EGLSurface) w2Var.f13501g);
                            }
                            EGLSurface eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplay, (EGLConfig) w2Var.e, (SurfaceTexture) w2Var.f13499b, null);
                            egl10.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, (EGLContext) w2Var.f);
                            Intrinsics.checkNotNullExpressionValue(eGLSurfaceEglCreateWindowSurface, "also(...)");
                            w2Var.f13501g = eGLSurfaceEglCreateWindowSurface;
                        }
                        GLES20.glViewport(0, 0, message.arg1, message.arg2);
                        iVar.b();
                    } else if (i != 4) {
                        z3 = false;
                    } else {
                        iVar.a(message);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return z3;
            case 2:
                tp0.b bVar = (tp0.b) this.f171262b;
                Intrinsics.checkNotNullParameter(message, "msg");
                int i2 = message.what;
                if (i2 != 0) {
                    if (i2 == 1) {
                        bVar.b();
                    } else if (i2 == 2) {
                        bVar.e(message.arg1, message.arg2);
                        bVar.b();
                    } else if (i2 == 3) {
                        bVar.c();
                    }
                    return true;
                }
                vp0.e eVar = (vp0.e) bVar;
                vp0.c animation = (vp0.c) message.obj;
                Intrinsics.checkNotNullParameter(animation, "animation");
                int[] iArr = animation.z;
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLUtils.texImage2D(3553, 0, animation.B, 0);
                GLES20.glBindTexture(3553, 0);
                Bitmap bitmap = animation.B;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                animation.B = null;
                eVar.f291021l.add(animation);
                eVar.f273251b = true;
                animation.A = true;
                return true;
            default:
                final i0 i0Var = (i0) this.f171262b;
                up0.h0 h0Var2 = i0.Companion;
                if (message.what == 9) {
                    SurfaceTexture surfaceTexture = i0Var.f281719a;
                    AtomicBoolean atomicBoolean2 = i0Var.f281722g;
                    try {
                        i0Var.f281724j.i();
                        i0Var.quitSafely();
                        return true;
                    } finally {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            surfaceTexture.release();
                        }
                    }
                }
                if (i0Var.f.get()) {
                    if (message.what != 1) {
                        return true;
                    }
                    i0Var.f281723h.set(false);
                    return true;
                }
                switch (message.what) {
                    case 0:
                        Handler handler = i0Var.e;
                        if (!i0Var.f.get()) {
                            try {
                                i0Var.f281724j.h();
                                final int i3 = 1;
                                handler.post(new Runnable() { // from class: up0.e0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                i0 i0Var2 = i0Var;
                                                i0Var2.f281721c.invoke(i0Var2);
                                                break;
                                            default:
                                                i0 i0Var3 = i0Var;
                                                if (!i0Var3.f.get()) {
                                                    i0Var3.f281720b.invoke(i0Var3);
                                                }
                                                break;
                                        }
                                    }
                                });
                            } catch (Exception e2) {
                                final int i5 = 1;
                                i0Var.c(true);
                                handler.post(new Runnable() { // from class: up0.f0
                                    @Override // java.lang.Runnable
                                    public final void run() throws Throwable {
                                        switch (i5) {
                                            case 0:
                                                Exception exc2 = e2;
                                                i0 i0Var2 = i0Var;
                                                i0Var2.d.invoke(i0Var2, exc2);
                                                break;
                                            default:
                                                Exception exc3 = e2;
                                                i0 i0Var3 = i0Var;
                                                i0Var3.d.invoke(i0Var3, exc3);
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            break;
                        }
                        return true;
                    case 1:
                        try {
                            try {
                                i0Var.f281724j.d(i0Var.i);
                                atomicBoolean = i0Var.f281723h;
                                z = false;
                            } catch (Exception e4) {
                                if ((e4 instanceof ParticlesEglException) && ((ParticlesEglException) e4).f55804a) {
                                    final int i6 = 0;
                                    i0Var.c(false);
                                    i0Var.e.post(new Runnable() { // from class: up0.e0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i6) {
                                                case 0:
                                                    i0 i0Var2 = i0Var;
                                                    i0Var2.f281721c.invoke(i0Var2);
                                                    break;
                                                default:
                                                    i0 i0Var3 = i0Var;
                                                    if (!i0Var3.f.get()) {
                                                        i0Var3.f281720b.invoke(i0Var3);
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    z = false;
                                } else {
                                    i0Var.c(true);
                                    Handler handler2 = i0Var.e;
                                    z = false;
                                    final Object[] objArr = 0 == true ? 1 : 0;
                                    handler2.post(new Runnable() { // from class: up0.f0
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            switch (objArr) {
                                                case 0:
                                                    Exception exc2 = e4;
                                                    i0 i0Var2 = i0Var;
                                                    i0Var2.d.invoke(i0Var2, exc2);
                                                    break;
                                                default:
                                                    Exception exc3 = e4;
                                                    i0 i0Var3 = i0Var;
                                                    i0Var3.d.invoke(i0Var3, exc3);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                atomicBoolean = i0Var.f281723h;
                            }
                            atomicBoolean.set(z);
                            return true;
                        } catch (Throwable th10) {
                            i0Var.f281723h.set(false);
                            throw th10;
                        }
                    case 2:
                        w wVar = i0Var.f281724j;
                        int i21 = message.arg1;
                        if (i21 != wVar.f281790m) {
                            wVar.f281790m = i21;
                            GLES20.glUseProgram(wVar.f281781c.f281757a);
                            wVar.m();
                        }
                        return true;
                    case 3:
                        w wVar2 = i0Var.f281724j;
                        float fIntBitsToFloat = Float.intBitsToFloat(message.arg1);
                        float fIntBitsToFloat2 = Float.intBitsToFloat(message.arg2);
                        wVar2.f281795s = fIntBitsToFloat;
                        wVar2.f281796t = fIntBitsToFloat2;
                        wVar2.f281794r = System.nanoTime();
                        wVar2.u = BitmapDescriptorFactory.HUE_RED;
                        wVar2.z = true;
                        return true;
                    case 4:
                        w wVar3 = i0Var.f281724j;
                        float fIntBitsToFloat3 = Float.intBitsToFloat(message.arg1);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(message.arg2);
                        wVar3.getClass();
                        long jNanoTime = System.nanoTime();
                        t tVar = wVar3.D;
                        if (!tVar.f281762b) {
                            tVar.d = tVar.a(jNanoTime);
                            tVar.f281763c = jNanoTime;
                        }
                        tVar.f281762b = true;
                        tVar.e = -1L;
                        wVar3.B = fIntBitsToFloat3;
                        wVar3.C = fIntBitsToFloat4;
                        return true;
                    case 5:
                        t tVar2 = i0Var.f281724j.D;
                        long jNanoTime2 = System.nanoTime();
                        if (tVar2.f281762b) {
                            tVar2.f = tVar2.a(jNanoTime2);
                            tVar2.e = jNanoTime2;
                            tVar2.f281763c = -1L;
                            tVar2.f281762b = false;
                        }
                        return true;
                    case 6:
                        w wVar4 = i0Var.f281724j;
                        Object obj2 = message.obj;
                        Intrinsics.i(obj2, "null cannot be cast to non-null type android.graphics.RectF");
                        RectF rect = (RectF) obj2;
                        float[] fArr = wVar4.R;
                        float[] fArr2 = wVar4.Q;
                        Intrinsics.checkNotNullParameter(rect, "rect");
                        long jNanoTime3 = System.nanoTime();
                        float fC = wVar4.c(jNanoTime3);
                        boolean z4 = wVar4.E;
                        float f4 = wVar4.F;
                        float f5 = wVar4.G;
                        float f6 = wVar4.H;
                        float f32 = wVar4.I;
                        wVar4.F = rect.centerX();
                        wVar4.G = rect.centerY();
                        float fWidth = rect.width() * 0.5f;
                        if (fWidth < BitmapDescriptorFactory.HUE_RED) {
                            fWidth = 0.0f;
                        }
                        wVar4.H = fWidth;
                        float fHeight = rect.height() * 0.5f;
                        if (fHeight < BitmapDescriptorFactory.HUE_RED) {
                            fHeight = 0.0f;
                        }
                        wVar4.I = fHeight;
                        if (z4) {
                            float f35 = 1.0f - fC;
                            float f36 = 1.0f - wVar4.J;
                            float f37 = f6 > BitmapDescriptorFactory.HUE_RED ? wVar4.H / f6 : 0.0f;
                            float f41 = f32 > BitmapDescriptorFactory.HUE_RED ? fHeight / f32 : BitmapDescriptorFactory.HUE_RED;
                            int i22 = wVar4.j0;
                            int i32 = 0;
                            while (i32 < i22) {
                                float[] fArr3 = wVar4.O;
                                float f42 = fArr3[i32];
                                float f57 = f35;
                                float[] fArr4 = wVar4.P;
                                float f69 = fArr4[i32];
                                float f75 = (fArr2[i32] * f57) + f42;
                                float f77 = (fArr[i32] * f57) + f69;
                                float f81 = f36;
                                float fA = j6.a.a(f42, f4, f37, wVar4.F);
                                float fA2 = j6.a.a(f69, f5, f41, wVar4.G);
                                fArr3[i32] = fA;
                                fArr4[i32] = fA2;
                                fArr2[i32] = (f75 - fA) * f81;
                                fArr[i32] = (f77 - fA2) * f81;
                                i32++;
                                f35 = f57;
                                f36 = f81;
                            }
                            wVar4.N = jNanoTime3;
                            if (jNanoTime3 != -1) {
                                float fC2 = wVar4.c(jNanoTime3);
                                wVar4.n(fC2);
                                if (fC2 >= 1.0f) {
                                    wVar4.N = -1L;
                                }
                            }
                            f = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            wVar4.f(0);
                            int i33 = wVar4.j0;
                            f = BitmapDescriptorFactory.HUE_RED;
                            p.o(fArr2, BitmapDescriptorFactory.HUE_RED, 0, i33);
                            p.o(fArr, BitmapDescriptorFactory.HUE_RED, 0, wVar4.j0);
                            wVar4.N = -1L;
                            wVar4.n(1.0f);
                        }
                        wVar4.E = true;
                        wVar4.b(f);
                        return true;
                    case 7:
                        w wVar5 = i0Var.f281724j;
                        if (!wVar5.E) {
                            return true;
                        }
                        wVar5.b(1.0f);
                        return true;
                    case 8:
                        i0Var.f281724j.j(message.arg1, message.arg2);
                        return true;
                    case 9:
                    default:
                        return true;
                    case 10:
                        Object obj3 = message.obj;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.effect.particles.ParticlesThemeDrawThread.BalanceConfigurationCommand");
                        g0 g0Var = (g0) obj3;
                        w wVar6 = i0Var.f281724j;
                        up0.b configuration = g0Var.f281714a;
                        p0 transition = g0Var.f281715b;
                        r rVar = wVar6.f281781c;
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        Intrinsics.checkNotNullParameter(transition, "transition");
                        if (wVar6.E) {
                            wVar6.o = null;
                            wVar6.f281791n = configuration;
                            GLES20.glUseProgram(rVar.f281757a);
                            wVar6.l();
                            wVar6.k(configuration.d);
                            return true;
                        }
                        Object[] objArr2 = configuration.d != wVar6.j0;
                        n0 n0VarA = transition.a();
                        n0 n0Var = n0.TO_BLACK_HOLE;
                        if (n0VarA == n0Var && objArr2 == true) {
                            wVar6.o = configuration;
                        } else {
                            wVar6.o = null;
                            wVar6.f281791n = configuration;
                            GLES20.glUseProgram(rVar.f281757a);
                            wVar6.l();
                        }
                        int i43 = configuration.d;
                        up0.f fVar = wVar6.f281793q;
                        int i59 = wVar6.j0;
                        if (i43 == i59 && transition != p0.ACCOUNT_SWITCH_OUT && transition != p0.ACCOUNT_SWITCH_IN) {
                            return true;
                        }
                        long jNanoTime4 = System.nanoTime();
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(transition, "transition");
                        fVar.f281705b = transition;
                        fVar.e = i43;
                        int i66 = up0.e.f281701a[transition.ordinal()];
                        if (i66 == 1 || i66 == 2) {
                            fVar.f281706c = Math.min(i59, i43);
                            fVar.d = Math.max(i59, i43);
                        } else {
                            if (i66 != 3 && i66 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVar.f281706c = 0;
                            fVar.d = Math.max(i59, i43);
                        }
                        fVar.f281708h = jNanoTime4;
                        fVar.f = BitmapDescriptorFactory.HUE_RED;
                        fVar.f281707g = BitmapDescriptorFactory.HUE_RED;
                        fVar.f281704a = true;
                        if (fVar.f281705b.a() == n0Var) {
                            return true;
                        }
                        wVar6.k(i43);
                        return true;
                    case 11:
                        w wVar7 = i0Var.f281724j;
                        up0.h0 h0Var3 = i0.Companion;
                        int i74 = message.arg1;
                        h0Var3.getClass();
                        float fIntBitsToFloat5 = Float.intBitsToFloat(i74);
                        Float fValueOf = Float.valueOf(fIntBitsToFloat5);
                        if (Float.isNaN(fIntBitsToFloat5)) {
                            fValueOf = null;
                        }
                        float fIntBitsToFloat6 = Float.intBitsToFloat(message.arg2);
                        Float fValueOf2 = Float.isNaN(fIntBitsToFloat6) ? null : Float.valueOf(fIntBitsToFloat6);
                        wVar7.i = fValueOf;
                        wVar7.f281787j = fValueOf2;
                        GLES20.glUseProgram(wVar7.f281781c.f281757a);
                        wVar7.a();
                        return true;
                }
        }
    }
}
