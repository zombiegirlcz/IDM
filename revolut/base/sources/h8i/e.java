package h8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh5.d f150055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f150056b;

    public e(sh5.d cryptoFcaDisclaimerProvider, c bottomDisclaimerDelegate) {
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerProvider, "cryptoFcaDisclaimerProvider");
        Intrinsics.checkNotNullParameter(bottomDisclaimerDelegate, "bottomDisclaimerDelegate");
        this.f150055a = cryptoFcaDisclaimerProvider;
        this.f150056b = bottomDisclaimerDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r9, com.revolut.feature_move_money.api.model.AccountWrapper r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof h8i.d
            if (r0 == 0) goto L13
            r0 = r11
            h8i.d r0 = (h8i.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            h8i.d r0 = new h8i.d
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f150053x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            sh5.c r9 = r0.f150052w
            yhm.o.b(r11)
            goto L9b
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            sh5.c r9 = r0.f150052w
            xi0.b r9 = (xi0.b) r9
            com.revolut.feature_move_money.api.model.AccountWrapper r10 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = r0.u
            yhm.o.b(r11)
            goto L7a
        L42:
            yhm.o.b(r11)
            dj0.d r11 = r9.getBalance()
            xi0.b r11 = r11.f115083b
            dj0.d r2 = r10.getBalance()
            xi0.b r2 = r2.f115083b
            boolean r6 = cp5.d.z(r2)
            if (r6 == 0) goto L59
            r11 = r2
            goto L61
        L59:
            boolean r2 = cp5.d.z(r11)
            if (r2 == 0) goto L60
            goto L61
        L60:
            r11 = r5
        L61:
            if (r11 == 0) goto L81
            sh5.d r2 = r8.f150055a
            gi5.d r2 = (gi5.d) r2
            efm.d0 r11 = r2.c(r11)
            r0.u = r9
            r0.v = r10
            r0.f150052w = r5
            r0.z = r4
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L7a
            goto L9a
        L7a:
            sh5.c r11 = (sh5.c) r11
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
            goto L84
        L81:
            r11 = r10
            r10 = r9
            r9 = r5
        L84:
            if (r9 == 0) goto L89
            boolean r2 = r9.f263437c
            goto L8a
        L89:
            r2 = 0
        L8a:
            r0.u = r5
            r0.v = r5
            r0.f150052w = r9
            r0.z = r3
            h8i.c r3 = r8.f150056b
            java.lang.Object r11 = r3.a(r10, r11, r2, r0)
            if (r11 != r1) goto L9b
        L9a:
            return r1
        L9b:
            java.util.List r11 = (java.util.List) r11
            if (r9 != 0) goto La6
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto La6
            return r5
        La6:
            if (r9 == 0) goto Lba
            boolean r10 = r9.f263437c
            if (r10 == 0) goto Lba
            x5i.g r10 = new x5i.g
            kotlin.Lazy r9 = r9.d
            java.lang.Object r9 = r9.getValue()
            com.revolut.core.ui_kit.models.Clause r9 = (com.revolut.core.ui_kit.models.Clause) r9
            r10.<init>(r9, r11)
            return r10
        Lba:
            x5i.f r9 = new x5i.f
            r9.<init>(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h8i.e.a(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }
}
