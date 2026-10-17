package pgb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ SalaryHubV3Controller u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SalaryHubV3Controller salaryHubV3Controller, Continuation continuation) {
        super(2, continuation);
        this.u = salaryHubV3Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.u.R2()).f83014w.a();
        return Unit.f186387a;
    }
}
