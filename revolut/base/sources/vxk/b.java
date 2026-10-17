package vxk;

import com.google.firebase.messaging.t;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import f1l.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293091a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f293092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f293093c;
    public final tm.g d;

    public b(g onboardingPartNaviCommandProvider, ln.a navigationCommandsDispatcher, t delegateFactory) {
        Intrinsics.checkNotNullParameter(onboardingPartNaviCommandProvider, "onboardingPartNaviCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        this.f293092b = onboardingPartNaviCommandProvider;
        this.f293093c = navigationCommandsDispatcher;
        this.d = delegateFactory.f(new vx9.b(this, 7));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        switch (this.f293091a) {
            case 0:
                OnboardingActionsContract$LaunchRemediationNextPartAction action = (OnboardingActionsContract$LaunchRemediationNextPartAction) aVar;
                Intrinsics.checkNotNullParameter(action, "action");
                return this.d.a(action);
            default:
                OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction action2 = (OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction) aVar;
                Intrinsics.checkNotNullParameter(action2, "action");
                return this.d.a(action2);
        }
    }

    public b(ln.a navigationCommandsDispatcher, g onboardingPartNaviCommandProvider, t delegateFactory) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(onboardingPartNaviCommandProvider, "onboardingPartNaviCommandProvider");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        this.f293093c = navigationCommandsDispatcher;
        this.f293092b = onboardingPartNaviCommandProvider;
        this.d = delegateFactory.f(new vx9.b(this, 6));
    }
}
