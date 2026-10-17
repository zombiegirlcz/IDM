package vb9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.WaitingListActivationReadyScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ WaitingListActivationReadyScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WaitingListActivationReadyScreen waitingListActivationReadyScreen, Continuation continuation) {
        super(2, continuation);
        this.u = waitingListActivationReadyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((f) this.u.Q.getValue()).C2(d.f287450a);
        return Unit.f186387a;
    }
}
