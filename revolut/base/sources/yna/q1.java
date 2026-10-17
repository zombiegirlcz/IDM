package yna;

import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.chat.navigation.InboxDestination;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.accessibility_settings.api.AccessibilitySettingsDestination;
import com.revolut.feature.backend_driven_limits.api.navigation.BackendDrivenLimitsDestination;
import com.revolut.feature.debug_tools.DebugScreenFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.notification_centre.api.navigation.LegacyInboxDestination;
import com.revolut.feature.notification_centre.api.navigation.RevolutFeedDestination;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.api.navigation.PocketsListDestination;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$Step;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.feature.referrals.code.api.ReferralCodeApiContract$InputData;
import com.revolut.feature.referrals.code.api.ScreenSource;
import com.revolut.feature.retail.privacy.api.navigation.RetailPrivacyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDestination;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(ProfileScreen profileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q1 q1Var = new q1(this.v, continuation);
        q1Var.u = obj2;
        return q1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q1) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarT2 = this.v.T2();
        Intrinsics.h(model);
        c1 c1Var = (c1) c0VarT2;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int i = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (str.hashCode()) {
            case -2102352180:
                if (str.equals("ID_ACCOUNT_DETAILS")) {
                    c1Var.C1(new PocketsListDestination(PocketListType.Main.f80780a));
                }
                break;
            case -2049582301:
                if (str.equals("ID_BUG_REPORT")) {
                    c1Var.C1(new BridgeDestination(new FeatureCommand(c1Var.I.b())));
                }
                break;
            case -1966217580:
                if (str.equals("ID_PLAN_CELL")) {
                    c1Var.G2();
                }
                break;
            case -1894977563:
                if (str.equals("ID_HELP")) {
                    c1Var.l2(new y0(c1Var, null, 0), new yi5.b(26));
                }
                break;
            case -1894732851:
                if (str.equals("ID_PLAN")) {
                    c1Var.G2();
                }
                break;
            case -1829164012:
                if (str.equals("ID_ITEM_ID_DEBUG_SCREEN")) {
                    c1Var.S.getClass();
                    c1Var.C1(new BridgeDestination(new FeatureCommand(DebugScreenFeatureConfig.f71623a)));
                }
                break;
            case -1803832678:
                if (str.equals("PUBLIC_EXPERIMENTS_ID")) {
                    c1Var.v2(new b0(ProfileFlowContract$Step.PublicExperiments.f81429a));
                }
                break;
            case -1355273974:
                if (str.equals("ID_ACCESSIBILITY")) {
                    c1Var.C1(AccessibilitySettingsDestination.f60554b);
                }
                break;
            case -1346694076:
                if (str.equals("ID_PRIVACY")) {
                    c1Var.C1(new RetailPrivacyDestination(null));
                }
                break;
            case -1024983765:
                if (str.equals("ID_REFERRAL_CODE")) {
                    yji.l.j2(c1Var, c1Var.e1(new xva.a(new ReferralCodeApiContract$InputData(ScreenSource.Profile.f81675a))), null, new g0(c1Var, 8), 1);
                }
                break;
            case -689193873:
                if (str.equals("ID_LOG_OUT")) {
                    c1Var.F2(false);
                }
                break;
            case -680737272:
                if (str.equals("ID_APPEARANCE")) {
                    c1Var.v2(new b0(ProfileFlowContract$Step.AppSettings.f81424a));
                }
                break;
            case -612805638:
                if (str.equals("ID_SECURITY_HUB")) {
                    c1Var.n2(new u0(c1Var, objArr == true ? 1 : 0, 4), new whi.b(6));
                }
                break;
            case -531679447:
                if (str.equals("ID_PERSONAL_INFO")) {
                    c1Var.C1(UserDetailsDestination.f26226a);
                }
                break;
            case -389200279:
                if (str.equals("ID_REVOLUT_RETAIL_APP")) {
                    c1Var.C1(new BridgeDestination(c1Var.N.a("com.revolut.revolut") ? new ActivityNavigateCommand(new ExternalAppDestination("com.revolut.revolut"), null, null, null, 268435456, null, null, null, null, false, 1006) : c1Var.O.a("com.revolut.revolut", gh0.d.GOOGLE)));
                }
                break;
            case -313907372:
                if (str.equals("ID_ABOUT_US")) {
                    c1Var.v2(new b0(ProfileFlowContract$Step.AboutUs.f81422a));
                }
                break;
            case -232723718:
                if (str.equals("ID_WALLET_LIMITS")) {
                    c1Var.C1(new BridgeDestination(new FeatureCommand(new LimitsFeatureConfig.Limits(zhm.y0.b(com.revolut.retail.feature.limits.api.navigation.b.WALLET), null, 2))));
                }
                break;
            case -163841837:
                if (str.equals("ID_NOTIFICATION_SETTINGS")) {
                    c1Var.v2(new b0(new ProfileFlowContract$Step.NotificationSettings(null)));
                }
                break;
            case 36666462:
                if (str.equals("ID_GENERAL_SETTINGS")) {
                    c1Var.v2(new b0(ProfileFlowContract$Step.Settings.f81430a));
                }
                break;
            case 348926435:
                if (str.equals("ID_INVITE_FRIENDS")) {
                    Object obj3 = model.u;
                    c1Var.B2(obj3 instanceof pwa.n ? (pwa.n) obj3 : null);
                }
                break;
            case 627981107:
                if (str.equals("ID_NEW_SUPPORT_INBOX")) {
                    c1Var.C1(InboxDestination.f51112b);
                }
                break;
            case 787188626:
                if (str.equals("ID_COBRANDED_PLAN")) {
                    c1Var.l2(new v0(c1Var, null, 1), new yi5.b(26));
                }
                break;
            case 1140719732:
                if (str.equals("ID_DOCUMENTS")) {
                    c1Var.l2(new u0(c1Var, objArr2 == true ? 1 : 0, i), new yi5.b(26));
                }
                break;
            case 1150966463:
                if (str.equals("ID_REVOLUT_ID")) {
                    c1Var.n2(new u0(c1Var, objArr3 == true ? 1 : 0, 3), new whi.b(6));
                }
                break;
            case 1254836735:
                if (str.equals("ID_BENEFICIARIES")) {
                    c1Var.C1(PodNomineesDestination.f102578a);
                }
                break;
            case 1383625463:
                if (str.equals("ID_STUDENT")) {
                    c1Var.C1(new BridgeDestination(new FeatureCommand(new KompotPricingPlanFeatureConfig.Student(0))));
                }
                break;
            case 1386419778:
                if (str.equals("ID_INBOX")) {
                    int i2 = i0.d[(t69.a.a(((y69.d) c1Var.P).f311237c) ? s69.l.REVOLUT_FEED : s69.l.LEGACY_INBOX).ordinal()];
                    if (i2 == 1) {
                        c1Var.C1(RevolutFeedDestination.f78135a);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c1Var.C1(LegacyInboxDestination.f78134a);
                    }
                }
                break;
            case 1388921344:
                if (str.equals("ID_LEARN")) {
                    c1Var.C1(new BridgeDestination(new FeatureCommand(new LearnKompotFeatureConfig.Home(null))));
                }
                break;
            case 1425661942:
                if (str.equals("ID_REWARDS_HUB")) {
                    c1Var.C1(RewardsHubDestination.f99255a);
                }
                break;
            case 1724355275:
                if (str.equals("ID_RESTRICTIONS")) {
                    c1Var.C1(new BackendDrivenLimitsDestination(false, false));
                }
                break;
            case 2085452521:
                if (str.equals("ID_ACCOUNT")) {
                    c1Var.v2(new b0(ProfileFlowContract$Step.Account.f81423a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
