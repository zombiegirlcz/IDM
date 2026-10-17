package f7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import d7.f0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n7.b f132545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f132546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f132547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g7.f f132548t;
    public g7.u u;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(LottieDrawable lottieDrawable, n7.b bVar, m7.x xVar) {
        m7.v vVar = xVar.f203272g;
        vVar.getClass();
        int i = m7.u.f203267a[vVar.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        m7.w wVar = xVar.f203273h;
        wVar.getClass();
        int i2 = m7.u.f203268b[wVar.ordinal()];
        super(lottieDrawable, bVar, cap, i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, xVar.i, xVar.e, xVar.f, xVar.f203271c, xVar.f203270b);
        this.f132545q = bVar;
        this.f132546r = xVar.f203269a;
        this.f132547s = xVar.f203274j;
        g7.e eVarA = xVar.d.a();
        this.f132548t = (g7.f) eVarA;
        eVarA.a(this);
        bVar.b(eVarA);
    }

    @Override // f7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        PointF pointF = f0.f111651a;
        g7.f fVar = this.f132548t;
        if (obj2 == 2) {
            fVar.k(cVar);
            return;
        }
        if (obj2 == f0.I) {
            g7.u uVar = this.u;
            n7.b bVar = this.f132545q;
            if (uVar != null) {
                bVar.m(uVar);
            }
            if (cVar == null) {
                this.u = null;
                return;
            }
            g7.u uVar2 = new g7.u(null, cVar);
            this.u = uVar2;
            uVar2.a(this);
            bVar.b(fVar);
        }
    }

    @Override // f7.b, f7.f
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        if (this.f132547s) {
            return;
        }
        g7.f fVar = this.f132548t;
        int iM = fVar.m(fVar.b(), fVar.d());
        e7.a aVar2 = this.i;
        aVar2.setColor(iM);
        g7.u uVar = this.u;
        if (uVar != null) {
            aVar2.setColorFilter((ColorFilter) uVar.f());
        }
        super.g(canvas, matrix, i, aVar);
    }

    @Override // f7.d
    public final String getName() {
        return this.f132546r;
    }
}
