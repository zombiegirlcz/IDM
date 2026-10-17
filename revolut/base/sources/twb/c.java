package twb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsGiftcardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsGiftcardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53228a;
        Object obj3 = model.u;
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SECTION_SHOPS_CAMPAIGN_ID")) {
            ShopsCampaignOffer shopsCampaignOffer = obj3 instanceof ShopsCampaignOffer ? (ShopsCampaignOffer) obj3 : null;
            if (shopsCampaignOffer != null) {
                aVar2.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination(shopsCampaignOffer), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
            }
        }
        return Unit.f186387a;
    }
}
