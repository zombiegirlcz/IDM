package hgb;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryHubController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SalaryHubController salaryHubController, Continuation continuation) {
        super(2, continuation);
        this.v = salaryHubController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (tVar.f54721a instanceof ActionWidgetDelegate.a.c) {
            ((com.revolut.feature.retail.salary_account.impl.salary_hub.a) this.v.d()).C2(n.f152149a);
        }
        return Unit.f186387a;
    }
}
