package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements u3d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.i f20712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f20713b;

    public l(ybl.i productGroupAvailabilityInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f20712a = productGroupAvailabilityInteractor;
        this.f20713b = instrumentTickerInteractor;
    }

    @Override // u3d.b
    public final FavouritesAssetTypeKey a() {
        y1d.b.Companion.getClass();
        return y1d.a.i;
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
        ybl.b bVar = this.f20713b;
        if (z) {
            rVarN = ((ael.k) bVar).i(arrayList, n9l.b.SEC_3);
        } else {
            rVarN = ((ael.k) bVar).n(arrayList, w4l.i.f294643c);
        }
        return nim.a.w(rVarN, new c09.a(27));
    }

    @Override // u3d.b
    public final List d() {
        return zhm.f0.f322471a;
    }

    @Override // u3d.b
    public final efm.r e(ArrayList favouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPairs, "favouritesAssetIdPairs");
        efm.r rVarFromCallable = efm.r.fromCallable(new a68.f(4));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    @Override // u3d.b
    public final Flow f(Pair favouritesAssetIdPair, ngd.a range, ngd.b type) {
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(type, "type");
        return vkm.i.f290039a;
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
        return rd0.e.c(nim.a.v(((ael.k) this.f20713b).l(zhm.d0.i1(assetIds)), new c09.a(26)), kotlin.coroutines.g.f186406a);
    }

    @Override // u3d.b
    public final Flow isAvailable() {
        return mo3.a.f(((ael.h0) this.f20712a).d(), new bw4.t(26), new b0c.a(22), new bw4.t(27));
    }
}
