package dw;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.IntBuffer;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f118185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f118186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f118187c;
    public volatile boolean d;
    public a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118189h;
    public o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f118190j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f118191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f118192m;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118185a = context;
        z1 z1VarB = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        this.f118186b = z1VarB;
        this.f118187c = z1VarB;
        this.d = true;
        this.e = a.NONE;
        this.f = new c(0);
        this.f118188g = -1;
        this.f118189h = -1;
        this.k = -1;
        this.f118191l = -1;
        this.f118192m = -1;
    }

    @Override // dw.i
    public final void a() {
        try {
            Thread.currentThread();
            this.f.c();
            c();
            this.f118192m = ew.b.a();
            e();
            int i = this.f118192m;
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            this.i = new o(this.f118188g, this.f118189h);
        } catch (Throwable th10) {
            release();
            throw th10;
        }
    }

    @Override // dw.i
    public final int b() {
        return this.f118192m;
    }

    public final void c() {
        Context context = this.f118185a;
        int iB = d.b(35633, ew.d.a(context, "vertex_shader.vert"));
        int iB2 = d.b(35632, ew.d.a(context, "pass_through_fragment_shader.frag"));
        int iB3 = d.b(35632, ew.d.a(context, "blur_fragment_shader.frag"));
        this.f118188g = d.a(iB, iB2);
        this.f118189h = d.a(iB, iB3);
        GLES20.glDeleteShader(iB);
        GLES20.glDeleteShader(iB2);
        GLES20.glDeleteShader(iB3);
    }

    public final void d(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (Intrinsics.f(rect, this.f118190j)) {
            return;
        }
        this.f118190j = rect;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i = this.f118191l;
        if (i != -1) {
            GLES20.glDeleteTextures(1, IntBuffer.wrap(new int[]{i}));
            this.f118191l = -1;
        }
        int i2 = this.k;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, IntBuffer.wrap(new int[]{i2}));
            this.k = -1;
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenTextures(1, iArr2, 0);
        this.k = iArr[0];
        int i3 = iArr2[0];
        this.f118191l = i3;
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, iWidth, iHeight, 0, 6408, 5121, null);
        GLES20.glBindFramebuffer(36160, this.k);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f118191l, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public final void e() {
        Iterator it8 = zhm.v.k(Integer.valueOf(this.f118188g), Integer.valueOf(this.f118189h)).iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            GLES20.glUseProgram(iIntValue);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(iIntValue, "externalTexture"), 0);
        }
    }

    @Override // dw.i
    public final void release() {
        GLES20.glDeleteFramebuffers(1, IntBuffer.wrap(new int[]{this.k}));
        this.k = -1;
        GLES20.glDeleteTextures(2, IntBuffer.wrap(new int[]{this.f118192m, this.f118191l}));
        this.f118192m = -1;
        this.f118191l = -1;
        GLES20.glDeleteShader(this.f118188g);
        GLES20.glDeleteProgram(this.f118189h);
        this.f118188g = -1;
        this.f118189h = -1;
        this.f.e();
        this.f118192m = -1;
    }

    @Override // dw.i
    public final void setOutputSurface(Surface surface) {
        c cVar = this.f;
        if (cVar.f == surface) {
            return;
        }
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
}
