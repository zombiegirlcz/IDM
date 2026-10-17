package pj9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.pay_later.impl.ui.deactivation.PayLaterDeactivationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ PayLaterDeactivationController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PayLaterDeactivationController payLaterDeactivationController, Continuation continuation) {
        super(2, continuation);
        this.u = payLaterDeactivationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.u.d();
        String str = ((f) ((j2) lVar.f236716s.f22677a).getValue()).f236706c;
        if (str != null) {
            Continuation continuation = null;
            if (lVar.f236715r) {
                lVar.l2(new j(lVar, str, continuation, 0), new yi5.b(26));
            } else {
                lVar.l2(new j(lVar, str, continuation, 1), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
