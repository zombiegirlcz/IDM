package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab2.b f317932b;

    public z(uw1.c apmFeatureChecker, ab2.b payIdAliasValidator) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(payIdAliasValidator, "payIdAliasValidator");
        this.f317931a = apmFeatureChecker;
        this.f317932b = payIdAliasValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yy9.y
            if (r0 == 0) goto L13
            r0 = r6
            yy9.y r0 = (yy9.y) r0
            int r1 = r0.f317930x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317930x = r1
            goto L18
        L13:
            yy9.y r0 = new yy9.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317930x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
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
            r0.f317930x = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L49
            goto L97
        L49:
            ab2.b r6 = r4.f317932b
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r5 = r6.a(r5)
            if (r5 != 0) goto L52
            goto L97
        L52:
            java.lang.String r6 = r5.f61904b
            a02.a r5 = r5.f61903a
            int[] r1 = yy9.w.f317927a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            switch(r5) {
                case 1: goto L74;
                case 2: goto L6a;
                case 3: goto L67;
                case 4: goto L67;
                case 5: goto L67;
                case 6: goto L67;
                case 7: goto L67;
                default: goto L61;
            }
        L61:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L67:
            zhm.f0 r5 = zhm.f0.f322471a
            goto L7d
        L6a:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$PayIdType$Phone r5 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$PayIdType$Phone
            r5.<init>(r6)
            java.util.List r5 = zhm.u.c(r5)
            goto L7d
        L74:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$PayIdType$Email r5 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$PayIdType$Email
            r5.<init>(r6)
            java.util.List r5 = zhm.u.c(r5)
        L7d:
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L97
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r6 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.payments.send_from_clipboard.api.R$string.payments_from_clipboard_payid_send_via_payid
            r3 = 14
            r1.<init>(r2, r0, r0, r3)
            int r0 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_payid
            r6.<init>(r0, r1, r5)
            return r6
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.z.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yy9.x
            if (r0 == 0) goto L13
            r0 = r5
            yy9.x r0 = (yy9.x) r0
            int r1 = r0.f317928w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317928w = r1
            goto L1a
        L13:
            yy9.x r0 = new yy9.x
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317928w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            uw1.c r5 = r4.f317931a
            ty1.b r5 = (ty1.b) r5
            uw1.f r2 = uw1.f.PAY_ID
            ufm.c r5 = r5.f(r2)
            r0.f317928w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.z.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
