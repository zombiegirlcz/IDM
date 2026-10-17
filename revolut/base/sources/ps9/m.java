package ps9;

import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RectangularButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RectangularButtonDelegate.Model model = (RectangularButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        String listId = model.f53150a;
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE3;
        dVar.getClass();
        com.revolut.kompot.navigable.vc.modal.a aVar2 = dVar.D;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (iHashCode != -1895067986) {
            if (iHashCode != -1668528987) {
                if (iHashCode == 29930157 && listId.equals("ID_INVITE")) {
                    dVar.l2(new v(dVar, null, 2), new yi5.b(26));
                }
            } else if (listId.equals("ITEM_ID_CHANGE_BACKGROUND")) {
                oki.h.v2(aVar2, GroupChatSettingsScreenContract$Step.ChangeBackgroundDialog.f79377a, popup);
            }
        } else if (listId.equals("ID_EDIT")) {
            oki.h.v2(aVar2, GroupChatSettingsScreenContract$Step.ChangeGroupName.f79378a, popup);
        }
        return Unit.f186387a;
    }
}
