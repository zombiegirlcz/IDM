package vgc;

import ffk.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements bgc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nhc.a f288820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f288821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f288822c;

    public e(nhc.a repository, t pricingPlanInteractor, m pollingHelper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pollingHelper, "pollingHelper");
        this.f288820a = repository;
        this.f288821b = pricingPlanInteractor;
        this.f288822c = pollingHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r12 == r0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(egc.a r11, com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments.Category.LinkedPayment.Payment r12, gim.c r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof vgc.c
            if (r0 == 0) goto L14
            r0 = r13
            vgc.c r0 = (vgc.c) r0
            int r1 = r0.f288818x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f288818x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vgc.c r0 = new vgc.c
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f288818x
            nhc.a r7 = r10.f288820a
            r8 = 3
            r2 = 2
            r3 = 1
            r9 = 0
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L49
            if (r1 == r2) goto L45
            if (r1 != r8) goto L3d
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment r11 = r6.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            goto Lac
        L35:
            r0 = move-exception
            r12 = r0
            goto Lb1
        L39:
            r0 = move-exception
            r11 = r0
            goto Lbe
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L45:
            yhm.o.b(r13)
            goto L79
        L49:
            yhm.o.b(r13)
            goto L68
        L4d:
            yhm.o.b(r13)
            r6.f288818x = r3
            r13 = r7
            nhc.i r13 = (nhc.i) r13
            r13.getClass()
            nhc.h r1 = new nhc.h
            r1.<init>(r13, r11, r12, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r1, r6)
            if (r13 != r0) goto L68
            goto Lab
        L68:
            java.lang.String r13 = (java.lang.String) r13
            r6.f288818x = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 5
            vgc.m r1 = r10.f288822c
            r2 = r13
            java.lang.Object r13 = r1.a(r2, r3, r5, r6)
            if (r13 != r0) goto L79
            goto Lab
        L79:
            vgc.i r13 = (vgc.i) r13
            boolean r11 = r13 instanceof vgc.h
            if (r11 == 0) goto L82
            bgc.a r11 = bgc.a.f15174a
            return r11
        L82:
            boolean r11 = r13 instanceof vgc.g
            if (r11 == 0) goto Lbf
            vgc.g r13 = (vgc.g) r13
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment r11 = r13.f288823a
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            r6.u = r11     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            r6.f288818x = r8     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            nhc.i r7 = (nhc.i) r7     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            r7.getClass()     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            n68.x r12 = new n68.x     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            r13 = 12
            r12.<init>(r7, r9, r13)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            java.lang.Object r12 = skm.e0.J(r13, r12, r6)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            if (r12 != r0) goto La7
            goto La9
        La7:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
        La9:
            if (r12 != r0) goto Lac
        Lab:
            return r0
        Lac:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L39
            goto Lb6
        Lb1:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.o.a(r12)
        Lb6:
            bgc.b r12 = new bgc.b
            double r0 = r11.d
            r12.<init>(r0)
            return r12
        Lbe:
            throw r11
        Lbf:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vgc.e.a(egc.a, com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments$Category$LinkedPayment$Payment, gim.c):java.lang.Object");
    }

    public final vkm.d b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nhc.i iVar = (nhc.i) this.f288820a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return iVar.d.b(Unit.f186387a, loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof vgc.d
            if (r0 == 0) goto L13
            r0 = r9
            vgc.d r0 = (vgc.d) r0
            int r1 = r0.f288819w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288819w = r1
            goto L18
        L13:
            vgc.d r0 = new vgc.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288819w
            nhc.a r3 = r7.f288820a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            goto L7f
        L2d:
            r8 = move-exception
            goto L84
        L2f:
            r8 = move-exception
            goto L8c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r9)
            goto L5f
        L3d:
            yhm.o.b(r9)
            r0.f288819w = r5
            r9 = r3
            nhc.i r9 = (nhc.i) r9
            r9.getClass()
            n3j.w r2 = new n3j.w
            r5 = 28
            r2.<init>(r9, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L5c:
            if (r8 != r1) goto L5f
            goto L7e
        L5f:
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r0.f288819w = r4     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            nhc.i r3 = (nhc.i) r3     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r3.getClass()     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            n68.x r8 = new n68.x     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            r9 = 12
            r8.<init>(r3, r6, r9)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            java.lang.Object r8 = skm.e0.J(r9, r8, r0)     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            if (r8 != r1) goto L7a
            goto L7c
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
        L7c:
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d java.util.concurrent.CancellationException -> L2f
            goto L89
        L84:
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.o.a(r8)
        L89:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vgc.e.c(java.util.List, gim.c):java.lang.Object");
    }
}
