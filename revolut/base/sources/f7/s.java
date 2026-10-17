package f7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import d7.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
public final class s implements f, o, k, g7.a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f132532a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f132533b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f132534c;
    public final n7.b d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g7.i f132535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g7.i f132536h;
    public final g7.t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f132537j;

    public s(LottieDrawable lottieDrawable, n7.b bVar, m7.o oVar) {
        this.f132534c = lottieDrawable;
        this.d = bVar;
        this.e = oVar.f203252b;
        this.f = oVar.d;
        g7.i iVarA = oVar.f203253c.a();
        this.f132535g = iVarA;
        bVar.b(iVarA);
        iVarA.a(this);
        g7.i iVarA2 = ((l7.b) oVar.e).a();
        this.f132536h = iVarA2;
        bVar.b(iVarA2);
        iVarA2.a(this);
        l7.f fVar = (l7.f) oVar.f;
        fVar.getClass();
        g7.t tVar = new g7.t(fVar);
        this.i = tVar;
        tVar.a(bVar);
        tVar.b(this);
    }

    @Override // f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f132537j.a(rectF, matrix, z);
    }

    @Override // f7.k
    public final void b(ListIterator listIterator) {
        if (this.f132537j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f132537j = new e(this.f132534c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        r7.g.g(fVar, i, arrayList, fVar2, this);
        for (int i2 = 0; i2 < this.f132537j.i.size(); i2++) {
            d dVar = (d) this.f132537j.i.get(i2);
            if (dVar instanceof l) {
                r7.g.g(fVar, i, arrayList, fVar2, (l) dVar);
            }
        }
    }

    @Override // g7.a
    public final void d() {
        this.f132534c.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        this.f132537j.e(list, list2);
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        if (this.i.c(obj2, cVar)) {
            return;
        }
        if (obj2 == f0.f111663s) {
            this.f132535g.k(cVar);
        } else if (obj2 == f0.f111664t) {
            this.f132536h.k(cVar);
        }
    }

    @Override // f7.f
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        float fFloatValue = ((Float) this.f132535g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f132536h.f()).floatValue();
        g7.t tVar = this.i;
        float fFloatValue3 = ((Float) tVar.v.f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) tVar.f141068w.f()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.f132532a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(tVar.f(f + fFloatValue2));
            this.f132537j.g(canvas, matrix2, (int) (r7.g.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), aVar);
        }
    }

    @Override // f7.d
    public final String getName() {
        return this.e;
    }

    @Override // f7.o
    public final Path getPath() {
        Path path = this.f132537j.getPath();
        Path path2 = this.f132533b;
        path2.reset();
        float fFloatValue = ((Float) this.f132535g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f132536h.f()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.f132532a;
            matrix.set(matrixF);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
