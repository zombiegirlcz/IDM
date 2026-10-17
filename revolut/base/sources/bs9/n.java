package bs9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ GroupChatScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GroupChatScreen groupChatScreen, Continuation continuation) {
        super(2, continuation);
        this.u = groupChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.u.d()).S.onNext(Boolean.TRUE);
        return Unit.f186387a;
    }
}
