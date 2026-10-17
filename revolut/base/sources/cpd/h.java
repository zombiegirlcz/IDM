package cpd;

import he3.j;
import ind.a0;
import ind.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;
import zhm.f0;
import zhm.w;
import zod.s;
import zod.t;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zod.p a(ind.e r9, xi0.b r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cpd.h.a(ind.e, xi0.b):zod.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static t b(ind.e currentPeriodData, List allCategories) {
        ?? arrayList;
        List list;
        Object next;
        Intrinsics.checkNotNullParameter(currentPeriodData, "currentPeriodData");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        ind.c cVar = currentPeriodData instanceof ind.c ? (ind.c) currentPeriodData : null;
        b0 b0Var = cVar != null ? cVar.e : null;
        a0 a0Var = b0Var instanceof a0 ? (a0) b0Var : null;
        if (a0Var == null || (list = a0Var.f162787a) == null) {
            arrayList = f0.f322471a;
        } else {
            List<j> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (j jVar : list2) {
                long j2 = ((ind.c) currentPeriodData).i.f115082a;
                double dAbs = j2 == 0 ? 0.0d : Math.abs(jVar.f151564b.f115082a / j2) * 100.0d;
                Iterator it8 = allCategories.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((i3) next).getId(), jVar.f151563a)) {
                        break;
                    }
                }
                arrayList.add(new s(dAbs, (i3) next, jVar.d));
            }
        }
        return new t(currentPeriodData.a(), arrayList);
    }

    public static zod.a0 c(j jVar, List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((i3) next).getId(), jVar.f151563a)) {
                break;
            }
        }
        return new zod.a0(jVar, (i3) next);
    }
}
