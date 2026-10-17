package n7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d7.j0;
import g7.s;
import g7.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r10.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements f7.f, g7.a, k7.g {
    public float A;
    public BlurMaskFilter B;
    public e7.a C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f212930a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f212931b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f212932c = new Matrix();
    public final e7.a d = new e7.a(1);
    public final e7.a e;
    public final e7.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e7.a f212933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e7.a f212934h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f212935j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f212936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f212937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f212938n;
    public final LottieDrawable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f212939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f212940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g7.i f212941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f212942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f212943t;
    public List u;
    public final ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f212944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f212945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f212946y;
    public e7.a z;

    public b(LottieDrawable lottieDrawable, h hVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new e7.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new e7.a(mode2);
        e7.a aVar = new e7.a(1);
        this.f212933g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        e7.a aVar2 = new e7.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f212934h = aVar2;
        this.i = new RectF();
        this.f212935j = new RectF();
        this.k = new RectF();
        this.f212936l = new RectF();
        this.f212937m = new RectF();
        this.f212938n = new Matrix();
        this.v = new ArrayList();
        this.f212945x = true;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.o = lottieDrawable;
        this.f212939p = hVar;
        List list = hVar.f212952h;
        if (hVar.u == g.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        l7.f fVar = hVar.i;
        fVar.getClass();
        t tVar = new t(fVar);
        this.f212944w = tVar;
        tVar.b(this);
        if (list != null && !list.isEmpty()) {
            v vVar = new v(list);
            this.f212940q = vVar;
            Iterator it8 = vVar.p().iterator();
            while (it8.hasNext()) {
                ((g7.e) it8.next()).a(this);
            }
            for (g7.e eVar : this.f212940q.r()) {
                b(eVar);
                eVar.a(this);
            }
        }
        h hVar2 = this.f212939p;
        if (hVar2.f212961t.isEmpty()) {
            if (true != this.f212945x) {
                this.f212945x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        g7.i iVar = new g7.i(hVar2.f212961t);
        this.f212941r = iVar;
        iVar.f141028b = true;
        iVar.a(new s(this, 3));
        boolean z = ((Float) this.f212941r.f()).floatValue() == 1.0f;
        if (z != this.f212945x) {
            this.f212945x = z;
            this.o.invalidateSelf();
        }
        b(this.f212941r);
    }

    @Override // f7.f
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        h();
        Matrix matrix2 = this.f212938n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.u.get(size)).f212944w.e());
                }
            } else {
                b bVar = this.f212943t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f212944w.e());
                }
            }
        }
        matrix2.preConcat(this.f212944w.e());
    }

    public final void b(g7.e eVar) {
        if (eVar == null) {
            return;
        }
        this.v.add(eVar);
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        b bVar = this.f212942s;
        h hVar = this.f212939p;
        if (bVar != null) {
            String str = bVar.f212939p.f212950c;
            k7.f fVar3 = new k7.f(fVar2);
            fVar3.f181767a.add(str);
            if (fVar.a(i, this.f212942s.f212939p.f212950c)) {
                b bVar2 = this.f212942s;
                k7.f fVar4 = new k7.f(fVar3);
                fVar4.f181768b = bVar2;
                arrayList.add(fVar4);
            }
            if (fVar.c(i, this.f212942s.f212939p.f212950c) && fVar.d(i, hVar.f212950c)) {
                this.f212942s.n(fVar, fVar.b(i, this.f212942s.f212939p.f212950c) + i, arrayList, fVar3);
            }
        }
        String str2 = hVar.f212950c;
        String str3 = hVar.f212950c;
        if (fVar.c(i, str2)) {
            if (!"__container".equals(str3)) {
                k7.f fVar5 = new k7.f(fVar2);
                fVar5.f181767a.add(str3);
                if (fVar.a(i, str3)) {
                    k7.f fVar6 = new k7.f(fVar5);
                    fVar6.f181768b = this;
                    arrayList.add(fVar6);
                }
                fVar2 = fVar5;
            }
            if (fVar.d(i, str3)) {
                n(fVar, fVar.b(i, str3) + i, arrayList, fVar2);
            }
        }
    }

    @Override // g7.a
    public final void d() {
        this.o.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
    }

    @Override // k7.g
    public void f(Object obj2, s7.c cVar) {
        this.f212944w.c(obj2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022f  */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, r7.a r24) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.b.g(android.graphics.Canvas, android.graphics.Matrix, int, r7.a):void");
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.f212943t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (b bVar = this.f212943t; bVar != null; bVar = bVar.f212943t) {
            this.u.add(bVar);
        }
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i, r7.a aVar);

    public yf.c j() {
        return this.f212939p.f212962w;
    }

    public final boolean k() {
        v vVar = this.f212940q;
        return (vVar == null || vVar.p().isEmpty()) ? false : true;
    }

    public final void l() {
        j0 j0Var = this.o.f25588a.f111677a;
        String str = this.f212939p.f212950c;
        HashMap map = j0Var.f111690c;
        if (j0Var.f111688a) {
            r7.f fVar = (r7.f) map.get(str);
            if (fVar == null) {
                fVar = new r7.f();
                map.put(str, fVar);
            }
            fVar.a();
            if (str.equals("__container")) {
                Iterator<E> it8 = j0Var.f111689b.iterator();
                if (it8.hasNext()) {
                    a0.d.B(it8.next());
                    throw null;
                }
            }
        }
    }

    public final void m(g7.e eVar) {
        this.v.remove(eVar);
    }

    public void n(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
    }

    public void o(boolean z) {
        if (z && this.z == null) {
            this.z = new e7.a();
        }
        this.f212946y = z;
    }

    public void p(float f) {
        d7.a aVar = d7.d.f111646a;
        t tVar = this.f212944w;
        g7.e eVar = tVar.f141063p;
        if (eVar != null) {
            eVar.j(f);
        }
        g7.e eVar2 = tVar.v;
        if (eVar2 != null) {
            eVar2.j(f);
        }
        g7.e eVar3 = tVar.f141068w;
        if (eVar3 != null) {
            eVar3.j(f);
        }
        g7.e eVar4 = tVar.f141060l;
        if (eVar4 != null) {
            eVar4.j(f);
        }
        g7.e eVar5 = tVar.f141061m;
        if (eVar5 != null) {
            eVar5.j(f);
        }
        g7.e eVar6 = tVar.f141062n;
        if (eVar6 != null) {
            eVar6.j(f);
        }
        g7.e eVar7 = tVar.o;
        if (eVar7 != null) {
            eVar7.j(f);
        }
        g7.i iVar = tVar.f141064q;
        if (iVar != null) {
            iVar.j(f);
        }
        g7.i iVar2 = tVar.f141065r;
        if (iVar2 != null) {
            iVar2.j(f);
        }
        g7.i iVar3 = tVar.f141066s;
        if (iVar3 != null) {
            iVar3.j(f);
        }
        g7.i iVar4 = tVar.f141067t;
        if (iVar4 != null) {
            iVar4.j(f);
        }
        g7.i iVar5 = tVar.u;
        if (iVar5 != null) {
            iVar5.j(f);
        }
        int i = 0;
        v vVar = this.f212940q;
        if (vVar != null) {
            for (int i2 = 0; i2 < vVar.p().size(); i2++) {
                ((g7.e) vVar.p().get(i2)).j(f);
            }
            d7.a aVar2 = d7.d.f111646a;
        }
        g7.i iVar6 = this.f212941r;
        if (iVar6 != null) {
            iVar6.j(f);
        }
        b bVar = this.f212942s;
        if (bVar != null) {
            bVar.p(f);
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i >= arrayList.size()) {
                d7.a aVar3 = d7.d.f111646a;
                return;
            } else {
                ((g7.e) arrayList.get(i)).j(f);
                i++;
            }
        }
    }
}
