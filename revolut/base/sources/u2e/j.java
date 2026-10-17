package u2e;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends oki.h implements dli.b {
    public final StoreBrandDetailMsiScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f276612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q2e.a f276613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f276614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f276615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f276616t;

    public j(StoreBrandDetailMsiScreenContract$InputData inputData, l2e.a storeBrandsInteractor, q2e.a campaignsSharedState, vii.b megaOfferLoader, wn.a adsTrackingControllerModelExtension, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(campaignsSharedState, "campaignsSharedState");
        Intrinsics.checkNotNullParameter(megaOfferLoader, "megaOfferLoader");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f276612p = storeBrandsInteractor;
        this.f276613q = campaignsSharedState;
        this.f276614r = megaOfferLoader;
        this.f276615s = adsTrackingControllerModelExtension;
        StoreMegaOffer storeMegaOffer = inputData.f88684b;
        this.f276616t = mra.d.b(this, new e(storeMegaOffer != null ? new Data(storeMegaOffer, null, false, 6, null) : new Data(null, null, true, 3, null), 6), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f276614r, new tik.b(continuation, this, 18)), null, null, new i(this, continuation, 0), 3);
        q2e.a aVar = this.f276613q;
        yji.l.a1(this, nim.a.u(new tk9.i(2, 4, continuation), aVar.f241560b), null, null, new i(this, continuation, 1), 3);
        yji.l.a1(this, aVar.f, null, null, new i(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276616t;
    }
}
