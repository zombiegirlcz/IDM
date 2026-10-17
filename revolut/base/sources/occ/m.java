package occ;

import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$InputData;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutController;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsShortCampaignInfo;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends yji.n implements bcc.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final void Z2(PromotedMerchant merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        PromotedMerchant.ShoppingOffer shoppingOffer = merchant.f;
        String str = merchant.d;
        String str2 = merchant.f84694h;
        if (shoppingOffer != null) {
            A2(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination(new ShopsShortCampaignInfo(shoppingOffer.f84697b, "revolutPayPromotedMerchants", null)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
            return;
        }
        if (str != null && str2 != null) {
            yji.n.P2(this, new PromotedMerchantCheckoutController(new PromotedMerchantCheckoutContract$InputData(str2, merchant)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            return;
        }
        if (str != null) {
            A2(new ExternalDestination.Browser(str, null));
            return;
        }
        String str3 = merchant.f84690a;
        PromotedMerchant.ShoppingOffer shoppingOffer2 = merchant.f;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.u(v0.a.m("Merchant must either have shoppingOffer or website for checkout: name=", str3, ", website=", str, ", campaignId="), shoppingOffer2 != null ? shoppingOffer2.f84697b : null, ", instructionsId=", str2));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
    }
}
