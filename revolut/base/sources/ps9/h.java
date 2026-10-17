package ps9;

import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GroupChatSettingsScreen groupChatSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                groupChatSettingsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e60.a aVar3 = ((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) groupChatSettingsScreen.d()).f79387r;
                e60.s sVar = (e60.s) aVar3;
                sVar.T(new e60.i(null, null, null, false, 0, 0, zhm.v.k(t80.f.JPEG, t80.f.PNG), null, false, u00.BACK, null, 15807));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) groupChatSettingsScreen.d();
                dVar.getClass();
                dVar.l2(new v(dVar, null, 1), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
