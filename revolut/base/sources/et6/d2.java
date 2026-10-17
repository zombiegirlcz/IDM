package et6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements gr6.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f129211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f129212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt6.h f129213c;
    public final com.revolut.domain.interactors.transactions.a d;

    public d2(gr6.e freelancerAvailabilityInteractor, p1 invoiceInteractor, gt6.h timelineMapper, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(timelineMapper, "timelineMapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f129211a = freelancerAvailabilityInteractor;
        this.f129212b = invoiceInteractor;
        this.f129213c = timelineMapper;
        this.d = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.freelancer.common.models.orders.FreelancerOrderInvoiceDetails r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.z1
            if (r0 == 0) goto L13
            r0 = r6
            et6.z1 r0 = (et6.z1) r0
            int r1 = r0.f129391w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129391w = r1
            goto L18
        L13:
            et6.z1 r0 = new et6.z1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129391w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f73450a
            r6 = 0
            et6.p1 r2 = r4.f129212b
            efm.r r5 = r2.d(r5, r6)
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            r0.f129391w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r6 = (com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice) r6
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails r5 = r6.f73383p
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.d2.a(com.revolut.feature.freelancer.common.models.orders.FreelancerOrderInvoiceDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.freelancer.common.models.FreelancerOrder r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof et6.a2
            if (r0 == 0) goto L13
            r0 = r14
            et6.a2 r0 = (et6.a2) r0
            int r1 = r0.f129190w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129190w = r1
            goto L18
        L13:
            et6.a2 r0 = new et6.a2
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129190w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L99
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            java.util.List r14 = r13.f73299q
            java.util.Collection r14 = (java.util.Collection) r14
            if (r14 == 0) goto L9f
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L3f
            goto L9f
        L3f:
            java.util.List r13 = r13.f73299q
            if (r13 == 0) goto L66
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r13, r2)
            r14.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L54:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r13.next()
            com.revolut.feature.freelancer.common.models.FreelancerOrderTransaction r2 = (com.revolut.feature.freelancer.common.models.FreelancerOrderTransaction) r2
            java.lang.String r2 = r2.f73312a
            r14.add(r2)
            goto L54
        L66:
            r14 = 0
        L67:
            if (r14 != 0) goto L6b
            zhm.f0 r14 = zhm.f0.f322471a
        L6b:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Set r13 = zhm.d0.i1(r14)
            tof.s9 r14 = new tof.s9
            r14.<init>(r13)
            tof.i7$c r13 = tof.i7.Companion
            tof.i7[] r2 = new tof.i7[r3]
            r4 = 0
            r2[r4] = r14
            r13.getClass()
            tof.oa r6 = tof.i7.c.b(r2)
            r10 = 0
            r11 = 30
            com.revolut.domain.interactors.transactions.a r5 = r12.d
            r7 = 0
            r8 = 0
            r9 = 0
            ufm.i r13 = com.revolut.domain.interactors.transactions.a.b(r5, r6, r7, r8, r9, r10, r11)
            r0.f129190w = r3
            java.lang.Object r14 = nim.a.b(r13, r0)
            if (r14 != r1) goto L99
            return r1
        L99:
            java.lang.String r13 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r13)
            return r14
        L9f:
            zhm.f0 r13 = zhm.f0.f322471a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.d2.b(com.revolut.feature.freelancer.common.models.FreelancerOrder, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.time.ZonedDateTime] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.freelancer.common.models.FreelancerOrder r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.d2.c(com.revolut.feature.freelancer.common.models.FreelancerOrder, gim.c):java.lang.Object");
    }
}
