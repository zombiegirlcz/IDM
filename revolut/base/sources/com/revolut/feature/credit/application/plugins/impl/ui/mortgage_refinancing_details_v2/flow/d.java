package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import ang.f;
import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import e84.e;
import ix6.l0;
import jch.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xy3.a;
import xy3.s;
import xy3.x;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements je4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MortgageRefinancingDetailsV2FlowContract$InputData f68017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ox3.a f68018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f68019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qki.d f68020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MortgageRefinancingDetailsV2FlowContract$InputData inputData, ox3.a interactor, f userInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68017p = inputData;
        this.f68018q = interactor;
        this.f68019r = userInteractor;
        this.f68020s = hx7.e.b(this, new MortgageRefinancingDetailsV2FlowContract$State(new s(r0.g())));
        p pVar = new p(this, 8);
        this.f68021t = cp5.d.a(this, MortgageRefinancingDetailsV2FlowContract$Step.Initial.f68010a, f0.f322471a, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (r0 == r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d r12, java.lang.String r13, xy3.x r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d.P2(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d, java.lang.String, xy3.x, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new c(this, null), new yi5.b(26));
    }

    public final void Q2(String str, boolean z) {
        H2(this.f68020s, new jb8.a(str, 3));
        if (z) {
            t.J2(this, false, null, null, 7);
        } else {
            this.f68021t.e(false);
        }
    }

    public final void R2(a.b bVar) {
        yki.a aVar = this.f68021t;
        boolean z = aVar.d() instanceof MortgageRefinancingDetailsV2FlowContract$Step.Initial;
        h.t2(this, aVar, new MortgageRefinancingDetailsV2FlowContract$Step.QuestionnaireStep(z, bVar), !z, z ? TransitionAnimation.FADE.f98392a : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (c84.t.N2(r11, (it3.d) r12, r0, 2) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(gim.c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof je4.c
            if (r0 == 0) goto L13
            r0 = r12
            je4.c r0 = (je4.c) r0
            int r1 = r0.f173209w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173209w = r1
            goto L18
        L13:
            je4.c r0 = new je4.c
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173209w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L74
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            yhm.o.b(r12)
            goto L69
        L36:
            yhm.o.b(r12)
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$InputData r12 = r11.f68017p
            ft3.h1 r7 = r12.a9()
            qki.d r12 = r11.f68020s
            java.lang.Object r12 = r12.f22677a
            vkm.j2 r12 = (vkm.j2) r12
            java.lang.Object r12 = r12.getValue()
            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$State r12 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.MortgageRefinancingDetailsV2FlowContract$State) r12
            xy3.s r8 = r12.f68005a
            r0.f173209w = r4
            ox3.a r12 = r11.f68018q
            s34.b r6 = r12.f230551a
            r6.getClass()
            rhl.b r5 = new rhl.b
            r10 = 15
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L69
            goto L73
        L69:
            it3.d r12 = (it3.d) r12
            r0.f173209w = r3
            java.lang.Object r12 = c84.t.N2(r11, r12, r0, r3)
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d.S2(gim.c):java.lang.Object");
    }

    public final void T2(String str, x xVar) {
        l2(new l0(this, str, xVar, (Continuation) null, 13), new yi5.b(26));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f68020s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68021t;
    }
}
