package com.revolut.feature.rev_points.impl.ui.opt_in.screen;

import cli.g;
import cli.y;
import cq9.m;
import eub.i;
import hx7.e;
import i4b.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q06.l;
import qm2.c;
import qzb.k;
import qzb.n;
import qzb.o;
import qzb.p;
import u29.b;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements k {

    @NotNull
    public static final n Companion = new n();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f83820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nyb.k f83821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f83822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k0c.a f83823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f83824t;
    public final RevPointsOptInScreenContract$InputData u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f83826x;

    public a(m stateMapper, b lifestyleHomeOnboardingInteractor, i revPointsOptInInteractor, nyb.k revPointsInteractor, l deeplinkRouter, k0c.a revPointsTermsReviewFlowProvider, f legalEntityContextProvider, RevPointsOptInScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeOnboardingInteractor, "lifestyleHomeOnboardingInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(revPointsTermsReviewFlowProvider, "revPointsTermsReviewFlowProvider");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = lifestyleHomeOnboardingInteractor;
        this.f83820p = revPointsOptInInteractor;
        this.f83821q = revPointsInteractor;
        this.f83822r = deeplinkRouter;
        this.f83823s = revPointsTermsReviewFlowProvider;
        this.f83824t = legalEntityContextProvider;
        this.u = inputData;
        this.v = new vii.b();
        this.f83825w = e.a(this, new c(this, 20));
        this.f83826x = d.b(this, new qzb.e(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r6.J2(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r6.J2(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof qzb.q
            if (r0 == 0) goto L13
            r0 = r7
            qzb.q r0 = (qzb.q) r0
            int r1 = r0.f250510w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250510w = r1
            goto L18
        L13:
            qzb.q r0 = new qzb.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250510w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            goto L92
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            goto L7e
        L39:
            yhm.o.b(r7)
            goto L4f
        L3d:
            yhm.o.b(r7)
            eub.i r7 = r6.f83820p
            efm.d0 r7 = eub.i.b(r7)
            r0.f250510w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4f
            goto L91
        L4f:
            m1c.r0 r7 = (m1c.r0) r7
            m1c.u r2 = r7.f201448b
            boolean r5 = r2 instanceof m1c.s
            if (r5 == 0) goto L81
            boolean r7 = qk.d.l(r7)
            if (r7 == 0) goto L75
            com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData r7 = new com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData
            m1c.s r2 = (m1c.s) r2
            java.util.ArrayList r0 = r2.f201451a
            r7.<init>(r0)
            com.revolut.kompot.navigable.vc.modal.a r6 = r6.f83825w
            com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$ModalStep$TermsReview r0 = new com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$ModalStep$TermsReview
            r0.<init>(r7)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r7 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            oki.h.v2(r6, r0, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L75:
            r0.f250510w = r4
            java.lang.Object r6 = r6.J2(r0)
            if (r6 != r1) goto L7e
            goto L91
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L81:
            m1c.t r7 = m1c.t.f201455a
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L95
            r0.f250510w = r3
            java.lang.Object r6 = r6.J2(r0)
            if (r6 != r1) goto L92
        L91:
            return r1
        L92:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L95:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.opt_in.screen.a.I2(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        o oVar = new o(1, this, continuation);
        vii.b bVar = this.v;
        yji.l.a1(this, q.Q(bVar, oVar), null, null, new p(2, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new o(0, this, continuation)), null, null, new p(0, this, continuation), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qzb.r
            if (r0 == 0) goto L13
            r0 = r5
            qzb.r r0 = (qzb.r) r0
            int r1 = r0.f250511w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250511w = r1
            goto L18
        L13:
            qzb.r r0 = new qzb.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250511w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$InputData r5 = r4.u
            com.revolut.feature.rev_points.models.RevPointsOptInSource r5 = r5.f83817a
            eub.i r2 = r4.f83820p
            nyb.o r2 = (nyb.o) r2
            efm.b r5 = r2.c(r5, r3)
            r0.f250511w = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            qzb.j r5 = new qzb.j
            r5.<init>(r3)
            r4.C2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.impl.ui.opt_in.screen.a.J2(gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83825w;
    }

    @Override // cli.z
    public final g getState() {
        return this.f83826x;
    }
}
