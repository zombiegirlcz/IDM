package yh4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ SepaDirectDebitSetUpController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SepaDirectDebitSetUpController sepaDirectDebitSetUpController, Continuation continuation) {
        super(2, continuation);
        this.u = sepaDirectDebitSetUpController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) this.u.d()).J2(g.f313755a);
        return Unit.f186387a;
    }
}
