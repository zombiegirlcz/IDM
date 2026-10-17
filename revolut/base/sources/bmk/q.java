package bmk;

import android.os.Parcelable;
import aw0.o9;
import bmk.b;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import com.youTransactor.uCube.rpc.Constants;
import d67.r;
import d67.s;
import d67.u;
import ffk.t;
import java.util.Iterator;
import java.util.List;
import jgk.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import org.joda.time.Period;
import pfk.x;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b.a f16883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f16884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final whk.g f16885n;
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f16886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f16887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wli.x f16888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ajk.b f16889s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wik.m f16890t;
    public final j2 u;
    public boolean v;

    public q(b.a flowType, gte.a featureToggleInteractor, x pricingPlanCancelRepository, whk.g planDowngradeOfferPromptBuilder, t pricingPlanInteractor, mre.c termsNavigationFactory, v planTermsCommandProvider, wli.x deeplinkHandler, ajk.b outOfAppNavigationProvider, wik.m pricingPlanOffersInteractor) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanCancelRepository, "pricingPlanCancelRepository");
        Intrinsics.checkNotNullParameter(planDowngradeOfferPromptBuilder, "planDowngradeOfferPromptBuilder");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(planTermsCommandProvider, "planTermsCommandProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        this.f16883l = flowType;
        this.f16884m = pricingPlanCancelRepository;
        this.f16885n = planDowngradeOfferPromptBuilder;
        this.o = pricingPlanInteractor;
        this.f16886p = termsNavigationFactory;
        this.f16887q = planTermsCommandProvider;
        this.f16888r = deeplinkHandler;
        this.f16889s = outOfAppNavigationProvider;
        this.f16890t = pricingPlanOffersInteractor;
        this.u = vkm.q.c(new a(null));
    }

    @Override // yji.n
    public final void D2() {
        b.a.C0114a c0114a = b.a.C0114a.f16848a;
        b.a aVar = this.f16883l;
        Continuation continuation = null;
        if (Intrinsics.f(aVar, c0114a)) {
            T2(new aza.g(this, continuation, 17), new yi5.b(27));
        } else {
            if (!Intrinsics.f(aVar, b.a.C0115b.f16849a)) {
                throw new NoWhenBranchMatchedException();
            }
            T2(new aza.g(this, continuation, 17), new yi5.b(27));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // bmk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(hha.d r27, kotlin.jvm.functions.Function1 r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bmk.q.Z2(hha.d, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bmk.l
            if (r0 == 0) goto L13
            r0 = r6
            bmk.l r0 = (bmk.l) r0
            int r1 = r0.f16875w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16875w = r1
            goto L18
        L13:
            bmk.l r0 = new bmk.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16875w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            vkm.j2 r6 = r5.u
            vkm.u1 r6 = vkm.q.h(r6)
            a82.v r2 = new a82.v
            r4 = 1
            r2.<init>(r6, r4)
            r0.f16875w = r3
            java.lang.Object r6 = vkm.q.x(r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            od0.i r6 = (od0.i) r6
            java.lang.Object r6 = r6.f224257a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bmk.q.b3(gim.c):java.lang.Object");
    }

    public final void c3(PricingPlanAction pricingPlanAction, Function0 function0, Function1 function1) {
        if (pricingPlanAction == null) {
            int i = jli.h.f175850a;
            return;
        }
        Continuation continuation = null;
        if (pricingPlanAction instanceof PricingPlanAction.Confirm) {
            PricingPlanAction.Confirm confirm = (PricingPlanAction.Confirm) pricingPlanAction;
            TextClause textClause = new TextClause(confirm.f102798a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = confirm.f102799b;
            T2(new j(this, new bkd.a(14), new j0((Clause) textClause, (Clause) (str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), new e(function0, function1), null), new yi5.b(27));
            return;
        }
        boolean zEquals = pricingPlanAction.equals(PricingPlanAction.Decline.f102800a);
        b.AbstractC0116b.c cVar = b.AbstractC0116b.c.f16852a;
        if (zEquals || pricingPlanAction.equals(PricingPlanAction.Dismiss.f102801a)) {
            function0.invoke();
            function1.invoke(cVar);
            return;
        }
        int i2 = 1;
        if (pricingPlanAction instanceof PricingPlanAction.SeeAllBenefits) {
            yji.n.P2(this, new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData((PlanBenefitsScreenContract$PlanReference) new PlanBenefitsScreenContract$PlanReference.Id(((PricingPlanAction.SeeAllBenefits) pricingPlanAction).f102806a), new PlanBenefitsScreenContract$UIConfig(false), true, (PricingPlanAnalyticsSource) new PricingPlanAnalyticsSource.Predefined(xfa.b.DOWNGRADE))), ModalDestination.Style.POPUP.f98311a, null, 2);
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.SeeAllDocuments) {
            yji.n.P2(this, new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(PlanDocumentsBottomSheetScreenContract$TitleConfig.NoTitle.f103524a, ((PricingPlanAction.SeeAllDocuments) pricingPlanAction).f102807a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.OpenUrl) {
            T2(new n(this, ((PricingPlanAction.OpenUrl) pricingPlanAction).f102805a, continuation, i2), new yi5.b(27));
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.ClaimPlanReferral) {
            rgk.q.a((PricingPlanAction.FlowSpecific) pricingPlanAction, "PlanDowngradeOffer");
            return;
        }
        if (!(pricingPlanAction instanceof PricingPlanAction.Common)) {
            if (!(pricingPlanAction instanceof PricingPlanAction.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            rgk.q.b((PricingPlanAction.Unsupported) pricingPlanAction, "PlanDowngradeOffer");
        } else {
            PricingPlanAction.Common common = (PricingPlanAction.Common) pricingPlanAction;
            Intrinsics.checkNotNullParameter(common, "<this>");
            Intrinsics.checkNotNullParameter("PlanDowngradeOffer", "tag");
            rgk.q.c(common, "PlanDowngradeOffer");
            function0.invoke();
            function1.invoke(cVar);
        }
    }

    public final void d3(u uVar, hha.d currentPlan, iha.h offer, whk.e offerType, PlanOfferPromptLayout planOfferPromptLayout, Function0 function0, Function1 function1) {
        List list;
        PricingPlanLayoutButton pricingPlanLayoutButton;
        j0 j0Var;
        j0 j0Var2;
        List list2;
        PricingPlanLayoutButton pricingPlanLayoutButton2;
        if (!Intrinsics.f(uVar, s.f111464a)) {
            boolean zF = Intrinsics.f(uVar, d67.t.f111465a);
            b.AbstractC0116b.c cVar = b.AbstractC0116b.c.f16852a;
            if (zF) {
                if (planOfferPromptLayout == null) {
                    function1.invoke(cVar);
                    return;
                }
                PricingPlanLayoutFooter pricingPlanLayoutFooter = planOfferPromptLayout.d;
                if (pricingPlanLayoutFooter != null && (list = pricingPlanLayoutFooter.f102834a) != null && (pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(1, list)) != null) {
                    pricingPlanAction = pricingPlanLayoutButton.f102833c;
                }
                c3(pricingPlanAction, function0, function1);
                return;
            }
            if (Intrinsics.f(uVar, r.f111463a)) {
                T2(new m(this, null), new yi5.b(27));
                return;
            }
            if (uVar instanceof d67.p) {
                Object obj2 = ((d67.p) uVar).f111461a.d;
                c3(obj2 instanceof PricingPlanAction ? (PricingPlanAction) obj2 : null, function0, function1);
                return;
            } else {
                if (!Intrinsics.f(uVar, d67.q.f111462a)) {
                    throw new NoWhenBranchMatchedException();
                }
                function0.invoke();
                function1.invoke(cVar);
                return;
            }
        }
        if (planOfferPromptLayout != null) {
            PricingPlanLayoutFooter pricingPlanLayoutFooter2 = planOfferPromptLayout.d;
            if (pricingPlanLayoutFooter2 != null && (list2 = pricingPlanLayoutFooter2.f102834a) != null && (pricingPlanLayoutButton2 = (PricingPlanLayoutButton) d0.e0(0, list2)) != null) {
                pricingPlanAction = pricingPlanLayoutButton2.f102833c;
            }
            c3(pricingPlanAction, function0, function1);
            return;
        }
        if (offerType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f16885n.getClass();
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        int i = whk.f.f297685a[offerType.ordinal()];
        if (i == 1) {
            Period period = offer.f161325b;
            if (period == null || !whk.g.a(period)) {
                j0Var = new j0((Clause) new TextLocalisedClause(R$string.plan_downgrade_discount_pitch_offer_claimed_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12), (Clause) new TextLocalisedQuantityClause(R$plurals.plan_downgrade_discount_pitch_offer_claimed_subtitle, Integer.valueOf(period != null ? period.getMonths() : 0), zhm.v.k(Integer.valueOf(period != null ? period.getMonths() : 0), dok.g.d(currentPlan, null)), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                j0Var2 = j0Var;
            } else {
                j0Var2 = new j0((Clause) new TextLocalisedClause(R$string.plan_downgrade_discount_pitch_offer_claimed_annual_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12), (Clause) new TextLocalisedQuantityClause(R$plurals.plan_downgrade_discount_pitch_offer_claimed_annual_subtitle, Integer.valueOf(period.getYears()), zhm.v.k(Integer.valueOf(period.getYears()), dok.g.d(currentPlan, null)), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Period period2 = offer.f161325b;
            if (period2 == null || !whk.g.a(period2)) {
                j0Var = new j0((Clause) new TextLocalisedClause(R$string.plan_downgrade_free_trial_pitch_offer_claimed_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12), (Clause) new TextLocalisedQuantityClause(R$plurals.plan_downgrade_free_trial_pitch_offer_claimed_subtitle, Integer.valueOf(period2 != null ? period2.getMonths() : 0), zhm.v.k(Integer.valueOf(period2 != null ? period2.getMonths() : 0), dok.g.d(currentPlan, null)), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                j0Var2 = j0Var;
            } else {
                j0Var2 = new j0((Clause) new TextLocalisedClause(R$string.plan_downgrade_free_trial_pitch_offer_claimed_annual_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12), (Clause) new TextLocalisedQuantityClause(R$plurals.plan_downgrade_free_trial_pitch_offer_claimed_annual_subtitle, Integer.valueOf(period2.getYears()), zhm.v.k(Integer.valueOf(period2.getYears()), dok.g.d(currentPlan, null)), (Style) null, 24), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            }
        }
        T2(new j(this, new d(this, currentPlan, offer, offerType, planOfferPromptLayout, function1, 0), j0Var2, function1, null), new yi5.b(27));
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void e3(hha.d currentPlan, iha.h offer, whk.e offerType, PlanOfferPromptLayout layout, Function1 function1) {
        whk.d dVar;
        int i;
        int i2;
        int i3;
        whk.c cVar;
        PromptMarketingScreen promptMarketingScreen;
        int i5;
        int i6;
        int i21;
        whk.g gVar = this.f16885n;
        if (layout != null) {
            gVar.getClass();
            Intrinsics.checkNotNullParameter(layout, "layout");
            promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(gVar.f297687a.a(layout), null, true, false, Boolean.FALSE, 10));
        } else {
            if (offerType == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gVar.getClass();
            Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
            Intrinsics.checkNotNullParameter(offer, "offer");
            Intrinsics.checkNotNullParameter(offerType, "offerType");
            Period period = offer.f161325b;
            dj0.d dVar2 = offer.f161326c;
            if (period == null || !whk.g.a(period)) {
                int months = period != null ? period.getMonths() : 0;
                hha.i iVar = hha.i.MONTHLY;
                hha.g gVarC = dok.g.c(currentPlan);
                if (gVarC == null) {
                    throw new IllegalStateException("Current plan do not support monthly billing");
                }
                dVar = new whk.d(months, iVar, gVarC);
            } else {
                int years = period.getYears();
                hha.i iVar2 = hha.i.ANNUAL;
                hha.g gVarB = dok.g.b(currentPlan);
                if (gVarB == null) {
                    throw new IllegalStateException("Current plan do not support annual billing");
                }
                dVar = new whk.d(years, iVar2, gVarB);
            }
            int i22 = whk.f.f297685a[offerType.ordinal()];
            int i32 = dVar.f297682a;
            hha.i iVar3 = dVar.f297683b;
            if (i22 == 1) {
                hha.g gVar2 = dVar.f297684c;
                double dA = whk.a.a(gVar2, dVar2);
                int[] iArr = whk.f.f297686b;
                int i33 = iArr[iVar3.ordinal()];
                if (i33 == 1) {
                    i = R$plurals.plan_downgrade_discount_pitch_content_title;
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$plurals.plan_downgrade_discount_pitch_content_annual_title;
                }
                TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(i, Integer.valueOf(i32), zhm.v.k(Integer.valueOf(i32), new PercentageClause(dA, (PercentageClause.Format) null, (Custom) null, 6), dok.g.d(currentPlan, null)), (Style) null, 24);
                int i43 = iArr[iVar3.ordinal()];
                if (i43 == 1) {
                    i2 = R$plurals.plan_downgrade_discount_pitch_content_subtitle;
                } else {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$plurals.plan_downgrade_discount_pitch_content_annual_subtitle;
                }
                int i59 = i2;
                Integer numValueOf = Integer.valueOf(i32);
                Integer numValueOf2 = Integer.valueOf(i32);
                Clause clauseD = dok.g.d(currentPlan, null);
                dj0.d dVar3 = gVar2.f152308c;
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                MoneyClause moneyClause = new MoneyClause(dVar3, defaults, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), o9Var);
                if (dVar2 == null) {
                    dj0.d.Companion.getClass();
                    dVar2 = dj0.d.e;
                }
                MoneyClause moneyClause2 = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4);
                int i66 = iArr[iVar3.ordinal()];
                if (i66 == 1) {
                    i3 = R$string.plan_downgrade_offer_reminder_discount_monthly_value;
                } else {
                    if (i66 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R$string.plan_downgrade_offer_reminder_discount_annual_value;
                }
                List listK = zhm.v.k(moneyClause, new TextLocalisedClause(i3, zhm.u.c(moneyClause2), null, 12));
                m70.a.t(t0.f186434a);
                cVar = new whk.c(textLocalisedQuantityClause, new TextLocalisedQuantityClause(i59, numValueOf, zhm.v.k(numValueOf2, clauseD, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), (Style) null, 24), new TextLocalisedClause(R$string.plan_downgrade_discount_pitch_action_claim_title, null, null, 14), new TextLocalisedClause(R$string.plan_downgrade_discount_pitch_action_continue_title, null, null, 14));
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int[] iArr2 = whk.f.f297686b;
                int i74 = iArr2[iVar3.ordinal()];
                if (i74 == 1) {
                    i5 = R$plurals.plan_downgrade_free_trial_pitch_content_title;
                } else {
                    if (i74 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = R$plurals.plan_downgrade_free_trial_pitch_content_annual_title;
                }
                TextLocalisedQuantityClause textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(i5, Integer.valueOf(i32), zhm.v.k(Integer.valueOf(i32), dok.g.d(currentPlan, null)), (Style) null, 24);
                int i92 = iArr2[iVar3.ordinal()];
                if (i92 == 1) {
                    i6 = R$plurals.plan_downgrade_free_trial_pitch_content_subtitle;
                } else {
                    if (i92 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = R$plurals.plan_downgrade_free_trial_pitch_content_annual_subtitle;
                }
                TextLocalisedQuantityClause textLocalisedQuantityClause3 = new TextLocalisedQuantityClause(i6, Integer.valueOf(i32), zhm.v.k(Integer.valueOf(i32), dok.g.d(currentPlan, null)), (Style) null, 24);
                int i96 = iArr2[iVar3.ordinal()];
                if (i96 == 1) {
                    i21 = R$plurals.plan_downgrade_free_trial_pitch_action_claim_title;
                } else {
                    if (i96 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i21 = R$plurals.plan_downgrade_free_trial_pitch_action_claim_annual_title;
                }
                cVar = new whk.c(textLocalisedQuantityClause2, textLocalisedQuantityClause3, new TextLocalisedQuantityClause(i21, Integer.valueOf(i32), zhm.u.c(Integer.valueOf(i32)), (Style) null, 24), new TextLocalisedClause(R$string.plan_downgrade_free_trial_pitch_action_continue_title, null, null, 14));
            }
            promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("DOWNGRADE_OFFER_PROMPT", cVar.f297679a, cVar.f297680b, new PromptMarketingContentDelegate.Model.Content.MediaContent(new CdnImage("discount", "mobile/premium/downgrade_offers", null, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG), null, null, Constants.TAG_E4_CUSTOMER_DATA), null), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, pd.BLACK, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) cVar.f297681c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) cVar.d, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, null, new TextLocalisedClause(R$string.plan_cancellation_offer_pitch_tc_apply, null, new Click(30, (Integer) null, (Object) null, "terms_clause_id", false), 10), null, null, null, 1964416), null, true, false, Boolean.FALSE, 10));
        }
        if (layout != null && !this.v) {
            this.v = true;
            List list = layout.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    T2(new be7.s(this, (PlanOfferPromptPresentAction) it8.next(), null, 15), new yi5.b(27));
                }
            }
        }
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (layout != null) {
            R2(promptMarketingScreen, popup, new c(this, currentPlan, offer, offerType, layout, function1, 0));
        } else {
            N2(promptMarketingScreen, popup, new a5b.a((Object) this, (Object) currentPlan, (Object) offer, (Object) offerType, (Object) function1, 3));
        }
    }
}
