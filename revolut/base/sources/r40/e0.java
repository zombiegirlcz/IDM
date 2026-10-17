package r40;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import ip0.xc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatListScreen f251332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ChatListScreen chatListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251332w = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f251332w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            default:
                e0 e0Var2 = new e0(this.f251332w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((xc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChatListScreen chatListScreen = this.f251332w;
        switch (i) {
            case 0:
                xc xcVar = (xc) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarI3 = chatListScreen.i3();
                x0 x0Var = (x0) cVarI3;
                x0Var.C2(xcVar.f, xcVar.f167122a);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarI32 = chatListScreen.i3();
                Intrinsics.h(clickData);
                x0 x0Var2 = (x0) cVarI32;
                x0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                x0Var2.A2(clickData.d);
                break;
        }
        return Unit.f186387a;
    }
}
