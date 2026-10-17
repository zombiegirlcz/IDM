package com.revolut.feature.shops.impl.ui.carousel_details;

import bbg.c0;
import cli.y;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import fn2.c;
import h4g.g;
import hx7.e;
import jid.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mid.k;
import oki.h;
import r10.d;
import skm.a2;
import vkm.q;
import y4f.o;
import yhi.b;
import yid.i;
import yid.n;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements n {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ShopsCarouselDetailsScreenContract$InputData f87152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f87153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wn.a f87154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f87155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f87156t;
    public final wid.c u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f87158x;

    public a(d shopsCarouselDetailsInteractor, ShopsCarouselDetailsScreenContract$InputData inputData, c shopsPerkActivationInteractor, wn.a adsTrackingControllerModelExtension, g shopsFeatureAvailabilityInteractor, p shopsItemsBidInteractor, wid.c auctionCountdownTicker, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(shopsCarouselDetailsInteractor, "shopsCarouselDetailsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shopsPerkActivationInteractor, "shopsPerkActivationInteractor");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsItemsBidInteractor, "shopsItemsBidInteractor");
        Intrinsics.checkNotNullParameter(auctionCountdownTicker, "auctionCountdownTicker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shopsCarouselDetailsInteractor;
        this.f87152p = inputData;
        this.f87153q = shopsPerkActivationInteractor;
        this.f87154r = adsTrackingControllerModelExtension;
        this.f87155s = shopsFeatureAvailabilityInteractor;
        this.f87156t = shopsItemsBidInteractor;
        this.u = auctionCountdownTicker;
        this.v = mra.d.b(this, new i(0), stateMapper, null, false, 12);
        this.f87157w = e.a(this, new yd8.a(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        J2();
        H2(this.v, new xyh.n(this.f87155s.e(), 9));
    }

    public final void I2(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shops.impl.model.ShopsContextParcelWrapper");
        ShopsContext shopsContext = ((k) obj2).f205719a;
        zn.d dVar = obj2 instanceof zn.d ? (zn.d) obj2 : null;
        if (dVar != null) {
            this.f87154r.Z2(dVar);
        }
        if (shopsContext instanceof ShopsDeeplinkOffer) {
            C2(new yid.k(((ShopsDeeplinkOffer) shopsContext).f87042a));
            return;
        }
        if (shopsContext instanceof ShopsCampaignOffer) {
            C1(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination((ShopsCampaignDetails) shopsContext), b.BOTTOM_DIALOG, (Integer) null, 12))));
            return;
        }
        boolean z = shopsContext instanceof ShopsPurchase;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f87157w;
        if (z) {
            h.v2(aVar, new ShopsCarouselDetailsScreenContract$ModalStep.PurchaseItemDialog((ShopsPurchase) shopsContext), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (shopsContext instanceof ShopsAuction) {
            h.v2(aVar, new ShopsCarouselDetailsScreenContract$ModalStep.BidAuction(((ShopsAuction) shopsContext).f87010a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
    }

    public final void J2() {
        a2 a2Var = this.f87158x;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f87158x = l.a1(this, q.Q(q.J(new go.g(Unit.f186387a, 2), this.f87156t.d), new o(continuation, this, 14)), null, null, new yid.p(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87157w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow nearestEndTimeFlow = this.v.B(new yi5.b(7));
        wid.c cVar = this.u;
        Continuation continuation = null;
        l.b1(this, cVar.a(nearestEndTimeFlow), null, new yid.p(this, null, 0), 3);
        Intrinsics.checkNotNullParameter(nearestEndTimeFlow, "nearestEndTimeFlow");
        l.b1(this, q.Q(q.q(nearestEndTimeFlow), new c0(continuation, true, (Object) cVar, 8)), null, new y5g.d(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
