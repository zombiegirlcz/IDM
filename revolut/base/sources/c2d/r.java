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

/* JADX INFO: loaded from: classes7.dex */
public final class r implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f20732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f20733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zhl.k f20734c;

    public r(ybl.b instrumentTickerInteractor, ybl.i productGroupAvailabilityInteractor, zhl.k historicalPricesInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        this.f20732a = productGroupAvailabilityInteractor;
        this.f20733b = instrumentTickerInteractor;
        this.f20734c = historicalPricesInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310360g;
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
        ybl.b bVar = this.f20733b;
        if (z) {
            rVarN = ((ael.k) bVar).i(arrayList, n9l.b.SEC_3);
        } else {
            rVarN = ((ael.k) bVar).n(arrayList, w4l.i.f294643c);
        }
        return nim.a.w(rVarN, new n(2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // u3d.b
    public final List d() {
        return zhm.d0.P0(b2d.a.f11937a.keySet(), new q());
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
        int i = p.f20728a[type.ordinal()];
        if (i == 1) {
            return boh.f.e(nim.a.v(rd0.e.b(ybl.b.c(this.f20733b)), new bd2.b((String) favouritesAssetIdPair.f186385a, 20)), new a5b.b(this, range, favouritesAssetIdPair, type, 15));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter("Candlestick chart isn't supported yet", "message");
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
        return rd0.e.c(nim.a.v(((ael.k) this.f20733b).l(zhm.d0.i1(assetIds)), new n(1)), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return mo3.a.f(((ael.h0) this.f20732a).b(cfl.p.ETF), new bw4.t(28), new b0c.a(23), new bw4.t(29));
    }
}
