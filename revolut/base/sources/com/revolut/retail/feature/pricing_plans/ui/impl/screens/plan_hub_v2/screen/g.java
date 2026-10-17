package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen;

import akd.s;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c;
import ffk.t;
import imk.i0;
import imk.l0;
import imk.m0;
import imk.p0;
import imk.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.r;
import ojk.a0;
import ojk.b0;
import ojk.q;
import ojk.v;
import q06.l;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends q implements i0 {
    public final vii.b A;
    public int B;
    public final y C;
    public final s D;
    public final com.revolut.kompot.navigable.vc.modal.a E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f103574t;
    public final egk.e u;
    public final i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kmk.b f103575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wik.g f103576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f103577y;
    public final rul.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanHubV2ScreenContract$InputData inputData, n stateMapper, l deeplinkRouter, ajk.c bottomSheetNavigationResolver, t pricingPlanInteractor, egk.e plansUiInteractor, mkd.d slotManagerFeedExtension, ajk.b outOfAppNavigationProvider, i4b.f legalEntityContextProvider, kmk.b planHubAnimationExtension, wik.g planHubModalsInteractor, a planHubUiEventsOrchestrator, rul.e planOnboardingInteractor) {
        super(deeplinkRouter, slotManagerFeedExtension, bottomSheetNavigationResolver, outOfAppNavigationProvider, inputData.f103558a);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(plansUiInteractor, "plansUiInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(planHubAnimationExtension, "planHubAnimationExtension");
        Intrinsics.checkNotNullParameter(planHubModalsInteractor, "planHubModalsInteractor");
        Intrinsics.checkNotNullParameter(planHubUiEventsOrchestrator, "planHubUiEventsOrchestrator");
        Intrinsics.checkNotNullParameter(planOnboardingInteractor, "planOnboardingInteractor");
        this.f103574t = pricingPlanInteractor;
        this.u = plansUiInteractor;
        this.v = legalEntityContextProvider;
        this.f103575w = planHubAnimationExtension;
        this.f103576x = planHubModalsInteractor;
        this.f103577y = planHubUiEventsOrchestrator;
        this.z = planOnboardingInteractor;
        this.A = new vii.b();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        a0 a0Var = new a0(new ojk.y(r0.g()), new Data(null, null, true, 3, null), new b0(null));
        this.C = mra.d.b(this, new u(data, data2, c.a.f103569a, new Data(null, null, true, 3, null), a0Var), stateMapper, null, false, 12);
        this.D = s.PLAN_HUB;
        this.E = hx7.e.a(this, new fb.c(this, inputData, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g r7, hha.d r8, com.revolut.data.model.Data r9, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c r10, gim.c r11) {
        /*
            kmk.b r0 = r7.f103575w
            cli.y r1 = r7.C
            boolean r2 = r11 instanceof imk.q0
            if (r2 == 0) goto L17
            r2 = r11
            imk.q0 r2 = (imk.q0) r2
            int r3 = r2.f162543y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f162543y = r3
            goto L1c
        L17:
            imk.q0 r2 = new imk.q0
            r2.<init>(r7, r11)
        L1c:
            java.lang.Object r11 = r2.f162541w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f162543y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            yhm.o.b(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c r10 = r2.v
            com.revolut.data.model.Data r9 = r2.u
            yhm.o.b(r11)
            goto L58
        L3e:
            yhm.o.b(r11)
            java.lang.Object r11 = r1.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            imk.u r11 = (imk.u) r11
            r2.u = r9
            r2.v = r10
            r2.f162543y = r6
            java.lang.Object r11 = r0.Z2(r11, r8, r2)
            if (r11 != r3) goto L58
            goto L7f
        L58:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r8 = r11.booleanValue()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r1.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            imk.u r8 = (imk.u) r8
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a r7 = r7.f103577y
            imk.f r7 = r7.f103567h
            if (r7 == 0) goto L71
            goto L72
        L71:
            r6 = 0
        L72:
            r7 = 0
            r2.u = r7
            r2.v = r7
            r2.f162543y = r5
            com.revolut.data.model.Data r7 = r0.c3(r8, r9, r10, r6)
            if (r7 != r3) goto L80
        L7f:
            return r3
        L80:
            return r7
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g.N2(com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g, hha.d, com.revolut.data.model.Data, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c, gim.c):java.lang.Object");
    }

    @Override // ojk.q, yji.l
    public final void I1() {
        super.I1();
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(this.f103574t.q()), null, null, new l0(2, this, continuation), 3);
        yji.l.a1(this, this.v.j(r.f204497a), null, null, new l0(0, this, continuation), 3);
    }

    @Override // ojk.q
    public final s I2() {
        return this.D;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // ojk.q
    public final y L2() {
        return this.C;
    }

    @Override // ojk.q
    public final v M2(v vVar, a0 extraData) {
        u currentState = (u) vVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return u.c(currentState, null, null, null, null, extraData, 15);
    }

    public final void O2() {
        PlanHubScreenHeader planHubScreenHeader;
        PlanHubScreenConfig planHubScreenConfig = (PlanHubScreenConfig) ((u) ((j2) this.C.f22677a).getValue()).f162546b.getContent();
        if (planHubScreenConfig == null || (planHubScreenHeader = planHubScreenConfig.f102661a) == null) {
            return;
        }
        if (!(planHubScreenHeader instanceof PlanHubScreenHeader.Standard)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanHubScreenHeader.Standard standard = (PlanHubScreenHeader.Standard) planHubScreenHeader;
        PlanHubScreenHeader.Standard.HeaderAction headerAction = standard.f102668h;
        PlanScreenElementView.Action action = standard.d;
        if (headerAction instanceof PlanHubScreenHeader.Standard.HeaderAction.RevPointsBadge) {
            PlanScreenElementView.Action action2 = ((PlanHubScreenHeader.Standard.HeaderAction.RevPointsBadge) headerAction).f102687c;
            if (action2 != null) {
                J2(action2.f81005a);
                return;
            }
            return;
        }
        if (headerAction != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (action != null) {
            J2(action.f81005a);
        }
    }

    @Override // yji.l
    public final void P1() {
        if (this.f103577y.f103567h != null) {
            return;
        }
        this.B++;
    }

    @Override // ojk.q, yji.l
    public final void T1(long j2) {
        super.T1(j2);
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(vkm.q.Q(this.A, new m0(1, this, continuation)), new m0(2, this, continuation)), null, new l0(1, this, continuation), 3);
        yji.l.b1(this, this.C.B(new im3.e(4)), null, new f(this, null), 3);
        n2(new p0(this, continuation, 0), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }

    @Override // ojk.c0
    public final void h0() {
        this.A.a();
    }
}
