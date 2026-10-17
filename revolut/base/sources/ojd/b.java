package ojd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.m;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsAdsPersonalizedOffersOptInScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShopsAdsPersonalizedOffersOptInScreen shopsAdsPersonalizedOffersOptInScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsAdsPersonalizedOffersOptInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        String listId = model.f52613a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SHOPS_ADS_PERSONALIZED_OFFERS_ACCEPT_BUTTON")) {
            gVar.n2(new m((Object) gVar, (Object) "SHOPS_ADS_PERSONALIZED_OFFERS_ACCEPT_BUTTON", true, (Continuation) null, 9), new o9h.b(gVar, 29));
        } else if (Intrinsics.f(listId, "SHOPS_ADS_PERSONALIZED_OFFERS_REJECT_BUTTON")) {
            gVar.n2(new m((Object) gVar, (Object) "SHOPS_ADS_PERSONALIZED_OFFERS_REJECT_BUTTON", false, (Continuation) null, 9), new o9h.b(gVar, 29));
        }
        return Unit.f186387a;
    }
}
