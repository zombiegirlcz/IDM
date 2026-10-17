package l8h;

import e8h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l8h.b;
import xzg.a0;
import xzg.b0;
import xzg.c0;
import xzg.w;
import xzg.x;
import xzg.y;
import xzg.z;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final a0 a(b.a aVar) {
        z yVar;
        String ref2 = aVar.getRef();
        int i = d.f192990b[aVar.getAssetType().ordinal()];
        if (i == 1) {
            yVar = new y(null);
        } else if (i == 2) {
            yVar = new y(x.CFD);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            yVar = w.f310036a;
        }
        return new a0(ref2, yVar, aVar.getBuyToAllRatio());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final c0 b(b bVar) {
        b0 b0Var;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = d.f192989a[bVar.getTimeSpan().ordinal()];
        if (i == 1) {
            b0Var = b0.ONE_DAY;
        } else if (i == 2) {
            b0Var = b0.ONE_MONTH;
        } else if (i == 3) {
            b0Var = b0.ONE_WEEK;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b0Var = b0.ONE_YEAR;
        }
        List mostTraded = bVar.getMostTraded();
        if (mostTraded != null) {
            List list = mostTraded;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(a((b.a) it8.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List mostBought = bVar.getMostBought();
        if (mostBought != null) {
            List list2 = mostBought;
            arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(a((b.a) it9.next()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        List mostSold = bVar.getMostSold();
        if (mostSold != null) {
            List list3 = mostSold;
            arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                arrayList3.add(a((b.a) it10.next()));
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new c0(b0Var, arrayList, arrayList2, arrayList3);
    }

    public static final a c(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (!(zVar instanceof y)) {
            if (zVar.equals(w.f310036a)) {
                return a.CRYPTO;
            }
            throw new NoWhenBranchMatchedException();
        }
        x xVar = ((y) zVar).f310037a;
        int i = xVar == null ? -1 : d.f192991c[xVar.ordinal()];
        if (i == -1) {
            return a.STOCK;
        }
        if (i == 1) {
            return a.CFD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b.a d(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return new b.a(a0Var.f309969a, c(a0Var.f309970b), a0Var.f309971c);
    }

    public static final String e(k kVar) {
        String strConcat;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        z zVar = kVar.f123701a;
        if (zVar instanceof y) {
            x xVar = ((y) zVar).f310037a;
            int i = xVar == null ? -1 : d.f192991c[xVar.ordinal()];
            if (i == -1) {
                str2 = "NO_SECURITY_TYPE";
            } else {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "SecurityType.CFD";
            }
            strConcat = "STOCK_".concat(str2);
        } else {
            if (!Intrinsics.f(zVar, w.f310036a)) {
                throw new NoWhenBranchMatchedException();
            }
            strConcat = "CRYPTO";
        }
        int i2 = d.d[kVar.f123702b.ordinal()];
        if (i2 == 1) {
            str = "OneDay";
        } else if (i2 == 2) {
            str = "OneMonth";
        } else if (i2 == 3) {
            str = "OneWeek";
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "OneYear";
        }
        return p.a.p("MOST_TRADED_", strConcat, str);
    }
}
