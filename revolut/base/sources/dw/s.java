package dw;

import android.content.Context;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.revolut.camerakit.core.settings.WatermarkConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class s implements i {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f118211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118213c;
    public final c d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118215h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f118216j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f118217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f118218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f118219n;
    public q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f118220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f118221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f118222r;

    public s(Context context, fw.b maskBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(maskBuilder, "maskBuilder");
        this.f118211a = context;
        this.d = new c(0);
        this.e = -1;
        this.f = -1;
        this.f118214g = -1;
        this.f118215h = -1;
        this.i = -1;
        this.f118216j = -1;
        this.k = -1;
        this.f118217l = -1;
        this.f118222r = -1;
    }

    @Override // dw.i
    public final void a() {
        Context context = this.f118211a;
        try {
            Thread.currentThread();
            this.f118213c = false;
            this.d.c();
            int iB = d.b(35633, ew.d.a(context, "vertex_shader.vert"));
            int iB2 = d.b(35632, ew.d.a(context, "pass_through_fragment_shader.frag"));
            int iA = d.a(iB, iB2);
            GLES20.glDeleteShader(iB);
            GLES20.glDeleteShader(iB2);
            this.e = iA;
            int iB3 = d.b(35633, ew.d.a(context, "watermark_overlay_vertex_shader.vert"));
            int iB4 = d.b(35632, ew.d.a(context, "watermark_overlay_fragment_shader.frag"));
            int iA2 = d.a(iB3, iB4);
            GLES20.glDeleteShader(iB3);
            GLES20.glDeleteShader(iB4);
            this.f = iA2;
            e();
            this.f118222r = ew.b.a();
        } catch (Throwable th10) {
            release();
            throw th10;
        }
    }

    @Override // dw.i
    public final int b() {
        return this.f118222r;
    }

    public final void c(r rVar, int i) {
        if (rVar == null) {
            return;
        }
        FloatBuffer floatBuffer = rVar.f118209a;
        GLES20.glBlendEquationSeparate(i, 32774);
        GLES20.glEnableVertexAttribArray(this.k);
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glDrawArrays(4, 0, rVar.f118210b);
        GLES20.glDisableVertexAttribArray(this.k);
    }

    public final void d() {
        int i;
        List listU;
        List list;
        q qVar = this.o;
        int i2 = this.f118218m;
        if (i2 <= 0 || (i = this.f118219n) <= 0 || qVar == null) {
            this.f118220p = null;
            this.f118221q = null;
            this.f118212b = false;
            return;
        }
        String nonce = qVar.f118207a;
        WatermarkConfig config = qVar.f118208b;
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(config, "config");
        int i3 = config.f50748a;
        int i5 = config.d;
        int i6 = config.f50750c;
        if (i3 <= 0 || i6 < 0 || i6 >= 101 || i5 < 4 || (i5 + 7) / 8 > 32) {
            listU = f0.f322471a;
        } else {
            double d = i6;
            double d5 = 100;
            int iB = rim.d.b((((double) i2) * d) / d5);
            int iB2 = rim.d.b((((double) i) * d) / d5);
            int i21 = i5 - 4;
            int i22 = i21 / 4;
            int i32 = i21 % 4;
            int i33 = (i32 > 0 ? 1 : 0) + i22;
            int i43 = (i32 > 1 ? 1 : 0) + i22;
            int i59 = (i32 > 2 ? 1 : 0) + i22;
            if (i2 > 0 && i > 0) {
                int iMax = Math.max(i33, i59) + 2;
                int iMax2 = Math.max(i43, i22) + 2;
                if (i2 - (iB * 2) >= iMax * i3 && i - (iB2 * 2) >= iMax2 * i3) {
                    fw.c cVar = new fw.c(iB, iB2);
                    int i66 = (i2 - iB) - i3;
                    fw.c cVar2 = new fw.c(i66, iB2);
                    int i74 = (i - iB2) - i3;
                    fw.c cVar3 = new fw.c(i66, i74);
                    fw.c cVar4 = new fw.c(iB, i74);
                    listU = w.u(zhm.v.k(zhm.u.c(cVar), fw.b.a(cVar, cVar2, i33), zhm.u.c(cVar2), fw.b.a(cVar2, cVar3, i43), zhm.u.c(cVar3), fw.b.a(cVar3, cVar4, i59), zhm.u.c(cVar4), fw.b.a(cVar4, cVar, i22)));
                }
            }
            listU = f0.f322471a;
        }
        if (listU.isEmpty()) {
            list = f0.f322471a;
        } else {
            byte[] bytes = nonce.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            int[] iArr = new int[i5];
            for (int i92 = 0; i92 < i5; i92++) {
                iArr[i92] = (bArrDigest[i92 / 8] >> (7 - (i92 % 8))) & 1;
            }
            ArrayList arrayList = new ArrayList(i5);
            for (int i96 = 0; i96 < i5; i96++) {
                fw.c cVar5 = (fw.c) listU.get(i96);
                arrayList.add(new fw.a(cVar5.f138507a, cVar5.f138508b, i3, iArr[i96] == 1 ? fw.d.POSITIVE : fw.d.NEGATIVE));
            }
            list = arrayList;
        }
        this.f118220p = f(list, fw.d.POSITIVE);
        r rVarF = f(list, fw.d.NEGATIVE);
        this.f118221q = rVarF;
        this.f118212b = (this.f118220p == null && rVarF == null) ? false : true;
    }

    public final void e() {
        this.f118215h = GLES20.glGetUniformLocation(this.e, "u_TextMatrix");
        this.i = GLES20.glGetAttribLocation(this.e, "a_Position");
        this.f118216j = GLES20.glGetAttribLocation(this.e, "a_TextCoord");
        this.f118214g = GLES20.glGetUniformLocation(this.e, "externalTexture");
        this.k = GLES20.glGetAttribLocation(this.f, "aPosition");
        this.f118217l = GLES20.glGetUniformLocation(this.f, "uDelta");
    }

    public final r f(List list, fw.d dVar) {
        Iterable oVar;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            fw.a aVar = (fw.a) it8.next();
            fw.d dVar2 = aVar.d;
            int i = aVar.f138504a;
            if (dVar2 == dVar) {
                int i2 = this.f118218m;
                float f = ((i * 2.0f) / i2) - 1.0f;
                int i3 = aVar.f138506c;
                float f4 = (((i + i3) * 2.0f) / i2) - 1.0f;
                int i5 = aVar.f138505b;
                int i6 = this.f118219n;
                float f5 = 1.0f - ((i5 * 2.0f) / i6);
                float f6 = 1.0f - (((i5 + i3) * 2.0f) / i6);
                float[] fArr = {f, f5, f, f6, f4, f5, f4, f5, f, f6, f4, f6};
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                oVar = new zhm.o(fArr, 2);
            } else {
                oVar = f0.f322471a;
            }
            a0.x(oVar, arrayList);
        }
        float[] fArrA1 = d0.a1(arrayList);
        if (fArrA1.length == 0) {
            return null;
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrA1.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrA1);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "apply(...)");
        return new r(floatBufferAsFloatBuffer, fArrA1.length / 2);
    }

    @Override // dw.i
    public final void release() {
        if (this.f118213c) {
            return;
        }
        this.f118220p = null;
        this.f118221q = null;
        int i = this.e;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.e = -1;
        }
        int i2 = this.f;
        if (i2 != -1) {
            GLES20.glDeleteProgram(i2);
            this.f = -1;
        }
        int i3 = this.f118222r;
        if (i3 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.f118222r = -1;
        }
        this.d.e();
        this.f118213c = true;
    }

    @Override // dw.i
    public final void setOutputSurface(Surface surface) {
        if (this.f118213c) {
            return;
        }
        c cVar = this.d;
        if (cVar.f != surface) {
            if (cVar.f118169g != null) {
                EGLSurface eGLSurface = cVar.e;
                if (eGLSurface == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.d(eGLSurface);
                cVar.b();
            }
            cVar.f = surface;
        }
        if (surface == null) {
            this.f118218m = 0;
            this.f118219n = 0;
            this.f118220p = null;
            this.f118221q = null;
            this.f118212b = false;
        }
    }
}
