package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan;

import ajk.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import ffk.t;
import hx7.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vgk.i;
import vgk.k;
import vgk.s;
import zfk.j;
import zfk.m;
import zhm.v;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements vgk.b {
    public static final LayeredImage A;

    @NotNull
    public static final i Companion = new i();
    public final vgk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cha.b f103011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ahk.a f103013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zfk.c f103014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f103015t;
    public final gte.a u;
    public final vjk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yjk.a f103016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yfk.a f103017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qki.d f103018y;
    public final yki.i z;

    static {
        List listK = v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_profile, (Integer) null, BitmapDescriptorFactory.HUE_RED, 8.0f, BitmapDescriptorFactory.HUE_RED, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 86), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_16_exclamation_mark, (Integer) null, 24.0f, BitmapDescriptorFactory.HUE_RED, 24.0f, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 106));
        Float fValueOf = Float.valueOf(40.0f);
        A = new LayeredImage(listK, fValueOf, fValueOf, 8);
    }

    public d(vgk.c inputData, cha.b familyPlansInteractor, t pricingPlanInteractor, ahk.a statusDialogProvider, zfk.c planSubscriberControllerModelExtension, f pricingPlanNavigationCommandsProvider, gte.a featureToggleInteractor, vjk.a cancelFamilyExtraExtension, yjk.a cancelLegacyFamilyPlanExtension, yfk.a planReferralSwitchNoticeExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cancelFamilyExtraExtension, "cancelFamilyExtraExtension");
        Intrinsics.checkNotNullParameter(cancelLegacyFamilyPlanExtension, "cancelLegacyFamilyPlanExtension");
        Intrinsics.checkNotNullParameter(planReferralSwitchNoticeExtension, "planReferralSwitchNoticeExtension");
        this.o = inputData;
        this.f103011p = familyPlansInteractor;
        this.f103012q = pricingPlanInteractor;
        this.f103013r = statusDialogProvider;
        this.f103014s = planSubscriberControllerModelExtension;
        this.f103015t = pricingPlanNavigationCommandsProvider;
        this.u = featureToggleInteractor;
        this.v = cancelFamilyExtraExtension;
        this.f103016w = cancelLegacyFamilyPlanExtension;
        this.f103017x = planReferralSwitchNoticeExtension;
        this.f103018y = e.b(this, new FamilyPlanFlowContract$State(false));
        this.z = d8l.d.a(this, new v48.d(this, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof vgk.l
            if (r0 == 0) goto L13
            r0 = r6
            vgk.l r0 = (vgk.l) r0
            int r1 = r0.f289205w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289205w = r1
            goto L18
        L13:
            vgk.l r0 = new vgk.l
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289205w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L62
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ffk.t r5 = r5.f103012q
            efm.d0 r5 = r5.e()
            vgk.g r6 = new vgk.g
            r2 = 0
            r6.<init>(r2)
            vf0.n r2 = new vf0.n
            r4 = 26
            r2.<init>(r6, r4)
            r5.getClass()
            ufm.i r6 = new ufm.i
            r4 = 1
            r6.<init>(r5, r2, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step$SelectFamilyPlan r5 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step.SelectFamilyPlan.f102988a
            pfm.z r5 = ue0.e.F(r6, r5)
            r0.f289205w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vgk.m
            if (r0 == 0) goto L13
            r0 = r7
            vgk.m r0 = (vgk.m) r0
            int r1 = r0.f289206w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289206w = r1
            goto L18
        L13:
            vgk.m r0 = new vgk.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289206w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L66
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            cha.b r6 = r6.f103011p
            ffk.h r6 = (ffk.h) r6
            vkm.d r6 = r6.e()
            vga.g r7 = new vga.g
            r2 = 29
            r7.<init>(r2)
            akg.n r6 = nim.a.v(r6, r7)
            vgg.a0 r7 = new vgg.a0
            r2 = 2
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            vge.f1 r7 = new vge.f1
            r4 = 3
            r5 = 6
            r7.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r6, r2, r7)
            r0.f289206w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            od0.i r7 = (od0.i) r7
            java.lang.Object r6 = r7.f224257a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.J2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r6.invoke(r10, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d r6, java.lang.String r7, zm3.l r8, kotlin.jvm.functions.Function2 r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof vgk.n
            if (r0 == 0) goto L13
            r0 = r10
            vgk.n r0 = (vgk.n) r0
            int r1 = r0.f289208x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289208x = r1
            goto L18
        L13:
            vgk.n r0 = new vgk.n
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289208x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r10)
            goto L82
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.jvm.functions.Function2 r6 = r0.u
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            yhm.o.b(r10)
            goto L71
        L3d:
            kotlin.jvm.functions.Function2 r7 = r0.u
            r9 = r7
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            yhm.o.b(r10)
            goto L5c
        L46:
            yhm.o.b(r10)
            cha.b r10 = r6.f103011p
            java.lang.String r8 = r8.getCode()
            r0.u = r9
            r0.f289208x = r5
            ffk.h r10 = (ffk.h) r10
            java.lang.Object r7 = r10.d(r7, r8, r0)
            if (r7 != r1) goto L5c
            goto L81
        L5c:
            ffk.t r6 = r6.f103012q
            efm.d0 r6 = r6.e()
            r7 = r9
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r0.u = r7
            r0.f289208x = r4
            java.lang.Object r10 = nim.a.b(r6, r0)
            if (r10 != r1) goto L70
            goto L81
        L70:
            r6 = r9
        L71:
            hha.d r10 = (hha.d) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            r7 = 0
            r0.u = r7
            r0.f289208x = r3
            java.lang.Object r6 = r6.invoke(r10, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d.K2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d, java.lang.String, zm3.l, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public final void L2(String str, hha.i iVar, l lVar) {
        vgk.f fVar = new vgk.f(this, lVar, 0);
        if (((jte.d) this.u).c(PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c)) {
            l2(new k(this, str, lVar, iVar, fVar, null), new yi5.b(26));
            return;
        }
        j jVar = m.Companion;
        boolean z = lVar != null;
        jVar.getClass();
        yji.l.a1(this, this.f103014s.h3(str, iVar, z ? zfk.l.f322029a : new zfk.k(null)), null, null, new s(fVar, null), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new uxe.l(this, null, 20), new yi5.b(26)).k(new vgk.d(this, 0));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f103018y;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
