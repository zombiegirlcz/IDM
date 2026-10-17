package t50;

import com.revolut.chat.domain.model.rate.ExperienceTagItem;
import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import ip0.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s7a.m0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RateChatProxyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RateChatProxyScreen rateChatProxyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rateChatProxyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarM3 = this.v.R2();
        Object obj3 = yVar.f167226b.f58324n;
        u uVar = (u) lVarM3;
        cli.y yVar2 = uVar.f268032s;
        if (obj3 instanceof s50.f) {
            ExperienceTagItem experienceTagItem = ((s50.f) obj3).f259909a;
            boolean zContains = ((k50.y) ((j2) yVar2.f22677a).getValue()).f181292c.contains(experienceTagItem);
            Set setH1 = d0.h1(((k50.y) ((j2) yVar2.f22677a).getValue()).f181292c);
            if (zContains) {
                setH1.remove(experienceTagItem);
            } else {
                setH1.add(experienceTagItem);
            }
            uVar.H2(yVar2, new m0(3, setH1));
        }
        return Unit.f186387a;
    }
}
