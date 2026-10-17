package pgk;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.feature.rewards.api.navigation.RewardsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose$GetPlanOrHigher$Tier;
import com.revolut.retail.feature.pricing_plans.waitlist.api.navigation.PricingPlanWaitlistDestination;
import ffk.e0;
import ffk.t;
import hha.u;
import hha.w0;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import pfk.h0;
import pfm.z;
import sri.m;
import te0.w;
import vkm.z1;
import wkm.y;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cgk.a {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f235994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f235995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f235996c;
    public final e0 d;
    public final ajk.f e;
    public final ajk.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ef3.b f235997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f235998h;

    public k(m navigator, gte.a featureToggleInteractor, t pricingPlanInteractor, e0 studentVerificationInteractor, l dashboardSourceProvider, ajk.f pricingPlanNavigationCommandsProvider, skk.a partnerOfferNavigationCommandProvider, ajk.d pricingPlanBottomSheetsNavigationProvider, ef3.b pricingPlansWaitlistDeeplinkResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(studentVerificationInteractor, "studentVerificationInteractor");
        Intrinsics.checkNotNullParameter(dashboardSourceProvider, "dashboardSourceProvider");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(partnerOfferNavigationCommandProvider, "partnerOfferNavigationCommandProvider");
        Intrinsics.checkNotNullParameter(pricingPlanBottomSheetsNavigationProvider, "pricingPlanBottomSheetsNavigationProvider");
        Intrinsics.checkNotNullParameter(pricingPlansWaitlistDeeplinkResolver, "pricingPlansWaitlistDeeplinkResolver");
        this.f235994a = navigator;
        this.f235995b = featureToggleInteractor;
        this.f235996c = pricingPlanInteractor;
        this.d = studentVerificationInteractor;
        this.e = pricingPlanNavigationCommandsProvider;
        this.f = pricingPlanBottomSheetsNavigationProvider;
        this.f235997g = pricingPlansWaitlistDeeplinkResolver;
        this.f235998h = v.k("plus", "premium", "metal", "ultra", "private", "metal-upgrade-conf", "plans", "plan", "plan-billing", "pricing-plans", "switch-to-annual", "plan-downgrade", "promo-link", "ultra_only", "partners", "offers", "family", "students", "student-email-authenticate");
    }

    public static String b(jf0.c cVar) {
        String str = (String) cVar.d.get("openPerk");
        if (str == null || d0.W(str)) {
            return null;
        }
        return str;
    }

    public static String c(jf0.c cVar) {
        String str = (String) cVar.d.get("launch_source_key");
        if (str != null) {
            return str;
        }
        String str2 = (String) cVar.d.get("utm_source");
        return str2 == null ? "Deeplink" : str2;
    }

    public static PlanChangeSuccessActionStrategy.NavigateNext d(String str, String str2) {
        return new PlanChangeSuccessActionStrategy.NavigateNext(new FeatureCommand(new RewardsFeatureConfig.RewardDetails(str, str2, 24)));
    }

    public static z h(final k kVar, final w0 w0Var, final xfa.b bVar, String str, String str2, u uVar, int i) {
        final boolean z = (i & 4) == 0;
        final String str3 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            str2 = "Deeplink";
        }
        final String str4 = str2;
        final u uVar2 = (i & 32) != 0 ? null : uVar;
        return kVar.g(new Function0() { // from class: pgk.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlanUpgradePurpose planUpgradePurpose$GetPlanOrHigher$Tier;
                String str5 = str3;
                w0 w0Var2 = w0Var;
                if (str5 != null) {
                    u uVar3 = uVar2;
                    if (uVar3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    planUpgradePurpose$GetPlanOrHigher$Tier = new PlanUpgradePurpose.GetFeature(uVar3);
                } else {
                    planUpgradePurpose$GetPlanOrHigher$Tier = new PlanUpgradePurpose$GetPlanOrHigher$Tier(w0Var2);
                }
                return new FeatureCommand(new InternalPricingPlanFeatureConfig.PlanUpgrade(planUpgradePurpose$GetPlanOrHigher$Tier, new PlanSelection.PlanTier(w0Var2), bVar, str5 != null ? k.d(str5, str4) : new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(kVar.e.d()), z));
            }
        });
    }

    public static PricingPlanContextualSelectionLayoutParams i(HashMap map) {
        String str = (String) map.get("presentation_type");
        String strL = str != null ? m70.a.l(str) : null;
        String str2 = (String) map.get("loyaltyProduct");
        return new PricingPlanContextualSelectionLayoutParams(strL, str2 != null ? m70.a.l(str2) : null);
    }

    public static FeatureCommand k(jf0.c cVar) {
        if (Intrinsics.f(cVar.e(3), "invitation") && cVar.e(4).length() > 0) {
            return new FeatureCommand(new KompotPricingPlanFeatureConfig.FamilyPlanInvitation(cVar.e(2), cVar.e(4)));
        }
        if (Intrinsics.f(cVar.e(2), "plan")) {
            return vhi.c.c(Intrinsics.f(cVar.e(3), "add-member") ? new KompotPricingPlanFeatureConfig.FamilyPlanAddMemberDestination(xfa.b.PLAN_HUB_START_FAMILY) : new KompotPricingPlanFeatureConfig.FamilyPlanDestination(xfa.b.PLAN_HUB_START_FAMILY), yhi.b.SOLID, null, false, 12);
        }
        return null;
    }

    public static FeatureCommand l(k kVar, w0 w0Var, xfa.b bVar, String str, String str2, u uVar, int i) {
        PlanUpgradePurpose planUpgradePurpose$GetPlanOrHigher$Tier;
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = "Deeplink";
        }
        if ((i & 32) != 0) {
            uVar = null;
        }
        if (str == null) {
            planUpgradePurpose$GetPlanOrHigher$Tier = new PlanUpgradePurpose$GetPlanOrHigher$Tier(w0Var);
        } else {
            if (uVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            planUpgradePurpose$GetPlanOrHigher$Tier = new PlanUpgradePurpose.GetFeature(uVar);
        }
        return new FeatureCommand(new InternalPricingPlanFeatureConfig.PlanUpgrade(planUpgradePurpose$GetPlanOrHigher$Tier, new PlanSelection.PlanTier(w0Var), bVar, str != null ? d(str, str2) : new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(kVar.e.d()), z));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f235998h.contains(deeplink.e(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x075e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instruction units count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pgk.k.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        u uVar;
        xfa.b bVarA;
        String strL;
        String strL2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        HashMap map = deeplink.d;
        int iHashCode = strE.hashCode();
        t tVar = this.f235996c;
        gte.a aVar = this.f235995b;
        switch (iHashCode) {
            case -1815773487:
                if (strE.equals("plan-downgrade")) {
                    efm.d0 d0VarE = tVar.e();
                    int i = 22;
                    pfa.c cVar = new pfa.c(new p5e.h(this, map, i), i);
                    d0VarE.getClass();
                    ufm.i iVar = new ufm.i(d0VarE, cVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return ue0.e.F(iVar, Boolean.TRUE);
                }
                break;
            case -1417738949:
                if (strE.equals("metal-upgrade-conf")) {
                    return g(new d(6));
                }
                break;
            case -1351067689:
                if (strE.equals("plan-billing")) {
                    w0 w0VarI = cp5.d.I(w0.Companion, deeplink.e(2));
                    if (w0VarI != null) {
                        return g(new pe2.c(this, w0VarI, deeplink));
                    }
                    ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                break;
            case -1281860764:
                if (strE.equals("family")) {
                    FeatureCommand featureCommandK = k(deeplink);
                    if (featureCommandK != null) {
                        return g(new f(featureCommandK, 0));
                    }
                    ufm.b bVarM2 = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                break;
            case -1019793001:
                if (strE.equals("offers")) {
                    String strE2 = deeplink.e(2);
                    return strE2.length() > 0 ? g(new pe2.c(strE2, this, deeplink)) : efm.d0.m(Boolean.FALSE);
                }
                break;
            case -318452137:
                if (strE.equals("premium")) {
                    xfa.b bVarA2 = l.a(deeplink);
                    if (bVarA2 == null) {
                        bVarA2 = xfa.b.PREMIUM_DEEPLINK;
                    }
                    w0 w0Var = w0.PREMIUM;
                    String strB = b(deeplink);
                    String strC = c(deeplink);
                    u.Companion.getClass();
                    return h(this, w0Var, bVarA2, strB, strC, u.f152362t, 4);
                }
                break;
            case -314497661:
                if (strE.equals("private")) {
                    xfa.b bVarA3 = l.a(deeplink);
                    if (bVarA3 == null) {
                        bVarA3 = xfa.b.PRIVATE_BANKING_DEEPLINK;
                    }
                    return h(this, w0.PRIVATE, bVarA3, null, null, null, 56);
                }
                break;
            case 3443497:
                if (strE.equals("plan")) {
                    PlanBottomSheetDeeplinkNavigation planBottomSheetDeeplinkNavigationA = this.f.a(deeplink);
                    if (planBottomSheetDeeplinkNavigationA != null) {
                        if (planBottomSheetDeeplinkNavigationA instanceof igk.d) {
                            return g(new os2.a((igk.d) planBottomSheetDeeplinkNavigationA, 28));
                        }
                        if (planBottomSheetDeeplinkNavigationA instanceof PlanBottomSheetDeeplinkNavigation.SavingsAccounts) {
                            return g(new os2.a((PlanBottomSheetDeeplinkNavigation.SavingsAccounts) planBottomSheetDeeplinkNavigationA, 29));
                        }
                        if (planBottomSheetDeeplinkNavigationA.equals(PlanBottomSheetDeeplinkNavigation.RevPointsCards.Credit.f102905a)) {
                            return g(new d(0));
                        }
                        if (planBottomSheetDeeplinkNavigationA.equals(PlanBottomSheetDeeplinkNavigation.RevPointsCards.Debit.f102906a)) {
                            return g(new d(1));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    String strE3 = deeplink.e(2);
                    switch (strE3.hashCode()) {
                        case -1443368734:
                            if (strE3.equals("cancel-downgrade")) {
                                return g(new d(12));
                            }
                            break;
                        case -1361636432:
                            if (strE3.equals("change")) {
                                String str = (String) map.get("fromTier");
                                w0 w0VarG = str != null ? cp5.d.G(w0.Companion, str) : null;
                                if (w0VarG == null) {
                                    return g(new pe2.c(this, deeplink, 3));
                                }
                                boolean z3 = Boolean.parseBoolean((String) map.get("modal"));
                                xfa.b bVarA4 = l.a(deeplink);
                                if (bVarA4 == null) {
                                    bVarA4 = xfa.b.PLAN_CHANGE_DEEPLINK;
                                }
                                xfa.b bVar = bVarA4;
                                return g(new f(z3 ? new FeatureCommand(new KompotOverlayFeatureConfig(new InternalPricingPlanFeatureConfig.PlanUpgrade.Destination(new PlanUpgradePurpose.GetPlanFromTier(w0VarG), PlanSelection.Default.f103355a, bVar, PlanChangeSuccessActionStrategy.Quit.f102917a, false), yhi.b.POPUP, (Integer) null, 12)) : new FeatureCommand(new PricingPlanFeatureConfig.DashboardFromPlanTier(w0VarG, bVar)), 0));
                            }
                            break;
                        case -1081434779:
                            if (strE3.equals("manage")) {
                                return g(new d(5));
                            }
                            break;
                        case -151398512:
                            if (strE3.equals("whats_new")) {
                                return g(new d(13));
                            }
                            break;
                        case 246054803:
                            if (strE3.equals("waitlist")) {
                                PricingPlanWaitlistDestination pricingPlanWaitlistDestinationA = this.f235997g.a(deeplink);
                                if (pricingPlanWaitlistDestinationA != null) {
                                    return g(new f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, u0.f(pricingPlanWaitlistDestinationA), 2)), 2));
                                }
                                ufm.b bVarM3 = efm.d0.m(Boolean.FALSE);
                                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                                return bVarM3;
                            }
                            break;
                        case 1825589435:
                            if (strE3.equals("screen-template")) {
                                String strE4 = deeplink.e(3);
                                if (strE4.length() != 0) {
                                    return g(new d8b.h(strE4, 9));
                                }
                                ufm.b bVarM4 = efm.d0.m(Boolean.FALSE);
                                Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
                                return bVarM4;
                            }
                            break;
                    }
                    if (deeplink.e(2).length() > 0) {
                        return Intrinsics.f(deeplink.e(3), "terms") ? g(new d8b.h(deeplink.e(2), 6)) : g(new f(this, 1));
                    }
                    return g(new f(this, 1));
                }
                break;
            case 3444122:
                if (strE.equals("plus")) {
                    xfa.b bVarA5 = l.a(deeplink);
                    if (bVarA5 == null) {
                        bVarA5 = xfa.b.PLUS_DEEPLINK;
                    }
                    w0 w0Var2 = w0.PLUS;
                    String strB2 = b(deeplink);
                    String strC2 = c(deeplink);
                    u.Companion.getClass();
                    return h(this, w0Var2, bVarA5, strB2, strC2, u.u, 4);
                }
                break;
            case 103787271:
                if (strE.equals("metal")) {
                    xfa.b bVarA6 = l.a(deeplink);
                    if (bVarA6 == null) {
                        bVarA6 = xfa.b.METAL_DEEPLINK;
                    }
                    w0 w0Var3 = w0.METAL;
                    String strB3 = b(deeplink);
                    String strC3 = c(deeplink);
                    u.Companion.getClass();
                    return h(this, w0Var3, bVarA6, strB3, strC3, u.f152361s, 4);
                }
                break;
            case 106748522:
                if (strE.equals("plans")) {
                    String strE5 = deeplink.e(2);
                    String str2 = strE5.length() > 0 ? strE5 : null;
                    String strB4 = b(deeplink);
                    if (strB4 != null && str2 != null) {
                        return g(new ky4.f(str2, this, deeplink, strB4));
                    }
                    if (str2 != null) {
                        uVar = new u(str2);
                    } else {
                        u.Companion.getClass();
                        uVar = u.F;
                    }
                    u uVar2 = uVar;
                    if (str2 != null) {
                        bVarA = xfa.b.FEATURE_DEEPLINK;
                    } else {
                        bVarA = l.a(deeplink);
                        if (bVarA == null) {
                            bVarA = xfa.b.PLANS_DEEPLINK;
                        }
                    }
                    String str3 = (String) map.get("isReadOnly");
                    if (str3 == null) {
                        str3 = (String) map.get("isFreeChallenge");
                    }
                    return g(new kul.b(this, uVar2, bVarA, Intrinsics.f(str3, "true"), 4));
                }
                break;
            case 111384492:
                if (strE.equals("ultra")) {
                    xfa.b bVarA7 = l.a(deeplink);
                    if (bVarA7 == null) {
                        bVarA7 = xfa.b.ULTRA_DEEPLINK;
                    }
                    w0 w0Var4 = w0.ULTRA;
                    String strB5 = b(deeplink);
                    String strC4 = c(deeplink);
                    u.Companion.getClass();
                    return h(this, w0Var4, bVarA7, strB5, strC4, u.f152360r, 4);
                }
                break;
            case 928733688:
                if (strE.equals("promo-link")) {
                    String lowerCase = deeplink.e(2).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.f(lowerCase, "not-eligible")) {
                        return g(new d(8));
                    }
                    ufm.b bVarM5 = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
                    return bVarM5;
                }
                break;
            case 1189002411:
                if (strE.equals("partners")) {
                    String strE6 = deeplink.e(2);
                    return g(new f(strE6.length() > 0 ? skk.a.a(strE6) : skk.a.b(), 0));
                }
                break;
            case 1370657336:
                if (strE.equals("student-email-authenticate")) {
                    z1 z1Var = this.d.f134829c;
                    if (aVar.a(PricingPlansApi$Toggles.StudentPlans.f81004c)) {
                        ufm.b bVarM6 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM6, "just(...)");
                        return bVarM6;
                    }
                    String code = (String) map.get("token");
                    boolean zF = Intrinsics.f(map.get("presentation_type"), "inline");
                    if (code == null || code.length() == 0) {
                        return efm.d0.m(Boolean.FALSE);
                    }
                    if (((Number) ((y) z1Var.l()).getValue()).intValue() <= 0 || !zF) {
                        return g(new d8b.h(code, 7));
                    }
                    Intrinsics.checkNotNullParameter(code, "code");
                    z1Var.k(code);
                    return efm.d0.m(Boolean.TRUE);
                }
                break;
            case 1597907363:
                if (strE.equals("pricing-plans")) {
                    String strE7 = deeplink.e(2);
                    if (Intrinsics.f(strE7, "offer")) {
                        if (!Intrinsics.f(deeplink.e(3), "prompt")) {
                            ufm.b bVarM7 = efm.d0.m(Boolean.FALSE);
                            Intrinsics.checkNotNullExpressionValue(bVarM7, "just(...)");
                            return bVarM7;
                        }
                        String strE8 = deeplink.e(4);
                        String str4 = strE8.length() > 0 ? strE8 : null;
                        if (str4 != null) {
                            return g(new a3l.b(10, new d8b.h(str4, 8)));
                        }
                        ufm.b bVarM8 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM8, "just(...)");
                        return bVarM8;
                    }
                    if (!Intrinsics.f(strE7, "benefit-prompt")) {
                        ufm.b bVarM9 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM9, "just(...)");
                        return bVarM9;
                    }
                    if (aVar.a(PricingPlansUiApi$Toggles.RevampedPremiumContextualBanners.f102641c) && aVar.a(PricingPlansUiApi$Toggles.PlanWidgetNudges.f102637c)) {
                        ufm.b bVarM10 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM10, "just(...)");
                        return bVarM10;
                    }
                    String str5 = (String) map.get("promptType");
                    if (str5 == null || (strL = m70.a.l(str5)) == null) {
                        ufm.b bVarM11 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM11, "just(...)");
                        return bVarM11;
                    }
                    String str6 = (String) map.get("suggestedPlanTier");
                    w0 w0VarG2 = str6 != null ? cp5.d.G(w0.Companion, str6) : null;
                    String str7 = (String) map.get("source");
                    return g(new bib.b((str7 == null || (strL2 = m70.a.l(str7)) == null) ? new PricingPlanAnalyticsSource.Predefined(xfa.b.PLANS_DEEPLINK) : new PricingPlanAnalyticsSource.Custom(strL2), strL, w0VarG2, i(map), 27));
                }
                break;
            case 1782924824:
                if (strE.equals("switch-to-annual")) {
                    String str8 = (String) map.get("entryPoint");
                    if (!Intrinsics.f(str8, "prompt") && Intrinsics.f(str8, "confirmation")) {
                        boolean zF2 = Intrinsics.f(map.get("skipDestinationDeeplink"), "true");
                        efm.d0 d0VarFirstOrError = m70.a.g(tVar.v(w4l.h.f294642c), null, new pch.f(20), 1).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        ufm.i iVar2 = new ufm.i(w.H0(d0VarFirstOrError, tVar.e()), new pfa.c(new l3d.f(this, zF2, 19), 21), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        return iVar2;
                    }
                    return g(new d(4));
                }
                break;
            case 1876018584:
                if (strE.equals("students")) {
                    if (aVar.a(PricingPlansApi$Toggles.StudentPlans.f81004c)) {
                        ufm.b bVarM12 = efm.d0.m(Boolean.FALSE);
                        Intrinsics.checkNotNullExpressionValue(bVarM12, "just(...)");
                        return bVarM12;
                    }
                    String strE9 = deeplink.e(2);
                    switch (strE9.hashCode()) {
                        case -1367724422:
                            if (strE9.equals("cancel")) {
                                return g(new d(10));
                            }
                            break;
                        case -892481550:
                            if (strE9.equals("status")) {
                                return g(new a3l.b(10, new d(3)));
                            }
                            break;
                        case -819951495:
                            if (strE9.equals("verify")) {
                                String str9 = (String) map.get("token");
                                return (str9 == null || str9.length() == 0) ? efm.d0.m(Boolean.FALSE) : g(new d8b.h(str9, 5));
                            }
                            break;
                        case -690213213:
                            if (strE9.equals("register")) {
                                return g(new a3l.b(10, new d(7)));
                            }
                            break;
                        case 90004811:
                            if (strE9.equals("graduate")) {
                                return g(new d(9));
                            }
                            break;
                    }
                    return g(new a3l.b(10, new d(11)));
                }
                break;
            case 2113088607:
                if (strE.equals("ultra_only")) {
                    return g(new d(2));
                }
                break;
        }
        ufm.b bVarM13 = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM13, "just(...)");
        return bVarM13;
    }

    public final z g(Function0 function0) {
        ufm.i iVar = new ufm.i(new ufm.c(new m1i.t(function0, this, 27), 2), new pfa.c(new h0(20), 23), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.HashMap r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pgk.i
            if (r0 == 0) goto L13
            r0 = r6
            pgk.i r0 = (pgk.i) r0
            int r1 = r0.f235991x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235991x = r1
            goto L18
        L13:
            pgk.i r0 = new pgk.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235991x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.HashMap r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ffk.t r6 = r4.f235996c
            efm.d0 r6 = r6.e()
            r0.u = r5
            r0.f235991x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            hha.d r6 = (hha.d) r6
            boolean r6 = r6.f152296p
            r0 = 0
            if (r6 != 0) goto L68
            java.lang.String r6 = "source"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L61
            java.lang.String r5 = m70.a.l(r5)
            if (r5 == 0) goto L61
            com.revolut.feature.pricingplans.models.PricingPlanUpdateSource$Dynamic r0 = new com.revolut.feature.pricingplans.models.PricingPlanUpdateSource$Dynamic
            r0.<init>(r5)
        L61:
            ajk.f r5 = r4.e
            com.revolut.retail.core.navigation.FeatureCommand r5 = igk.q.a(r5, r0)
            return r5
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pgk.k.j(java.util.HashMap, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.HashMap r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof pgk.j
            if (r0 == 0) goto L13
            r0 = r11
            pgk.j r0 = (pgk.j) r0
            int r1 = r0.f235993x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235993x = r1
            goto L18
        L13:
            pgk.j r0 = new pgk.j
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235993x
            r3 = 12
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L35
            if (r2 != r6) goto L2d
            boolean r10 = r0.u
            yhm.o.b(r11)
            goto L83
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r11)
            java.lang.String r11 = "entryPoint"
            java.lang.Object r11 = r10.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r2 = "confirmation"
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r11, r2)
            if (r11 == 0) goto L9f
            java.lang.String r11 = "skipDestinationDeeplink"
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r11 = "true"
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            w4l.h r11 = w4l.h.f294642c
            ffk.t r2 = r9.f235996c
            efm.r r11 = r2.v(r11)
            pch.f r7 = new pch.f
            r8 = 20
            r7.<init>(r8)
            efm.r r11 = m70.a.g(r11, r5, r7, r6)
            efm.d0 r11 = r11.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r7)
            efm.d0 r2 = r2.e()
            efm.d0 r11 = te0.w.H0(r11, r2)
            r0.u = r10
            r0.f235993x = r6
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L83
            return r1
        L83:
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r0 = r11.f186385a
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r0 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r0
            java.lang.Object r11 = r11.f186386b
            hha.d r11 = (hha.d) r11
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$SwitchToAnnualBillingFlow r1 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$SwitchToAnnualBillingFlow
            lha.o r0 = r0.f81142t
            if (r0 == 0) goto L94
            goto L95
        L94:
            r6 = r4
        L95:
            r1.<init>(r11, r6, r10)
            yhi.b r10 = yhi.b.SOLID
            com.revolut.retail.core.navigation.FeatureCommand r10 = vhi.c.c(r1, r10, r5, r4, r3)
            return r10
        L9f:
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$PlanSwitchToAnnualEntryDestination r10 = com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig.PlanSwitchToAnnualEntryDestination.f102886a
            yhi.b r11 = yhi.b.SOLID
            com.revolut.retail.core.navigation.FeatureCommand r10 = vhi.c.c(r10, r11, r5, r4, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pgk.k.m(java.util.HashMap, gim.c):java.lang.Object");
    }
}
