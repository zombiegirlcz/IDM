package s6b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.account_creation.CobrandedCardsAccountCreationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ CobrandedCardsAccountCreationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CobrandedCardsAccountCreationScreen cobrandedCardsAccountCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cobrandedCardsAccountCreationScreen;
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
        o.b(obj2);
        ((m) this.u.R2()).f260209q.a();
        return Unit.f186387a;
    }
}
