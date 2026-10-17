package tt7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InsuranceDetailsScreen insuranceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar = (com.revolut.feature.insurance_credit.impl.ui.screen.details.b) nVarE3;
        bVar.I2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
