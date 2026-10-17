package w7b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsValueReminderScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsValueReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.u.R2()).f82631s.a();
        return Unit.f186387a;
    }
}
