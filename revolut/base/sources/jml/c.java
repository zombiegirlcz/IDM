package jml;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ ContinueWithRevolutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ContinueWithRevolutScreen continueWithRevolutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = continueWithRevolutScreen;
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
        o.b(obj2);
        ((com.revolut.sso.impl.ui.consolidation.continue_with_revolut.a) this.u.d()).C2(f.f176634a);
        return Unit.f186387a;
    }
}
