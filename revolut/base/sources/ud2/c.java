package ud2;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ SpinDeregisterPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SpinDeregisterPromptScreen spinDeregisterPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = spinDeregisterPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.u.d();
        qVarD3.getClass();
        qVarD3.l2(new o(qVarD3, null, 0), new yi5.b(26));
        return Unit.f186387a;
    }
}
