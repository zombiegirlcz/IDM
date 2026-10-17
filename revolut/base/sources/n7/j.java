package n7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.firebase.messaging.u;
import d7.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m7.s;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    public final f7.e D;
    public final d E;
    public final g7.h F;

    public j(LottieDrawable lottieDrawable, h hVar, d dVar, d7.j jVar) {
        super(lottieDrawable, hVar);
        this.E = dVar;
        f7.e eVar = new f7.e(lottieDrawable, this, new s("__container", hVar.f212948a, false), jVar);
        this.D = eVar;
        List list = Collections.EMPTY_LIST;
        eVar.e(list, list);
        u uVar = this.f212939p.f212963x;
        if (uVar != null) {
            this.F = new g7.h(this, this, uVar);
        }
    }

    @Override // n7.b, f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.D.a(rectF, this.f212938n, z);
    }

    @Override // n7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        PointF pointF = f0.f111651a;
        g7.h hVar = this.F;
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
        g7.h hVar = this.F;
        if (hVar != null) {
            aVar = hVar.a(matrix, i);
        }
        this.D.g(canvas, matrix, i, aVar);
    }

    @Override // n7.b
    public final yf.c j() {
        yf.c cVar = this.f212939p.f212962w;
        return cVar != null ? cVar : this.E.f212939p.f212962w;
    }

    @Override // n7.b
    public final void n(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        this.D.c(fVar, i, arrayList, fVar2);
    }
}
