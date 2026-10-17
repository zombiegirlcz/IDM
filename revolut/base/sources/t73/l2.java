package t73;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class l2 extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l2(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((rp0.k1) this.u.z).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "VIRTUAL_CARD_RENEWAL_SUCCESS_TOAST", new TextLocalisedClause(R$string.card_renewal_success_toast, null, null, 14), null, null, null, 60));
        return Unit.f186387a;
    }
}
