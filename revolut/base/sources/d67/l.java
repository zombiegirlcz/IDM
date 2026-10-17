package d67;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ PromptMarketingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PromptMarketingScreen promptMarketingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = promptMarketingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.R2().C2(q.f111462a);
        return Unit.f186387a;
    }
}
