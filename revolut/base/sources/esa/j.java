package esa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            osa.b bVar = aVar.f81605p;
            String str = aVar.I2().f81490a;
            this.u = 1;
            Object objA = nim.a.a(bVar.f229289a.a(str), this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return aVar.C1(new MainContainerScreenDestination.JustShow(new MainScreenTab(ibb.c.f160142c.f83420a), new TransferDestination.ChatTransfer(false, new TabTransferShotDialogAction.Success(new TextLocalisedClause(R$string.payments_core_toast_recipient_deleted, null, null, 14)), 3), (AccountCreationTransitionAnimation) null, 12));
    }
}
