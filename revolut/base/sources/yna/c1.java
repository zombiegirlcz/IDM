package yna;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.feature.profile.api.ProfileApi$Toggles$EsimEntryPointInHeader;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.waitlist.api.PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final class c1 extends jki.g implements c0 {

    @NotNull
    public static final h0 Companion = new h0();
    public final mli.e A;
    public final gpk.c B;
    public final am2.a C;
    public final d6k.d D;
    public final e60.a E;
    public final j60.a F;
    public final cpa.a G;
    public final wwa.b H;
    public final xo.h I;
    public final yva.a J;
    public final nkd.a K;
    public final mkd.d L;
    public final ajk.f M;
    public final y70.a N;
    public final rqi.c O;
    public final r69.a P;
    public final twg.c Q;
    public final stj.k R;
    public final kma.c S;
    public final uw1.c T;
    public final kl.t1 U;
    public final xjl.u V;
    public final smd.s W;
    public final i4b.f X;
    public final lek.a Y;
    public final cti.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final fej.b f315306a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final cej.a f315307b0;
    public final oej.a c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final tvi.a f315308d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final myj.e f315309e0;
    public final q5b.b f0;
    public final q5b.c g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final s5b.a f315310h0;
    public final wli.x i0;
    public final cha.c j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final hl2.a f315311k0;
    public final rul.e l0;
    public final yok.l m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final tla.f f315312n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Lazy f315313o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tla.d f315314p;
    public final Lazy p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jn2.b f315315q;
    public final Lazy q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f315316r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lazy f315317r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f315318s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f315319s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r70.c f315320t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f315321t0;
    public final ffk.t u;
    public final aoa.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final rp0.g1 f315322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f01.a f315323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kd6.a f315324y;
    public final ang.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(jki.p stateMapper, tla.d appNavigationCommandsProvider, jn2.b badgeManager, c70.a clipboard, gte.a featureToggleInteractor, r70.c hapticEngine, ffk.t pricingPlanInteractor, aoa.j pricingPlanDataInteractor, rp0.g1 shotDialogDisplayer, f01.a uiKitResources, kd6.a profileAppCompanyProvider, ang.f userInteractor, mli.e userLogoutInteractor, gpk.c appVersionNameProvider, am2.a profileTypeInteractor, d6k.d editRevTagModelExtension, e60.a mediaPickerBottomDialog, j60.a bottomExpandableDialogControllerExtension, cpa.a profileAvatarEncoder, wwa.b inviteCampaignHomeInteractor, xo.h bugReportNavigationProvider, yva.a referralsCodeInteractor, nkd.a promoBannerControllerModelExtension, mkd.d slotManagerFeedExtension, ajk.f pricingPlanNavigationCommandsProvider, y70.a appInstalledChecker, rqi.c googlePlayNaviCommandFactory, r69.a inboxInteractor, twg.c unreadNotificationsStateProvider, stj.k rewardsHubNotificationsInteractor, kma.c debugScreenNavigationDestinationProvider, uw1.c apmFeatureChecker, kl.t1 pricingPlanWaitlistInteractor, xjl.u ssoUserActivityInteractor, smd.s permissionsSettingsProvider, i4b.f legalEntityContextProvider, lek.a podNomineesFeatureChecker, cti.a asftHomeCommandProvider, fej.b esimHomeCommandProvider, cej.a esimFeatureAvailabilityInteractor, oej.a esimCoreInteractor, tvi.a airportLoungesHomeCommandProvider, myj.e learnFeatureStateChecker, q5b.b cobrandedCardsPlansInteractor, q5b.c cobrandsProductAvailabilityInteractor, s5b.a cobrandedCardsEntryPointDestinationProvider, wli.x deeplinkHandler, cha.c studentPlanInteractor, hl2.a restrictionsInteractor, rul.e switcherButtonProvider, yok.l tradingFeeItemProvider, tla.f profileOnboarding) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(appNavigationCommandsProvider, "appNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(badgeManager, "badgeManager");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanDataInteractor, "pricingPlanDataInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(profileAppCompanyProvider, "profileAppCompanyProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(appVersionNameProvider, "appVersionNameProvider");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(editRevTagModelExtension, "editRevTagModelExtension");
        Intrinsics.checkNotNullParameter(mediaPickerBottomDialog, "mediaPickerBottomDialog");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(profileAvatarEncoder, "profileAvatarEncoder");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(bugReportNavigationProvider, "bugReportNavigationProvider");
        Intrinsics.checkNotNullParameter(referralsCodeInteractor, "referralsCodeInteractor");
        Intrinsics.checkNotNullParameter(promoBannerControllerModelExtension, "promoBannerControllerModelExtension");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(googlePlayNaviCommandFactory, "googlePlayNaviCommandFactory");
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        Intrinsics.checkNotNullParameter(unreadNotificationsStateProvider, "unreadNotificationsStateProvider");
        Intrinsics.checkNotNullParameter(rewardsHubNotificationsInteractor, "rewardsHubNotificationsInteractor");
        Intrinsics.checkNotNullParameter(debugScreenNavigationDestinationProvider, "debugScreenNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(pricingPlanWaitlistInteractor, "pricingPlanWaitlistInteractor");
        Intrinsics.checkNotNullParameter(ssoUserActivityInteractor, "ssoUserActivityInteractor");
        Intrinsics.checkNotNullParameter(permissionsSettingsProvider, "permissionsSettingsProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(podNomineesFeatureChecker, "podNomineesFeatureChecker");
        Intrinsics.checkNotNullParameter(asftHomeCommandProvider, "asftHomeCommandProvider");
        Intrinsics.checkNotNullParameter(esimHomeCommandProvider, "esimHomeCommandProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(airportLoungesHomeCommandProvider, "airportLoungesHomeCommandProvider");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cobrandedCardsEntryPointDestinationProvider, "cobrandedCardsEntryPointDestinationProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(restrictionsInteractor, "restrictionsInteractor");
        Intrinsics.checkNotNullParameter(switcherButtonProvider, "switcherButtonProvider");
        Intrinsics.checkNotNullParameter(tradingFeeItemProvider, "tradingFeeItemProvider");
        Intrinsics.checkNotNullParameter(profileOnboarding, "profileOnboarding");
        this.f315314p = appNavigationCommandsProvider;
        this.f315315q = badgeManager;
        this.f315316r = clipboard;
        this.f315318s = featureToggleInteractor;
        this.f315320t = hapticEngine;
        this.u = pricingPlanInteractor;
        this.v = pricingPlanDataInteractor;
        this.f315322w = shotDialogDisplayer;
        this.f315323x = uiKitResources;
        this.f315324y = profileAppCompanyProvider;
        this.z = userInteractor;
        this.A = userLogoutInteractor;
        this.B = appVersionNameProvider;
        this.C = profileTypeInteractor;
        this.D = editRevTagModelExtension;
        this.E = mediaPickerBottomDialog;
        this.F = bottomExpandableDialogControllerExtension;
        this.G = profileAvatarEncoder;
        this.H = inviteCampaignHomeInteractor;
        this.I = bugReportNavigationProvider;
        this.J = referralsCodeInteractor;
        this.K = promoBannerControllerModelExtension;
        this.L = slotManagerFeedExtension;
        this.M = pricingPlanNavigationCommandsProvider;
        this.N = appInstalledChecker;
        this.O = googlePlayNaviCommandFactory;
        this.P = inboxInteractor;
        this.Q = unreadNotificationsStateProvider;
        this.R = rewardsHubNotificationsInteractor;
        this.S = debugScreenNavigationDestinationProvider;
        this.T = apmFeatureChecker;
        this.U = pricingPlanWaitlistInteractor;
        this.V = ssoUserActivityInteractor;
        this.W = permissionsSettingsProvider;
        this.X = legalEntityContextProvider;
        this.Y = podNomineesFeatureChecker;
        this.Z = asftHomeCommandProvider;
        this.f315306a0 = esimHomeCommandProvider;
        this.f315307b0 = esimFeatureAvailabilityInteractor;
        this.c0 = esimCoreInteractor;
        this.f315308d0 = airportLoungesHomeCommandProvider;
        this.f315309e0 = learnFeatureStateChecker;
        this.f0 = cobrandedCardsPlansInteractor;
        this.g0 = cobrandsProductAvailabilityInteractor;
        this.f315310h0 = cobrandedCardsEntryPointDestinationProvider;
        this.i0 = deeplinkHandler;
        this.j0 = studentPlanInteractor;
        this.f315311k0 = restrictionsInteractor;
        this.l0 = switcherButtonProvider;
        this.m0 = tradingFeeItemProvider;
        this.f315312n0 = profileOnboarding;
        final int i = 0;
        this.f315313o0 = yhm.j.b(new Function0(this) { // from class: yna.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f315337b;

            {
                this.f315337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                efm.r rVarW;
                efm.r rVarR;
                switch (i) {
                    case 0:
                        return m70.a.g(this.f315337b.C.a(), null, new yjh.b0(12), 1).replay(1).e();
                    case 1:
                        aoa.j jVar = this.f315337b.v;
                        Lazy lazy = jVar.f7953g;
                        Lazy lazy2 = jVar.f7953g;
                        Object value = lazy.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r rVar = (efm.r) value;
                        efm.r rVarN = jVar.f7950a.n();
                        efm.r rVarC = sh3.a.c(jVar.f7951b, aoa.j.f7949h, null, null, 6);
                        gte.a aVar = jVar.f7952c;
                        jte.d dVar = (jte.d) aVar;
                        if (dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                            toh.d dVar2 = jVar.d;
                            if (((nyb.b) ((eub.a) dVar2.f273214a)).f()) {
                                rVarW = nim.a.w(((nyb.k) dVar2.f273215b).c(false), new yjj.j(21));
                            } else {
                                rVarW = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                            }
                        } else {
                            rVarW = z9h.n.f(null, null, false, 6, null);
                            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                        }
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        efm.r rVarSwitchMap = ((efm.r) value2).distinctUntilChanged((kfm.d) new aoa.h(new an4.g(18), 0)).switchMap(new aoa.h(new aoa.g(jVar, 2), 1));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        if (!((jte.d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c)) {
                            od0.i.Companion.getClass();
                            rVarR = efm.r.just(new Data(od0.i.f224256b, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarR, "just(...)");
                        } else if (dVar.c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
                            ufm.d dVar3 = jVar.e;
                            rVarR = rd0.e.c(nim.a.v(n14.e.x((ffk.t) dVar3.f279876b, new vdl.a(dVar3, 22)), new anf.p(14)), kotlin.coroutines.g.f186406a);
                        } else {
                            Object value3 = lazy2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            efm.r rVarDistinctUntilChanged = nim.a.w((efm.r) value3, new anf.p(15)).distinctUntilChanged((kfm.d) new ai0.j(new an4.g(19), 28));
                            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                            rVarR = pd.b.r(rVarDistinctUntilChanged, new aoa.g(jVar, 0));
                        }
                        efm.r map = te0.w.p(rVar, rVarN, rVarC, rVarW, rVarSwitchMap, rVarR).map(new ai0.j(new aoa.g(jVar, 1), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.replay(1).e();
                    case 2:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ChatApi$Toggles.SupportNewInbox.f50985c));
                    case 3:
                        int i2 = i0.f315347a[((y69.d) this.f315337b.P).b().ordinal()];
                        boolean z = true;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
                }
            }
        });
        final int i2 = 1;
        this.p0 = yhm.j.b(new Function0(this) { // from class: yna.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f315337b;

            {
                this.f315337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                efm.r rVarW;
                efm.r rVarR;
                switch (i2) {
                    case 0:
                        return m70.a.g(this.f315337b.C.a(), null, new yjh.b0(12), 1).replay(1).e();
                    case 1:
                        aoa.j jVar = this.f315337b.v;
                        Lazy lazy = jVar.f7953g;
                        Lazy lazy2 = jVar.f7953g;
                        Object value = lazy.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r rVar = (efm.r) value;
                        efm.r rVarN = jVar.f7950a.n();
                        efm.r rVarC = sh3.a.c(jVar.f7951b, aoa.j.f7949h, null, null, 6);
                        gte.a aVar = jVar.f7952c;
                        jte.d dVar = (jte.d) aVar;
                        if (dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                            toh.d dVar2 = jVar.d;
                            if (((nyb.b) ((eub.a) dVar2.f273214a)).f()) {
                                rVarW = nim.a.w(((nyb.k) dVar2.f273215b).c(false), new yjj.j(21));
                            } else {
                                rVarW = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                            }
                        } else {
                            rVarW = z9h.n.f(null, null, false, 6, null);
                            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                        }
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        efm.r rVarSwitchMap = ((efm.r) value2).distinctUntilChanged((kfm.d) new aoa.h(new an4.g(18), 0)).switchMap(new aoa.h(new aoa.g(jVar, 2), 1));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        if (!((jte.d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c)) {
                            od0.i.Companion.getClass();
                            rVarR = efm.r.just(new Data(od0.i.f224256b, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarR, "just(...)");
                        } else if (dVar.c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
                            ufm.d dVar3 = jVar.e;
                            rVarR = rd0.e.c(nim.a.v(n14.e.x((ffk.t) dVar3.f279876b, new vdl.a(dVar3, 22)), new anf.p(14)), kotlin.coroutines.g.f186406a);
                        } else {
                            Object value3 = lazy2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            efm.r rVarDistinctUntilChanged = nim.a.w((efm.r) value3, new anf.p(15)).distinctUntilChanged((kfm.d) new ai0.j(new an4.g(19), 28));
                            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                            rVarR = pd.b.r(rVarDistinctUntilChanged, new aoa.g(jVar, 0));
                        }
                        efm.r map = te0.w.p(rVar, rVarN, rVarC, rVarW, rVarSwitchMap, rVarR).map(new ai0.j(new aoa.g(jVar, 1), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.replay(1).e();
                    case 2:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ChatApi$Toggles.SupportNewInbox.f50985c));
                    case 3:
                        int i22 = i0.f315347a[((y69.d) this.f315337b.P).b().ordinal()];
                        boolean z = true;
                        if (i22 != 1) {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
                }
            }
        });
        final int i3 = 2;
        this.q0 = yhm.j.b(new Function0(this) { // from class: yna.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f315337b;

            {
                this.f315337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                efm.r rVarW;
                efm.r rVarR;
                switch (i3) {
                    case 0:
                        return m70.a.g(this.f315337b.C.a(), null, new yjh.b0(12), 1).replay(1).e();
                    case 1:
                        aoa.j jVar = this.f315337b.v;
                        Lazy lazy = jVar.f7953g;
                        Lazy lazy2 = jVar.f7953g;
                        Object value = lazy.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r rVar = (efm.r) value;
                        efm.r rVarN = jVar.f7950a.n();
                        efm.r rVarC = sh3.a.c(jVar.f7951b, aoa.j.f7949h, null, null, 6);
                        gte.a aVar = jVar.f7952c;
                        jte.d dVar = (jte.d) aVar;
                        if (dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                            toh.d dVar2 = jVar.d;
                            if (((nyb.b) ((eub.a) dVar2.f273214a)).f()) {
                                rVarW = nim.a.w(((nyb.k) dVar2.f273215b).c(false), new yjj.j(21));
                            } else {
                                rVarW = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                            }
                        } else {
                            rVarW = z9h.n.f(null, null, false, 6, null);
                            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                        }
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        efm.r rVarSwitchMap = ((efm.r) value2).distinctUntilChanged((kfm.d) new aoa.h(new an4.g(18), 0)).switchMap(new aoa.h(new aoa.g(jVar, 2), 1));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        if (!((jte.d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c)) {
                            od0.i.Companion.getClass();
                            rVarR = efm.r.just(new Data(od0.i.f224256b, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarR, "just(...)");
                        } else if (dVar.c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
                            ufm.d dVar3 = jVar.e;
                            rVarR = rd0.e.c(nim.a.v(n14.e.x((ffk.t) dVar3.f279876b, new vdl.a(dVar3, 22)), new anf.p(14)), kotlin.coroutines.g.f186406a);
                        } else {
                            Object value3 = lazy2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            efm.r rVarDistinctUntilChanged = nim.a.w((efm.r) value3, new anf.p(15)).distinctUntilChanged((kfm.d) new ai0.j(new an4.g(19), 28));
                            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                            rVarR = pd.b.r(rVarDistinctUntilChanged, new aoa.g(jVar, 0));
                        }
                        efm.r map = te0.w.p(rVar, rVarN, rVarC, rVarW, rVarSwitchMap, rVarR).map(new ai0.j(new aoa.g(jVar, 1), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.replay(1).e();
                    case 2:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ChatApi$Toggles.SupportNewInbox.f50985c));
                    case 3:
                        int i22 = i0.f315347a[((y69.d) this.f315337b.P).b().ordinal()];
                        boolean z = true;
                        if (i22 != 1) {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
                }
            }
        });
        final int i5 = 3;
        this.f315317r0 = yhm.j.b(new Function0(this) { // from class: yna.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f315337b;

            {
                this.f315337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                efm.r rVarW;
                efm.r rVarR;
                switch (i5) {
                    case 0:
                        return m70.a.g(this.f315337b.C.a(), null, new yjh.b0(12), 1).replay(1).e();
                    case 1:
                        aoa.j jVar = this.f315337b.v;
                        Lazy lazy = jVar.f7953g;
                        Lazy lazy2 = jVar.f7953g;
                        Object value = lazy.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r rVar = (efm.r) value;
                        efm.r rVarN = jVar.f7950a.n();
                        efm.r rVarC = sh3.a.c(jVar.f7951b, aoa.j.f7949h, null, null, 6);
                        gte.a aVar = jVar.f7952c;
                        jte.d dVar = (jte.d) aVar;
                        if (dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                            toh.d dVar2 = jVar.d;
                            if (((nyb.b) ((eub.a) dVar2.f273214a)).f()) {
                                rVarW = nim.a.w(((nyb.k) dVar2.f273215b).c(false), new yjj.j(21));
                            } else {
                                rVarW = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                            }
                        } else {
                            rVarW = z9h.n.f(null, null, false, 6, null);
                            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                        }
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        efm.r rVarSwitchMap = ((efm.r) value2).distinctUntilChanged((kfm.d) new aoa.h(new an4.g(18), 0)).switchMap(new aoa.h(new aoa.g(jVar, 2), 1));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        if (!((jte.d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c)) {
                            od0.i.Companion.getClass();
                            rVarR = efm.r.just(new Data(od0.i.f224256b, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarR, "just(...)");
                        } else if (dVar.c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
                            ufm.d dVar3 = jVar.e;
                            rVarR = rd0.e.c(nim.a.v(n14.e.x((ffk.t) dVar3.f279876b, new vdl.a(dVar3, 22)), new anf.p(14)), kotlin.coroutines.g.f186406a);
                        } else {
                            Object value3 = lazy2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            efm.r rVarDistinctUntilChanged = nim.a.w((efm.r) value3, new anf.p(15)).distinctUntilChanged((kfm.d) new ai0.j(new an4.g(19), 28));
                            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                            rVarR = pd.b.r(rVarDistinctUntilChanged, new aoa.g(jVar, 0));
                        }
                        efm.r map = te0.w.p(rVar, rVarN, rVarC, rVarW, rVarSwitchMap, rVarR).map(new ai0.j(new aoa.g(jVar, 1), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.replay(1).e();
                    case 2:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ChatApi$Toggles.SupportNewInbox.f50985c));
                    case 3:
                        int i22 = i0.f315347a[((y69.d) this.f315337b.P).b().ordinal()];
                        boolean z = true;
                        if (i22 != 1) {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
                }
            }
        });
        final int i6 = 4;
        this.f315319s0 = yhm.j.b(new Function0(this) { // from class: yna.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f315337b;

            {
                this.f315337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                efm.r rVarW;
                efm.r rVarR;
                switch (i6) {
                    case 0:
                        return m70.a.g(this.f315337b.C.a(), null, new yjh.b0(12), 1).replay(1).e();
                    case 1:
                        aoa.j jVar = this.f315337b.v;
                        Lazy lazy = jVar.f7953g;
                        Lazy lazy2 = jVar.f7953g;
                        Object value = lazy.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        efm.r rVar = (efm.r) value;
                        efm.r rVarN = jVar.f7950a.n();
                        efm.r rVarC = sh3.a.c(jVar.f7951b, aoa.j.f7949h, null, null, 6);
                        gte.a aVar = jVar.f7952c;
                        jte.d dVar = (jte.d) aVar;
                        if (dVar.c(ProfileApi$Toggles$RevampedProfileScreen.f81321c)) {
                            toh.d dVar2 = jVar.d;
                            if (((nyb.b) ((eub.a) dVar2.f273214a)).f()) {
                                rVarW = nim.a.w(((nyb.k) dVar2.f273215b).c(false), new yjj.j(21));
                            } else {
                                rVarW = z9h.n.f(null, null, false, 6, null);
                                Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                            }
                        } else {
                            rVarW = z9h.n.f(null, null, false, 6, null);
                            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                        }
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        efm.r rVarSwitchMap = ((efm.r) value2).distinctUntilChanged((kfm.d) new aoa.h(new an4.g(18), 0)).switchMap(new aoa.h(new aoa.g(jVar, 2), 1));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        if (!((jte.d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c)) {
                            od0.i.Companion.getClass();
                            rVarR = efm.r.just(new Data(od0.i.f224256b, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarR, "just(...)");
                        } else if (dVar.c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
                            ufm.d dVar3 = jVar.e;
                            rVarR = rd0.e.c(nim.a.v(n14.e.x((ffk.t) dVar3.f279876b, new vdl.a(dVar3, 22)), new anf.p(14)), kotlin.coroutines.g.f186406a);
                        } else {
                            Object value3 = lazy2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            efm.r rVarDistinctUntilChanged = nim.a.w((efm.r) value3, new anf.p(15)).distinctUntilChanged((kfm.d) new ai0.j(new an4.g(19), 28));
                            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                            rVarR = pd.b.r(rVarDistinctUntilChanged, new aoa.g(jVar, 0));
                        }
                        efm.r map = te0.w.p(rVar, rVarN, rVarC, rVarW, rVarSwitchMap, rVarR).map(new ai0.j(new aoa.g(jVar, 1), 29));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.replay(1).e();
                    case 2:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ChatApi$Toggles.SupportNewInbox.f50985c));
                    case 3:
                        int i22 = i0.f315347a[((y69.d) this.f315337b.P).b().ordinal()];
                        boolean z = true;
                        if (i22 != 1) {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(((jte.d) this.f315337b.f315318s).c(ProfileApi$Toggles$RevampedProfileScreen.f81321c));
                }
            }
        });
        this.f315321t0 = new a(new TextClause(appVersionNameProvider.f(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 65527);
    }

    public final boolean A2() {
        return ((Boolean) this.f315317r0.getValue()).booleanValue();
    }

    public final void B2(pwa.n nVar) {
        if (nVar == null) {
            nVar = pwa.n.STANDARD;
        }
        C1(new BridgeDestination(new FeatureCommand(new ReferralsBizFeatureConfig.InviteCampaignHomeFeatureConfig(nVar, 15))));
    }

    public final efm.r C2() {
        v20.f0 f0Var = (v20.f0) this.f315315q.f176651b.f211647a;
        j30.c cVar = f0Var.f285388j;
        return m70.a.f(rd0.e.c(nim.a.v(f0Var.m(w4l.h.f294642c), new v20.s(1)), kotlin.coroutines.g.f186406a), new jb8.b(14), new jme.f(1), new jme.f(2)).map(new yma.r(new yjj.j(18), 17));
    }

    public final efm.r D2() {
        boolean zA2 = A2();
        x xVar = x.f315383a;
        if (zA2) {
            efm.r map = ((y69.d) ((r69.a) this.Q.f275017a)).d().map(new blh.g0(new bng.a(12), 8));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return ue0.e.E(map, xVar);
        }
        efm.r rVarJust = efm.r.just(xVar);
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    public final efm.r E2() {
        if (!y2()) {
            efm.r rVarJust = efm.r.just(x.f315383a);
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        twg.c cVar = this.Q;
        n30.n nVar = (n30.n) cVar.f275019c;
        efm.r rVarC = rd0.e.c(nim.a.v(((v20.f0) nVar.f211647a).m(w4l.h.f294642c), new n30.b(nVar, 0)), kotlin.coroutines.g.f186406a);
        y69.d dVar = (y69.d) ((r69.a) cVar.f275017a);
        int i = boa.a.f17360a[dVar.b().ordinal()];
        if (i == 1) {
            efm.r rVarCombineLatest = efm.r.combineLatest(rVarC, dVar.d(), new blh.g0(new bn4.y(8), 6));
            Intrinsics.h(rVarCombineLatest);
            return rVarCombineLatest;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        efm.r map = rVarC.map(new blh.g0(new bng.a(11), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void F2(boolean z) {
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R.string.retail_main_logout_alert_title, null, null, 14), new TextLocalisedClause(R$string.retail_main_logout_popup_subtitle, null, null, 14), null, 28);
        kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
        List listK = zhm.v.k(new CellDetailsSwitcherDelegate.Model("ID_BOTTOM_DIALOG_FORGET_THIS_DEVICE_TITLE", new TextLocalisedClause(R$string.retail_main_logout_forget_device_title, null, null, 14), z, true, 0, null, null, null, 4080), new CellDetailsStandaloneNoteDelegate.Model("ID_BOTTOM_DIALOG_FORGET_THIS_DEVICE_DESCRIPTION", null, new TextLocalisedClause(R$string.retail_main_logout_forget_device_description, null, null, 14), null, null, false, null, 0, 0, 2042));
        yp0.b.k(listK, 0, R$attr.uikit_dp0, 0, 0, 29);
        s0Var.b(listK.toArray(new qv0.i[0]));
        um0 um0Var = new um0("ID_BOTTOM_DIALOG_LOGOUT_ACTIONS", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.retail_main_logout_alert_logout, null, null, 14), false, null, null, 56), (Object) new a0(z), (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008);
        yp0.b.r(um0Var, 0, 0, 0, 0, 15);
        s0Var.a(um0Var);
        ArrayList arrayList = s0Var.f186433a;
        this.F.x(new rp0.y(zhm.v.k(arrayList.toArray(new Object[arrayList.size()])), tVar, rp0.l.WINDOW, null, null, null, 1016));
    }

    public final void G2() {
        l2(new y0(this, null, 1), new yi5.b(26));
    }

    public final void H2() {
        ((rp0.k1) this.f315322w).d(new ShotDialogDisplayer$Configuration("ID_SHOT_COPIED_TO_CLIPBOARD", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_copied_to_clipboard, null, null, 14), new ConfigurableResourceImage(R$drawable.uikit_icn_24_copy, null, null, null, 1022), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, new vkm.t0(rd0.e.b(z2()), 1), null, null, new m0(this, continuation, 5), 3);
        efm.r rVarSwitchMap = z2().switchMap(new yma.r(new g0(this, 2), 13));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new k0(this, null), 3);
        yji.l.a1(this, rd0.e.b(te0.w.l(m70.a.g(this.z.k(false), null, new yjh.b0(13), 1), z2())), null, null, new m0(this, continuation, 8), 3);
        vkm.d dVarB = rd0.e.b(hng.g.b(((ang.b) this.f315324y.f182811a).f7765a));
        zhm.h0 h0Var = zhm.h0.f322473a;
        yji.l.a1(this, new vvh.e(mo3.a.g(rd0.e.n(dVarB, h0Var), null, new yjh.b0(25), 1), 15), null, null, new m0(this, continuation, 9), 3);
        efm.r rVarSwitchMap2 = z2().switchMap(new yma.r(new g0(this, 7), 19));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap2), null, null, new m0(this, continuation, 2), 3);
        efm.r rVarSwitchMap3 = z2().filter(new yma.r(new yjj.j(15), 11)).switchMap(new yma.r(new g0(this, 1), 12));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap3), null, null, new m0(this, continuation, 3), 3);
        efm.r rVarSwitchMap4 = z2().filter(new yma.r(new yjj.j(14), 9)).switchMap(new yma.r(new g0(this, 0), 10));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
        yji.l.a1(this, vkm.q.q(new xo8.a0(rd0.e.b(rVarSwitchMap4), 27)), null, null, new m0(this, continuation, 0), 3);
        ty1.b bVar = (ty1.b) this.T;
        bVar.getClass();
        x2(new xyh.n(bVar.b(uw1.f.UPI), 11));
        PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist pricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist = PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist.f103651c;
        jte.d dVar = (jte.d) this.f315318s;
        if (dVar.c(pricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist)) {
            List listC = zhm.u.c(gok.b.ACTIVE);
            hd.r rVar = (hd.r) this.U.f185240b;
            w4l.i loadingStrategy = w4l.i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            yji.l.a1(this, new vvh.e(mo3.a.g(((x4l.c) rVar.e).b(new ook.c(null, listC, null), loadingStrategy), null, null, 3), 14), null, null, new m0(this, continuation, 4), 3);
        }
        xjl.u uVar = this.V;
        uVar.getClass();
        yji.l.a1(this, new v1(new xec.c0(uVar, continuation, 19)), null, null, new m0(this, continuation, 7), 3);
        yji.l.a1(this, this.X.j(null), null, null, new m0(this, continuation, 1), 3);
        rul.e eVar = this.l0;
        yji.l.a1(this, !((r10.q) eVar.f257630b).E() ? new go.g(null, 2) : new q87.q(((ang.f) eVar.f257629a).j(w4l.j.f294644c), 21), null, null, new m0(this, continuation, 6), 3);
        if (dVar.c(ProfileApi$Toggles$EsimEntryPointInHeader.f81312c)) {
            yji.l.a1(this, vkm.q.q(rd0.e.e(new t38.e(new y5j.e(((efj.c) this.f315307b0).b(), 17), 24, new q87.q(((oej.b) this.c0).d(), 20), new f23.g0(3, 5, null)), h0Var, new x18.c(3, 26, null))), null, null, new rf9.h(this, continuation, 28), 3);
        }
    }

    @Override // yji.l
    public final void P1() {
        oga.f fVar;
        oga.g gVar = ((a) t2()).f315283p;
        ufm.d dVar = this.v.e;
        dVar.getClass();
        if (gVar == null || (fVar = gVar.f225071a) == null || !fVar.d) {
            return;
        }
        zga.a aVar = (zga.a) dVar.f279877c;
        String nudgeKey = gVar.f225072b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(nudgeKey, "nudgeKey");
        ConcurrentHashMap.KeySetView nudgeKeys = aVar.f322091a;
        Intrinsics.checkNotNullExpressionValue(nudgeKeys, "nudgeKeys");
        nudgeKeys.add(nudgeKey);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 <= 0) {
            return;
        }
        n2(new u0(this, null, 5), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f315321t0;
    }

    public final boolean y2() {
        return ((Boolean) this.q0.getValue()).booleanValue();
    }

    public final efm.r z2() {
        return (efm.r) this.f315313o0.getValue();
    }
}
