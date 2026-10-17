package com.revolut.feature.freelancer.impl.ui.sales.new_sale;

import ex6.b;
import gr6.p;
import hx7.e;
import java.util.Set;
import jr6.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import vkm.q0;
import vkm.t0;
import wm3.j;
import xnl.f;
import xv4.o;
import y17.k;
import y17.n;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k {
    public final a27.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerNewSaleFlowContract$InputData f74155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gr6.a f74156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f74157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f74158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f74159t;
    public final Set u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f74160w;

    public a(a27.k eligibilityStepChecker, FreelancerNewSaleFlowContract$InputData inputData, gr6.a freelancerAccountDetailsInteractor, m freelancerDialogFactory, p freelancerProductArticleInteractor, b serverErrorHandlerExtension) {
        Intrinsics.checkNotNullParameter(eligibilityStepChecker, "eligibilityStepChecker");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(serverErrorHandlerExtension, "serverErrorHandlerExtension");
        this.o = eligibilityStepChecker;
        this.f74155p = inputData;
        this.f74156q = freelancerAccountDetailsInteractor;
        this.f74157r = freelancerDialogFactory;
        this.f74158s = freelancerProductArticleInteractor;
        this.f74159t = serverErrorHandlerExtension;
        yja.b[] elements = {yja.b.NEXT_CLICK, yja.b.NOT_FOUND};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.u = kotlin.collections.d.y0(elements);
        this.v = e.b(this, new FreelancerNewSaleFlowContract$DomainState(null));
        this.f74160w = d8l.d.a(this, new xwd.a(this, 11));
    }

    public static final Object I2(a aVar, gim.i iVar) {
        Object objP2 = aVar.p2(iVar, new j(aVar, null, 14));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.freelancer.impl.ui.sales.new_sale.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof y17.o
            if (r0 == 0) goto L13
            r0 = r8
            y17.o r0 = (y17.o) r0
            int r1 = r0.f310326w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310326w = r1
            goto L18
        L13:
            y17.o r0 = new y17.o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310326w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            gr6.p r8 = r7.f74158s
            com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$InputData r2 = r7.f74155p
            cs6.c r2 = r2.f74143b
            ir6.f r2 = kotlin.jvm.internal.s.O(r2)
            r0.f310326w = r3
            et6.x2 r8 = (et6.x2) r8
            java.lang.Object r8 = r8.g(r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.product_article.api.models.ProductArticleParams r8 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r8
            com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$ProductArticle r2 = new com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$EligibilityCheck$ProductArticle
            r2.<init>(r8)
            yki.i r1 = r7.f74160w
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.new_sale.a.J2(com.revolut.feature.freelancer.impl.ui.sales.new_sale.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        Continuation continuation = null;
        l.a1(this, new q0(new t0(this.o.e, 1), new o(this, continuation, 14), 1), null, null, new f(this, continuation, 24), 3);
        l2(new n(this, continuation, 2), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.v;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ((ex6.d) this.f74159t).Z2(throwable, new y17.l(this, 0));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74160w;
    }
}
