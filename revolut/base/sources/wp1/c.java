package wp1;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.c f299007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f299008b;

    public c(vo1.c billsFeatureChecker, f userInteractor) {
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f299007a = billsFeatureChecker;
        this.f299008b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof wp1.b
            if (r0 == 0) goto L13
            r0 = r8
            wp1.b r0 = (wp1.b) r0
            int r1 = r0.f299006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299006x = r1
            goto L18
        L13:
            wp1.b r0 = new wp1.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299006x
            java.lang.String r3 = "await(...)"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            wp1.c r0 = r0.u
            yhm.o.b(r8)
            goto L6d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            goto L4f
        L3b:
            yhm.o.b(r8)
            vo1.c r8 = r7.f299007a
            fp1.d r8 = (fp1.d) r8
            ufm.i r8 = r8.d()
            r0.f299006x = r5
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L4f
            goto L6b
        L4f:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L94
            ang.f r8 = r7.f299008b
            r2 = 0
            efm.d0 r8 = r8.f(r2)
            r0.u = r7
            r0.f299006x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r7
        L6d:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            do3.n r8 = (do3.n) r8
            wi0.b r8 = do3.q.y(r8)
            r0.getClass()
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.Y1
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L89
            xo1.g r8 = xo1.g.TAPI
            goto L95
        L89:
            wi0.b r0 = wi0.b.O
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L94
            xo1.g r8 = xo1.g.TAPI_CO
            goto L95
        L94:
            r8 = r6
        L95:
            if (r8 != 0) goto L98
            return r6
        L98:
            com.revolut.feature.pay_bills_taxes.api.navigation.PhoneTopUpsDestination r0 = new com.revolut.feature.pay_bills_taxes.api.navigation.PhoneTopUpsDestination
            com.revolut.feature.pay_bills_taxes.api.navigation.PhoneTopUpsNavigation$InputData r1 = new com.revolut.feature.pay_bills_taxes.api.navigation.PhoneTopUpsNavigation$InputData
            r1.<init>(r8, r6)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wp1.c.a(gim.c):java.lang.Object");
    }
}
