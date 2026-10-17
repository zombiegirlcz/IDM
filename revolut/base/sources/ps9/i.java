package ps9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps9.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
