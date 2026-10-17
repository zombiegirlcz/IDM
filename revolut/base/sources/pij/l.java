package pij;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ActivatePlanOfferClickData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract.ActivatePlanOfferClickData");
        EsimSubscriptionsScreenContract$ActivatePlanOfferClickData clickData = (EsimSubscriptionsScreenContract$ActivatePlanOfferClickData) obj3;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.v.R2();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        j60.a.v(bVar.D, false, null, 3);
        cli.y yVar = bVar.f101081e0;
        bVar.H2(yVar, new i0(bVar, 0));
        String str = clickData.f101024a;
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = clickData.f101025b;
        EsimContractMetadata esimContractMetadata = clickData.f101026c;
        chj.c0 c0Var = bVar.G;
        j2 j2Var = (j2) yVar.f22677a;
        c0Var.Z2(str, ((v) j2Var.getValue()).f236584j, esimDataPlanOfferInfo, esimContractMetadata, (l71.d) ((v) j2Var.getValue()).k.getContent());
        return Unit.f186387a;
    }
}
