package r40;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ChatListScreen chatListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarI3 = this.v.T2();
        Intrinsics.h(model);
        x0 x0Var = (x0) cVarI3;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        x0Var.A2(model.e);
        return Unit.f186387a;
    }
}
