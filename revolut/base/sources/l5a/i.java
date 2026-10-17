package l5a;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ PaymentsIntroScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PaymentsIntroScreen paymentsIntroScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentsIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e) this.u.R2()).C2(a.b.f80193a);
        return Unit.f186387a;
    }
}
