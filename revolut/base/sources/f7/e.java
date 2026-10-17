package f7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements f, o, g7.a, k7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a80.e f132469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f132470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.j f132471c;
    public final Matrix d;
    public final Path e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f132472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f132473h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LottieDrawable f132474j;
    public ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g7.t f132475l;

    public e(LottieDrawable lottieDrawable, n7.b bVar, m7.s sVar, d7.j jVar) {
        l7.f fVar;
        String str = sVar.f203261a;
        boolean z = sVar.f203263c;
        List list = sVar.f203262b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVarA = ((m7.b) list.get(i2)).a(lottieDrawable, jVar, bVar);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                fVar = null;
                break;
            }
            m7.b bVar2 = (m7.b) list.get(i);
            if (bVar2 instanceof l7.f) {
                fVar = (l7.f) bVar2;
                break;
            }
            i++;
        }
        this(lottieDrawable, bVar, str, z, arrayList, fVar);
    }

    @Override // f7.f
    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        g7.t tVar = this.f132475l;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).a(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List b() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i);
                if (dVar instanceof o) {
                    this.k.add((o) dVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // k7.g
    public final void c(k7.f fVar, int i, ArrayList arrayList, k7.f fVar2) {
        String str = this.f132472g;
        if (!fVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            k7.f fVar3 = new k7.f(fVar2);
            fVar3.f181767a.add(str);
            if (fVar.a(i, str)) {
                k7.f fVar4 = new k7.f(fVar3);
                fVar4.f181768b = this;
                arrayList.add(fVar4);
            }
            fVar2 = fVar3;
        }
        if (!fVar.d(i, str)) {
            return;
        }
        int iB = fVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            d dVar = (d) arrayList2.get(i2);
            if (dVar instanceof k7.g) {
                ((k7.g) dVar).c(fVar, iB, arrayList, fVar2);
            }
            i2++;
        }
    }

    @Override // g7.a
    public final void d() {
        this.f132474j.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.e(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    @Override // k7.g
    public final void f(Object obj2, s7.c cVar) {
        g7.t tVar = this.f132475l;
        if (tVar != null) {
            tVar.c(obj2, cVar);
        }
    }

    @Override // f7.f
    public final void g(Canvas canvas, Matrix matrix, int i, r7.a aVar) {
        if (this.f132473h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        g7.t tVar = this.f132475l;
        if (tVar != null) {
            matrix2.preConcat(tVar.e());
            i = (int) (((((tVar.f141063p == null ? 100 : ((Integer) r1.f()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        LottieDrawable lottieDrawable = this.f132474j;
        boolean z = (lottieDrawable.u && h() && i != 255) || (aVar != null && lottieDrawable.v && h());
        int i2 = z ? 255 : i;
        r7.j jVar = this.f132471c;
        if (z) {
            RectF rectF = this.f132470b;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            a(rectF, matrix, true);
            a80.e eVar = this.f132469a;
            eVar.f1988b = i;
            if (aVar != null) {
                aVar.a(eVar);
                aVar = null;
            } else {
                eVar.f1989c = null;
            }
            canvas = jVar.e(canvas, rectF, eVar);
        } else if (aVar != null) {
            r7.a aVar2 = new r7.a(aVar);
            aVar2.c(i2);
            aVar = aVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = arrayList.get(size);
            if (obj2 instanceof f) {
                ((f) obj2).g(canvas, matrix2, i2, aVar);
            }
        }
        if (z) {
            jVar.c();
        }
    }

    @Override // f7.d
    public final String getName() {
        throw null;
    }

    @Override // f7.o
    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        g7.t tVar = this.f132475l;
        if (tVar != null) {
            matrix.set(tVar.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.f132473h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof o) {
                    path.addPath(((o) dVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof f) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public e(LottieDrawable lottieDrawable, n7.b bVar, String str, boolean z, ArrayList arrayList, l7.f fVar) {
        this.f132469a = new a80.e(5, (byte) 0);
        this.f132470b = new RectF();
        this.f132471c = new r7.j();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.f132472g = str;
        this.f132474j = lottieDrawable;
        this.f132473h = z;
        this.i = arrayList;
        if (fVar != null) {
            g7.t tVar = new g7.t(fVar);
            this.f132475l = tVar;
            tVar.a(bVar);
            tVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof k) {
                arrayList2.add((k) dVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).b(arrayList.listIterator(arrayList.size()));
        }
    }
}
