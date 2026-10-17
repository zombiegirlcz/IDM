package wnk;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wnk.i;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ StudentReviewPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StudentReviewPromptScreen studentReviewPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = studentReviewPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.u.d()).C2(i.b.f298848a);
        return Unit.f186387a;
    }
}
