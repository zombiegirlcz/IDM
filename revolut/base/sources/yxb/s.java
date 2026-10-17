package yxb;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rev_points.models.SpareChangeCalculations;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeRefundControllerApi$Destination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import efm.d0;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import skm.p0;
import te0.w;
import wp5.y;
import yhm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements xtb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f317631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f317632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.t f317633c;
    public final eub.i d;
    public final eub.a e;
    public final wub.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u29.g f317634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rul.e f317635h;
    public final a2c.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xvh.c f317636j;

    public s(sri.m navigator, gte.a featureToggleInteractor, ffk.t pricingPlanInteractor, eub.i revPointsOptInInteractor, eub.a revPointsAvailabilityInteractor, wub.a revPointsBuyingFeatureInteractor, u29.g lifestyleTabAvailabilityInteractor, rul.e revPointsSpareChangeInteractor, a2c.e spareChangeNavigationResolver, xvh.c autoInvestInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailabilityInteractor, "lifestyleTabAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        this.f317631a = navigator;
        this.f317632b = featureToggleInteractor;
        this.f317633c = pricingPlanInteractor;
        this.d = revPointsOptInInteractor;
        this.e = revPointsAvailabilityInteractor;
        this.f = revPointsBuyingFeatureInteractor;
        this.f317634g = lifestyleTabAvailabilityInteractor;
        this.f317635h = revPointsSpareChangeInteractor;
        this.i = spareChangeNavigationResolver;
        this.f317636j = autoInvestInteractor;
    }

    public static q06.h C(NaviCommand naviCommand) {
        return new q06.h(new BridgeDestination(naviCommand), new q06.b(ibb.c.e, null));
    }

    public static LocalDate D(String str) {
        Object objA;
        if (str == null) {
            return null;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = LocalDate.parse(str);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        return (LocalDate) (objA instanceof yhm.n ? null : objA);
    }

    public static ufm.i E(s sVar, NaviCommand naviCommand, RevPointsOptInNextDestination revPointsOptInNextDestination, String str) {
        d0 d0VarE = ((nyb.o) sVar.d).e(false);
        c cVar = new c(new w43.b((Object) naviCommand, (Object) revPointsOptInNextDestination, (Object) str, true, 8), 22);
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.e.f83420a, null), null, null, 6)));
    }

    public static ufm.b c() {
        ufm.b bVarM = d0.m(b());
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static ufm.b d(Integer num, boolean z) {
        ufm.b bVarM = d0.m(gc0.c.f(new KompotOverlayFeatureConfig(new RevPointsBuyingDestination(new InputData(z, num, (Function1) null, 10)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static ufm.b g(SpareChangeCalculations spareChangeCalculations, int i, boolean z) {
        ufm.b bVarM = d0.m(gc0.c.f(new KompotOverlayFeatureConfig(new RevPointsSpareChangeBreakdownControllerApi$Destination(new RevPointsSpareChangeBreakdownControllerApi$InputData(spareChangeCalculations, i, z, 24)), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static ufm.b i() {
        ufm.b bVarM = d0.m(gc0.c.f(new KompotOverlayFeatureConfig(new RevPointsSpareChangeRefundControllerApi$Destination(0), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static FeatureCommand n(List list) {
        return (list.size() == 1 && hha.s.p((hha.d) list.get(0))) ? new FeatureCommand(new PricingPlanFeatureConfig.UltraDashboard(null)) : new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yxb.q
            if (r0 == 0) goto L13
            r0 = r5
            yxb.q r0 = (yxb.q) r0
            int r1 = r0.f317629w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317629w = r1
            goto L18
        L13:
            yxb.q r0 = new yxb.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317629w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ufm.i r5 = r4.k()
            r0.f317629w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            q06.h r5 = C(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.A(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(jf0.c r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof yxb.r
            if (r0 == 0) goto L13
            r0 = r8
            yxb.r r0 = (yxb.r) r0
            int r1 = r0.f317630w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317630w = r1
            goto L18
        L13:
            yxb.r r0 = new yxb.r
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317630w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L69
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            java.util.HashMap r8 = r6.d
            java.lang.String r2 = "startDate"
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.time.LocalDate r8 = D(r8)
            java.util.HashMap r6 = r6.d
            java.lang.String r2 = "endDate"
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.time.LocalDate r6 = D(r6)
            com.revolut.feature.rev_points.api.navigation.RevPointsWrappedDestination r2 = new com.revolut.feature.rev_points.api.navigation.RevPointsWrappedDestination
            r2.<init>(r8, r6)
            com.revolut.retail.core.navigation.FeatureCommand r2 = zh9.u0.f(r2)
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$Wrapped r4 = new com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$Wrapped
            r4.<init>(r8, r6)
            ufm.i r6 = E(r5, r2, r4, r7)
            r0.f317630w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            q06.h r6 = C(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.B(jf0.c, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return (!y.D(cVar, "deeplink", 1, "rev-points") || Intrinsics.f(cVar.e(2), "gift-cards") || Intrinsics.f(cVar.e(2), "pocket")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new yl6.b(this, null, 18)), new yua.h(new wo5.a(deeplink, this, z), 25), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i h(Integer num, String str) {
        ufm.i iVar = new ufm.i(new ufm.i(w.o0(p0.f264003c, new y7i.h(this, null, 26)), new c(new yuc.p(new RevPointsSpareChangeControllerApi$InputData(new RevPointsSpareChangeControllerApi$Mode.Adjust(null, num, 11)), 16), 20), 1), new c(new yrb.i(this, str, 24), 21), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i j() {
        return E(this, gc0.c.f(new RevPointsFeatureConfig.RevPointsTransactionsConfig()), RevPointsOptInNextDestination.Tab.f83531a, null);
    }

    public final ufm.i k() {
        return E(this, gc0.c.f(new RevPointsFeatureConfig.RevPointsUpsellSelectPlanConfig()), RevPointsOptInNextDestination.Tab.f83531a, null);
    }

    public final z l(String str, String str2, RevPointsFlowDestination.EarnHubPendingAction earnHubPendingAction) {
        boolean z = Boolean.parseBoolean(str);
        d0 d0VarE = ((nyb.o) this.d).e(false);
        c cVar = new c(new w43.b(gc0.c.f(new RevPointsFeatureConfig.RevPointsEarnConfig(z, earnHubPendingAction)), new RevPointsOptInNextDestination.EarnHub(z, earnHubPendingAction), str2, !(earnHubPendingAction instanceof RevPointsFlowDestination.EarnHubPendingAction.OpenSpareChange), 8), 22);
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new c(new a(this, 14), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.F(iVar2, Boolean.TRUE);
    }

    public final d0 m() {
        d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((nyb.b) this.e).e(), null, new yw9.j(17), 1), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(jf0.c r10, java.lang.String r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof yxb.e
            if (r0 == 0) goto L13
            r0 = r12
            yxb.e r0 = (yxb.e) r0
            int r1 = r0.f317614w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317614w = r1
            goto L18
        L13:
            yxb.e r0 = new yxb.e
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317614w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L78
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r12)
            java.util.HashMap r10 = r10.d
            java.lang.String r12 = "context"
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
            r2 = 0
            if (r10 == 0) goto L58
            m1c.e0[] r4 = m1c.e0.values()
            int r5 = r4.length
            r6 = r12
        L46:
            if (r6 >= r5) goto L58
            r7 = r4[r6]
            java.lang.String r8 = r7.name()
            boolean r8 = kotlin.text.a0.z(r8, r10, r3)
            if (r8 == 0) goto L55
            goto L59
        L55:
            int r6 = r6 + 1
            goto L46
        L58:
            r7 = r2
        L59:
            if (r7 != 0) goto L5c
            return r2
        L5c:
            com.revolut.feature.rev_points.api.navigation.RevPointsBottomSheetDestination r10 = new com.revolut.feature.rev_points.api.navigation.RevPointsBottomSheetDestination
            r10.<init>(r7)
            yhi.b r4 = yhi.b.BOTTOM_DIALOG
            r5 = 12
            com.revolut.retail.core.navigation.FeatureCommand r10 = vhi.c.c(r10, r4, r2, r12, r5)
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$Tab r12 = com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination.Tab.f83531a
            ufm.i r10 = E(r9, r10, r12, r11)
            r0.f317614w = r3
            java.lang.Object r12 = nim.a.b(r10, r0)
            if (r12 != r1) goto L78
            return r1
        L78:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            kotlin.jvm.internal.Intrinsics.h(r12)
            q06.h r10 = C(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.o(jf0.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r11, java.lang.String r12, com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination.EarnHubPendingAction r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof yxb.f
            if (r0 == 0) goto L13
            r0 = r14
            yxb.f r0 = (yxb.f) r0
            int r1 = r0.f317615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317615w = r1
            goto L18
        L13:
            yxb.f r0 = new yxb.f
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317615w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L74
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r14)
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig$RevPointsEarnConfig r14 = new com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig$RevPointsEarnConfig
            r14.<init>(r11, r13)
            com.revolut.retail.core.navigation.FeatureCommand r5 = gc0.c.f(r14)
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$EarnHub r6 = new com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$EarnHub
            r6.<init>(r11, r13)
            boolean r11 = r13 instanceof com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination.EarnHubPendingAction.OpenSpareChange
            r8 = r11 ^ 1
            eub.i r11 = r10.d
            efm.d0 r11 = eub.i.b(r11)
            w43.b r4 = new w43.b
            r9 = 8
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            yxb.c r12 = new yxb.c
            r13 = 22
            r12.<init>(r4, r13)
            r11.getClass()
            ufm.i r13 = new ufm.i
            r14 = 1
            r13.<init>(r11, r12, r14)
            java.lang.String r11 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            r0.f317615w = r3
            java.lang.Object r14 = nim.a.b(r13, r0)
            if (r14 != r1) goto L74
            return r1
        L74:
            com.revolut.retail.core.navigation.NaviCommand r14 = (com.revolut.retail.core.navigation.NaviCommand) r14
            kotlin.jvm.internal.Intrinsics.h(r14)
            q06.h r11 = C(r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.p(java.lang.String, java.lang.String, com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination$EarnHubPendingAction, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yxb.g
            if (r0 == 0) goto L13
            r0 = r5
            yxb.g r0 = (yxb.g) r0
            int r1 = r0.f317616w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317616w = r1
            goto L18
        L13:
            yxb.g r0 = new yxb.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317616w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            u29.g r5 = r4.f317634g
            tzh.g r5 = r5.a()
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r5 = rd0.e.c(r5, r2)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            ufm.f r5 = ue0.e.t(r5, r2)
            r0.f317616w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            v19.a r5 = (v19.a) r5
            v19.a r0 = v19.a.NOT_AVAILABLE
            r1 = 0
            if (r5 != r0) goto L5e
            return r1
        L5e:
            q06.i r5 = new q06.i
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.e
            r0.<init>(r2, r1)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.q(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Integer r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yxb.h
            if (r0 == 0) goto L13
            r0 = r6
            yxb.h r0 = (yxb.h) r0
            int r1 = r0.f317617w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317617w = r1
            goto L18
        L13:
            yxb.h r0 = new yxb.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317617w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            wub.a r6 = r4.f
            boolean r6 = r6.a()
            if (r6 != 0) goto L3c
            r5 = 0
            return r5
        L3c:
            r6 = 0
            ufm.b r5 = d(r5, r6)
            r0.f317617w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            q06.h r5 = C(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.r(java.lang.Integer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yxb.i
            if (r0 == 0) goto L13
            r0 = r9
            yxb.i r0 = (yxb.i) r0
            int r1 = r0.f317619x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317619x = r1
            goto L18
        L13:
            yxb.i r0 = new yxb.i
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317619x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            java.util.List r0 = r0.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r9)
            goto L89
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            yhm.o.b(r9)
            goto L65
        L3b:
            yhm.o.b(r9)
            ffk.t r9 = r8.f317633c
            efm.r r9 = r9.o()
            efm.r r9 = mo3.a.n(r9)
            yw9.j r2 = new yw9.j
            r6 = 16
            r2.<init>(r6)
            efm.r r9 = m70.a.g(r9, r4, r2, r5)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.f317619x = r5
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L65
            goto L85
        L65:
            java.util.List r9 = (java.util.List) r9
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L6e
            return r4
        L6e:
            com.revolut.retail.core.navigation.FeatureCommand r2 = b()
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$Tab r5 = com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination.Tab.f83531a
            ufm.i r2 = E(r8, r2, r5, r4)
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            r0.u = r4
            r0.f317619x = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            r7 = r0
            r0 = r9
            r9 = r7
        L89:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.retail.core.navigation.FeatureCommand r0 = n(r0)
            kotlin.jvm.internal.Intrinsics.h(r9)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r0)
            q06.h r9 = C(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.s(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yxb.j
            if (r0 == 0) goto L13
            r0 = r6
            yxb.j r0 = (yxb.j) r0
            int r1 = r0.f317620w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317620w = r1
            goto L18
        L13:
            yxb.j r0 = new yxb.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317620w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = b()
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$Tab r2 = com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination.Tab.f83531a
            ufm.i r5 = E(r4, r6, r2, r5)
            r0.f317620w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            q06.h r5 = C(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.t(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yxb.k
            if (r0 == 0) goto L13
            r0 = r5
            yxb.k r0 = (yxb.k) r0
            int r1 = r0.f317621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317621w = r1
            goto L18
        L13:
            yxb.k r0 = new yxb.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317621w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wub.a r5 = r4.f
            boolean r5 = r5.b()
            r2 = 0
            if (r5 != 0) goto L3c
            return r2
        L3c:
            ufm.b r5 = d(r2, r3)
            r0.f317621w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            q06.h r5 = C(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.u(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(jf0.c r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yxb.l
            if (r0 == 0) goto L13
            r0 = r7
            yxb.l r0 = (yxb.l) r0
            int r1 = r0.f317622w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317622w = r1
            goto L18
        L13:
            yxb.l r0 = new yxb.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317622w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            java.util.HashMap r5 = r5.d
            java.lang.String r7 = "completed"
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig$RevPointsRedeemConfig r7 = new com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig$RevPointsRedeemConfig
            r7.<init>(r5)
            com.revolut.retail.core.navigation.FeatureCommand r7 = gc0.c.f(r7)
            com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$RedeemHub r2 = new com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination$RedeemHub
            r2.<init>(r5)
            ufm.i r5 = E(r4, r7, r2, r6)
            r0.f317622w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            q06.h r5 = C(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.v(jf0.c, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r6, java.lang.Integer r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof yxb.m
            if (r0 == 0) goto L13
            r0 = r8
            yxb.m r0 = (yxb.m) r0
            int r1 = r0.f317625y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317625y = r1
            goto L18
        L13:
            yxb.m r0 = new yxb.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f317623w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317625y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Integer r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4e
        L3a:
            yhm.o.b(r8)
            efm.d0 r8 = r5.m()
            r0.u = r6
            r0.v = r7
            r0.f317625y = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L4e
            goto L68
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 != 0) goto L58
            return r2
        L58:
            ufm.i r6 = r5.h(r7, r6)
            r0.u = r2
            r0.v = r2
            r0.f317625y = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            q06.h r6 = C(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.w(java.lang.String, java.lang.Integer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yxb.n
            if (r0 == 0) goto L13
            r0 = r9
            yxb.n r0 = (yxb.n) r0
            int r1 = r0.f317626w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317626w = r1
            goto L18
        L13:
            yxb.n r0 = new yxb.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317626w
            r3 = 2
            r4 = 3
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r9)
            goto Laa
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            yhm.o.b(r9)
            goto L9a
        L3a:
            yhm.o.b(r9)
            goto L4e
        L3e:
            yhm.o.b(r9)
            efm.d0 r9 = r8.m()
            r0.f317626w = r5
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L4e
            goto La9
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            if (r9 != 0) goto L58
            goto L62
        L58:
            eub.a r9 = r8.e
            nyb.b r9 = (nyb.b) r9
            boolean r9 = r9.g()
            if (r9 != 0) goto L63
        L62:
            return r2
        L63:
            rul.e r9 = r8.f317635h
            efm.r r9 = r9.j(r5)
            efm.r r9 = m70.a.g(r9, r2, r2, r4)
            xvh.c r6 = r8.f317636j
            w4l.h r7 = w4l.h.f294642c
            efm.r r5 = xvh.c.c(r6, r2, r7, r5)
            efm.r r2 = m70.a.g(r5, r2, r2, r4)
            efm.r r9 = te0.w.l(r9, r2)
            yv8.j r2 = new yv8.j
            r5 = 17
            r2.<init>(r8, r5)
            efm.r r9 = te0.w.a0(r9, r2)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.f317626w = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L9a
            goto La9
        L9a:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            efm.h0 r9 = (efm.h0) r9
            r0.f317626w = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto Laa
        La9:
            return r1
        Laa:
            com.revolut.retail.core.navigation.NaviCommand r9 = (com.revolut.retail.core.navigation.NaviCommand) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            q06.h r9 = C(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.x(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r6 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yxb.o
            if (r0 == 0) goto L13
            r0 = r6
            yxb.o r0 = (yxb.o) r0
            int r1 = r0.f317627w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317627w = r1
            goto L18
        L13:
            yxb.o r0 = new yxb.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317627w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L46
        L36:
            yhm.o.b(r6)
            efm.d0 r6 = r5.m()
            r0.f317627w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            goto L67
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4f
            goto L59
        L4f:
            eub.a r6 = r5.e
            nyb.b r6 = (nyb.b) r6
            boolean r6 = r6.g()
            if (r6 != 0) goto L5b
        L59:
            r6 = 0
            return r6
        L5b:
            ufm.b r6 = i()
            r0.f317627w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            q06.h r6 = C(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.y(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yxb.p
            if (r0 == 0) goto L13
            r0 = r5
            yxb.p r0 = (yxb.p) r0
            int r1 = r0.f317628w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317628w = r1
            goto L18
        L13:
            yxb.p r0 = new yxb.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317628w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ufm.i r5 = r4.j()
            r0.f317628w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            q06.h r5 = C(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yxb.s.z(gim.c):java.lang.Object");
    }
}
