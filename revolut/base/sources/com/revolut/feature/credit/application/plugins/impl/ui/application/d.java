package com.revolut.feature.credit.application.plugins.impl.ui.application;

import aii.m;
import aii.n;
import aii.w;
import al4.p;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.NoAuthTokenException;
import com.revolut.core.strings_provider.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.api.navigation.CreditApplicationDashboardFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.feature.credit.help.api.navigation.self_service.ForbearanceSelfServiceInputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import cu8.r0;
import ft3.d1;
import ft3.g1;
import ft3.j1;
import grl.k9;
import grl.r2;
import h54.g;
import h54.r;
import hw3.l;
import j54.f;
import j54.i0;
import j54.s;
import j54.s0;
import j54.t;
import j54.u;
import j54.v;
import j54.z;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y;
import nii.y0;
import oki.h;
import om4.s3;
import rz3.e;
import vie.i;
import vkm.j2;
import wli.x;
import xq3.j;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends h implements g {
    public final h54.a A;
    public final sp3.a B;
    public final j24.c C;
    public final CreditApplicationFlowContract$InputData D;
    public final i0 E;
    public final s0 F;
    public final f G;
    public final v H;
    public final z I;
    public final s J;
    public final x K;
    public final yp.b L;
    public final i M;
    public final aq3.a N;
    public final rg4.d O;
    public final qki.d P;
    public final yki.i Q;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qr0.i f67090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f67091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ow3.e f67092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f67093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f67094t;
    public final r0 u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hz3.c f67095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f67096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f67097y;
    public final gte.a z;

    public d(e anotherApplicationPopupWrapper, qr0.i applicationIntroWrapper, j creditApplicationLifecycleInteractor, ow3.e creditApplicationCancellationInteractor, j creditApplicationInteractor, j creditEligibilityCriteriaInteractor, r0 kycRequiredActionTransformer, ang.f userInteractor, hz3.c creditApplicationCommandsFactory, p creditCardProductFeatureTogglesInteractor, l creditWaitingListFeatureTogglesInteractor, gte.a featureToggleInteractor, h54.a creditApplicationErrorPopupFactory, sp3.a dataMonitoringFacade, j24.c planSelectionConfigProvider, CreditApplicationFlowContract$InputData inputData, i0 pluginControllerModelExtension, s0 workflowApplicationExtension, f creditApplicationCancellationModelExtension, v creditApplicationLifecycleExtension, z productArticlesExtension, s createApplicationExtension, x deeplinkHandler, yp.b appStoreNavigationFactory, i tabCreditPreferencesInteractor, aq3.a checklistAvailabilityProvider, rg4.d preApplicationChecksFlowDelegate) {
        Intrinsics.checkNotNullParameter(anotherApplicationPopupWrapper, "anotherApplicationPopupWrapper");
        Intrinsics.checkNotNullParameter(applicationIntroWrapper, "applicationIntroWrapper");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditEligibilityCriteriaInteractor, "creditEligibilityCriteriaInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditWaitingListFeatureTogglesInteractor, "creditWaitingListFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationErrorPopupFactory, "creditApplicationErrorPopupFactory");
        Intrinsics.checkNotNullParameter(dataMonitoringFacade, "dataMonitoringFacade");
        Intrinsics.checkNotNullParameter(planSelectionConfigProvider, "planSelectionConfigProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        Intrinsics.checkNotNullParameter(workflowApplicationExtension, "workflowApplicationExtension");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationModelExtension, "creditApplicationCancellationModelExtension");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleExtension, "creditApplicationLifecycleExtension");
        Intrinsics.checkNotNullParameter(productArticlesExtension, "productArticlesExtension");
        Intrinsics.checkNotNullParameter(createApplicationExtension, "createApplicationExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(tabCreditPreferencesInteractor, "tabCreditPreferencesInteractor");
        Intrinsics.checkNotNullParameter(checklistAvailabilityProvider, "checklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(preApplicationChecksFlowDelegate, "preApplicationChecksFlowDelegate");
        this.o = anotherApplicationPopupWrapper;
        this.f67090p = applicationIntroWrapper;
        this.f67091q = creditApplicationLifecycleInteractor;
        this.f67092r = creditApplicationCancellationInteractor;
        this.f67093s = creditApplicationInteractor;
        this.f67094t = creditEligibilityCriteriaInteractor;
        this.u = kycRequiredActionTransformer;
        this.v = userInteractor;
        this.f67095w = creditApplicationCommandsFactory;
        this.f67096x = creditCardProductFeatureTogglesInteractor;
        this.f67097y = creditWaitingListFeatureTogglesInteractor;
        this.z = featureToggleInteractor;
        this.A = creditApplicationErrorPopupFactory;
        this.B = dataMonitoringFacade;
        this.C = planSelectionConfigProvider;
        this.D = inputData;
        this.E = pluginControllerModelExtension;
        this.F = workflowApplicationExtension;
        this.G = creditApplicationCancellationModelExtension;
        this.H = creditApplicationLifecycleExtension;
        this.I = productArticlesExtension;
        this.J = createApplicationExtension;
        this.K = deeplinkHandler;
        this.L = appStoreNavigationFactory;
        this.M = tabCreditPreferencesInteractor;
        this.N = checklistAvailabilityProvider;
        this.O = preApplicationChecksFlowDelegate;
        h54.c[] elements = {h54.c.RESUME_INTRO, h54.c.RESUME_APPLICATION, h54.c.KYC_VERIFICATION, h54.c.PRODUCT_INTRO, h54.c.PRODUCT_ELIGIBILITY_VERIFICATION, h54.c.PRODUCT_ARTICLES, h54.c.PLAN_SELECTION, h54.c.PRE_APPLICATION_CHECKS, h54.c.START_APPLICATION};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        f0 f0Var = f0.f322471a;
        d1 d1VarC = inputData.f67053a;
        if (h54.j.f149477b[d1VarC.f137810a.ordinal()] == 1 && ((s3) creditCardProductFeatureTogglesInteractor).p()) {
            d1VarC = d1.c(d1VarC, gt3.c.PREMIUM, null, 5);
        }
        d1 d1Var = d1VarC;
        this.P = hx7.e.b(this, new CreditApplicationFlowContract$State(listL, f0Var, f0Var, d1Var, inputData.k, inputData.f67054b, null));
        this.Q = d8l.d.a(this, new h1c.c(this, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.credit.application.plugins.impl.ui.application.d r5, gim.c r6) {
        /*
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r0 = r5.D
            boolean r1 = r6 instanceof h54.p
            if (r1 == 0) goto L15
            r1 = r6
            h54.p r1 = (h54.p) r1
            int r2 = r1.f149487w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f149487w = r2
            goto L1a
        L15:
            h54.p r1 = new h54.p
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149487w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            xq3.j r6 = r5.f67091q
            ft3.d1 r5 = r5.M2()
            java.util.Set r5 = zhm.y0.b(r5)
            r1.f149487w = r4
            java.lang.Object r6 = xq3.j.g(r6, r5, r1)
            if (r6 != r2) goto L47
            return r2
        L47:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r6.next()
            r2 = r1
            it3.d r2 = (it3.d) r2
            boolean r3 = r2.f168324b
            if (r3 != 0) goto L7e
            ks3.a r3 = ks3.a.EXPIRED
            ks3.a r4 = ks3.a.REJECTED
            ks3.a[] r3 = new ks3.a[]{r3, r4}
            java.lang.String r4 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.util.Set r3 = kotlin.collections.d.y0(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            ks3.c r2 = r2.d
            boolean r2 = zhm.d0.T(r3, r2)
            if (r2 == 0) goto L52
        L7e:
            r5.add(r1)
            goto L52
        L82:
            java.lang.String r6 = r0.f67058j
            if (r6 == 0) goto La6
            java.util.Iterator r5 = r5.iterator()
        L8a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La2
            java.lang.Object r6 = r5.next()
            r1 = r6
            it3.d r1 = (it3.d) r1
            java.lang.String r1 = r1.f168332p
            java.lang.String r2 = r0.f67058j
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L8a
            goto La3
        La2:
            r6 = 0
        La3:
            it3.d r6 = (it3.d) r6
            return r6
        La6:
            java.lang.Object r5 = zhm.d0.d0(r5)
            it3.d r5 = (it3.d) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.I2(com.revolut.feature.credit.application.plugins.impl.ui.application.d, gim.c):java.io.Serializable");
    }

    public final ViewController J2() {
        j1 j1Var = M2().f137810a;
        String str = this.D.f67058j;
        if (str == null) {
            throw new IllegalArgumentException("originalFacilityId must not be null for forbearance self-service");
        }
        ViewController viewControllerE1 = e1(new h15.a(new ForbearanceSelfServiceInputData(j1Var, str)));
        h54.i block = new h54.i(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h54.q
            if (r0 == 0) goto L13
            r0 = r7
            h54.q r0 = (h54.q) r0
            int r1 = r0.f149488w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149488w = r1
            goto L18
        L13:
            h54.q r0 = new h54.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149488w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.v
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            h3d.a r2 = new h3d.a
            r4 = 14
            r2.<init>(r4)
            h0l.g r4 = new h0l.g
            r5 = 17
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f149488w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.K2(gim.c):java.lang.Object");
    }

    public final r2 L2() {
        return this.D.f67054b.f137797a;
    }

    @Override // yki.j
    public final void M0() {
        n2(new h54.l(this, null, 14), new whi.b(6));
    }

    public final d1 M2() {
        return ((CreditApplicationFlowContract$State) ((j2) this.P.f22677a).getValue()).d;
    }

    public final boolean N2() {
        return ((jte.d) this.z).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (e3(r10, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (Q2(r10, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (X2(false, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof h54.s
            if (r0 == 0) goto L13
            r0 = r10
            h54.s r0 = (h54.s) r0
            int r1 = r0.f149489w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149489w = r1
            goto L18
        L13:
            h54.s r0 = new h54.s
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149489w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r10)
            goto Lb6
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            yhm.o.b(r10)
            goto La9
        L3e:
            yhm.o.b(r10)
            goto L9d
        L42:
            yhm.o.b(r10)
            goto L65
        L46:
            yhm.o.b(r10)
            r0.f149489w = r6
            xq3.j r10 = r9.f67091q
            xr3.k r10 = r10.f308077a
            r10.getClass()
            xb4.e r2 = new xb4.e
            r7 = 11
            r8 = 0
            r2.<init>(r10, r8, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r1) goto L65
            goto Lb5
        L65:
            it3.d r10 = (it3.d) r10
            if (r10 == 0) goto Lac
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r2 = r9.D
            java.lang.String r2 = r2.f67058j
            rz3.e r3 = r9.o
            r3.getClass()
            java.lang.String r3 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            ft3.j1 r3 = r10.f168328j
            int[] r7 = rz3.d.f258505a
            int r3 = r3.ordinal()
            r3 = r7[r3]
            if (r3 == r6) goto L86
            if (r3 == r5) goto L86
            goto L94
        L86:
            java.lang.String r3 = r10.f168332p
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r3, r2)
            if (r2 != 0) goto La0
            boolean r2 = rz3.e.a(r10)
            if (r2 == 0) goto La0
        L94:
            r0.f149489w = r5
            java.lang.Object r10 = r9.e3(r10, r0)
            if (r10 != r1) goto L9d
            goto Lb5
        L9d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La0:
            r0.f149489w = r4
            java.lang.Object r10 = r9.Q2(r10, r0)
            if (r10 != r1) goto La9
            goto Lb5
        La9:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lac:
            r0.f149489w = r3
            r10 = 0
            java.lang.Object r10 = r9.X2(r10, r0)
            if (r10 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.O2(gim.c):java.lang.Object");
    }

    public final Object P2(it3.i iVar, gim.c cVar) throws Throwable {
        Object objG3;
        int i = h54.j.f[iVar.f168335a.ordinal()];
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        yki.i iVar2 = this.Q;
        switch (i) {
            case 1:
                h.w2(iVar2, CreditApplicationFlowContract$Step.ModalStep.NotEligible.f67070a, bottom_dialog);
                break;
            case 2:
                h.t2(this, iVar2, CreditApplicationFlowContract$Step.CreditHealthPrompt.f67064a, false, null, false, 12);
                break;
            case 3:
                h.w2(iVar2, CreditApplicationFlowContract$Step.ModalStep.Maintenance.f67069a, bottom_dialog);
                break;
            case 4:
                Object objH3 = h3(cVar);
                return objH3 == fim.a.COROUTINE_SUSPENDED ? objH3 : Unit.f186387a;
            case 5:
                Object objO2 = O2(cVar);
                return objO2 == fim.a.COROUTINE_SUSPENDED ? objO2 : Unit.f186387a;
            case 6:
                int i2 = h54.j.f149477b[M2().f137810a.ordinal()];
                w4l.i iVar3 = w4l.i.f294643c;
                if (i2 == 1) {
                    objG3 = g3(iVar3, cVar);
                    if (objG3 != fim.a.COROUTINE_SUSPENDED) {
                        objG3 = Unit.f186387a;
                    }
                } else if (i2 != 5) {
                    k9 value = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                    this.A.getClass();
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    yji.l.a1(this, X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.error_api_32041, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, analyticsProduct, null, null, null, null, null, 32246), false, 5)), null, null, new r(this, null, 1), 3);
                    objG3 = Unit.f186387a;
                } else {
                    objG3 = g3(iVar3, cVar);
                    if (objG3 != fim.a.COROUTINE_SUSPENDED) {
                        objG3 = Unit.f186387a;
                    }
                }
                return objG3 == fim.a.COROUTINE_SUSPENDED ? objG3 : Unit.f186387a;
            case 7:
                Object objI3 = i3(cVar);
                return objI3 == fim.a.COROUTINE_SUSPENDED ? objI3 : Unit.f186387a;
            case 8:
                Object objX2 = X2(true, cVar);
                return objX2 == fim.a.COROUTINE_SUSPENDED ? objX2 : Unit.f186387a;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (R2(r7, r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (j54.i0.h0(r6.E, r7, false, r0, 5) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(it3.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h54.t
            if (r0 == 0) goto L13
            r0 = r8
            h54.t r0 = (h54.t) r0
            int r1 = r0.f149491x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149491x = r1
            goto L18
        L13:
            h54.t r0 = new h54.t
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149491x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L73
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L61
        L39:
            it3.d r7 = r0.u
            yhm.o.b(r8)
            goto L4f
        L3f:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f168323a
            r0.u = r7
            r0.f149491x = r5
            java.lang.Object r8 = r6.T2(r8, r0)
            if (r8 != r1) goto L4f
            goto L72
        L4f:
            java.lang.String r8 = r7.f168331n
            r2 = 0
            if (r8 == 0) goto L64
            java.lang.String r7 = r7.f168323a
            r0.u = r2
            r0.f149491x = r4
            java.lang.Object r7 = r6.R2(r7, r8, r0)
            if (r7 != r1) goto L61
            goto L72
        L61:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L64:
            r0.u = r2
            r0.f149491x = r3
            j54.i0 r8 = r6.E
            r2 = 0
            r3 = 5
            java.lang.Object r7 = j54.i0.h0(r8, r7, r2, r0, r3)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.Q2(it3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof h54.u
            if (r0 == 0) goto L13
            r0 = r10
            h54.u r0 = (h54.u) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            h54.u r0 = new h54.u
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f149494y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r9 = r0.f149493x
            java.lang.String r8 = r0.f149492w
            yki.i r1 = r0.v
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r0 = r0.u
            yhm.o.b(r10)
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r10)
            r0.u = r7
            yki.i r10 = r7.Q
            r0.v = r10
            r0.f149492w = r8
            r0.f149493x = r9
            r0.A = r3
            java.lang.Object r0 = r7.K2(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r1 = r10
            r10 = r0
            r0 = r7
        L50:
            wi0.b r10 = (wi0.b) r10
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$Workflow r2 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$Workflow
            r3 = 0
            r2.<init>(r8, r9, r10, r3)
            r5 = 0
            r6 = 12
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.R2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final void S2(hha.d dVar, hha.i iVar, String str) {
        H2(this.P, new g31.e(dVar, iVar, str));
        l2(new h54.l(this, null, 15), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (((qq3.g) r5.B).b(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h54.v
            if (r0 == 0) goto L13
            r0 = r7
            h54.v r0 = (h54.v) r0
            int r1 = r0.f149496x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149496x = r1
            goto L18
        L13:
            h54.v r0 = new h54.v
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149496x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f149496x = r4
            java.lang.Object r7 = r5.j3(r0)
            if (r7 != r1) goto L46
            goto L55
        L46:
            r7 = 0
            r0.u = r7
            r0.f149496x = r3
            sp3.a r7 = r5.B
            qq3.g r7 = (qq3.g) r7
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.T2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (j54.i0.h0(r14.E, r0, r2, r7, 1) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        if (P2(r2, r7) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U2(ft3.d1 r15, java.lang.String r16, com.revolut.feature.credit.application.api.models.IntendedPricingPlan r17, ft3.a1 r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.U2(ft3.d1, java.lang.String, com.revolut.feature.credit.application.api.models.IntendedPricingPlan, ft3.a1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V2(gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.V2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (X2(false, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (X2(true, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h54.x
            if (r0 == 0) goto L13
            r0 = r7
            h54.x r0 = (h54.x) r0
            int r1 = r0.f149500w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149500w = r1
            goto L18
        L13:
            h54.x r0 = new h54.x
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149500w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r7)
            goto L9f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L76
        L3a:
            yhm.o.b(r7)
            goto L5b
        L3e:
            yhm.o.b(r7)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r7 = r6.D
            yp3.b r7 = r7.i
            int[] r2 = h54.j.f149476a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r5) goto L64
            if (r7 != r4) goto L5e
            r0.f149500w = r5
            r7 = 0
            java.lang.Object r7 = r6.X2(r7, r0)
            if (r7 != r1) goto L5b
            goto L9e
        L5b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L64:
            ks8.b r7 = ks8.c.Companion
            r7.getClass()
            ks8.c r7 = ks8.c.f189303g
            r0.f149500w = r4
            cu8.r0 r2 = r6.u
            java.lang.Object r7 = r2.f(r7, r0)
            if (r7 != r1) goto L76
            goto L9e
        L76:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.i
            if (r2 == 0) goto L92
            ks8.i r7 = (ks8.i) r7
            h54.o r0 = new h54.o
            r1 = 2
            r2 = 0
            r0.<init>(r6, r7, r2, r1)
            yi5.b r7 = new yi5.b
            r1 = 26
            r7.<init>(r1)
            r6.l2(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L92:
            boolean r7 = r7 instanceof ks8.j.a
            if (r7 == 0) goto La2
            r0.f149500w = r3
            java.lang.Object r7 = r6.X2(r5, r0)
            if (r7 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La2:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.W2(gim.c):java.lang.Object");
    }

    public final Object X2(boolean z, gim.c cVar) throws Throwable {
        qki.d dVar = this.P;
        h54.c cVar2 = (h54.c) d0.d0(((CreditApplicationFlowContract$State) ((j2) dVar.f22677a).getValue()).f67060a);
        if (cVar2 == null) {
            return Unit.f186387a;
        }
        H2(dVar, new gae.a(cVar2, z, 4));
        Object objV2 = V2(cVar);
        return objV2 == fim.a.COROUTINE_SUSPENDED ? objV2 : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (X2(false, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y2(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof h54.y
            if (r0 == 0) goto L13
            r0 = r10
            h54.y r0 = (h54.y) r0
            int r1 = r0.f149503y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149503y = r1
            goto L18
        L13:
            h54.y r0 = new h54.y
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f149501w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149503y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            goto Laf
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yki.i r1 = r0.v
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r0 = r0.u
            yhm.o.b(r10)
            goto L94
        L3b:
            yhm.o.b(r10)
            ft3.d1 r10 = r9.M2()
            gt3.f r10 = r10.f137811b
            gt3.c r2 = gt3.c.PREMIUM
            r5 = 0
            if (r10 != r2) goto L4b
            r10 = r4
            goto L4c
        L4b:
            r10 = r5
        L4c:
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r2 = r9.D
            yp3.c r6 = r2.f67056g
            int[] r7 = h54.j.d
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r4) goto L64
            if (r6 != r3) goto L5e
            r6 = r4
            goto L65
        L5e:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L64:
            r6 = r5
        L65:
            al4.p r7 = r9.f67096x
            om4.s3 r7 = (om4.s3) r7
            gte.a r7 = r7.f226520a
            com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles$CreditApplicationSkipPlanSelection r8 = com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles.CreditApplicationSkipPlanSelection.f66185c
            jte.d r7 = (jte.d) r7
            boolean r7 = r7.c(r8)
            com.revolut.feature.credit.application.api.models.IntendedPricingPlan r2 = r2.k
            if (r2 != 0) goto L79
            r2 = r4
            goto L7a
        L79:
            r2 = r5
        L7a:
            if (r10 == 0) goto La6
            if (r6 != 0) goto La6
            if (r7 != 0) goto La6
            if (r2 == 0) goto La6
            r0.u = r9
            yki.i r10 = r9.Q
            r0.v = r10
            r0.f149503y = r4
            java.lang.Object r0 = r9.K2(r0)
            if (r0 != r1) goto L91
            goto Lae
        L91:
            r1 = r10
            r10 = r0
            r0 = r9
        L94:
            wi0.b r10 = (wi0.b) r10
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$PlanSelection r2 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$PlanSelection
            r2.<init>(r10)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La6:
            r0.f149503y = r3
            java.lang.Object r10 = r9.X2(r5, r0)
            if (r10 != r1) goto Laf
        Lae:
            return r1
        Laf:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.Y2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (X2(false, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof h54.z
            if (r0 == 0) goto L13
            r0 = r9
            h54.z r0 = (h54.z) r0
            int r1 = r0.f149504w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149504w = r1
            goto L18
        L13:
            h54.z r0 = new h54.z
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149504w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L68
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            yhm.o.b(r9)
            goto L58
        L36:
            yhm.o.b(r9)
            ft3.d1 r9 = r8.M2()
            qki.d r2 = r8.P
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State r2 = (com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State) r2
            ft3.a1 r2 = r2.f
            r0.f149504w = r4
            rg4.d r4 = r8.O
            rg4.f r4 = (rg4.f) r4
            java.lang.Object r9 = r4.a(r9, r2, r0)
            if (r9 != r1) goto L58
            goto L67
        L58:
            rg4.c r9 = (rg4.c) r9
            boolean r2 = r9 instanceof rg4.b
            if (r2 == 0) goto L6b
            r0.f149504w = r3
            r9 = 0
            java.lang.Object r9 = r8.X2(r9, r0)
            if (r9 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6b:
            boolean r0 = r9 instanceof rg4.a
            if (r0 == 0) goto L86
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$PreApplicationChecks r3 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$PreApplicationChecks
            rg4.a r9 = (rg4.a) r9
            com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario r9 = r9.f254016a
            r3.<init>(r9)
            r6 = 0
            r7 = 12
            yki.i r2 = r8.Q
            r4 = 0
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L86:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (P2((it3.i) r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h54.a0
            if (r0 == 0) goto L13
            r0 = r7
            h54.a0 r0 = (h54.a0) r0
            int r1 = r0.f149449w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149449w = r1
            goto L18
        L13:
            h54.a0 r0 = new h54.a0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149449w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L6a
        L36:
            yhm.o.b(r7)
            r0.f149449w = r4
            ft3.d1 r7 = r6.M2()
            qki.d r2 = r6.P
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State r2 = (com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$State) r2
            ft3.a1 r2 = r2.f
            ft3.y0 r2 = r2.d
            r4 = 0
            if (r2 == 0) goto L57
            it3.k r2 = r2.c0()
            goto L58
        L57:
            r2 = r4
        L58:
            r5 = 3
            ft3.d1 r7 = ft3.d1.c(r7, r4, r2, r5)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r2 = r6.D
            yp3.e r2 = r2.f67057h
            xq3.j r4 = r6.f67093s
            java.lang.Object r7 = r4.b(r7, r2, r0)
            if (r7 != r1) goto L6a
            goto L74
        L6a:
            it3.i r7 = (it3.i) r7
            r0.f149449w = r3
            java.lang.Object r7 = r6.P2(r7, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.a3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (kotlin.Unit.f186387a == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (X2(false, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (X2(false, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        if (f3(r1, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (Q2(r1, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
    
        if (X2(false, r2) == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r22) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.c3(gim.c):java.lang.Object");
    }

    public final FeatureCommand d3(String str) {
        it3.d dVar;
        CreditApplicationFlowContract$InputData creditApplicationFlowContract$InputData = this.D;
        boolean z = true;
        if (!((wr3.b) this.N).a(creditApplicationFlowContract$InputData.f67053a.f137810a) && ((dVar = ((CreditApplicationFlowContract$State) ((j2) this.P.f22677a).getValue()).f67063g) == null || !dVar.f168333q)) {
            z = false;
        }
        r2[] elements = {r2.CREDIT_APPLICATION_DASHBOARD, r2.CREDIT_APPLICATION_CHECKLIST};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        if (!z || setY0.contains(L2())) {
            return null;
        }
        d1 d1Var = creditApplicationFlowContract$InputData.f67053a;
        return new FeatureCommand(new CreditApplicationDashboardFeatureConfig(str, g1.e(d1Var.f137810a, d1Var.f137811b, creditApplicationFlowContract$InputData.f67058j)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(it3.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h54.d0
            if (r0 == 0) goto L13
            r0 = r9
            h54.d0 r0 = (h54.d0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            h54.d0 r0 = new h54.d0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r8 = r0.z
            it3.d r1 = r0.f149458y
            yki.i r2 = r0.f149457x
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r3 = r0.f149456w
            grl.r2 r4 = r0.v
            it3.d r0 = r0.u
            yhm.o.b(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L62
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            yhm.o.b(r9)
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r9 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            grl.r2 r4 = r7.L2()
            r0.u = r8
            r0.v = r4
            r0.f149456w = r7
            yki.i r2 = r7.Q
            r0.f149457x = r2
            r0.f149458y = r8
            r0.z = r9
            r0.C = r3
            java.lang.Object r0 = r7.K2(r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r3 = r7
            r1 = r0
            r0 = r8
        L62:
            wi0.b r1 = (wi0.b) r1
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r5 = r7.D
            ft3.a1 r5 = r5.f67054b
            java.lang.String r5 = r5.f137798b
            com.revolut.tracking.v3.CreditApplicationCommonContext r0 = zr3.b.b(r1, r4, r5, r0)
            r9.getClass()
            com.google.protobuf.w0 r9 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r0)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ModalStep$OtherApplicationInProgress r0 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ModalStep$OtherApplicationInProgress
            r0.<init>(r8, r9)
            r3.getClass()
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r2, r0, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.e3(it3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(it3.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h54.e0
            if (r0 == 0) goto L13
            r0 = r9
            h54.e0 r0 = (h54.e0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            h54.e0 r0 = new h54.e0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r8 = r0.z
            it3.d r1 = r0.f149463y
            yki.i r2 = r0.f149462x
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r3 = r0.f149461w
            grl.r2 r4 = r0.v
            it3.d r0 = r0.u
            yhm.o.b(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L62
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            yhm.o.b(r9)
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r9 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            grl.r2 r4 = r7.L2()
            r0.u = r8
            r0.v = r4
            r0.f149461w = r7
            yki.i r2 = r7.Q
            r0.f149462x = r2
            r0.f149463y = r8
            r0.z = r9
            r0.C = r3
            java.lang.Object r0 = r7.K2(r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r3 = r7
            r1 = r0
            r0 = r8
        L62:
            wi0.b r1 = (wi0.b) r1
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r5 = r7.D
            ft3.a1 r5 = r5.f67054b
            java.lang.String r5 = r5.f137798b
            com.revolut.tracking.v3.CreditApplicationCommonContext r0 = zr3.b.b(r1, r4, r5, r0)
            r9.getClass()
            com.google.protobuf.w0 r9 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r0)
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ModalStep$ResumeApplication r0 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ModalStep$ResumeApplication
            r0.<init>(r8, r9)
            r3.getClass()
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r2, r0, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.f3(it3.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(w4l.i r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.g3(w4l.i, gim.c):java.lang.Object");
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.P;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h54.g0
            if (r0 == 0) goto L13
            r0 = r7
            h54.g0 r0 = (h54.g0) r0
            int r1 = r0.f149467y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149467y = r1
            goto L18
        L13:
            h54.g0 r0 = new h54.g0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f149465w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149467y
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ModalStep$UpdateRequired r3 = com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract.Step.ModalStep.UpdateRequired.f67075a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yki.i r1 = r0.v
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r0 = r0.u
            yhm.o.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            yhm.o.b(r7)
            goto L4e
        L3c:
            yhm.o.b(r7)
            r0.f149467y = r5
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r7 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.Tutorial
            j54.z r2 = r6.I
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d r2 = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) r2
            java.lang.Object r7 = r2.c3(r7, r0)
            if (r7 != r1) goto L4e
            goto L64
        L4e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            yki.i r2 = r6.Q
            if (r7 == 0) goto L7e
            r0.u = r6
            r0.v = r2
            r0.f149467y = r4
            java.lang.Object r7 = r6.K2(r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            r0 = r6
            r1 = r2
        L67:
            wi0.b r7 = (wi0.b) r7
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep r2 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep
            r2.<init>(r3)
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r3 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.Tutorial
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles r4 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles
            r4.<init>(r7, r2, r3)
            r0.getClass()
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r7 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            oki.h.z2(r1, r4, r7)
            goto L83
        L7e:
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r2, r3, r7)
        L83:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.h3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof h54.h0
            if (r0 == 0) goto L13
            r0 = r11
            h54.h0 r0 = (h54.h0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            h54.h0 r0 = new h54.h0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f149471x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$WaitingList r5 = com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step.WaitingList.f67086a
            yki.i r4 = r10.Q
            r3 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3a
            if (r2 != r3) goto L32
            yki.i r4 = r0.f149470w
            com.revolut.feature.credit.application.plugins.impl.ui.application.d r0 = r0.v
            yhm.o.b(r11)
            goto L7a
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            boolean r2 = r0.u
            yhm.o.b(r11)
            goto L62
        L40:
            yhm.o.b(r11)
            hw3.l r11 = r10.f67097y
            gte.a r11 = r11.f156079a
            com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditWaitingListV3 r2 = com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$CreditWaitingListV3.f66277c
            jte.d r11 = (jte.d) r11
            boolean r2 = r11.c(r2)
            if (r2 != 0) goto L91
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r11 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.WaitingList
            r0.u = r2
            r0.z = r6
            j54.z r6 = r10.I
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d r6 = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) r6
            java.lang.Object r11 = r6.c3(r11, r0)
            if (r11 != r1) goto L62
            goto L78
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L91
            r0.v = r10
            r0.f149470w = r4
            r0.u = r2
            r0.z = r3
            java.lang.Object r11 = r10.K2(r0)
            if (r11 != r1) goto L79
        L78:
            return r1
        L79:
            r0 = r10
        L7a:
            wi0.b r11 = (wi0.b) r11
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep r1 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles$NextAction$CustomStep
            r1.<init>(r5)
            com.revolut.feature.credit.application.plugins.impl.ui.application.a r2 = com.revolut.feature.credit.application.plugins.impl.ui.application.a.WaitingList
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles r3 = new com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step$ProductArticles
            r3.<init>(r11, r1, r2)
            r0.getClass()
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r11 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            oki.h.z2(r4, r3, r11)
            goto L9a
        L91:
            r8 = 0
            r9 = 12
            r6 = 0
            r7 = 0
            r3 = r10
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
        L9a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.i3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r3.b(r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h54.i0
            if (r0 == 0) goto L13
            r0 = r7
            h54.i0 r0 = (h54.i0) r0
            int r1 = r0.f149475w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149475w = r1
            goto L18
        L13:
            h54.i0 r0 = new h54.i0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149475w
            vie.i r3 = r6.M
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L52
        L38:
            yhm.o.b(r7)
            r0.f149475w = r5
            boolean r7 = r3.a()
            if (r7 != 0) goto L4d
            java.lang.Object r7 = r3.c(r5, r0)
            if (r7 != r1) goto L4a
            goto L4f
        L4a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            goto L4f
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L4f:
            if (r7 != r1) goto L52
            goto L68
        L52:
            com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$InputData r7 = r6.D
            ft3.d1 r2 = r7.f67053a
            ft3.j1 r5 = r2.f137810a
            gt3.f r2 = r2.f137811b
            java.lang.String r7 = r7.f67058j
            ft3.q0 r7 = ft3.g1.e(r5, r2, r7)
            r0.f149475w = r4
            java.lang.Object r7 = r3.b(r7, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.d.j3(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) this.I;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ViewController viewController = dVar.f67118t;
        if (viewController != null && (throwable instanceof NoAuthTokenException)) {
            viewController.c3(yja.b.CLOSE_CLICK);
            return true;
        }
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        yji.l.a1(this, X1(h54.a.a(this.A, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), new y(com.google.android.gms.internal.mlkit_vision_face.a.o(o0.f186429a.b(throwable.getClass()).m(), ": ", throwable.getMessage()), n14.e.m(throwable)), 1)), null, null, new r(this, null, 0), 3);
        return true;
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j54.e;
        yki.i iVar = this.Q;
        w wVar = w.f5295a;
        if (z) {
            j54.e eVar = (j54.e) event;
            h.w2(iVar, new CreditApplicationFlowContract$Step.ModalStep.Cancellation(eVar.f171504b, eVar.f171505c, eVar.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return wVar;
        }
        if (event instanceof u) {
            u uVar = (u) event;
            C2(new yp3.i(uVar.f171568b, uVar.f171569c, uVar.d));
            return wVar;
        }
        NaviCommand naviCommandD3 = null;
        if (event instanceof t.b) {
            t.b bVar = (t.b) event;
            NaviCommand naviCommand = bVar.f171563b;
            if (naviCommand == null) {
                String str = bVar.f171564c;
                if (str != null) {
                    naviCommandD3 = d3(str);
                }
            } else {
                naviCommandD3 = naviCommand;
            }
            C2(new yp3.h(naviCommandD3));
            return wVar;
        }
        if (event instanceof t.c) {
            C2(new yp3.j(((t.c) event).f171565b));
            return wVar;
        }
        if (event instanceof t.a) {
            t.a aVar = (t.a) event;
            NaviCommand naviCommand2 = aVar.f171561b;
            if (naviCommand2 == null) {
                String str2 = aVar.f171562c;
                if (str2 != null) {
                    naviCommandD3 = d3(str2);
                }
            } else {
                naviCommandD3 = naviCommand2;
            }
            C2(new yp3.g(naviCommandD3));
            return wVar;
        }
        if (!(event instanceof h54.d)) {
            if (!(event instanceof h54.e)) {
                return super.o2(event);
            }
            h54.e eVar2 = (h54.e) event;
            h.w2(iVar, eVar2.f149459b, eVar2.f149460c);
            return wVar;
        }
        CreditApplicationFlowContract$Step creditApplicationFlowContract$Step = ((h54.d) event).f149455b;
        if (creditApplicationFlowContract$Step instanceof CreditApplicationFlowContract$Step.ProductArticles) {
            h.z2(iVar, creditApplicationFlowContract$Step, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
            return wVar;
        }
        h.t2(this, this.Q, creditApplicationFlowContract$Step, false, null, false, 12);
        return wVar;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.Q;
    }
}
