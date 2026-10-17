package t50;

import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RateChatProxyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RateChatProxyScreen rateChatProxyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rateChatProxyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarM3 = this.v.R2();
        u uVar = (u) lVarM3;
        uVar.K2(model.i, model.f52613a);
        return Unit.f186387a;
    }
}
