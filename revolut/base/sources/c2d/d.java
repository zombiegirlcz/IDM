package c2d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f20684a = zhm.r0.k(new Pair(ngd.a.ONE_DAY, qta.f.DAY), new Pair(ngd.a.ONE_WEEK, qta.f.WEEK), new Pair(ngd.a.ONE_MONTH, qta.f.MONTH), new Pair(ngd.a.THREE_MONTHS, qta.f.THREE_MONTH), new Pair(ngd.a.SIX_MONTHS, qta.f.SIX_MONTH), new Pair(ngd.a.ONE_YEAR, qta.f.YEAR));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final List a() {
        return zhm.d0.P0(f20684a.keySet(), new c());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static final vkm.d b(vpk.p ratesPlotRepository, ngd.b type, ngd.a range, Pair favouritesAssetIdPair) {
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        int i = b.f20680a[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter("Candlestick chart isn't supported yet", "message");
            throw new NotImplementedError("Candlestick chart isn't supported yet");
        }
        xi0.a aVar = xi0.b.Companion;
        String str = (String) favouritesAssetIdPair.f186385a;
        aVar.getClass();
        return rd0.e.b(nim.a.w(vpk.p.d(ratesPlotRepository, new Pair(xi0.a.a(str), xi0.a.a((String) favouritesAssetIdPair.f186386b)), (qta.f) u1.u(range, f20684a), null, 12), new a(favouritesAssetIdPair, type, 0)));
    }

    public static final efm.r c(ppk.f ratesInteractor, List favouritesAssetIdPairs, boolean z) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        List<Pair> list = favouritesAssetIdPairs;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (Pair pair : list) {
            xi0.a aVar = xi0.b.Companion;
            String str = (String) pair.f186385a;
            aVar.getClass();
            arrayList.add(new Pair(xi0.a.a(str), xi0.a.a((String) pair.f186386b)));
        }
        return nim.a.w(z ? ratesInteractor.e(arrayList, n9l.b.SEC_3) : cpk.a.a(ratesInteractor, arrayList), new bke.t(favouritesAssetIdPairs, 6));
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public static final efm.r d(vpk.p ratesPlotRepository, ngd.a range, ArrayList pairs) {
        Intrinsics.checkNotNullParameter(ratesPlotRepository, "ratesPlotRepository");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        ArrayList currencyPairs = new ArrayList(zhm.w.t(pairs, 10));
        Iterator it8 = pairs.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            xi0.a aVar = xi0.b.Companion;
            String str = (String) pair.f186385a;
            aVar.getClass();
            v1.c.A(currencyPairs, xi0.a.a(str), xi0.a.a((String) pair.f186386b));
        }
        qta.f duration = (qta.f) u1.u(range, f20684a);
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(duration, "duration");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ArrayList arrayList = new ArrayList(zhm.w.t(currencyPairs, 10));
        Iterator it9 = currencyPairs.iterator();
        while (it9.hasNext()) {
            arrayList.add(vpk.p.d(ratesPlotRepository, (Pair) it9.next(), duration, loadingStrategy, 4));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return nim.a.w(mif.a.l(arrayList), new c09.a(22));
    }
}
