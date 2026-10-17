package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f20681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f20682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zhl.k f20683c;

    public c0(ybl.b instrumentTickerInteractor, xoj.a featuresInteractor, zhl.k historicalPricesInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        this.f20681a = instrumentTickerInteractor;
        this.f20682b = featuresInteractor;
        this.f20683c = historicalPricesInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.e;
    }

    @Override // u3d.b
    public final efm.r b(List favouritesAssetIdPairs, boolean z) {
        efm.r rVarN;
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        if (favouritesAssetIdPairs.isEmpty()) {
            return te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
        }
        List list = favouritesAssetIdPairs;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add((String) ((Pair) it8.next()).f186385a);
        }
        ybl.b bVar = this.f20681a;
        if (z) {
            rVarN = ((ael.k) bVar).i(arrayList, n9l.b.SEC_3);
        } else {
            rVarN = ((ael.k) bVar).n(arrayList, w4l.i.f294643c);
        }
        return nim.a.w(rVarN, new n(8));
    }

    @Override // u3d.b
    public final List d() {
        return zhm.d0.P0(b2d.a.a().keySet(), new b0());
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        ArrayList arrayList = new ArrayList(zhm.w.t(favouritesAssetIdPairs, 10));
        Iterator it8 = favouritesAssetIdPairs.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((Pair) it8.next(), ngd.a.ONE_DAY, ngd.b.LINE));
        }
        return rd0.e.c(zh9.u0.k(arrayList), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = a0.f20676a[type.ordinal()];
        if (i == 1) {
            return boh.f.e(nim.a.v(rd0.e.b(ybl.b.c(this.f20681a)), new bd2.b((String) favouritesAssetIdPair.f186385a, 21)), new a5b.b(this, range, favouritesAssetIdPair, type, 16));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("Candlestick chart isn't supported yet");
    }

    @Override // u3d.b
    public final lgd.a g0() {
        return lgd.a.DISTINCT;
    }

    @Override // u3d.b
    public final efm.r h() {
        return te0.w.h(lgd.b.SECURITY);
    }

    @Override // u3d.b
    public final efm.r i(List assetIds) {
        Intrinsics.checkNotNullParameter(assetIds, "assetIds");
        return rd0.e.c(nim.a.v(((ael.k) this.f20681a).l(zhm.d0.i1(assetIds)), new n(7)), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        efm.r map = ((cpj.b) this.f20682b).k(yoj.c.WEALTH_TRADING, yoj.d.DISABLED).map(new c03.u(24, new n(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
