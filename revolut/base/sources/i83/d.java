package i83;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreenContract$ModalStep;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.kompot.common.ModalDestination;
import h93.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReactivateCardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReactivateCardScreen reactivateCardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reactivateCardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) iVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.TerminatedCard");
        TerminatedCard terminatedCard = (TerminatedCard) obj3;
        if (terminatedCard.f65551h.f65543b == n0.ACTIVE_CHARGEBACK) {
            bVar.C2(new h(terminatedCard));
        } else {
            oki.h.v2(bVar.f65491q, new ReactivateCardScreenContract$ModalStep.ShowConfirmationDialog(terminatedCard), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
