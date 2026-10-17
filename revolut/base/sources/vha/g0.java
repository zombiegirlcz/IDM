package vha;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ q0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.u = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.A2(new FreelancerBizFeatureConfig.Onboarding.Default(FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a, FreelancerOnboardingNavStrategy.NavigateToMain.f73261a, 1));
    }
}
