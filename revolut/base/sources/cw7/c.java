package cw7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SchemeInsuranceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SchemeInsuranceDetailsScreen schemeInsuranceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = schemeInsuranceDetailsScreen;
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
        g gVarE3 = this.v.d();
        com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a aVar2 = (com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) gVarE3;
        aVar2.I2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
