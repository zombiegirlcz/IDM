package o75;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ LoanRefinancedSettlementPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoanRefinancedSettlementPromptScreen loanRefinancedSettlementPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = loanRefinancedSettlementPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((i) ((g) this.u.f70482a0.getValue())).u2();
        return Unit.f186387a;
    }
}
