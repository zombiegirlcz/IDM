package t50;

import cli.y;
import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import ip0.u80;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RateChatProxyScreen f268015w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RateChatProxyScreen rateChatProxyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268015w = rateChatProxyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f268015w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f268015w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RateChatProxyScreen rateChatProxyScreen = this.f268015w;
        switch (i) {
            case 0:
                u80 u80Var = (u80) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarM3 = rateChatProxyScreen.R2();
                String listId = u80Var.f166631a;
                int i2 = u80Var.f166632b;
                u uVar = (u) lVarM3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                y yVar = uVar.f268032s;
                z30.e eVar = (z30.e) d0.e0(i2, ((k50.y) ((j2) yVar.f22677a).getValue()).f181291b.a());
                if (eVar != null && ((k50.y) ((j2) yVar.f22677a).getValue()).f181290a == null) {
                    if (eVar.f319112a == z30.n.DEFAULT) {
                        uVar.H2(yVar, new sx8.a(eVar, 29));
                    } else {
                        uVar.l2(new s(uVar, eVar, i2, null), new yi5.b(26));
                    }
                }
                break;
            default:
                lw0.l lVar = (lw0.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) rateChatProxyScreen.R2()).K2(null, lVar.a());
                break;
        }
        return Unit.f186387a;
    }
}
