package s2e;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends oki.h implements dli.b {
    public final StoreBrandDetailDiscountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f259299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q2e.a f259300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f259301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f259302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f259303t;

    public k(StoreBrandDetailDiscountScreenContract$InputData inputData, l2e.a storeBrandsInteractor, q2e.a campaignsSharedState, vii.b megaOfferLoader, wn.a adsTrackingControllerModelExtension, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(campaignsSharedState, "campaignsSharedState");
        Intrinsics.checkNotNullParameter(megaOfferLoader, "megaOfferLoader");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f259299p = storeBrandsInteractor;
        this.f259300q = campaignsSharedState;
        this.f259301r = megaOfferLoader;
        this.f259302s = adsTrackingControllerModelExtension;
        StoreMegaOffer storeMegaOffer = inputData.f88672b;
        this.f259303t = mra.d.b(this, new e(storeMegaOffer != null ? new Data(storeMegaOffer, null, false, 6, null) : new Data(null, null, true, 3, null), 6), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f259301r, new r3k.c(continuation, this, 20)), null, null, new i(this, continuation, 1), 3);
        q2e.a aVar = this.f259300q;
        yji.l.a1(this, nim.a.u(new qkg.a(2, 19, continuation), aVar.f241560b), null, null, new i(this, continuation, 0), 3);
        yji.l.a1(this, aVar.f, null, null, new i(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f259303t;
    }
}
