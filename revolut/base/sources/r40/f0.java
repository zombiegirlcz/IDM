package r40;

import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ChatListScreen chatListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh vhVar = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarI3 = this.v.T2();
        SwipeToActionDelegate.SwipeAction swipeAction = vhVar.f54883a;
        String itemId = swipeAction.f53505a;
        Object obj3 = swipeAction.f;
        x0 x0Var = (x0) cVarI3;
        w50.k kVar = x0Var.f251380t;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj3 instanceof v30.j) {
            if (Intrinsics.f(itemId, "ACTION_TRANSCRIPT_ID")) {
                kVar.b3(new TranscriptIdentifier.ChatId(((v30.j) obj3).f285785a));
                kVar.Z2(null);
            } else if (Intrinsics.f(itemId, "ACTION_END_CHAT_ID")) {
                x0Var.n2(new v0(x0Var, obj3, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
