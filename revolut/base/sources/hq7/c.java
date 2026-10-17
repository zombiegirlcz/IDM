package hq7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PolicyDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PolicyDetailsScreen policyDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = policyDetailsScreen;
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
        o.b(obj2);
        h hVarT2 = this.v.T2();
        Object obj3 = model.u;
        k kVar = (k) hVarT2;
        kVar.getClass();
        if (obj3 instanceof Benefit) {
            kVar.Y1(new BenefitDetailsScreen(new BenefitDetailsScreenContract$InputData((Benefit) obj3)), ModalDestination.Style.POPUP.f98311a, new hie.b(1, kVar, k.class, "handleBenefitDetailsResult", "handleBenefitDetailsResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/common/benefit_details/BenefitDetailsScreenContract$OutputData;)V", 0, 10));
        }
        return Unit.f186387a;
    }
}
