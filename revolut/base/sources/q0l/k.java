package q0l;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ PartnerConsentPromptsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PartnerConsentPromptsScreen partnerConsentPromptsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = partnerConsentPromptsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = (c) this.v.f104260b0.getValue();
            this.u = 1;
            f fVar = (f) cVar;
            int i2 = e.f241303a[fVar.f241304p.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.u2();
            }
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
