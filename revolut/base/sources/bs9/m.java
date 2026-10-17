package bs9;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ GroupChatScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(GroupChatScreen groupChatScreen, Continuation continuation) {
        super(2, continuation);
        this.u = groupChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ks9.a aVar2 = ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.u.d()).z;
        aVar2.getClass();
        aVar2.T2(new k7c.l0(aVar2, null, 25), new yi5.b(27));
        return Unit.f186387a;
    }
}
