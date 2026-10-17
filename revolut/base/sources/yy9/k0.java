package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317905a;

    public k0(uw1.c apmFeatureChecker, ze2.a upiAliasValidator) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(upiAliasValidator, "upiAliasValidator");
        this.f317905a = apmFeatureChecker;
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
            boolean r0 = r6 instanceof yy9.j0
            if (r0 == 0) goto L13
            r0 = r6
            yy9.j0 r0 = (yy9.j0) r0
            int r1 = r0.f317902x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317902x = r1
            goto L18
        L13:
            yy9.j0 r0 = new yy9.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317902x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f317902x = r3
            uw1.c r6 = r4.f317905a
            ty1.b r6 = (ty1.b) r6
            uw1.f r0 = uw1.f.UPI
            boolean r6 = r6.b(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L53
            goto L7f
        L53:
            java.lang.String r6 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            kotlin.text.Regex r6 = yg2.a.f313500a
            boolean r6 = r6.f(r5)
            if (r6 == 0) goto L68
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r6 = new com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias
            a02.a r1 = a02.a.UPI_ID
            r6.<init>(r1, r5, r0)
            goto L69
        L68:
            r6 = r0
        L69:
            if (r6 != 0) goto L6c
            goto L7f
        L6c:
            a02.a r5 = r6.f61903a
            int[] r1 = yy9.i0.f317899a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            switch(r5) {
                case 1: goto L80;
                case 2: goto L7f;
                case 3: goto L7f;
                case 4: goto L7f;
                case 5: goto L7f;
                case 6: goto L7f;
                case 7: goto L7f;
                default: goto L79;
            }
        L79:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L7f:
            return r0
        L80:
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption r5 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$UpiType$UpiId r1 = new com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType$UpiType$UpiId
            java.lang.String r6 = r6.f61904b
            r1.<init>(r6)
            java.util.List r6 = zhm.u.c(r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.payments.send_from_clipboard.api.R$string.payments_from_clipboard_upi_send_via_upi
            r3 = 14
            r1.<init>(r2, r0, r0, r3)
            int r0 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_upi
            r5.<init>(r0, r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.k0.a(java.lang.String, gim.c):java.lang.Object");
    }
}
