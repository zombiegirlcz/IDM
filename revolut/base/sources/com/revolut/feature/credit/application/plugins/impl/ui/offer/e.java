package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import c84.t;
import c84.y;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import ff4.m;
import ff4.n;
import ff4.o;
import ff4.p;
import ff4.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements cf4.a {

    @NotNull
    private static final cf4.d Companion = new cf4.d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OfferFlowContract$InputData f68083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rx3.b f68084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ff4.t f68085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sp3.a f68086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f68087t;
    public final hw3.c u;
    public final qki.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f68088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OfferFlowContract$InputData inputData, rx3.b offerDocumentsInteractor, ff4.t offerContentScreenInteractor, sp3.a creditDataMonitoringFacade, x deeplinkHandler, hw3.c actionPathInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(offerDocumentsInteractor, "offerDocumentsInteractor");
        Intrinsics.checkNotNullParameter(offerContentScreenInteractor, "offerContentScreenInteractor");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68083p = inputData;
        this.f68084q = offerDocumentsInteractor;
        this.f68085r = offerContentScreenInteractor;
        this.f68086s = creditDataMonitoringFacade;
        this.f68087t = deeplinkHandler;
        this.u = actionPathInteractor;
        this.v = hx7.e.b(this, new OfferFlowContract$State(null, null, null));
        hs3.c cVar = inputData.f68061b.f154902b;
        this.f68088w = cp5.d.a(this, cVar != null ? new OfferFlowContract$Step.AnimatedIntro(cVar) : new OfferFlowContract$Step.OfferContent(null, null, null), f0.f322471a, new c9f.c(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (c84.t.N2(r11, (it3.d) r13, r0, 2) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(bv3.a r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof cf4.e
            if (r0 == 0) goto L13
            r0 = r13
            cf4.e r0 = (cf4.e) r0
            int r1 = r0.f23543x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23543x = r1
            goto L18
        L13:
            cf4.e r0 = new cf4.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23543x
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r13)
            goto Lac
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            yhm.o.b(r13)
            goto L9f
        L3b:
            bv3.a r12 = r0.u
            yhm.o.b(r13)
            goto L86
        L41:
            yhm.o.b(r13)
            bs3.g r13 = bs3.g.INCOGNIA
            java.lang.Long r2 = r12.f18940a
            if (r2 == 0) goto L6c
            long r7 = r2.longValue()
            double r7 = (double) r7
            r2 = 100
            double r9 = (double) r2
            double r7 = r7 / r9
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r7 = "format(...)"
            java.lang.String r8 = "%.2f"
            java.lang.String r2 = a0.d.v(r2, r6, r8, r7)
            java.lang.String r7 = "credit_value"
            java.util.Map r2 = a0.d.x(r7, r2)
            if (r2 != 0) goto L70
        L6c:
            java.util.Map r2 = zhm.r0.g()
        L70:
            bs3.i r7 = new bs3.i
            java.lang.String r8 = "offer"
            r7.<init>(r8, r2, r13)
            r0.u = r12
            r0.f23543x = r6
            sp3.a r13 = r11.f68086s
            qq3.g r13 = (qq3.g) r13
            java.lang.Object r13 = r13.a(r7, r0)
            if (r13 != r1) goto L86
            goto Lab
        L86:
            com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData r13 = r11.f68083p
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r13 = r13.f68062c
            ft3.h1 r13 = kp0.w0.F(r13)
            ff4.t r2 = r11.f68085r
            efm.d0 r12 = r2.a(r12, r13)
            r0.u = r5
            r0.f23543x = r4
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L9f
            goto Lab
        L9f:
            it3.d r13 = (it3.d) r13
            r0.u = r5
            r0.f23543x = r3
            java.lang.Object r12 = c84.t.N2(r11, r13, r0, r4)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer.e.P2(bv3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (lg0.b.x1(r9.f68087t, r2, null, null, r6, 6) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r1.c(r11, r6) == r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        if (c84.t.N2(r10, (it3.d) r15, r6, 2) != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        if (P2(r11, r6) == r0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(com.revolut.feature.credit.application.plugins.api.models.action_button.Action r11, java.lang.Long r12, java.lang.Long r13, fu3.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer.e.Q2(com.revolut.feature.credit.application.plugins.api.models.action_button.Action, java.lang.Long, java.lang.Long, fu3.a, gim.c):java.lang.Object");
    }

    public final void R2(q qVar, OfferFlowContract$Step.OfferContent offerContent) {
        if (qVar instanceof o) {
            o oVar = (o) qVar;
            h.t2(this, this.f68088w, new OfferFlowContract$Step.EditOffer(oVar.f134733a, oVar.f134734b, oVar.f134735c), true, null, false, 12);
            return;
        }
        Continuation continuation = null;
        if (qVar instanceof m) {
            l2(new b(this, qVar, null), new yi5.b(26));
            return;
        }
        if (Intrinsics.f(qVar, n.f134732a)) {
            n2(new c(this, null), new whi.b(6));
        } else {
            if (!(qVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(this.v, new ce9.a(offerContent, 3));
            n2(new y(this, (p) qVar, continuation, 12), new whi.b(6));
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68088w;
    }
}
