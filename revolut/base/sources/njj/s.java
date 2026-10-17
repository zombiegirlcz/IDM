package njj;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ContractStatementData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j0 j0VarE3 = this.v.d();
        Object obj3 = model.f51787l;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) j0VarE3;
        aVar2.getClass();
        if (obj3 instanceof EsimMobilePlanCheckoutScreenContract$ContractStatementData) {
            EsimMobilePlanCheckoutScreenContract$ContractStatementData esimMobilePlanCheckoutScreenContract$ContractStatementData = (EsimMobilePlanCheckoutScreenContract$ContractStatementData) obj3;
            aVar2.A1(new m0(aVar2, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101139a, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101140b, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101141c, esimMobilePlanCheckoutScreenContract$ContractStatementData.d, esimMobilePlanCheckoutScreenContract$ContractStatementData.e, null), new yi5.b(25));
        }
        return Unit.f186387a;
    }
}
