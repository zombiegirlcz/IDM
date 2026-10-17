package cjd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.shops.impl.model.ShopsCampaignCountriesParcel;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ShopsCampaignCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ShopsCampaignCheckoutScreen shopsCampaignCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = shopsCampaignCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVarM3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.shops.impl.ui.details.a aVar2 = (com.revolut.feature.shops.impl.ui.details.a) eVarM3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        if (obj3 instanceof ShopsCampaignCountriesParcel) {
            oki.h.v2(aVar2.F, new ShopsCampaignCheckoutScreenContract$ModalStep.Countries(((ShopsCampaignCountriesParcel) obj3).f87122a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
