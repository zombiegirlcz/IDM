package abi;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ EmailVerificationPromptController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EmailVerificationPromptController emailVerificationPromptController, Continuation continuation) {
        super(2, continuation);
        this.u = emailVerificationPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.u.d();
        aVar2.f97600p.getClass();
        aVar2.C1(rai.a.a());
        return Unit.f186387a;
    }
}
