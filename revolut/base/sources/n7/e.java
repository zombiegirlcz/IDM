package n7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.c0;
import d7.f0;
import g7.u;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends b {
    public final e7.a D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final c0 H;
    public u I;
    public u J;
    public final g7.h K;
    public r7.j L;
    public a80.e M;

    public e(LottieDrawable lottieDrawable, h hVar) {
        super(lottieDrawable, hVar);
        this.D = new e7.a(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = hVar.f212951g;
        d7.j jVar = lottieDrawable.f25588a;
        this.H = jVar == null ? null : (c0) ((HashMap) jVar.c()).get(str);
        com.google.firebase.messaging.u uVar = this.f212939p.f212963x;
        if (uVar != null) {
            this.K = new g7.h(this, this, uVar);
        }
    }

    @Override // n7.b, f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapQ;
        super.a(rectF, matrix, z);
        c0 c0Var = this.H;
        if (c0Var != null) {
            int i = c0Var.f111644b;
            int i2 = c0Var.f111643a;
            float fC = r7.l.c();
            if (this.o.o || (bitmapQ = q()) == null) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2 * fC, i * fC);
            } else {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapQ.getWidth() * fC, bitmapQ.getHeight() * fC);
            }
            this.f212938n.mapRect(rectF);
        }
    }

    @Override // n7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        if (obj2 == f0.I) {
            if (cVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new u(null, cVar);
                return;
            }
        }
        if (obj2 == f0.L) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new u(null, cVar);
                return;
            }
        }
        g7.h hVar = this.K;
        if (obj2 == 5 && hVar != null) {
            hVar.f141035c.k(cVar);
            return;
        }
        if (obj2 == f0.E && hVar != null) {
            hVar.b(cVar);
            return;
        }
        if (obj2 == f0.F && hVar != null) {
            hVar.e.k(cVar);
            return;
        }
        if (obj2 == f0.G && hVar != null) {
            hVar.f.k(cVar);
        } else {
            if (obj2 != f0.H || hVar == null) {
                return;
            }
            hVar.f141036g.k(cVar);
        }
    }

    @Override // n7.b
    public final void i(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        c0 c0Var;
        Bitmap bitmapQ = q();
        if (bitmapQ == null || bitmapQ.isRecycled() || (c0Var = this.H) == null) {
            return;
        }
        float fC = r7.l.c();
        e7.a aVar2 = this.D;
        aVar2.setAlpha(i);
        u uVar = this.I;
        if (uVar != null) {
            aVar2.setColorFilter((ColorFilter) uVar.f());
        }
        g7.h hVar = this.K;
        if (hVar != null) {
            aVar = hVar.a(matrix, i);
        }
        int width = bitmapQ.getWidth();
        int height = bitmapQ.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.o;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (c0Var.f111643a * fC), (int) (c0Var.f111644b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapQ.getWidth() * fC), (int) (bitmapQ.getHeight() * fC));
        }
        boolean z3 = aVar != null;
        if (z3) {
            if (this.L == null) {
                this.L = new r7.j();
            }
            if (this.M == null) {
                this.M = new a80.e(5, (byte) 0);
            }
            this.M.p();
            a80.e eVar = this.M;
            aVar.getClass();
            r7.a aVar3 = new r7.a(aVar);
            eVar.f1989c = aVar3;
            aVar3.c(i);
            float f = rect2.left;
            float f4 = rect2.top;
            float f5 = rect2.right;
            float f6 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f4, f5, f6);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapQ, rect, rect2, aVar2);
        if (z3) {
            this.L.c();
            if (this.L.f251950c == r7.i.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap q() {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e.q():android.graphics.Bitmap");
    }
}
