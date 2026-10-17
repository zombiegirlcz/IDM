package u83;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import u83.j;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ AskLocationSecurityPromptController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AskLocationSecurityPromptController askLocationSecurityPromptController, Continuation continuation) {
        super(2, continuation);
        this.u = askLocationSecurityPromptController;
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
        ((g) ((h) this.u.M.getValue())).C2(j.a.f278104a);
        return Unit.f186387a;
    }
}
