package slj;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPowerOfAttorneyTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPowerOfAttorneyTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        String listId = model.f52519a;
        boolean z = model.f52521c;
        k kVar = (k) hVarE3;
        y yVar = kVar.f264220s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_POWER_OF_ATTORNEY_TERMS")) {
            kVar.H2(yVar, new rk.b(z, 6));
        } else if (Intrinsics.f(listId, "ID_EARLY_TERMINATION_TERMS")) {
            kVar.H2(yVar, new rk.b(z, 7));
        }
        return Unit.f186387a;
    }
}
