package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f317898b;

    public i(uw1.c apmFeatureChecker, o apmProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(apmProvider, "apmProvider");
        this.f317897a = apmFeatureChecker;
        this.f317898b = apmProvider;
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
            boolean r0 = r8 instanceof yy9.h
            if (r0 == 0) goto L13
            r0 = r8
            yy9.h r0 = (yy9.h) r0
            int r1 = r0.f317894x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317894x = r1
            goto L18
        L13:
            yy9.h r0 = new yy9.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317894x
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
            r0.f317894x = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r1) goto L47
            goto L60
        L47:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L50
            goto L65
        L50:
            com.revolut.feature.apm.core.api.product.ApmIris r8 = com.revolut.feature.apm.core.api.product.ApmIris.f61811c
            n02.b r2 = n02.b.IRIS
            r0.u = r5
            r0.f317894x = r3
            yy9.o r3 = r6.f317898b
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
            com.revolut.feature.apm.core.api.product.ApmIris r2 = com.revolut.feature.apm.core.api.product.ApmIris.f61811c
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = r2.e()
            java.util.List r2 = zhm.u.c(r2)
            r3 = 12
            r0.<init>(r1, r2, r5, r3)
            int r1 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_iris
            r7.<init>(r1, r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.i.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yy9.g
            if (r0 == 0) goto L13
            r0 = r5
            yy9.g r0 = (yy9.g) r0
            int r1 = r0.f317890w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317890w = r1
            goto L1a
        L13:
            yy9.g r0 = new yy9.g
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317890w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yy9.o r5 = r4.f317898b
            gte.a r5 = r5.f317914c
            com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard r2 = com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard.f61778c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r2)
            if (r5 == 0) goto L5c
            uw1.c r5 = r4.f317897a
            ty1.b r5 = (ty1.b) r5
            ufm.c r5 = r5.e()
            r0.f317890w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.i.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
