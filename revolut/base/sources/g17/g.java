package g17;

import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ct6.m;
import hr6.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f139552w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f139552w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f139552w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar2 = this.f139552w;
            l lVar = hVar2.f139554q;
            FreelancerOnboardingNavStrategy.NavigateToCustom navigateToCustom = new FreelancerOnboardingNavStrategy.NavigateToCustom(hVar2.f139555r.f74095c);
            this.u = hVar2;
            this.v = 1;
            FeatureCommand featureCommandE = ((m) lVar).e(FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a, navigateToCustom);
            if (featureCommandE == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj2 = featureCommandE;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.u;
            o.b(obj2);
        }
        return hVar.C1(u0.b((NaviCommand) obj2));
    }
}
