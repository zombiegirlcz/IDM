package d7d;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ ConsentPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConsentPromptScreen consentPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = consentPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) ((f) this.u.X.getValue());
        nVar.getClass();
        nVar.n2(new k(nVar, null, 2), new h(nVar, 0));
        return Unit.f186387a;
    }
}
