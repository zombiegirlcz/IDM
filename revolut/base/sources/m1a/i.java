package m1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements w0a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f201313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f201314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f201315c;

    public i(o contactResolver, gte.a featureToggleInteractor, d deletionDataProvider) {
        Intrinsics.checkNotNullParameter(contactResolver, "contactResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deletionDataProvider, "deletionDataProvider");
        this.f201313a = contactResolver;
        this.f201314b = featureToggleInteractor;
        this.f201315c = deletionDataProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, java.util.List r11, com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof m1a.e
            if (r0 == 0) goto L13
            r0 = r13
            m1a.e r0 = (m1a.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m1a.e r0 = new m1a.e
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f201303x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.List r10 = r0.f201302w
            java.util.List r10 = (java.util.List) r10
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData r12 = r0.v
            java.lang.String r11 = r0.u
            yhm.o.b(r13)
            goto L59
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            yhm.o.b(r13)
            if (r11 != 0) goto L3e
            zhm.f0 r11 = zhm.f0.f322471a
        L3e:
            r0.u = r10
            r0.v = r12
            r13 = r11
            java.util.List r13 = (java.util.List) r13
            r0.f201302w = r13
            r0.z = r3
            m1a.h r13 = new m1a.h
            r2 = 0
            r13.<init>(r11, r9, r2)
            java.lang.Object r13 = skm.e0.o(r13, r0)
            if (r13 != r1) goto L56
            return r1
        L56:
            r8 = r11
            r11 = r10
            r10 = r8
        L59:
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L6c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r10.next()
            v61.g r1 = (v61.g) r1
            java.lang.String r3 = r1.f286285a
            long r4 = r1.f286286b
            java.lang.String r6 = r1.f286287c
            java.util.ArrayList r1 = r1.d
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L89:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r1.next()
            v61.f r2 = (v61.f) r2
            java.lang.Object r2 = r13.get(r2)
            com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember r2 = (com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType.SplitMember) r2
            if (r2 == 0) goto L89
            r7.add(r2)
            goto L89
        La1:
            com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem r2 = new com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem
            r2.<init>(r3, r4, r6, r7)
            r0.add(r2)
            goto L6c
        Laa:
            w0a.e r10 = new w0a.e
            r10.<init>(r11, r0, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.i.a(java.lang.String, java.util.List, com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(v61.h r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m1a.f
            if (r0 == 0) goto L13
            r0 = r9
            m1a.f r0 = (m1a.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m1a.f r0 = new m1a.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f201306x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.util.List r8 = r0.f201305w
            java.util.List r8 = (java.util.List) r8
            java.lang.String r2 = r0.v
            m1a.i r4 = r0.u
            yhm.o.b(r9)
            goto L7f
        L3f:
            yhm.o.b(r9)
            com.revolut.feature.payments.api.PaymentsToggles$ScanBill r9 = com.revolut.feature.payments.api.PaymentsToggles$ScanBill.f79163c
            gte.a r2 = r7.f201314b
            jte.d r2 = (jte.d) r2
            boolean r9 = r2.c(r9)
            if (r9 != 0) goto L58
            w0a.d r8 = w0a.e.Companion
            r8.getClass()
            w0a.e r8 = w0a.d.a()
            return r8
        L58:
            java.util.ArrayList r9 = r8.f
            java.lang.Object r9 = zhm.d0.d0(r9)
            v61.i r9 = (v61.i) r9
            if (r9 == 0) goto L65
            java.lang.String r2 = r9.f286298j
            goto L66
        L65:
            r2 = r5
        L66:
            if (r9 == 0) goto L6b
            java.util.ArrayList r6 = r9.f286296g
            goto L6c
        L6b:
            r6 = r5
        L6c:
            r0.u = r7
            r0.v = r2
            r0.f201305w = r6
            r0.z = r4
            m1a.d r4 = r7.f201315c
            java.lang.Object r9 = r4.a(r8, r9, r0)
            if (r9 != r1) goto L7d
            goto L8f
        L7d:
            r4 = r7
            r8 = r6
        L7f:
            com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData r9 = (com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData) r9
            r0.u = r5
            r0.v = r5
            r0.f201305w = r5
            r0.z = r3
            java.lang.Object r8 = r4.a(r2, r8, r9, r0)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.i.b(v61.h, gim.c):java.lang.Object");
    }
}
