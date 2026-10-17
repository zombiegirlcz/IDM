package com.revolut.feature.apm.aani.impl.ui;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.common.ui.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import tak.d;
import tx0.g4;
import u7k.w;
import uea.e;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements ul1.c {
    public final AaniFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kdh.b f61133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ul1.a f61134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vl1.c f61135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zja.a f61136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f61137t;
    public final ProductArticleParams u;
    public final i v;

    public c(AaniFlowContract$InputData inputData, kdh.b aaniInteractor, ul1.a aaniDialogProvider, vl1.c newContactNavigationProvider, zja.a productArticleInteractor, d pendingPaymentExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aaniInteractor, "aaniInteractor");
        Intrinsics.checkNotNullParameter(aaniDialogProvider, "aaniDialogProvider");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        this.o = inputData;
        this.f61133p = aaniInteractor;
        this.f61134q = aaniDialogProvider;
        this.f61135r = newContactNavigationProvider;
        this.f61136s = productArticleInteractor;
        this.f61137t = pendingPaymentExtension;
        this.u = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(AaniArticles.ONBOARDING));
        this.v = d8l.d.a(this, new w(this, 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r12.J2(true, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.aani.impl.ui.c r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof ul1.h
            if (r0 == 0) goto L13
            r0 = r13
            ul1.h r0 = (ul1.h) r0
            int r1 = r0.f280852w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280852w = r1
            goto L18
        L13:
            ul1.h r0 = new ul1.h
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280852w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L6c
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            goto L4a
        L36:
            yhm.o.b(r13)
            zja.a r13 = r12.f61136s
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = r12.u
            r0.f280852w = r4
            kka.h r13 = (kka.h) r13
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r13 = r13.e(r2, r5, r0)
            if (r13 != r1) goto L4a
            goto L6b
        L4a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L62
            yki.i r6 = r12.v
            r10 = 0
            r11 = 14
            com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$Step$ProductArticle r7 = com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$Step.ProductArticle.f61130a
            r8 = 0
            r9 = 0
            r5 = r12
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L62:
            r5 = r12
            r0.f280852w = r3
            java.lang.Object r12 = r5.J2(r4, r0)
            if (r12 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.aani.impl.ui.c.I2(com.revolut.feature.apm.aani.impl.ui.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(boolean r24, gim.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.aani.impl.ui.c.J2(boolean, gim.c):java.lang.Object");
    }

    public final void K2() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new e(this, null, 9), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new g4(1, this, c.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
