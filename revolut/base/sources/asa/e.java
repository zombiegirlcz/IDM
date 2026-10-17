package asa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8893a;

    public e() {
        p0 p0Var = o0.f186429a;
        this.f8893a = r0.k(new Pair(p0Var.b(urf.b.class), 1), new Pair(p0Var.b(urf.a.class), 2), new Pair(p0Var.b(i1l.d.class), 3), new Pair(p0Var.b(j1l.a.class), 4), new Pair(p0Var.b(k1l.a.class), 5), new Pair(p0Var.b(i1l.a.class), 6), new Pair(p0Var.b(i1l.i.class), 7), new Pair(p0Var.b(i1l.f.class), 8), new Pair(p0Var.b(i1l.h.class), 9), new Pair(p0Var.b(i1l.l.class), 10), new Pair(p0Var.b(i1l.c.class), 11));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public final hrf.h a(List errors) {
        ?? r56;
        Object obj2;
        Intrinsics.checkNotNullParameter(errors, "errors");
        List list = errors;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((yqi.b) obj3) instanceof wsa.a) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            r56 = this.f8893a;
            if (!zHasNext) {
                break;
            }
            Object next = it8.next();
            if (r56.containsKey(o0.f186429a.b(((yqi.b) next).getClass()))) {
                arrayList3.add(next);
            }
        }
        Iterator it9 = arrayList3.iterator();
        if (it9.hasNext()) {
            Object next2 = it9.next();
            if (it9.hasNext()) {
                Object obj4 = r56.get(o0.f186429a.b(((yqi.b) next2).getClass()));
                if (obj4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue = ((Number) obj4).intValue();
                do {
                    Object next3 = it9.next();
                    Object obj5 = r56.get(o0.f186429a.b(((yqi.b) next3).getClass()));
                    if (obj5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int iIntValue2 = ((Number) obj5).intValue();
                    if (iIntValue > iIntValue2) {
                        next2 = next3;
                        iIntValue = iIntValue2;
                    }
                } while (it9.hasNext());
            }
            obj2 = next2;
        } else {
            obj2 = null;
        }
        return new hrf.h(arrayList2, arrayList, (yqi.b) obj2);
    }
}
