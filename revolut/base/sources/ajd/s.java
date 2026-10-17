package ajd;

import androidx.room.RxRoom;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends jki.g implements l {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f5552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ks0.n f5553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fn2.c f5554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn.a f5555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h4g.g f5556t;
    public final nyb.k u;
    public final h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f5557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5558x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z shopsSearchInteractor, ks0.n shopsBrandRecentSearchRepository, fn2.c shopsPerkActivationInteractor, wn.a adsTrackingControllerModelExtension, h4g.g shopsFeatureAvailabilityInteractor, nyb.k revPointsInteractor, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(shopsSearchInteractor, "shopsSearchInteractor");
        Intrinsics.checkNotNullParameter(shopsBrandRecentSearchRepository, "shopsBrandRecentSearchRepository");
        Intrinsics.checkNotNullParameter(shopsPerkActivationInteractor, "shopsPerkActivationInteractor");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f5552p = shopsSearchInteractor;
        this.f5553q = shopsBrandRecentSearchRepository;
        this.f5554r = shopsPerkActivationInteractor;
        this.f5555s = adsTrackingControllerModelExtension;
        this.f5556t = shopsFeatureAvailabilityInteractor;
        this.u = revPointsInteractor;
        this.v = new h(0);
    }

    @Override // yji.l
    public final void I1() {
        s sVar;
        boolean zE = this.f5556t.e();
        x2(new a2g.p(zE, 11));
        if (zE) {
            sVar = this;
            yji.l.a1(sVar, rd0.e.b(this.u.b()), null, null, new r(this, null), 3);
        } else {
            sVar = this;
            x2(new aik.d(7));
        }
        z2();
        efm.r map = w.f0(RxRoom.createObservable(((zhd.b) sVar.f5553q.f189085b).f322398a, false, new String[]{"shops_brand_recent_search"}, new zg6.c(14))).map(new oc8.e(23, new oh3.a(8)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(sVar, rd0.e.b(map), null, null, new q(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shops.impl.model.ShopsContextParcelWrapper");
        ShopsContext shopsContext = ((mid.k) obj2).f205719a;
        Continuation continuation = null;
        zn.d dVar = obj2 instanceof zn.d ? (zn.d) obj2 : null;
        if (dVar != null) {
            this.f5555s.Z2(dVar);
        }
        String str = this.f5558x;
        if (str != null && !d0.W(str)) {
            n2(new ad4.c(this, str, continuation, 18), new whi.b(6));
        }
        if (shopsContext instanceof ShopsDeeplinkOffer) {
            v2(new i(((ShopsDeeplinkOffer) shopsContext).f87042a));
        } else if (shopsContext instanceof ShopsCampaignOffer) {
            C1(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination((ShopsCampaignDetails) shopsContext), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
        }
    }

    public final void z2() {
        this.f5557w = yji.l.b1(this, nim.a.v(rd0.e.b(this.f5552p.r(null, whd.a.Search.a())), new aik.d(5)), null, new q(this, null, 1), 3);
    }
}
