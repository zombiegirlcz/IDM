package hy5;

import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wkm.l;
import xzg.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f156738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoCollectionDetailsControllerContract$InputData f156739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x8h.g f156740n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nw5.a f156741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jy5.a f156742q;

    public h(c view, CryptoCollectionDetailsControllerContract$InputData inputData, x8h.g collectionsInteractor, a mapper, nw5.a cryptoCommodityRateInteractor, jy5.a cryptoCollectionDetailsChartInteractor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        Intrinsics.checkNotNullParameter(cryptoCollectionDetailsChartInteractor, "cryptoCollectionDetailsChartInteractor");
        this.f156738l = view;
        this.f156739m = inputData;
        this.f156740n = collectionsInteractor;
        this.o = mapper;
        this.f156741p = cryptoCommodityRateInteractor;
        this.f156742q = cryptoCollectionDetailsChartInteractor;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        n.l2(this, rd0.e.b(((RewardsGridDelegate) ((CryptoCollectionDetailsController) this.f156738l).R.getValue()).f53209c.d), null, new g(this, null), 3);
    }

    @Override // hy5.b
    public final l Z2() {
        return q.Q(yh5.b.d(mo3.a.g(rd0.e.b(this.f156740n.b(this.f156739m.f71594a, o.CRYPTO)), null, new hy2.b(4), 1), ((jy5.b) this.f156742q).f179327a.f147831a), new hcj.o((Continuation) null, this, 13));
    }
}
