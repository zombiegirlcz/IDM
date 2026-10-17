package t50;

import aw0.n6;
import cli.y;
import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RateChatProxyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RateChatProxyScreen rateChatProxyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = rateChatProxyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RateChatProxyScreen rateChatProxyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.c(rateChatProxyScreen.m2());
                u uVar = (u) rateChatProxyScreen.R2();
                uVar.f268031r.set(true);
                y yVar = uVar.f268032s;
                z30.e eVar = ((k50.y) ((j2) yVar.f22677a).getValue()).f181290a;
                if (eVar != null && ((k50.y) ((j2) yVar.f22677a).getValue()).d.length() <= 500) {
                    uVar.n2(new sx2.r(uVar, eVar, null, 13), new su0.c(1, uVar, u.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 10));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) rateChatProxyScreen.R2();
                uVar2.f268031r.set(true);
                uVar2.C2(new k(uVar2.o.f268016a));
                break;
        }
        return Unit.f186387a;
    }
}
