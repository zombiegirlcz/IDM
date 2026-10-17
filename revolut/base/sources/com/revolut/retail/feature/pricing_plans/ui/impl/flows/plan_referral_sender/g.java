package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import eh3.s;
import eik.y;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import lx0.j;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h implements eik.e {

    @NotNull
    public static final eik.g Companion = new eik.g();
    public final kge.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f4h.a f103234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final iik.a f103235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final iik.c f103236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fik.d f103237t;
    public final y u;
    public final eik.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f103238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PlanReferralsSenderFlowContract$InputData f103239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f103240y;

    public g(kge.d planReferralsInteractor, t pricingPlanInteractor, f4h.a planSharingEnabledProvider, iik.a contactsChooserScreenProvider, iik.c contactsFilterProvider, fik.d dialogMapper, y introArticleParamsResolver, eik.c inviteVideoUrlResolver, j videoPreloader, PlanReferralsSenderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(planReferralsInteractor, "planReferralsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planSharingEnabledProvider, "planSharingEnabledProvider");
        Intrinsics.checkNotNullParameter(contactsChooserScreenProvider, "contactsChooserScreenProvider");
        Intrinsics.checkNotNullParameter(contactsFilterProvider, "contactsFilterProvider");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(introArticleParamsResolver, "introArticleParamsResolver");
        Intrinsics.checkNotNullParameter(inviteVideoUrlResolver, "inviteVideoUrlResolver");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = planReferralsInteractor;
        this.f103233p = pricingPlanInteractor;
        this.f103234q = planSharingEnabledProvider;
        this.f103235r = contactsChooserScreenProvider;
        this.f103236s = contactsFilterProvider;
        this.f103237t = dialogMapper;
        this.u = introArticleParamsResolver;
        this.v = inviteVideoUrlResolver;
        this.f103238w = videoPreloader;
        this.f103239x = inputData;
        this.f103240y = d8l.d.a(this, new s(this, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
    
        if (r24.R2(r1, r2) == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (N2(r7, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(int r7, boolean r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof eik.l
            if (r0 == 0) goto L13
            r0 = r9
            eik.l r0 = (eik.l) r0
            int r1 = r0.f126677y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126677y = r1
            goto L18
        L13:
            eik.l r0 = new eik.l
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f126675w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126677y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L88
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r8 = r0.v
            int r7 = r0.u
            yhm.o.b(r9)
            goto L73
        L3a:
            yhm.o.b(r9)
            r0.u = r7
            r0.v = r8
            r0.f126677y = r4
            f4h.a r9 = r6.f103234q
            java.lang.Object r9 = r9.f132229b
            y21.c r9 = (y21.c) r9
            com.revolut.data.network.models.security.SecuritySettings r2 = com.revolut.data.network.models.security.SecuritySettings.PRICING_PLAN_REVEAL_SETTING
            w4l.h r5 = w4l.h.f294642c
            efm.r r9 = r9.b(r2, r5)
            vkm.d r9 = rd0.e.b(r9)
            zfd.e r9 = zi0.c.w(r9)
            ieg.y r2 = new ieg.y
            r5 = 22
            r2.<init>(r5)
            r5 = 0
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            g48.r r2 = new g48.r
            r4 = 12
            r2.<init>(r9, r4)
            java.lang.Object r9 = vkm.q.x(r2, r0)
            if (r9 != r1) goto L73
            goto L87
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8b
            r0.u = r7
            r0.v = r8
            r0.f126677y = r3
            java.lang.Object r7 = r6.N2(r7, r8, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8b:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$PlanSharing r8 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$PlanSharing
            r8.<init>(r7)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yki.i r9 = r6.f103240y
            oki.h.z2(r9, r8, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.J2(int, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eik.m
            if (r0 == 0) goto L13
            r0 = r5
            eik.m r0 = (eik.m) r0
            int r1 = r0.f126678w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126678w = r1
            goto L18
        L13:
            eik.m r0 = new eik.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126678w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ffk.t r5 = r4.f103233p
            efm.d0 r5 = r5.e()
            r0.f126678w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.K2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eik.n
            if (r0 == 0) goto L13
            r0 = r5
            eik.n r0 = (eik.n) r0
            int r1 = r0.f126679w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126679w = r1
            goto L18
        L13:
            eik.n r0 = new eik.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126679w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f126679w = r3
            java.lang.Object r5 = r4.K2(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            hha.d r5 = (hha.d) r5
            r0 = 0
            com.revolut.core.ui_kit.models.Clause r5 = dok.g.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new eik.s(this, null, 0), new eed.j(this, "init flow", 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum M2(gim.c r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eik.o
            if (r0 == 0) goto L13
            r0 = r5
            eik.o r0 = (eik.o) r0
            int r1 = r0.f126680w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126680w = r1
            goto L18
        L13:
            eik.o r0 = new eik.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126680w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f126680w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.K2(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3d
            return r1
        L3d:
            hha.d r5 = (hha.d) r5     // Catch: java.lang.Exception -> L27
            hha.w0 r5 = hha.s.f(r5)     // Catch: java.lang.Exception -> L27
            return r5
        L44:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L57
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Unable to load referred plan"
            java.lang.String r3 = "PlanReferralsSenderFlowModel"
            rd0.d.a(r1, r3, r2, r5, r0)
            r5 = 0
            return r5
        L57:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.M2(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [oki.h] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [oki.h] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g, oki.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(int r8, boolean r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof eik.r
            if (r0 == 0) goto L13
            r0 = r10
            eik.r r0 = (eik.r) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            eik.r r0 = new eik.r
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r8 = r0.v
            boolean r9 = r0.f126684w
            com.revolut.core.ui_kit.models.Clause r1 = r0.z
            com.revolut.core.ui_kit.models.Clause r1 = (com.revolut.core.ui_kit.models.Clause) r1
            yki.b r2 = r0.f126686y
            oki.h r0 = r0.f126685x
            yhm.o.b(r10)
        L35:
            r3 = r9
            goto L85
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            boolean r9 = r0.f126684w
            int r8 = r0.u
            yki.b r2 = r0.f126686y
            oki.h r4 = r0.f126685x
            yhm.o.b(r10)
            goto L65
        L4b:
            yhm.o.b(r10)
            r0.f126685x = r7
            yki.i r10 = r7.f103240y
            r0.f126686y = r10
            r0.u = r8
            r0.f126684w = r9
            r0.C = r4
            java.lang.Object r2 = r7.L2(r0)
            if (r2 != r1) goto L61
            goto L80
        L61:
            r4 = r2
            r2 = r10
            r10 = r4
            r4 = r7
        L65:
            com.revolut.core.ui_kit.models.Clause r10 = (com.revolut.core.ui_kit.models.Clause) r10
            r0.f126685x = r4
            r0.f126686y = r2
            r5 = r10
            com.revolut.core.ui_kit.models.Clause r5 = (com.revolut.core.ui_kit.models.Clause) r5
            r0.z = r5
            r0.u = r8
            r0.f126684w = r9
            r0.v = r8
            r0.C = r3
            iik.c r3 = r7.f103236s
            java.lang.Object r0 = r3.a(r0)
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            r1 = r10
            r10 = r0
            r0 = r4
            goto L35
        L85:
            com.revolut.feature.contacts_chooser.api.models.ContactsFilter r10 = (com.revolut.feature.contacts_chooser.api.models.ContactsFilter) r10
            r9 = r1
            r1 = r2
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$SelectContacts r2 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$SelectContacts
            r2.<init>(r9, r8, r10)
            r5 = 0
            r6 = 12
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.N2(int, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eik.t
            if (r0 == 0) goto L13
            r0 = r5
            eik.t r0 = (eik.t) r0
            int r1 = r0.f126688w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126688w = r1
            goto L18
        L13:
            eik.t r0 = new eik.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126688w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f126688w = r3
            java.lang.Enum r5 = r4.M2(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            hha.w0 r5 = (hha.w0) r5
            if (r5 == 0) goto L66
            eik.c r0 = r4.v
            r0.getClass()
            java.lang.String r0 = "planTier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int[] r0 = eik.b.f126665a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L63;
                case 2: goto L60;
                case 3: goto L5d;
                case 4: goto L5a;
                case 5: goto L66;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L66;
                case 9: goto L66;
                default: goto L54;
            }
        L54:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L5a:
            java.lang.String r5 = "https://assets.revolut.com/mobile/premium/plan_referral/invite/ultra.mp4"
            return r5
        L5d:
            java.lang.String r5 = "https://assets.revolut.com/mobile/premium/plan_referral/invite/metal.mp4"
            return r5
        L60:
            java.lang.String r5 = "https://assets.revolut.com/mobile/premium/plan_referral/invite/premium.mp4"
            return r5
        L63:
            java.lang.String r5 = "https://assets.revolut.com/mobile/premium/plan_referral/invite/plus.mp4"
            return r5
        L66:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.O2(gim.c):java.lang.Object");
    }

    public final void P2(l lVar) {
        this.f103237t.getClass();
        y0 y0Var = new y0(null, new j0((Clause) new TextLocalisedClause(R$string.plan_referral_invite_sent_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5);
        yji.l.a1(this, X1(y0Var), null, null, new chf.a(this, y0Var, lVar, null, 18), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(zm3.l r5, gim.c r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eik.u
            if (r0 == 0) goto L13
            r0 = r6
            eik.u r0 = (eik.u) r0
            int r1 = r0.f126690x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126690x = r1
            goto L18
        L13:
            eik.u r0 = new eik.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126690x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zm3.l r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f126690x = r3
            java.lang.Object r6 = r4.O2(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L50
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$InviteVideo r0 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$InviteVideo
            r0.<init>(r6, r5)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r5 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            yki.i r6 = r4.f103240y
            oki.h.w2(r6, r0, r5)
            goto L53
        L50:
            r4.P2(r5)
        L53:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.Q2(zm3.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (J2(r2, true, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(pck.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof eik.v
            if (r0 == 0) goto L13
            r0 = r9
            eik.v r0 = (eik.v) r0
            int r1 = r0.f126692x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f126692x = r1
            goto L18
        L13:
            eik.v r0 = new eik.v
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f126692x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L8d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            pck.d r8 = r0.u
            yhm.o.b(r9)
            goto L61
        L39:
            yhm.o.b(r9)
            eik.s r9 = new eik.s
            r2 = 1
            r9.<init>(r7, r4, r2)
            yi5.b r2 = new yi5.b
            r6 = 26
            r2.<init>(r6)
            r7.l2(r9, r2)
            r0.u = r8
            r0.f126692x = r5
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$InputData r9 = r7.f103239x
            boolean r9 = r9.f103221a
            if (r9 == 0) goto L58
            r9 = r4
            goto L5e
        L58:
            eik.y r9 = r7.u
            java.lang.Object r9 = r9.a(r8, r0)
        L5e:
            if (r9 != r1) goto L61
            goto L8c
        L61:
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r9
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            pck.b r2 = r8.f234924a
            int r2 = r2.d
            int r8 = r8.f234925b
            int r2 = r2 - r8
            if (r2 >= 0) goto L72
            r2 = 0
        L72:
            if (r9 == 0) goto L82
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$Intro r8 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$Step$Intro
            r8.<init>(r9, r2)
            r9 = 6
            yki.i r0 = r7.f103240y
            oki.h.u2(r7, r0, r8, r4, r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L82:
            r0.u = r4
            r0.f126692x = r3
            java.lang.Object r8 = r7.J2(r2, r5, r0)
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g.R2(pck.d, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103240y;
    }
}
