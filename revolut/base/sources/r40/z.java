package r40;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ChatListScreen chatListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarI3 = this.v.T2();
        Intrinsics.h(model);
        x0 x0Var = (x0) cVarI3;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        x0Var.A2(model.f53016n);
        return Unit.f186387a;
    }
}
