package r40;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ChatListScreen chatListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarI3 = this.v.T2();
        Intrinsics.h(model);
        x0 x0Var = (x0) cVarI3;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        pse.a aVar2 = obj3 instanceof pse.a ? (pse.a) obj3 : null;
        if (aVar2 != null) {
            x0Var.E2(aVar2.f239483a);
        }
        return Unit.f186387a;
    }
}
