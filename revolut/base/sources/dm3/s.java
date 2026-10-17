package dm3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.contacts.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.contacts.impl.ui.contact.screen.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            zm3.a aVar3 = ((e) ((j2) aVar2.G.f22677a).getValue()).f115827a;
            zm3.l lVar = aVar3 instanceof zm3.l ? (zm3.l) aVar3 : null;
            if (lVar != null) {
                pfm.r rVarB = aVar2.f66010s.b(lVar);
                this.u = 1;
                if (nim.a.a(rVarB, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return aVar2.C1(new MainContainerScreenDestination.JustShow(new MainScreenTab(ibb.c.f160142c.f83420a), new TransferDestination.ChatTransfer(false, new TabTransferShotDialogAction.Success(new TextLocalisedClause(R$string.payments_chat_delete_chat_toast_title, null, null, 14)), 3), (AccountCreationTransitionAnimation) null, 12));
    }
}
