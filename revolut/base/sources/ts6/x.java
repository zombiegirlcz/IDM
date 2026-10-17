package ts6;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274036w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u0 u0Var, s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.v = u0Var;
        this.f274036w = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f274036w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s0 s0Var = this.f274036w;
        if (i == 0) {
            yhm.o.b(obj2);
            FreelancerOnboardingArticleConfig showArticle = this.v == u0.SHOW_INTRO ? new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.GENERAL) : FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a;
            hr6.l lVar = s0Var.f;
            this.u = 1;
            obj2 = ((ct6.m) lVar).e(showArticle, FreelancerOnboardingNavStrategy.NavigateToMain.f73261a);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return new BridgeDestination(com.revolut.retail.core.navigation.a.c(s0Var.h(), (NaviCommand) obj2));
    }
}
