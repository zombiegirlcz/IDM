package v25;

import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ o u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = oVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.A2(new LoanKompotFeatureConfig.PaymentManagementDestination(this.v));
        return Unit.f186387a;
    }
}
