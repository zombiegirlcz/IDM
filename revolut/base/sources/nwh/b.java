package nwh;

import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.models.Clause;
import g6j.t;
import hw0.k;
import iw0.e;
import iw0.g;
import iw0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import qta.f;
import tof.a3;
import tof.p0;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public b(t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
    }

    public static Map a(ArrayList arrayList, List list) {
        if (arrayList.isEmpty() || list.isEmpty()) {
            return r0.g();
        }
        HashMap map = new HashMap();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a3 a3Var = (a3) it8.next();
            DateTime dateTime = a3Var.f272596j;
            if (dateTime != null) {
                int iG = v.g(arrayList, new t(dateTime, 2));
                if (iG < 0) {
                    iG = Math.min(-(iG + 1), arrayList.size() - 1);
                }
                Object obj2 = arrayList.get(iG);
                Object arrayList2 = map.get(obj2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(obj2, arrayList2);
                }
                ((Collection) arrayList2).add(a3Var);
            }
        }
        return map;
    }

    public static ArrayList d(List list) {
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(new Pair(Long.valueOf(TimeUnit.SECONDS.toMillis(((Number) pair.f186385a).longValue())), pair.f186386b));
        }
        return arrayList;
    }

    public static k e(Pair pair, f fVar, float f, iw0.a aVar) {
        DateTime dateTimeWithMillis = new DateTime().withMillis(((Number) pair.f186385a).longValue());
        boolean zM = a.f219888a[fVar.ordinal()] == 1 ? edl.a.m(dateTimeWithMillis.toLocalDate()) : false;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = "dd MMM, HH:mm";
        switch (c.f219889a[fVar.ordinal()]) {
            case 1:
                if (zM) {
                    str = "HH:mm";
                }
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "dd MMM";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = dateTimeWithMillis.toString(str);
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return new k(string, (float) ((Number) pair.f186386b).doubleValue(), f, aVar, (Object) null, (Clause) null, 48);
    }

    public static g f(List list) {
        boolean z;
        List list2 = list;
        boolean z3 = list2 instanceof Collection;
        boolean z4 = false;
        if (z3 && list2.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((a3) it8.next()).z != p0.BUY) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (z3 && list2.isEmpty()) {
            z4 = true;
        } else {
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (((a3) it9.next()).z != p0.SELL) {
                    break;
                }
            }
            z4 = true;
        }
        return new g(z ? e.GREEN : z4 ? e.RED : e.GREY, i.DEFAULT);
    }

    public final double b(List points, double d, mi miVar, Double d5) {
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(points, "points");
        if (miVar != null) {
            Pair pair = (Pair) d0.e0(miVar.f54485b, points);
            dDoubleValue = ((Number) (pair != null ? pair.f186386b : ((Pair) d0.m0(points)).f186386b)).doubleValue();
        } else {
            dDoubleValue = d5 != null ? d5.doubleValue() : ((Number) ((Pair) d0.m0(points)).f186386b).doubleValue();
        }
        return dDoubleValue - d;
    }

    public final boolean c(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return ((Number) ((Pair) d0.m0(list)).f186386b).doubleValue() >= ((Number) ((Pair) d0.b0(list)).f186386b).doubleValue();
    }
}
