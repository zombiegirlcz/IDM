package n7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.u;
import d7.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public g7.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final r7.j I;
    public final a80.e J;
    public Boolean K;
    public Boolean L;
    public float M;
    public boolean N;
    public final g7.h O;

    public d(LottieDrawable lottieDrawable, h hVar, List list, d7.j jVar) {
        b bVar;
        b jVar2;
        super(lottieDrawable, hVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new r7.j();
        this.J = new a80.e(5, (byte) 0);
        this.N = true;
        l7.b bVar2 = hVar.f212960s;
        if (bVar2 != null) {
            g7.i iVarA = bVar2.a();
            this.D = iVarA;
            b(iVarA);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(jVar.f111682j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < longSparseArray.size(); i++) {
                    b bVar4 = (b) longSparseArray.get(longSparseArray.keyAt(i));
                    if (bVar4 != null && (bVar = (b) longSparseArray.get(bVar4.f212939p.f)) != null) {
                        bVar4.f212943t = bVar;
                    }
                }
                u uVar = this.f212939p.f212963x;
                if (uVar != null) {
                    this.O = new g7.h(this, this, uVar);
                    return;
                }
                return;
            }
            h hVar2 = (h) list.get(size);
            switch (a.f212928a[hVar2.e.ordinal()]) {
                case 1:
                    jVar2 = new j(lottieDrawable, hVar2, this, jVar);
                    break;
                case 2:
                    jVar2 = new d(lottieDrawable, hVar2, (List) jVar.f111679c.get(hVar2.f212951g), jVar);
                    break;
                case 3:
                    jVar2 = new k(lottieDrawable, hVar2);
                    break;
                case 4:
                    jVar2 = new e(lottieDrawable, hVar2);
                    break;
                case 5:
                    jVar2 = new i(lottieDrawable, hVar2);
                    break;
                case 6:
                    jVar2 = new o(lottieDrawable, hVar2);
                    break;
                default:
                    r7.c.b("Unknown layer type " + hVar2.e);
                    jVar2 = null;
                    break;
            }
            if (jVar2 != null) {
                longSparseArray.put(jVar2.f212939p.d, jVar2);
                if (bVar3 != null) {
                    bVar3.f212942s = jVar2;
                    bVar3 = null;
                } else {
                    this.E.add(0, jVar2);
                    int i2 = c.f212947a[hVar2.u.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        bVar3 = jVar2;
                    }
                }
            }
            size--;
        }
    }

    @Override // n7.b, f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ((b) arrayList.get(size)).a(rectF2, this.f212938n, true);
            rectF.union(rectF2);
        }
    }

    @Override // n7.b, k7.g
    public final void f(Object obj2, s7.c cVar) {
        super.f(obj2, cVar);
        if (obj2 == f0.C) {
            if (cVar == null) {
                g7.e eVar = this.D;
                if (eVar != null) {
                    eVar.k(null);
                    return;
                }
                return;
            }
            g7.u uVar = new g7.u(null, cVar);
            this.D = uVar;
            uVar.a(this);
            b(this.D);
            return;
        }
        g7.h hVar = this.O;
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
        Canvas canvasE;
        d7.a aVar2 = d7.d.f111646a;
        boolean z = false;
        g7.h hVar = this.O;
        boolean z3 = (aVar == null && hVar == null) ? false : true;
        LottieDrawable lottieDrawable = this.o;
        boolean z4 = lottieDrawable.u;
        ArrayList<b> arrayList = this.E;
        if ((z4 && arrayList.size() > 1 && i != 255) || (z3 && lottieDrawable.v)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (hVar != null) {
            aVar = hVar.a(matrix, i2);
        }
        boolean z6 = this.N;
        h hVar2 = this.f212939p;
        RectF rectF = this.G;
        if (z6 || !"__container".equals(hVar2.f212950c)) {
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, hVar2.o, hVar2.f212957p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (b bVar : arrayList) {
                RectF rectF2 = this.H;
                bVar.a(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        r7.j jVar = this.I;
        if (z) {
            a80.e eVar = this.J;
            eVar.p();
            eVar.f1988b = i;
            if (aVar != null) {
                aVar.a(eVar);
                aVar = null;
            }
            canvasE = jVar.e(canvas, rectF, eVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).g(canvasE, matrix, i2, aVar);
            }
        }
        if (z) {
            jVar.c();
        }
        canvas.restore();
        d7.a aVar3 = d7.d.f111646a;
    }

    @Override // n7.b
    public final void n(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i2)).c(fVar, i, arrayList, fVar2);
            i2++;
        }
    }

    @Override // n7.b
    public final void o(boolean z) {
        super.o(z);
        Iterator it8 = this.E.iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).o(z);
        }
    }

    @Override // n7.b
    public final void p(float f) {
        d7.a aVar = d7.d.f111646a;
        this.M = f;
        super.p(f);
        g7.e eVar = this.D;
        h hVar = this.f212939p;
        if (eVar != null) {
            d7.j jVar = this.o.f25588a;
            f = ((((Float) eVar.f()).floatValue() * hVar.f212949b.f111685n) - hVar.f212949b.f111683l) / ((jVar.f111684m - jVar.f111683l) + 0.01f);
        }
        if (this.D == null) {
            float f4 = hVar.f212956n;
            d7.j jVar2 = hVar.f212949b;
            f -= f4 / (jVar2.f111684m - jVar2.f111683l);
        }
        if (hVar.f212955m != BitmapDescriptorFactory.HUE_RED && !"__container".equals(hVar.f212950c)) {
            f /= hVar.f212955m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).p(f);
        }
        d7.a aVar2 = d7.d.f111646a;
    }

    public final boolean q() {
        if (this.L == null) {
            ArrayList arrayList = this.E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                if (bVar instanceof j) {
                    if (bVar.k()) {
                        this.L = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof d) && ((d) bVar).q()) {
                    this.L = Boolean.TRUE;
                    return true;
                }
            }
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }
}
