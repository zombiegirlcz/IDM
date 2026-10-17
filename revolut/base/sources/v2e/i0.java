package v2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends oki.h implements v {

    @NotNull
    public static final y Companion = new y();
    public final l80.e A;
    public final cli.y B;
    public final StoreBrandDetailRedeemScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f285704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kye.e f285705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jwb.e f285706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nyb.k f285707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wli.x f285708t;
    public final q2e.a u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f285709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f285710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f285711y;
    public final wn.a z;

    public i0(StoreBrandDetailRedeemScreenContract$InputData inputData, l2e.a storeBrandsInteractor, kye.e storeExclusivesInteractor, jwb.e revPointsGiftCardsInteractor, nyb.k revPointsInteractor, wli.x deeplinkHandler, q2e.a campaignsSharedState, vii.b voucherProductGroupDetailsLoader, vii.b revPointsAccountFlow, vii.b megaOfferLoader, vii.b exclusivesOffersLoader, wn.a adsTrackingControllerModelExtension, l80.e dateProvider, m0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftCardsInteractor, "revPointsGiftCardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(campaignsSharedState, "campaignsSharedState");
        Intrinsics.checkNotNullParameter(voucherProductGroupDetailsLoader, "voucherProductGroupDetailsLoader");
        Intrinsics.checkNotNullParameter(revPointsAccountFlow, "revPointsAccountFlow");
        Intrinsics.checkNotNullParameter(megaOfferLoader, "megaOfferLoader");
        Intrinsics.checkNotNullParameter(exclusivesOffersLoader, "exclusivesOffersLoader");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f285704p = storeBrandsInteractor;
        this.f285705q = storeExclusivesInteractor;
        this.f285706r = revPointsGiftCardsInteractor;
        this.f285707s = revPointsInteractor;
        this.f285708t = deeplinkHandler;
        this.u = campaignsSharedState;
        this.v = voucherProductGroupDetailsLoader;
        this.f285709w = revPointsAccountFlow;
        this.f285710x = megaOfferLoader;
        this.f285711y = exclusivesOffersLoader;
        this.z = adsTrackingControllerModelExtension;
        this.A = dateProvider;
        StoreMegaOffer storeMegaOffer = inputData.f88689b;
        this.B = mra.d.b(this, new l(storeMegaOffer != null ? new Data(storeMegaOffer, null, false, 6, null) : new Data(null, null, true, 3, null), 1791), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f285710x, new b0(2, continuation, this)), null, null, new a0(2, continuation, this), 3);
        yji.l.a1(this, vkm.q.Q(this.f285709w, new b0(3, continuation, this)), null, null, new e0(this, null), 3);
        v20.s sVar = new v20.s(24);
        cli.y yVar = this.B;
        yji.l.a1(this, vkm.q.Q(vkm.q.Q(yVar.B(sVar), new b0(6, continuation, this)), new b0(7, continuation, this)), null, null, new a0(5, continuation, this), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.Q(yVar.B(new v20.s(20)), new b0(0, continuation, this)), new b0(1, continuation, this)), null, null, new a0(1, continuation, this), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.Q(yVar.B(new v20.s(23)), new b0(4, continuation, this)), new b0(5, continuation, this)), null, null, new a0(4, continuation, this), 3);
        q2e.a aVar = this.u;
        yji.l.a1(this, new t38.e(nim.a.u(new tk9.i(2, 11, continuation), aVar.f241560b), 24, yVar.B(new v20.s(25)), new z(3, null)), null, null, new a0(0, continuation, this), 3);
        yji.l.a1(this, aVar.f, null, null, new a0(3, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
