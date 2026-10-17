package c9d;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubscriptionCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SubscriptionCancellationScreen subscriptionCancellationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subscriptionCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarT2 = this.v.T2();
        com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) iVarT2;
        cVar.y2(model.k, model.f52926a);
        return Unit.f186387a;
    }
}
