package up0;

import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.core.ui_kit.effect.particles.ParticlesEglException;
import grl.b4;
import ix0.i1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w {

    @NotNull
    private static final u Companion = new u();
    public boolean A;
    public float B;
    public float C;
    public final t D;
    public boolean E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public long K;
    public float L;
    public float M;
    public long N;
    public final float[] O;
    public final float[] P;
    public final float[] Q;
    public final float[] R;
    public float[] S;
    public float[] T;
    public float[] U;
    public float[] V;
    public float[] W;
    public float[] X;
    public float[] Y;
    public float[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f281777a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final float[] f281778a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f281779b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final float[] f281780b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f281781c;
    public final float[] c0;
    public final tim.d d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float[] f281782d0;
    public int e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float[] f281783e0;
    public int f;
    public final FloatBuffer f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f281784g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f281785h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f281786h0;
    public Float i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f281787j;
    public int j0;
    public float k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f281788k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f281789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f281790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f281791n;
    public b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f281792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f281793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f281794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f281795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f281796t;
    public float u;
    public final float[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f281797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f281798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f281799y;
    public boolean z;

    public w(SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, b bVar) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        this.f281777a = f;
        this.f281779b = new q(surfaceTexture);
        this.f281781c = new r();
        this.d = new tim.d((int) 1370835506, (int) 0);
        this.e = i;
        this.f = i2;
        this.f281789l = f * 500.0f;
        this.f281790m = i3;
        this.f281791n = bVar;
        this.f281793q = new f();
        this.f281794r = -1L;
        this.v = new float[5];
        float[] fArr = new float[5];
        for (int i5 = 0; i5 < 5; i5++) {
            fArr[i5] = (float) Math.pow(0.1f, i5);
        }
        this.f281797w = fArr;
        this.f281799y = -1L;
        this.D = new t(0);
        this.J = 1.0f;
        this.K = -1L;
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = -1L;
        this.O = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.P = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.Q = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.R = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.S = new float[0];
        this.T = new float[0];
        this.U = new float[0];
        this.V = new float[0];
        this.W = new float[0];
        this.X = new float[0];
        this.Y = new float[0];
        this.Z = new float[0];
        this.f281778a0 = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.f281780b0 = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.c0 = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.f281782d0 = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
        this.f281783e0 = new float[ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED];
        this.f0 = ByteBuffer.allocateDirect(32000).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f281788k0 = te0.w.y0(new tyl.a(this, 25));
    }

    public static void e(int i, int i2, int i3) {
        GLES20.glEnableVertexAttribArray(i);
        GLES20.glVertexAttribPointer(i, i2, 5126, false, 48, i3 * 4);
    }

    public final void a() {
        Float f = this.i;
        this.f281784g = f != null ? kotlin.ranges.f.f(f.floatValue(), BitmapDescriptorFactory.HUE_RED, this.e) : this.e * 0.5f;
        Float f4 = this.f281787j;
        this.f281785h = f4 != null ? kotlin.ranges.f.f(f4.floatValue(), BitmapDescriptorFactory.HUE_RED, this.f) : this.f * 0.5f;
        GLES20.glUniform2f(g().f281765b, this.f281784g, this.f281785h);
    }

    public final void b(float f) {
        if (Math.abs(f - this.J) >= 1.0E-4f) {
            this.L = this.J;
            this.M = f;
            this.K = System.nanoTime();
        } else {
            this.K = -1L;
            this.J = f;
            if (f == 1.0f) {
                this.E = false;
            }
        }
    }

    public final float c(long j2) {
        if (this.N == -1) {
            return 1.0f;
        }
        return i1.d(kotlin.ranges.f.f(((j2 - r0) / 1.0E9f) / 0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f));
    }

    public final void d(long j2) {
        float f;
        float f4;
        float f5;
        float[] fArr;
        float f6;
        float[] fArr2;
        float f32;
        int i;
        float fSin;
        float f35;
        if (this.e == 0 || this.f == 0) {
            return;
        }
        r rVar = this.f281781c;
        if (rVar.f281757a == 0) {
            return;
        }
        GLES20.glClear(16384);
        GLES20.glUseProgram(rVar.f281757a);
        float f36 = (j2 - this.f281792p) / 1.0E9f;
        f fVar = this.f281793q;
        boolean z = fVar.f281704a;
        if (z) {
            long j3 = j2 - fVar.f281708h;
            fVar.f = kotlin.ranges.f.f((float) (j3 / fVar.f281705b.b().f281753c), BitmapDescriptorFactory.HUE_RED, 1.0f);
            x.a(j3, fVar.f281705b.b());
            fVar.f281707g = x.a(j3, fVar.f281705b.c());
            if (j3 >= fVar.f281705b.b().f281753c && j3 >= fVar.f281705b.c().f281753c) {
                fVar.f281704a = false;
            }
        }
        if (z && !fVar.f281704a && fVar.f281705b.a() == n0.TO_BLACK_HOLE) {
            k(fVar.e);
            b bVar = this.o;
            if (bVar != null) {
                this.o = null;
                this.f281791n = bVar;
                l();
            }
        }
        float fA = this.D.a(j2);
        if (this.K != -1) {
            float f37 = (j2 - r10) / 1.0E9f;
            float fExp = 1.0f - (((17.95196f * f37) + 1.0f) * ((float) Math.exp((-17.95196f) * f37)));
            float f41 = this.L;
            float f42 = this.M;
            this.J = j6.a.a(f42, f41, fExp, f41);
            if (f37 >= 0.525f) {
                this.K = -1L;
                this.J = f42;
                if (f42 == 1.0f) {
                    this.E = false;
                }
            }
        }
        if (this.N != -1) {
            float fC = c(j2);
            n(fC);
            if (fC >= 1.0f) {
                this.N = -1L;
            }
        }
        float f57 = this.f281799y == -1 ? 0.0f : kotlin.ranges.f.f((j2 - r10) / 1.0E9f, BitmapDescriptorFactory.HUE_RED, 0.033333335f);
        this.f281799y = j2;
        float f69 = (j2 - this.f281792p) / 1.0E9f;
        float f75 = 0.42f * f69 * 0.2f;
        float f77 = 0.22f * f69 * 0.2f;
        float f81 = f69 * 0.26f * 0.2f;
        float f82 = f57;
        boolean z3 = this.f281794r != -1;
        if (z3) {
            f = (j2 - r9) / 1500000000;
            if (f > 1.0f) {
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        float f93 = this.f281777a;
        float[] fArr3 = this.f281783e0;
        float[] fArr4 = this.f281782d0;
        float[] fArr5 = this.c0;
        if (z3) {
            float f94 = this.u;
            float f99 = this.f281798x;
            float f100 = f94 * f99;
            float f101 = f99 * f;
            int i2 = this.j0;
            int i3 = 0;
            while (i3 < i2) {
                int i5 = i2;
                float f102 = this.S[i3];
                float f103 = this.e;
                float f104 = ((f102 * f103) + this.f281784g) - (f103 * 0.5f);
                float f105 = f75;
                float f106 = this.T[i3];
                float f107 = this.f;
                float f108 = ((f106 * f107) + this.f281785h) - (f107 * 0.5f);
                float f109 = fA;
                float[] fArr6 = fArr5;
                float f110 = f93;
                float f111 = kotlin.ranges.f.f(this.X[i3] + (((float) Math.sin(this.U[i3] + f81)) * 0.02f), -1.0f, 1.0f);
                float f112 = 1.0f - (f111 * f111);
                float f113 = f112 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f112;
                int i6 = i3;
                float fSqrt = (float) Math.sqrt(f113);
                double d = (this.Z[i6] * f77) + this.W[i6] + f105;
                float fSin2 = (((((float) Math.sin(d)) * fSqrt) + 1.0f) * 0.5f * 0.62f) + 0.58f;
                float f114 = this.k * this.Y[i6];
                float fCos = (((float) Math.cos(d)) * fSqrt * f114 * fSin2) + this.f281784g;
                float f115 = this.f281785h;
                float fA2 = j6.a.a(fCos, f104, 0.94f, f104);
                float fA3 = j6.a.a((f111 * f114 * fSin2 * 0.92f) + f115, f108, 0.94f, f108);
                float f116 = fA2 - this.f281784g;
                float f117 = fA3 - f115;
                float f118 = f81;
                float f119 = f100;
                float fHypot = (float) Math.hypot(f116, f117);
                if (fHypot < 0.001f) {
                    fHypot = 0.001f;
                }
                float f120 = this.f281789l;
                float f121 = fHypot < f120 ? (1.0f - (fHypot / f120)) * 170.0f * f110 * this.V[i6] : 0.0f;
                float f122 = ((f116 / fHypot) * f121) + fA2;
                float f123 = ((f117 / fHypot) * f121) + fA3;
                int i21 = i6 * 4;
                float f124 = fArr3[i21 + 2];
                float f125 = fArr3[i21 + 3];
                boolean z4 = this.E;
                if (z4) {
                    f122 = ((f122 - f124) * this.J) + f124;
                }
                if (z4) {
                    f123 = ((f123 - f125) * this.J) + f125;
                }
                float f126 = f122 - this.f281795s;
                float f127 = f123 - this.f281796t;
                float[] fArr7 = fArr3;
                float fHypot2 = (float) Math.hypot(f126, f127);
                if (fHypot2 > 0.001f) {
                    f35 = f126 / fHypot2;
                    fSin = f127 / fHypot2;
                    i = i6;
                } else {
                    i = i6;
                    double d5 = i * 2.3999631f;
                    float fCos2 = (float) Math.cos(d5);
                    fSin = (float) Math.sin(d5);
                    f35 = fCos2;
                }
                for (int i22 = 0; i22 < 5; i22++) {
                    float f128 = this.v[i22];
                    float f129 = f119 - f128;
                    float f130 = f101 - f128;
                    if (f130 >= BitmapDescriptorFactory.HUE_RED && f129 <= fHypot2 && f130 > fHypot2) {
                        float f131 = this.f281797w[i22] * 120.0f * this.V[i];
                        fArr6[i] = (f35 * f131) + fArr6[i];
                        fArr4[i] = (f131 * fSin) + fArr4[i];
                    }
                }
                i3 = i + 1;
                fArr3 = fArr7;
                f75 = f105;
                fA = f109;
                f81 = f118;
                f93 = f110;
                fArr5 = fArr6;
                f100 = f119;
                i2 = i5;
            }
            f4 = fA;
            fArr = fArr5;
            f6 = f93;
            fArr2 = fArr3;
            this.u = f;
            f5 = 1.0f;
            if (f >= 1.0f) {
                this.f281794r = -1L;
            }
            f32 = 0.0f;
        } else {
            f4 = fA;
            f5 = 1.0f;
            fArr = fArr5;
            f6 = f93;
            fArr2 = fArr3;
            f32 = 0.0f;
            this.u = BitmapDescriptorFactory.HUE_RED;
        }
        boolean z6 = this.A;
        if (f82 > f32 && (z3 || this.z)) {
            float fExp2 = (float) Math.exp(f82 * (-6.0f));
            int i32 = this.j0;
            boolean z11 = false;
            for (int i33 = 0; i33 < i32; i33++) {
                float f132 = fArr[i33];
                float[] fArr8 = this.f281778a0;
                fArr[i33] = f132 - ((fArr8[i33] * 14.0f) * f82);
                float f133 = fArr4[i33];
                float[] fArr9 = this.f281780b0;
                fArr4[i33] = f133 - ((fArr9[i33] * 14.0f) * f82);
                fArr[i33] = fArr[i33] * fExp2;
                fArr4[i33] = fArr4[i33] * fExp2;
                fArr8[i33] = (fArr[i33] * f82) + fArr8[i33];
                fArr9[i33] = (fArr4[i33] * f82) + fArr9[i33];
                if (Math.abs(fArr8[i33]) > 0.01f || Math.abs(fArr9[i33]) > 0.01f || Math.abs(fArr[i33]) > 0.01f || Math.abs(fArr4[i33]) > 0.01f) {
                    z11 = true;
                } else {
                    fArr8[i33] = 0.0f;
                    fArr9[i33] = 0.0f;
                    fArr[i33] = 0.0f;
                    fArr4[i33] = 0.0f;
                }
                int i43 = i33 * 4;
                fArr2[i43] = fArr8[i33];
                fArr2[i43 + 1] = fArr9[i33];
            }
            this.z = z11 || z3;
            z6 = true;
        }
        if (z6) {
            FloatBuffer floatBuffer = this.f0;
            floatBuffer.clear();
            int i59 = this.j0;
            floatBuffer.put(fArr2, 0, i59 * 4);
            floatBuffer.position(0);
            GLES20.glBindBuffer(34962, this.f281786h0);
            GLES20.glBufferSubData(34962, 0, i59 * 16, floatBuffer);
            GLES20.glBindBuffer(34962, 0);
            this.A = false;
        }
        GLES20.glUniform1f(g().f281766c, f36);
        GLES20.glUniform1f(g().f281768h, fVar.f);
        GLES20.glUniform1f(g().i, fVar.f281707g);
        GLES20.glUniform1i(g().f281769j, fVar.f281706c);
        GLES20.glUniform1i(g().k, fVar.d);
        GLES20.glUniform1f(g().f281770l, fVar.f281705b.a() == n0.TO_BLACK_HOLE ? -1.0f : f5);
        GLES20.glUniform2f(g().f281771m, this.B, this.C);
        GLES20.glUniform1f(g().f281772n, f4 > BitmapDescriptorFactory.HUE_RED ? 180.0f * f6 : 0.0f);
        GLES20.glUniform1f(g().o, f6 * 90.0f * f4);
        GLES20.glUniform1f(g().f281773p, this.E ? f5 : 0.0f);
        GLES20.glUniform2f(g().f281774q, this.F, this.G);
        GLES20.glUniform2f(g().f281775r, this.H, this.I);
        GLES20.glUniform1f(g().f281776s, this.J);
        GLES30.glBindVertexArray(this.i0);
        GLES20.glDrawArrays(0, 0, this.j0);
        GLES30.glBindVertexArray(0);
        q qVar = this.f281779b;
        if (EGL14.eglSwapBuffers(qVar.f281755b, qVar.d)) {
            return;
        }
        int iEglGetError = EGL14.eglGetError();
        throw new ParticlesEglException(iEglGetError, iEglGetError == 12302);
    }

    public final void f(int i) {
        float f;
        float f4;
        float f5;
        float f6;
        float f32;
        float f35;
        float f36;
        float f37;
        float f41 = this.f281777a;
        float f42 = 1.4f * f41;
        float f57 = this.H - f42;
        float f69 = BitmapDescriptorFactory.HUE_RED;
        if (f57 < BitmapDescriptorFactory.HUE_RED) {
            f57 = 0.0f;
        }
        float f75 = this.I - f42;
        if (f75 < BitmapDescriptorFactory.HUE_RED) {
            f75 = 0.0f;
        }
        float fMin = Math.min(f57, f75);
        float fMin2 = Math.min(16.0f * f41, 0.45f * fMin);
        float fMin3 = Math.min(f41 * 10.0f, fMin * 0.35f);
        if (fMin3 < 0.001f) {
            fMin3 = 0.001f;
        }
        float f77 = f57 - fMin2;
        float f81 = f77 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f77;
        float f82 = f75 - fMin2;
        float f93 = f82 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f82;
        int i2 = this.j0;
        int i3 = i;
        while (i3 < i2) {
            tim.d dVar = this.d;
            float fB = ((dVar.b() * 2.0f) - 1.0f) * f81;
            float fB2 = ((dVar.b() * 2.0f) - 1.0f) * f93;
            int i5 = 0;
            while (true) {
                if (i5 >= 64) {
                    f = fMin3;
                    f4 = f77;
                    f5 = f57;
                    f6 = f69;
                    f32 = f75;
                    f35 = fMin2;
                    break;
                }
                float fB3 = ((dVar.b() * 2.0f) - 1.0f) * f57;
                float fB4 = ((dVar.b() * 2.0f) - 1.0f) * f75;
                float f94 = f69;
                float fAbs = Math.abs(fB3) - f77;
                f = fMin3;
                float fAbs2 = Math.abs(fB4) - f82;
                if (fAbs < f94) {
                    f4 = f77;
                    f36 = f94;
                } else {
                    f4 = f77;
                    f36 = fAbs;
                }
                f5 = f57;
                double d = f36;
                if (fAbs2 < f94) {
                    f32 = f75;
                    f37 = f94;
                } else {
                    f32 = f75;
                    f37 = fAbs2;
                }
                f35 = fMin2;
                f6 = f94;
                float f99 = -((Math.min(Math.max(fAbs, fAbs2), f6) + ((float) Math.hypot(d, f37))) - f35);
                if (f99 >= f6 && dVar.b() <= i1.d(f99 / f)) {
                    fB = fB3;
                    fB2 = fB4;
                    break;
                }
                i5++;
                f69 = f6;
                f77 = f4;
                fMin3 = f;
                f57 = f5;
                f75 = f32;
                fMin2 = f35;
            }
            this.O[i3] = this.F + fB;
            this.P[i3] = this.G + fB2;
            i3++;
            f69 = f6;
            f77 = f4;
            fMin3 = f;
            f57 = f5;
            f75 = f32;
            fMin2 = f35;
        }
        n(1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final v g() {
        return (v) this.f281788k0.getValue();
    }

    public final void h() {
        q qVar = this.f281779b;
        if (!Intrinsics.f(qVar.f281755b, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Particle EGL context is already initialized");
        }
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        Intrinsics.checkNotNullExpressionValue(eGLDisplayEglGetDisplay, "eglGetDisplay(...)");
        qVar.f281755b = eGLDisplayEglGetDisplay;
        if (Intrinsics.f(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to obtain EGL display");
        }
        if (!EGL14.eglInitialize(qVar.f281755b, new int[2], 0, new int[2], 0)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (!EGL14.eglChooseConfig(qVar.f281755b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        if (iArr[0] <= 0) {
            throw new IllegalStateException("No OpenGL ES 3 EGL config available");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            throw new IllegalStateException("No OpenGL ES 3 EGL config available");
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(qVar.f281755b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
        Intrinsics.checkNotNullExpressionValue(eGLContextEglCreateContext, "eglCreateContext(...)");
        qVar.f281756c = eGLContextEglCreateContext;
        if (Intrinsics.f(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            throw new IllegalStateException("Unable to create OpenGL ES 3 context");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(qVar.f281755b, eGLConfig, qVar.f281754a, new int[]{12344}, 0);
        Intrinsics.checkNotNullExpressionValue(eGLSurfaceEglCreateWindowSurface, "eglCreateWindowSurface(...)");
        qVar.d = eGLSurfaceEglCreateWindowSurface;
        if (Intrinsics.f(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            throw new IllegalStateException("Unable to create EGL window surface");
        }
        EGLDisplay eGLDisplay = qVar.f281755b;
        EGLSurface eGLSurface = qVar.d;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, qVar.f281756c)) {
            throw new IllegalStateException("Unable to make particle EGL context current");
        }
        r rVar = this.f281781c;
        rVar.getClass();
        Intrinsics.checkNotNullParameter("#version 300 es\nprecision highp float;\n\nlayout(location = 0) in vec2 destination;\nlayout(location = 1) in vec2 phase;\nlayout(location = 2) in vec2 speed;\nlayout(location = 3) in float depth;\nlayout(location = 4) in float pulseSpeed;\nlayout(location = 5) in vec4 dynamicData;\nlayout(location = 6) in float sphereTheta;\nlayout(location = 7) in float sphereY;\nlayout(location = 8) in float sphereRadius;\nlayout(location = 9) in float sphereSpin;\nuniform vec2 resolution;\nuniform vec2 sceneCenter;\nuniform float time;\nuniform float density;\nuniform vec3 particleColor;\nuniform int primaryEndIndex;\nuniform int grayEndIndex;\nuniform float blackHoleRawMotionProgress;\nuniform float blackHoleOpacityProgress;\nuniform int blackHoleStartIndex;\nuniform int blackHoleEndIndex;\nuniform float blackHoleDirection;\nuniform vec2 interactionPoint;\nuniform float interactionRadius;\nuniform float interactionStrength;\nuniform float rectCollapseEnabled;\nuniform vec2 rectCollapseCenter;\nuniform vec2 rectCollapseHalfSize;\nuniform float rectCollapseProgress;\n\nout float particleAlpha;\nout vec3 resolvedParticleColor;\n\nfloat roundedRectangleSignedDistance(\n    vec2 point,\n    vec2 halfSize,\n    float cornerRadius\n) {\n    vec2 distance = abs(point) - (halfSize - cornerRadius);\n    return length(max(distance, vec2(0.0))) +\n        min(max(distance.x, distance.y), 0.0) - cornerRadius;\n}\n\nfloat smootherstepValue(float value) {\n    float progress = clamp(value, 0.0, 1.0);\n    return progress * progress * progress *\n        (progress * (progress * 6.0 - 15.0) + 10.0);\n}\n\nfloat springEase(float value, float bounce) {\n    float progress = clamp(value, 0.0, 1.0);\n    float clampedBounce = clamp(bounce, 0.0, 0.97);\n    if (progress <= 0.0 || progress >= 1.0) {\n        return progress;\n    }\n    if (clampedBounce <= 0.0) {\n        return smootherstepValue(progress);\n    }\n    float period = max(0.03, 1.0 - clampedBounce);\n    float angularFrequency = 2.0 * 3.1415927 / period;\n    float damping = mix(8.2, 5.7, clampedBounce / 0.97);\n    float decay = exp(-damping * progress);\n    return 1.0 - decay * (\n        cos(angularFrequency * progress) +\n            (damping / angularFrequency) * sin(angularFrequency * progress)\n    );\n}\n\nvoid main() {\n    vec2 position = destination * resolution + sceneCenter - resolution * 0.5;\n\n    float movementTime = time * 0.1;\n    position.x += cos(movementTime * speed.x + phase.x) *\n        20.0 * density * depth;\n    position.y += sin(movementTime * speed.y + phase.y) *\n        20.0 * density * depth;\n    position.x += sin(movementTime * 0.37 + phase.y) *\n        80.0 * density * depth;\n    position.y += cos(movementTime * 0.29 + phase.x) *\n        80.0 * density * depth;\n\n    float sphereSize = min(resolution.x, resolution.y) * 0.38;\n    float verticalDrift = sin(\n        time * 0.26 *\n            0.2 + phase.y\n    ) * (0.12 *\n        0.2 /\n        (1.0 + 0.2));\n    float projectedY = clamp(sphereY + verticalDrift, -1.0, 1.0);\n    float ring = sqrt(max(0.0, 1.0 - projectedY * projectedY));\n    float theta = sphereTheta +\n        time * 0.42 * 0.2 +\n        time * 0.22 *\n            0.2 * sphereSpin;\n    float sphereZ = sin(theta) * ring;\n    float sphereDepth = 0.58 +\n        ((sphereZ + 1.0) * 0.5) * 0.62;\n    float radius = sphereSize * sphereRadius;\n    vec2 spherePosition = sceneCenter + vec2(\n        cos(theta) * ring * radius * sphereDepth,\n        projectedY * radius * sphereDepth * 0.92\n    );\n    position = mix(position, spherePosition, 0.94);\n\n    vec2 blackHoleCenter = sceneCenter;\n    vec2 blackHoleDelta = position - blackHoleCenter;\n    float blackHoleDistance = max(length(blackHoleDelta), 0.001);\n    float blackHoleRadius = 500.0 * density;\n    float blackHoleInfluence = 0.0;\n    if (blackHoleDistance < blackHoleRadius) {\n        blackHoleInfluence = 1.0 - blackHoleDistance / blackHoleRadius;\n        float blackHoleForce = blackHoleInfluence *\n            170.0 * density * depth;\n        position += blackHoleDelta / blackHoleDistance * blackHoleForce;\n    }\n\n    if (rectCollapseEnabled > 0.5) {\n        vec2 collapseTarget = dynamicData.zw;\n        vec2 rectangleOffset = collapseTarget - rectCollapseCenter;\n        float minimumHalfSize = min(rectCollapseHalfSize.x, rectCollapseHalfSize.y);\n        float cornerRadius = min(16.0 * density, minimumHalfSize * 0.45);\n        float edgeDistance = -roundedRectangleSignedDistance(\n            rectangleOffset,\n            rectCollapseHalfSize,\n            cornerRadius\n        );\n        float collapseJitterRadius = min(\n            20.0 * density * 0.25,\n            100.0 * density\n        );\n        vec2 collapseJitter = vec2(\n            cos(time * 1.7 * speed.x + phase.x),\n            sin(time * 1.9 * speed.y + phase.y)\n        ) * collapseJitterRadius;\n        float jitterLength = length(collapseJitter);\n        float maximumJitterLength = max(0.0, edgeDistance * 0.75);\n        if (jitterLength > maximumJitterLength && jitterLength > 0.001) {\n            collapseJitter *= maximumJitterLength / jitterLength;\n        }\n        position = mix(\n            collapseTarget + collapseJitter,\n            position,\n            rectCollapseProgress\n        );\n    }\n\n    position += dynamicData.xy * density;\n\n    float blackHoleAlpha = 1.0;\n    if (\n        gl_VertexID >= blackHoleStartIndex &&\n        gl_VertexID < blackHoleEndIndex\n    ) {\n        vec2 center = sceneCenter;\n        vec2 direction = position - center;\n        float directionLength = max(length(direction), 0.001);\n        float sourceDepth = clamp(depth, 0.0, 1.0);\n        float alignedRadius =\n            (200.0 * 0.5) *\n            mix(0.72, 1.18, sourceDepth) * density;\n        vec2 origin = center + direction / directionLength *\n            alignedRadius;\n        float transitionDepth = clamp((sphereDepth - 0.58) / 0.62, 0.0, 1.0);\n        float delayFraction =\n            (blackHoleDirection > 0.0 ? 1.0 - transitionDepth : transitionDepth) *\n            0.04 * 0.8;\n        float delayedRawProgress = clamp(\n            (blackHoleRawMotionProgress - delayFraction) / (1.0 - delayFraction),\n            0.0,\n            1.0\n        );\n        float delayedMotionProgress = springEase(delayedRawProgress, 0.08);\n        if (blackHoleDirection > 0.0) {\n            position = mix(origin, position, delayedMotionProgress);\n            blackHoleAlpha = blackHoleOpacityProgress;\n        } else {\n            position = mix(position, origin, delayedMotionProgress);\n            blackHoleAlpha = 1.0 - blackHoleOpacityProgress;\n        }\n    }\n\n    if (interactionRadius > 0.0) {\n        vec2 interactionDelta = position - interactionPoint;\n        float interactionDistance = length(interactionDelta);\n        if (interactionDistance < interactionRadius) {\n            float interactionFalloff =\n                1.0 - interactionDistance / interactionRadius;\n            vec2 interactionDirection = interactionDistance > 0.001\n                ? interactionDelta / interactionDistance\n                : vec2(0.0, -1.0);\n            float visualDepth = clamp(\n                (sphereDepth - 0.58) / 0.62,\n                0.0,\n                1.0\n            );\n            position += interactionDirection *\n                interactionFalloff * interactionFalloff *\n                interactionStrength * visualDepth;\n        }\n    }\n\n    float pulseScale = 0.1875 * 0.64;\n    float pulse = 1.0 - pulseScale +\n        pulseScale * cos(\n            time * 3.3 * pulseSpeed +\n                phase.y * 1.0\n    );\n    float pointRadius = pulse *\n        (0.68 + depth * 0.42) * sphereDepth * density;\n    gl_PointSize = max(pointRadius * 2.0, 1.0);\n\n    vec2 normalizedPosition = position / resolution;\n    gl_Position = vec4(\n        normalizedPosition.x * 2.0 - 1.0,\n        1.0 - normalizedPosition.y * 2.0,\n        0.0,\n        1.0\n    );\n    float denominationSize = 1.0;\n    resolvedParticleColor = particleColor;\n    if (gl_VertexID >= grayEndIndex) {\n        denominationSize = 1.16;\n        resolvedParticleColor = vec3(227.0, 198.0, 151.0) / 255.0;\n    } else if (gl_VertexID >= primaryEndIndex) {\n        denominationSize = 1.08;\n        resolvedParticleColor = vec3(179.0, 175.0, 173.0) / 255.0;\n    }\n    gl_PointSize *= denominationSize;\n    float baseParticleAlpha = ((50.0 + depth * 190.0) / 255.0) *\n        mix(0.72, 1.0, sphereDepth);\n    particleAlpha = mix(\n        baseParticleAlpha,\n        1.0,\n        blackHoleInfluence * 1.0\n    ) * blackHoleAlpha;\n}", "vertexShaderSource");
        Intrinsics.checkNotNullParameter("#version 300 es\nprecision mediump float;\n\nin float particleAlpha;\nin vec3 resolvedParticleColor;\nout vec4 fragmentColor;\n\nvoid main() {\n    float distanceFromCenter = distance(gl_PointCoord, vec2(0.5));\n    if (distanceFromCenter >= 0.5) {\n        discard;\n    }\n    float edgeWidth = fwidth(distanceFromCenter);\n    float edgeAlpha = 1.0 - smoothstep(0.5 - edgeWidth, 0.5, distanceFromCenter);\n    float alpha = particleAlpha * edgeAlpha;\n    fragmentColor = vec4(resolvedParticleColor * alpha, alpha);\n}", "fragmentShaderSource");
        if (rVar.f281757a != 0) {
            throw new IllegalStateException("Particle OpenGL program is already initialized");
        }
        int iA = r.a(35633, "#version 300 es\nprecision highp float;\n\nlayout(location = 0) in vec2 destination;\nlayout(location = 1) in vec2 phase;\nlayout(location = 2) in vec2 speed;\nlayout(location = 3) in float depth;\nlayout(location = 4) in float pulseSpeed;\nlayout(location = 5) in vec4 dynamicData;\nlayout(location = 6) in float sphereTheta;\nlayout(location = 7) in float sphereY;\nlayout(location = 8) in float sphereRadius;\nlayout(location = 9) in float sphereSpin;\nuniform vec2 resolution;\nuniform vec2 sceneCenter;\nuniform float time;\nuniform float density;\nuniform vec3 particleColor;\nuniform int primaryEndIndex;\nuniform int grayEndIndex;\nuniform float blackHoleRawMotionProgress;\nuniform float blackHoleOpacityProgress;\nuniform int blackHoleStartIndex;\nuniform int blackHoleEndIndex;\nuniform float blackHoleDirection;\nuniform vec2 interactionPoint;\nuniform float interactionRadius;\nuniform float interactionStrength;\nuniform float rectCollapseEnabled;\nuniform vec2 rectCollapseCenter;\nuniform vec2 rectCollapseHalfSize;\nuniform float rectCollapseProgress;\n\nout float particleAlpha;\nout vec3 resolvedParticleColor;\n\nfloat roundedRectangleSignedDistance(\n    vec2 point,\n    vec2 halfSize,\n    float cornerRadius\n) {\n    vec2 distance = abs(point) - (halfSize - cornerRadius);\n    return length(max(distance, vec2(0.0))) +\n        min(max(distance.x, distance.y), 0.0) - cornerRadius;\n}\n\nfloat smootherstepValue(float value) {\n    float progress = clamp(value, 0.0, 1.0);\n    return progress * progress * progress *\n        (progress * (progress * 6.0 - 15.0) + 10.0);\n}\n\nfloat springEase(float value, float bounce) {\n    float progress = clamp(value, 0.0, 1.0);\n    float clampedBounce = clamp(bounce, 0.0, 0.97);\n    if (progress <= 0.0 || progress >= 1.0) {\n        return progress;\n    }\n    if (clampedBounce <= 0.0) {\n        return smootherstepValue(progress);\n    }\n    float period = max(0.03, 1.0 - clampedBounce);\n    float angularFrequency = 2.0 * 3.1415927 / period;\n    float damping = mix(8.2, 5.7, clampedBounce / 0.97);\n    float decay = exp(-damping * progress);\n    return 1.0 - decay * (\n        cos(angularFrequency * progress) +\n            (damping / angularFrequency) * sin(angularFrequency * progress)\n    );\n}\n\nvoid main() {\n    vec2 position = destination * resolution + sceneCenter - resolution * 0.5;\n\n    float movementTime = time * 0.1;\n    position.x += cos(movementTime * speed.x + phase.x) *\n        20.0 * density * depth;\n    position.y += sin(movementTime * speed.y + phase.y) *\n        20.0 * density * depth;\n    position.x += sin(movementTime * 0.37 + phase.y) *\n        80.0 * density * depth;\n    position.y += cos(movementTime * 0.29 + phase.x) *\n        80.0 * density * depth;\n\n    float sphereSize = min(resolution.x, resolution.y) * 0.38;\n    float verticalDrift = sin(\n        time * 0.26 *\n            0.2 + phase.y\n    ) * (0.12 *\n        0.2 /\n        (1.0 + 0.2));\n    float projectedY = clamp(sphereY + verticalDrift, -1.0, 1.0);\n    float ring = sqrt(max(0.0, 1.0 - projectedY * projectedY));\n    float theta = sphereTheta +\n        time * 0.42 * 0.2 +\n        time * 0.22 *\n            0.2 * sphereSpin;\n    float sphereZ = sin(theta) * ring;\n    float sphereDepth = 0.58 +\n        ((sphereZ + 1.0) * 0.5) * 0.62;\n    float radius = sphereSize * sphereRadius;\n    vec2 spherePosition = sceneCenter + vec2(\n        cos(theta) * ring * radius * sphereDepth,\n        projectedY * radius * sphereDepth * 0.92\n    );\n    position = mix(position, spherePosition, 0.94);\n\n    vec2 blackHoleCenter = sceneCenter;\n    vec2 blackHoleDelta = position - blackHoleCenter;\n    float blackHoleDistance = max(length(blackHoleDelta), 0.001);\n    float blackHoleRadius = 500.0 * density;\n    float blackHoleInfluence = 0.0;\n    if (blackHoleDistance < blackHoleRadius) {\n        blackHoleInfluence = 1.0 - blackHoleDistance / blackHoleRadius;\n        float blackHoleForce = blackHoleInfluence *\n            170.0 * density * depth;\n        position += blackHoleDelta / blackHoleDistance * blackHoleForce;\n    }\n\n    if (rectCollapseEnabled > 0.5) {\n        vec2 collapseTarget = dynamicData.zw;\n        vec2 rectangleOffset = collapseTarget - rectCollapseCenter;\n        float minimumHalfSize = min(rectCollapseHalfSize.x, rectCollapseHalfSize.y);\n        float cornerRadius = min(16.0 * density, minimumHalfSize * 0.45);\n        float edgeDistance = -roundedRectangleSignedDistance(\n            rectangleOffset,\n            rectCollapseHalfSize,\n            cornerRadius\n        );\n        float collapseJitterRadius = min(\n            20.0 * density * 0.25,\n            100.0 * density\n        );\n        vec2 collapseJitter = vec2(\n            cos(time * 1.7 * speed.x + phase.x),\n            sin(time * 1.9 * speed.y + phase.y)\n        ) * collapseJitterRadius;\n        float jitterLength = length(collapseJitter);\n        float maximumJitterLength = max(0.0, edgeDistance * 0.75);\n        if (jitterLength > maximumJitterLength && jitterLength > 0.001) {\n            collapseJitter *= maximumJitterLength / jitterLength;\n        }\n        position = mix(\n            collapseTarget + collapseJitter,\n            position,\n            rectCollapseProgress\n        );\n    }\n\n    position += dynamicData.xy * density;\n\n    float blackHoleAlpha = 1.0;\n    if (\n        gl_VertexID >= blackHoleStartIndex &&\n        gl_VertexID < blackHoleEndIndex\n    ) {\n        vec2 center = sceneCenter;\n        vec2 direction = position - center;\n        float directionLength = max(length(direction), 0.001);\n        float sourceDepth = clamp(depth, 0.0, 1.0);\n        float alignedRadius =\n            (200.0 * 0.5) *\n            mix(0.72, 1.18, sourceDepth) * density;\n        vec2 origin = center + direction / directionLength *\n            alignedRadius;\n        float transitionDepth = clamp((sphereDepth - 0.58) / 0.62, 0.0, 1.0);\n        float delayFraction =\n            (blackHoleDirection > 0.0 ? 1.0 - transitionDepth : transitionDepth) *\n            0.04 * 0.8;\n        float delayedRawProgress = clamp(\n            (blackHoleRawMotionProgress - delayFraction) / (1.0 - delayFraction),\n            0.0,\n            1.0\n        );\n        float delayedMotionProgress = springEase(delayedRawProgress, 0.08);\n        if (blackHoleDirection > 0.0) {\n            position = mix(origin, position, delayedMotionProgress);\n            blackHoleAlpha = blackHoleOpacityProgress;\n        } else {\n            position = mix(position, origin, delayedMotionProgress);\n            blackHoleAlpha = 1.0 - blackHoleOpacityProgress;\n        }\n    }\n\n    if (interactionRadius > 0.0) {\n        vec2 interactionDelta = position - interactionPoint;\n        float interactionDistance = length(interactionDelta);\n        if (interactionDistance < interactionRadius) {\n            float interactionFalloff =\n                1.0 - interactionDistance / interactionRadius;\n            vec2 interactionDirection = interactionDistance > 0.001\n                ? interactionDelta / interactionDistance\n                : vec2(0.0, -1.0);\n            float visualDepth = clamp(\n                (sphereDepth - 0.58) / 0.62,\n                0.0,\n                1.0\n            );\n            position += interactionDirection *\n                interactionFalloff * interactionFalloff *\n                interactionStrength * visualDepth;\n        }\n    }\n\n    float pulseScale = 0.1875 * 0.64;\n    float pulse = 1.0 - pulseScale +\n        pulseScale * cos(\n            time * 3.3 * pulseSpeed +\n                phase.y * 1.0\n    );\n    float pointRadius = pulse *\n        (0.68 + depth * 0.42) * sphereDepth * density;\n    gl_PointSize = max(pointRadius * 2.0, 1.0);\n\n    vec2 normalizedPosition = position / resolution;\n    gl_Position = vec4(\n        normalizedPosition.x * 2.0 - 1.0,\n        1.0 - normalizedPosition.y * 2.0,\n        0.0,\n        1.0\n    );\n    float denominationSize = 1.0;\n    resolvedParticleColor = particleColor;\n    if (gl_VertexID >= grayEndIndex) {\n        denominationSize = 1.16;\n        resolvedParticleColor = vec3(227.0, 198.0, 151.0) / 255.0;\n    } else if (gl_VertexID >= primaryEndIndex) {\n        denominationSize = 1.08;\n        resolvedParticleColor = vec3(179.0, 175.0, 173.0) / 255.0;\n    }\n    gl_PointSize *= denominationSize;\n    float baseParticleAlpha = ((50.0 + depth * 190.0) / 255.0) *\n        mix(0.72, 1.0, sphereDepth);\n    particleAlpha = mix(\n        baseParticleAlpha,\n        1.0,\n        blackHoleInfluence * 1.0\n    ) * blackHoleAlpha;\n}");
        try {
            int iA2 = r.a(35632, "#version 300 es\nprecision mediump float;\n\nin float particleAlpha;\nin vec3 resolvedParticleColor;\nout vec4 fragmentColor;\n\nvoid main() {\n    float distanceFromCenter = distance(gl_PointCoord, vec2(0.5));\n    if (distanceFromCenter >= 0.5) {\n        discard;\n    }\n    float edgeWidth = fwidth(distanceFromCenter);\n    float edgeAlpha = 1.0 - smoothstep(0.5 - edgeWidth, 0.5, distanceFromCenter);\n    float alpha = particleAlpha * edgeAlpha;\n    fragmentColor = vec4(resolvedParticleColor * alpha, alpha);\n}");
            try {
                rVar.f281757a = r.c(iA, iA2);
                GLES20.glDeleteShader(iA);
                GLES20.glDeleteShader(iA2);
                int[] iArr2 = new int[2];
                GLES20.glGenBuffers(2, iArr2, 0);
                int i = iArr2[0];
                this.g0 = i;
                int i2 = iArr2[1];
                this.f281786h0 = i2;
                if (i == 0 || i2 == 0) {
                    throw new IllegalStateException("Unable to create particle OpenGL buffers");
                }
                int[] iArr3 = new int[1];
                GLES30.glGenVertexArrays(1, iArr3, 0);
                int i3 = iArr3[0];
                this.i0 = i3;
                if (i3 == 0) {
                    throw new IllegalStateException("Unable to create particle OpenGL vertex array");
                }
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(1, 771);
                GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                GLES20.glUseProgram(rVar.f281757a);
                GLES20.glUniform1f(g().d, this.f281777a);
                m();
                l();
                float[] fArr = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] destinationY = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] phaseY = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] depth = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] sphereTheta = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] sphereY = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] sphereRadius = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                float[] sphereSpin = new float[b4.EXPIRED_OR_INVALID_KEY_VALUE];
                FloatBuffer buffer = ByteBuffer.allocateDirect(96000).order(ByteOrder.nativeOrder()).asFloatBuffer();
                tim.d dVar = new tim.d((int) 7, (int) 0);
                int i5 = 0;
                for (int i6 = b4.EXPIRED_OR_INVALID_KEY_VALUE; i5 < i6; i6 = b4.EXPIRED_OR_INVALID_KEY_VALUE) {
                    fArr[i5] = dVar.b();
                    destinationY[i5] = (dVar.b() * 0.68f) + 0.16f;
                    buffer.put(fArr[i5]);
                    buffer.put(destinationY[i5]);
                    buffer.put(dVar.b() * 3.1415927f * 2.0f);
                    float fB = dVar.b() * 3.1415927f * 2.0f;
                    phaseY[i5] = fB;
                    buffer.put(fB);
                    buffer.put((dVar.b() * 0.7f) + 0.25f);
                    buffer.put(dVar.b() + 0.35f);
                    float fB2 = (dVar.b() * 0.65f) + 0.35f;
                    depth[i5] = fB2;
                    buffer.put(fB2);
                    buffer.put((dVar.b() * 1.9f) + 0.45f);
                    sphereTheta[i5] = dVar.b() * 3.1415927f * 2.0f;
                    sphereY[i5] = (dVar.b() * 2.0f) - 1.0f;
                    tim.d dVar2 = dVar;
                    sphereRadius[i5] = (((float) Math.pow(dVar.b(), 0.45f)) * 0.82f) + 0.18f;
                    sphereSpin[i5] = (dVar2.b() * 0.7f) + 0.65f;
                    buffer.put(sphereTheta[i5]);
                    buffer.put(sphereY[i5]);
                    buffer.put(sphereRadius[i5]);
                    buffer.put(sphereSpin[i5]);
                    i5++;
                    dVar = dVar2;
                    fArr = fArr;
                }
                float[] destinationX = fArr;
                buffer.position(0);
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                Intrinsics.checkNotNullParameter(destinationX, "destinationX");
                Intrinsics.checkNotNullParameter(destinationY, "destinationY");
                Intrinsics.checkNotNullParameter(phaseY, "phaseY");
                Intrinsics.checkNotNullParameter(depth, "depth");
                Intrinsics.checkNotNullParameter(sphereTheta, "sphereTheta");
                Intrinsics.checkNotNullParameter(sphereY, "sphereY");
                Intrinsics.checkNotNullParameter(sphereRadius, "sphereRadius");
                Intrinsics.checkNotNullParameter(sphereSpin, "sphereSpin");
                this.S = destinationX;
                this.T = destinationY;
                this.U = phaseY;
                this.V = depth;
                this.W = sphereTheta;
                this.X = sphereY;
                this.Y = sphereRadius;
                this.Z = sphereSpin;
                GLES20.glBindBuffer(34962, this.g0);
                GLES20.glBufferData(34962, buffer.capacity() * 4, buffer, 35044);
                GLES20.glBindBuffer(34962, 0);
                GLES20.glBindBuffer(34962, this.f281786h0);
                GLES20.glBufferData(34962, 32000, null, 35048);
                GLES20.glBindBuffer(34962, 0);
                GLES30.glBindVertexArray(this.i0);
                GLES20.glBindBuffer(34962, this.g0);
                e(0, 2, 0);
                e(1, 2, 2);
                e(2, 2, 4);
                e(3, 1, 6);
                e(4, 1, 7);
                e(6, 1, 8);
                e(7, 1, 9);
                e(8, 1, 10);
                e(9, 1, 11);
                GLES20.glBindBuffer(34962, this.f281786h0);
                GLES20.glEnableVertexAttribArray(5);
                GLES20.glVertexAttribPointer(5, 4, 5126, false, 16, 0);
                GLES30.glBindVertexArray(0);
                GLES20.glBindBuffer(34962, 0);
                b bVar = this.f281791n;
                k(bVar != null ? bVar.d : 0);
                j(this.e, this.f);
                this.f281792p = System.nanoTime();
                Intrinsics.checkNotNullParameter("initialization", "operation");
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError != 0) {
                    throw new IllegalStateException(a0.d.n("Particle OpenGL error after initialization: ", iGlGetError).toString());
                }
            } catch (Throwable th10) {
                GLES20.glDeleteShader(iA);
                GLES20.glDeleteShader(iA2);
                throw th10;
            }
        } catch (Exception e) {
            GLES20.glDeleteShader(iA);
            throw e;
        }
    }

    public final void i() {
        int i = this.i0;
        if (i != 0) {
            GLES30.glDeleteVertexArrays(1, new int[]{i}, 0);
            this.i0 = 0;
        }
        int i2 = this.g0;
        if (i2 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
            this.g0 = 0;
        }
        int i3 = this.f281786h0;
        if (i3 != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i3}, 0);
            this.f281786h0 = 0;
        }
        r rVar = this.f281781c;
        int i5 = rVar.f281757a;
        if (i5 != 0) {
            GLES20.glDeleteProgram(i5);
            rVar.f281757a = 0;
        }
        q qVar = this.f281779b;
        if (Intrinsics.f(qVar.f281755b, EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLDisplay eGLDisplay = qVar.f281755b;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        if (!Intrinsics.f(qVar.d, EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(qVar.f281755b, qVar.d);
        }
        if (!Intrinsics.f(qVar.f281756c, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(qVar.f281755b, qVar.f281756c);
        }
        EGL14.eglTerminate(qVar.f281755b);
        EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        qVar.d = EGL_NO_SURFACE;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        qVar.f281756c = EGL_NO_CONTEXT;
        EGLDisplay EGL_NO_DISPLAY = EGL14.EGL_NO_DISPLAY;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        qVar.f281755b = EGL_NO_DISPLAY;
    }

    public final void j(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.k = Math.min(i, i2) * 0.38f;
        float fHypot = ((float) Math.hypot(this.e, this.f)) * 0.72f;
        float f = fHypot / 7.0f;
        float[] fArr = this.v;
        zhm.p.o(fArr, BitmapDescriptorFactory.HUE_RED, 0, fArr.length);
        for (int i3 = 1; i3 < 5; i3++) {
            fArr[i3] = fArr[i3 - 1] + f;
            f *= 1.2f;
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        this.f281798x = fHypot + fArr[fArr.length - 1];
        GLES20.glViewport(0, 0, this.e, this.f);
        GLES20.glUseProgram(this.f281781c.f281757a);
        GLES20.glUniform2f(g().f281764a, this.e, this.f);
        a();
    }

    public final void k(int i) {
        int i2 = this.j0;
        float[] fArr = this.f281782d0;
        float[] fArr2 = this.c0;
        float[] fArr3 = this.f281780b0;
        float[] fArr4 = this.f281778a0;
        if (i > i2) {
            zhm.p.o(fArr4, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(fArr3, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(fArr2, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(fArr, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(this.Q, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(this.R, BitmapDescriptorFactory.HUE_RED, i2, i);
            zhm.p.o(this.f281783e0, BitmapDescriptorFactory.HUE_RED, i2 * 4, i * 4);
        }
        this.j0 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            if (Math.abs(fArr4[i3]) > 0.01f || Math.abs(fArr3[i3]) > 0.01f || Math.abs(fArr2[i3]) > 0.01f || Math.abs(fArr[i3]) > 0.01f) {
                z = true;
                break;
            }
        }
        this.z = z;
        this.A = true;
        if (!this.E || i <= i2) {
            return;
        }
        f(i2);
    }

    public final void l() {
        b bVar = this.f281791n;
        int i = bVar != null ? bVar.f281677a : this.j0;
        int i2 = (bVar != null ? bVar.f281678b : 0) + i;
        GLES20.glUniform1i(g().f, i);
        GLES20.glUniform1i(g().f281767g, i2);
    }

    public final void m() {
        GLES20.glUniform3f(g().e, Color.red(this.f281790m) / 255.0f, Color.green(this.f281790m) / 255.0f, Color.blue(this.f281790m) / 255.0f);
    }

    public final void n(float f) {
        float f4 = 1.0f - f;
        int i = this.j0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 4;
            float f5 = (this.Q[i2] * f4) + this.O[i2];
            float[] fArr = this.f281783e0;
            fArr[i3 + 2] = f5;
            fArr[i3 + 3] = (this.R[i2] * f4) + this.P[i2];
        }
        this.A = true;
    }
}
