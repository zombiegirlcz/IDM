package dmj;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPhoneNumberCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.d();
        Object obj3 = model.f51787l;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) b0VarE3;
        if (obj3 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData) {
            String str = cVar.o.f101371a;
            EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData = (EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData) obj3;
            long j2 = esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101368c;
            String str2 = esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101367b;
            String str3 = esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101366a;
            if (str3 == null) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimMobilePlanPhoneNumberCheckoutScreenModel", "Can't download phone number checkout contract summary, phoneNumberId is null", null, h0Var);
            } else {
                cVar.A1(new h0(cVar, str3, str, str2, j2, null), new yi5.b(25));
            }
        } else {
            cVar.getClass();
        }
        return Unit.f186387a;
    }
}
