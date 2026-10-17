package r40;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ChatListScreen chatListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarI3 = this.v.T2();
        String itemId = model.f53228a;
        Object obj3 = model.u;
        x0 x0Var = (x0) cVarI3;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj3 instanceof pse.a) {
            x0Var.B2(((pse.a) obj3).f239483a);
        }
        return Unit.f186387a;
    }
}
