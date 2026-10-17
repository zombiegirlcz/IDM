package ps9;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ GroupChatSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.u.d()).D, GroupChatSettingsScreenContract$Step.ManageMembers.f79380a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
