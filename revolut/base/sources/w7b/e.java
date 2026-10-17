package w7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminder;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CobrandedCardsValueReminderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cobrandedCardsValueReminderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CobrandedCardsValueReminderAction cobrandedCardsValueReminderAction;
        int i = this.u;
        CobrandedCardsValueReminderScreen cobrandedCardsValueReminderScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) cobrandedCardsValueReminderScreen.R2()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) cobrandedCardsValueReminderScreen.R2();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = cVar.u;
                CobrandedCardsValueReminder cobrandedCardsValueReminder = (CobrandedCardsValueReminder) ((i) ((j2) cVar.f82632t.f22677a).getValue()).f295498a.getContent();
                CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = (cobrandedCardsValueReminder == null || (cobrandedCardsValueReminderAction = cobrandedCardsValueReminder.f) == null) ? null : cobrandedCardsValueReminderAction.f82448b;
                CobrandedCardsValueReminderScreenContract$InputData cobrandedCardsValueReminderScreenContract$InputData = cVar.o;
                boolean z = cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Downgrade;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    if (cobrandedCardsValueReminderActionConfirmation == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("valueReminderData.content.confirmAction must not be null when pressing Confirm button");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        CobrandedCardsValueReminderScreenContract$InputData.Downgrade downgrade = (CobrandedCardsValueReminderScreenContract$InputData.Downgrade) cobrandedCardsValueReminderScreenContract$InputData;
                        oki.h.v2(aVar3, new CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation(downgrade.f82611a, downgrade.f82612b, cobrandedCardsValueReminderActionConfirmation), bottom_dialog);
                    }
                } else {
                    if (!(cobrandedCardsValueReminderScreenContract$InputData instanceof CobrandedCardsValueReminderScreenContract$InputData.Terminate)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (cobrandedCardsValueReminderActionConfirmation == null) {
                        cVar.C2(a.e.f82625a);
                    } else {
                        oki.h.v2(aVar3, new CobrandedCardsValueReminderScreenContract$ModalStep.TerminateConfirmation(cobrandedCardsValueReminderActionConfirmation), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) cobrandedCardsValueReminderScreen.R2()).C2(a.d.f82624a);
                return Unit.f186387a;
        }
    }
}
