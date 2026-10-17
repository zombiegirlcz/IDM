package jnd;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static lzi.p a(LocalDate localDate, List list) {
        Object next;
        nkm.g gVar = new nkm.g(y.n(d0.Q(list), new a15.l(15, localDate)));
        if (gVar.hasNext()) {
            next = gVar.next();
            if (gVar.hasNext()) {
                LocalDate localDate2 = ((lzi.p) next).f200995a;
                do {
                    Object next2 = gVar.next();
                    LocalDate localDate3 = ((lzi.p) next2).f200995a;
                    if (localDate2.compareTo((Object) localDate3) < 0) {
                        next = next2;
                        localDate2 = localDate3;
                    }
                } while (gVar.hasNext());
            }
        } else {
            next = null;
        }
        return (lzi.p) next;
    }

    public static dj0.d b(d budgetData, lzi.j period, String categoryId) {
        Object next;
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        b bVar = budgetData instanceof b ? (b) budgetData : null;
        lzi.p pVarA = bVar == null ? null : a(period.f200981b.f99211b, bVar.a(period));
        if (pVarA != null) {
            Iterator it8 = pVarA.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((lzi.o) next).f200993a, categoryId)) {
                    break;
                }
            }
            lzi.o oVar = (lzi.o) next;
            if (oVar != null) {
                return oVar.f200994b;
            }
        }
        return null;
    }

    public static dj0.d c(d budgetData, lzi.j period, String categoryId, dj0.d categorySpent) {
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(categorySpent, "categorySpent");
        dj0.d dVarB = b(budgetData, period, categoryId);
        if (dVarB != null) {
            return new dj0.d(dVarB.f115082a + categorySpent.f115082a, dVarB.f115083b);
        }
        return null;
    }

    public static dj0.d d(d budgetData, lzi.j period, dj0.d spent) {
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        b bVar = budgetData instanceof b ? (b) budgetData : null;
        lzi.p pVarA = bVar == null ? null : a(period.f200981b.f99211b, bVar.a(period));
        dj0.d dVar = pVarA != null ? pVarA.d : null;
        if (dVar != null) {
            return new dj0.d(dVar.f115082a + spent.f115082a, dVar.f115083b);
        }
        return null;
    }

    public static Boolean e(d budgetData, lzi.j period, String categoryId, dj0.d categorySpent) {
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(categorySpent, "categorySpent");
        dj0.d dVarC = c(budgetData, period, categoryId, categorySpent);
        if (dVarC != null) {
            return Boolean.valueOf(dVarC.f115082a < 0);
        }
        return null;
    }

    public static Boolean f(d budgetData, lzi.j period, dj0.d spent) {
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(spent, "spent");
        dj0.d dVarD = d(budgetData, period, spent);
        if (dVarD != null) {
            return Boolean.valueOf(dVarD.f115082a < 0);
        }
        return null;
    }
}
