package cjd;

import aw0.n6;
import c84.y;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShopsCampaignCheckoutScreen f24635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ShopsCampaignCheckoutScreen shopsCampaignCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24635w = shopsCampaignCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f24635w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a(this.f24635w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            default:
                a aVar3 = new a(this.f24635w, continuation, 2);
                aVar3.v = obj2;
                return aVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopsCampaignCheckoutScreen shopsCampaignCheckoutScreen = this.f24635w;
        switch (i) {
            case 0:
                n6 n6Var = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarM3 = shopsCampaignCheckoutScreen.R2();
                Object obj3 = n6Var.k;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.shops.api.model.ShopsCampaignOffer");
                ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) obj3;
                com.revolut.feature.shops.impl.ui.details.a aVar2 = (com.revolut.feature.shops.impl.ui.details.a) eVarM3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(shopsCampaignOffer, "shopsCampaignOffer");
                aVar2.l2(new y(aVar2, shopsCampaignOffer, null, 23), new yi5.b(26));
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shops.impl.ui.details.a) shopsCampaignCheckoutScreen.R2()).M2(aVar3);
                break;
            default:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarM32 = shopsCampaignCheckoutScreen.R2();
                Intrinsics.h(aVar5);
                ((com.revolut.feature.shops.impl.ui.details.a) eVarM32).M2(aVar5);
                break;
        }
        return Unit.f186387a;
    }
}
