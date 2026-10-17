package pv7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDetailsLayoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDetailsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) qVarE3;
        bVar.J2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
