package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f317907b;

    public l(uw1.c apmFeatureChecker, o apmProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(apmProvider, "apmProvider");
        this.f317906a = apmFeatureChecker;
        this.f317907b = apmProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof yy9.k
            if (r0 == 0) goto L13
            r0 = r8
            yy9.k r0 = (yy9.k) r0
            int r1 = r0.f317904x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317904x = r1
            goto L18
        L13:
            yy9.k r0 = new yy9.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317904x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L47
        L39:
            yhm.o.b(r8)
            r0.u = r7
            r0.f317904x = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L47
            goto L60
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L50
            goto L65
        L50:
            com.revolut.feature.apm.core.api.product.ApmMultibanco r8 = com.revolut.feature.apm.core.api.product.ApmMultibanco.f61815c
            n02.b r2 = n02.b.MBWAY
            r0.u = r5
            r0.f317904x = r3
            yy9.o r3 = r6.f317907b
            java.lang.Object r8 = r3.b(r7, r8, r2, r0)
            if (r8 != r1) goto L61
        L60:
            return r1
        L61:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$ApmType$Phone r8 = (com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType.ApmType.Phone) r8
            if (r8 != 0) goto L66
        L65:
            return r5
        L66:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r7 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption
            java.util.List r8 = zhm.u.c(r8)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.core.api.R$string.apm_clipboard_payment_send_via
            com.revolut.feature.apm.core.api.product.ApmMultibanco r2 = com.revolut.feature.apm.core.api.product.ApmMultibanco.f61815c
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r2.e()
            java.util.List r2 = zhm.u.c(r2)
            r3 = 12
            r0.<init>(r1, r2, r5, r3)
            int r1 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_mb_way
            r7.<init>(r1, r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.l.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yy9.j
            if (r0 == 0) goto L13
            r0 = r5
            yy9.j r0 = (yy9.j) r0
            int r1 = r0.f317900w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317900w = r1
            goto L1a
        L13:
            yy9.j r0 = new yy9.j
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317900w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yy9.o r5 = r4.f317907b
            gte.a r5 = r5.f317914c
            com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard r2 = com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard.f61778c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r2)
            if (r5 == 0) goto L5e
            uw1.c r5 = r4.f317906a
            ty1.b r5 = (ty1.b) r5
            yoj.c r2 = yoj.c.APM_MULTIBANCO
            pfm.z r5 = r5.c(r2)
            r0.f317900w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.l.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
