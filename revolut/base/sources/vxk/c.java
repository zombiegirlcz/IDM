package vxk;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import f1l.g;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction f293094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction onboardingActionsContract$LaunchTradingAccountNextOnboardingAction, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f293094w = onboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f293094w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = bVar.f293092b;
            OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction onboardingActionsContract$LaunchTradingAccountNextOnboardingAction = this.f293094w;
            TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig = onboardingActionsContract$LaunchTradingAccountNextOnboardingAction.f104127b;
            OnboardingPart onboardingPart = onboardingActionsContract$LaunchTradingAccountNextOnboardingAction.f104126a;
            boolean z = onboardingActionsContract$LaunchTradingAccountNextOnboardingAction.f104128c;
            this.u = 1;
            obj2 = gVar.a(tradingAccountOnboardingFeatureConfig, onboardingPart, z, this);
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
