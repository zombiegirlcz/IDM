package p7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f233458a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cpi.g f233459b = cpi.g.G("c", "v", "i", "o");

    @Override // p7.g0
    public final Object a(q7.d dVar, float f) {
        if (dVar.n() == q7.c.BEGIN_ARRAY) {
            dVar.d();
        }
        dVar.f();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zJ = false;
        while (dVar.i()) {
            int iP = dVar.p(f233459b);
            if (iP == 0) {
                zJ = dVar.j();
            } else if (iP == 1) {
                arrayListC = o.c(dVar, f);
            } else if (iP == 2) {
                arrayListC2 = o.c(dVar, f);
            } else if (iP != 3) {
                dVar.q();
                dVar.r();
            } else {
                arrayListC3 = o.c(dVar, f);
            }
        }
        dVar.h();
        if (dVar.n() == q7.c.END_ARRAY) {
            dVar.g();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new m7.q(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new k7.a(r7.g.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), r7.g.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zJ) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new k7.a(r7.g.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), r7.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new m7.q(pointF, zJ, arrayList);
    }
}
