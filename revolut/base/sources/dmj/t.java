package dmj;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.api.model.EsimTermsConsent;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPhoneNumberCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.d();
        Object obj3 = model.i;
        boolean z = model.f52521c;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) b0VarE3;
        if (obj3 instanceof EsimTermsConsent) {
            EsimTermsConsent esimTermsConsent = (EsimTermsConsent) obj3;
            cli.y yVar = cVar.z;
            Map mapG = ((a0) ((j2) yVar.f22677a).getValue()).f116138h;
            if (mapG == null) {
                mapG = zhm.r0.g();
            }
            cVar.H2(yVar, new d0(mapG, esimTermsConsent, z, 0));
        } else {
            cVar.getClass();
        }
        return Unit.f186387a;
    }
}
