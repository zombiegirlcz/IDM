package hnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mre.c f154084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gnb.b f154085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f154086c;

    public d(mre.c termsNavigationFactory, gnb.b savingsDocumentsInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f154084a = termsNavigationFactory;
        this.f154085b = savingsDocumentsInteractor;
        this.f154086c = uriHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.shared.savings.models.product.SavingsDocument r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof hnb.b
            if (r0 == 0) goto L13
            r0 = r15
            hnb.b r0 = (hnb.b) r0
            int r1 = r0.f154080w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154080w = r1
            goto L18
        L13:
            hnb.b r0 = new hnb.b
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154080w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L82
        L2a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L32:
            yhm.o.b(r15)
            return r15
        L36:
            yhm.o.b(r15)
            boolean r15 = r14 instanceof com.revolut.feature.shared.savings.models.product.SavingsDocument.Link
            if (r15 == 0) goto L59
            com.revolut.feature.shared.savings.models.product.SavingsDocument$Link r14 = (com.revolut.feature.shared.savings.models.product.SavingsDocument.Link) r14
            java.lang.String r15 = r14.f86610c
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r6 = r14.f86608a
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.f154080w = r4
            java.lang.Object r14 = r13.b(r15, r5, r0)
            if (r14 != r1) goto L58
            goto L81
        L58:
            return r14
        L59:
            boolean r15 = r14 instanceof com.revolut.feature.shared.savings.models.product.SavingsDocument.Scope
            if (r15 == 0) goto L93
            com.revolut.feature.terms.api.model.TermsScope r15 = new com.revolut.feature.terms.api.model.TermsScope
            com.revolut.feature.shared.savings.models.product.SavingsDocument$Scope r14 = (com.revolut.feature.shared.savings.models.product.SavingsDocument.Scope) r14
            java.lang.String r14 = r14.f86611a
            r15.<init>(r14)
            r0.f154080w = r3
            mre.c r14 = r13.f154084a
            rre.d r14 = (rre.d) r14
            r2 = 0
            ufm.i r14 = r14.c(r15, r2)
            arg.a r2 = new arg.a
            r3 = 2
            r2.<init>(r15, r3)
            ufm.i r14 = ue0.e.D(r14, r2)
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.String r14 = "getTermsNavigationCommand(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            com.revolut.kompot.bridge.navigation.BridgeDestination r14 = zh9.u0.b(r15)
            cjb.c r15 = new cjb.c
            r15.<init>(r14)
            return r15
        L93:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: hnb.d.a(com.revolut.feature.shared.savings.models.product.SavingsDocument, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r20, com.revolut.core.ui_kit.models.TextClause r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hnb.d.b(java.lang.String, com.revolut.core.ui_kit.models.TextClause, gim.c):java.lang.Object");
    }
}
