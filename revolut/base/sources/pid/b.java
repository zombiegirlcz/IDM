package pid;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$ModalDestination;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h4g.g;
import jid.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mid.k;
import o97.c;
import o97.e;
import o97.l;
import o97.r;
import o97.x;
import o97.y;
import z87.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f236468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f236469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f236470c;

    public b(z shopsSearchInteractor, a shopsBrandsSearchMapper, g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(shopsSearchInteractor, "shopsSearchInteractor");
        Intrinsics.checkNotNullParameter(shopsBrandsSearchMapper, "shopsBrandsSearchMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f236468a = shopsSearchInteractor;
        this.f236469b = shopsFeatureAvailabilityInteractor;
        this.f236470c = r.SHOPS_BRANDS;
    }

    public static x m(Object obj2) {
        return obj2 instanceof k ? m(((k) obj2).f205719a) : obj2 instanceof ShopsCampaignOffer ? new l(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$ModalDestination((ShopsCampaignDetails) obj2), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))) : obj2 instanceof ShopsDeeplinkOffer ? new c(((ShopsDeeplinkOffer) obj2).f87042a) : e.f223096a;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        g gVar = this.f236469b;
        efm.r rVarFlatMap = gVar.c().flatMap(new phc.b(14, new l1.e(this, searchQuery, gVar.e(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // z87.f
    public final r h() {
        return this.f236470c;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        return m(yVar.f223136b);
    }
}
