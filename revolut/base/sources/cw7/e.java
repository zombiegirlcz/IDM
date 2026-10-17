package cw7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SchemeInsuranceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SchemeInsuranceDetailsScreen schemeInsuranceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = schemeInsuranceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x10 x10Var = (x10) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        ActionsView.Item item = x10Var.f167082b;
        com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a aVar2 = (com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) gVarE3;
        aVar2.I2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
