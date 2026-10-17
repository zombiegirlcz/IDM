package vxk;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import f1l.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OnboardingActionsContract$LaunchRemediationNextPartAction f293090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OnboardingActionsContract$LaunchRemediationNextPartAction onboardingActionsContract$LaunchRemediationNextPartAction, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f293090w = onboardingActionsContract$LaunchRemediationNextPartAction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f293090w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = bVar.f293092b;
            OnboardingActionsContract$LaunchRemediationNextPartAction onboardingActionsContract$LaunchRemediationNextPartAction = this.f293090w;
            TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig tradingRemediationFeatureConfig = onboardingActionsContract$LaunchRemediationNextPartAction.f104124b;
            OnboardingPart onboardingPart = onboardingActionsContract$LaunchRemediationNextPartAction.f104123a;
            boolean z = onboardingActionsContract$LaunchRemediationNextPartAction.f104125c;
            this.u = 1;
            obj2 = gVar.b(tradingRemediationFeatureConfig, onboardingPart, z, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.f293093c.b((NaviCommand) obj2);
        return Unit.f186387a;
    }
}
