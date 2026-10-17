package fmf;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TransactionDetailsScreen transactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarE3 = this.v.d();
        n0 n0Var = (n0) f0VarE3;
        n0Var.I2(model.f53016n, model.f53008a);
        return Unit.f186387a;
    }
}
