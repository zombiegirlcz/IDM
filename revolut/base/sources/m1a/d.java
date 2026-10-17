package m1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f201301a;

    public d(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f201301a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(v61.h r7, v61.i r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof m1a.b
            if (r0 == 0) goto L13
            r0 = r9
            m1a.b r0 = (m1a.b) r0
            int r1 = r0.f201298y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201298y = r1
            goto L18
        L13:
            m1a.b r0 = new m1a.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f201296w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201298y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            v61.i r7 = r0.v
            v61.h r8 = r0.u
            yhm.o.b(r9)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L52
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r9)
            if (r8 == 0) goto L84
            java.lang.String r9 = r8.f286298j
            if (r9 == 0) goto L41
            goto L42
        L41:
            r8 = r4
        L42:
            if (r8 != 0) goto L45
            goto L84
        L45:
            r0.u = r7
            r0.v = r8
            r0.f201298y = r3
            java.lang.Object r9 = r6.b(r7, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5b
            goto L84
        L5b:
            java.lang.String r9 = r7.f286288a
            java.lang.String r8 = r8.f286293a
            java.util.ArrayList r7 = r7.f286291g
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r7.next()
            v61.d r1 = (v61.d) r1
            java.lang.String r1 = r1.e
            if (r1 == 0) goto L6a
            r0.add(r1)
            goto L6a
        L7e:
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData$SplitBill r7 = new com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData$SplitBill
            r7.<init>(r9, r8, r0)
            return r7
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.d.a(v61.h, v61.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(v61.h r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m1a.c
            if (r0 == 0) goto L13
            r0 = r6
            m1a.c r0 = (m1a.c) r0
            int r1 = r0.f201300x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201300x = r1
            goto L18
        L13:
            m1a.c r0 = new m1a.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201300x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r5 = r5.d
            if (r5 != 0) goto L3b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3b:
            ang.f r6 = r4.f201301a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f201300x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            do3.n r6 = (do3.n) r6
            java.lang.String r6 = r6.f116408a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.d.b(v61.h, gim.c):java.lang.Object");
    }
}
