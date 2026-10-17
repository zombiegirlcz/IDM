package a68;

import com.revolut.RevolutApplication;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingResultFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptDestination;
import cu8.v0;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.mock.NetworkBehavior;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1566a;

    public /* synthetic */ f(int i) {
        this.f1566a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 12;
        Object[] objArr = 0;
        switch (this.f1566a) {
            case 0:
                return new FeatureCommand(new JuniorAccountActivationFeatureConfig.AccountApprovedAlready(null));
            case 1:
                return vhi.c.c(JuniorAccountActivationFeatureConfig.CompanyMismatchDestination.f76621a, yhi.b.POPUP, null, false, 12);
            case 2:
                return vhi.c.c(JuniorAccountActivationFeatureConfig.CountryMismatchDestination.f76622a, yhi.b.POPUP, null, false, 12);
            case 3:
                return anf.a.f7729a;
            case 4:
                return new Data(f0.f322471a, null, false, 6, null);
            case 5:
                v0 v0Var = com.revolut.feature.kyc.impl.f.Companion;
                return Boolean.TRUE;
            case 6:
                return cyh.a.f110093a;
            case 7:
                return Unit.f186387a;
            case 8:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PartnerConsentPromptDestination(q0l.a.PARTNER_CHOICE_DOES_NOT_MATCH), false, (Integer) null, 0, 61)), 2)));
            case 9:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new PartnerConsentPromptDestination(q0l.a.UNABLE_OPEN_TRADING_ACCOUNT), yhi.b.POPUP, (Integer) (objArr == true ? 1 : 0), i)), 2)));
            case 10:
                return Boolean.TRUE;
            case 11:
                return new FeatureCommand(new TradingOnboardingResultFeatureConfig.TradingOnboardingResultFailed(0));
            case 12:
                RevolutApplication.INSTANCE.getClass();
                if (RevolutApplication.A == null) {
                    Intrinsics.r("sInstance");
                    throw null;
                }
                phm.a aVar = (phm.a) j6.a.j(hf0.b.d, jk3.c.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return ue0.e.v(((ik3.c) ((jk3.c) aVar2.b()).a()).q());
                }
                throw new IllegalStateException(a0.d.q("Api ", jk3.c.class, " is not found"));
            case 13:
                return DummyCommand.f98635a;
            case 14:
                return pva.a.f240036a;
            case 15:
                return NetworkBehavior.lambda$new$0();
            case 16:
                return new FeatureCommand(ProfileFeatureConfig.Terms.f81349a);
            case 17:
                return new RuntimeException("unauthorized");
            case 18:
                return gc0.c.f(v3a.h.b());
            case 19:
                TimeoutException timeoutException = new TimeoutException("Google Pay availability check timeout");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, timeoutException, h0Var);
                Intrinsics.checkNotNullParameter("Check timeout", "<set-?>");
                return Boolean.FALSE;
            default:
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f1566a = i;
    }
}
