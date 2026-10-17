package ps9;

import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ks9.e0;
import ks9.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((GroupSettingsAction.SmartSettlementSetting) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        GroupSettingsAction.SmartSettlementSetting action = (GroupSettingsAction.SmartSettlementSetting) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(action);
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(action, "parcel");
        f0 f0Var = (f0) dVar.v;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        f0Var.T2(new e0(f0Var, null), new yi5.b(27));
        return Unit.f186387a;
    }
}
