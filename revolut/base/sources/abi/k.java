package abi;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ EmailVerificationPromptController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(EmailVerificationPromptController emailVerificationPromptController, Continuation continuation) {
        super(2, continuation);
        this.u = emailVerificationPromptController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.u.d();
        int i = m.f2971a[aVar2.o.f97598c.ordinal()];
        if (i == 1) {
            String str = ((a) ((j2) aVar2.u.f22677a).getValue()).f2965a;
            Continuation continuation = null;
            if (str != null) {
                aVar2.l2(new a1a.a(aVar2, str, continuation, 29), new a9h.b(17));
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Expected OTP value was null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.I2();
        }
        return Unit.f186387a;
    }
}
