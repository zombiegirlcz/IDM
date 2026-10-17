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
public final class k implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f20706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f20707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zhl.k f20708c;

    public k(ybl.b instrumentTickerInteractor, ybl.i productGroupAvailabilityInteractor, zhl.k historicalPricesInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        this.f20706a = instrumentTickerInteractor;
        this.f20707b = productGroupAvailabilityInteractor;
        this.f20708c = historicalPricesInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.f310361h;
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
        ybl.b bVar = this.f20706a;
        if (z) {
            rVarN = ((ael.k) bVar).i(arrayList, n9l.b.SEC_3);
        } else {
            rVarN = ((ael.k) bVar).n(arrayList, w4l.i.f294643c);
        }
        return nim.a.w(rVarN, new c09.a(25));
    }

    @Override // u3d.b
    public final List d() {
        return zhm.f0.f322471a;
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        ArrayList arrayList = new ArrayList(zhm.w.t(favouritesAssetIdPairs, 10));
        Iterator it8 = favouritesAssetIdPairs.iterator();
        while (it8.hasNext()) {
            arrayList.add(f((Pair) it8.next(), ngd.a.ONE_WEEK, ngd.b.LINE));
        }
        return rd0.e.c(zh9.u0.k(arrayList), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        if (range != ngd.a.ONE_WEEK) {
            return new go.g(new Data(null, new NotImplementedError("For bonds only one week chart range is supported yet"), false, 5, null), 2);
        }
        int i = i.f20703a[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new go.g(new Data(null, new NotImplementedError("Candlestick chart isn't supported yet"), false, 5, null), 2);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) favouritesAssetIdPair.f186385a;
        return boh.f.e(nim.a.v(((ael.k) this.f20706a).l(zhm.y0.b(str)), new bd2.b(str, 19)), new c1g.o(this, 1, favouritesAssetIdPair, type));
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
        return rd0.e.c(nim.a.v(((ael.k) this.f20706a).l(zhm.d0.i1(assetIds)), new c09.a(24)), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return new a07.p(((ael.h0) this.f20707b).b(cfl.p.BONDS), 11);
    }
}
