package u85;

import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeController;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LoanWelcomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(LoanWelcomeController loanWelcomeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = loanWelcomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanWelcomeController loanWelcomeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                loanWelcomeController.e3().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = loanWelcomeController.e3();
                jVarE3.C1(u0.b(new FeatureCommand(new LoanHomeFeatureConfig(jVarE3.o.f70604a))));
                break;
        }
        return Unit.f186387a;
    }
}
