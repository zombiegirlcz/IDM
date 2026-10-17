package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mri.w f171558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sp3.a f171559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ang.f f171560n;
    public final xq3.j o;

    public s(mri.w revolutJobInteractor, sp3.a dataMonitoringFacade, ang.f userInteractor, xq3.j creditApplicationLifecycleInteractor) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(dataMonitoringFacade, "dataMonitoringFacade");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        this.f171558l = revolutJobInteractor;
        this.f171559m = dataMonitoringFacade;
        this.f171560n = userInteractor;
        this.o = creditApplicationLifecycleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r14 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(ft3.d1 r10, java.lang.String r11, com.revolut.feature.credit.application.api.models.IntendedPricingPlan r12, ft3.a1 r13, gim.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof j54.q
            if (r0 == 0) goto L14
            r0 = r14
            j54.q r0 = (j54.q) r0
            int r1 = r0.f171545x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f171545x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            j54.q r0 = new j54.q
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f171545x
            r7 = 3
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            r10 = 2
            if (r1 == r10) goto L39
            if (r1 != r7) goto L31
            it3.b r10 = r6.u
            yhm.o.b(r14)
            goto L93
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            yhm.o.b(r14)
            wi0.b r14 = (wi0.b) r14
            java.lang.String r10 = "applicationId"
            r11 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            java.lang.String r10 = "workflowId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            java.lang.String r10 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r10)
            throw r11
        L4f:
            yhm.o.b(r14)
            goto L65
        L53:
            yhm.o.b(r14)
            r6.f171545x = r8
            xq3.j r1 = r9.o
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.c(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L65
            goto L92
        L65:
            r10 = r14
            it3.c r10 = (it3.c) r10
            boolean r11 = r10 instanceof it3.b
            if (r11 == 0) goto Lab
            java.lang.String r11 = "<this>"
            mri.w r12 = r9.f171558l
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r11)
            r11 = 0
            nzl.a r12 = (nzl.a) r12
            r12.c(r11, r8)
            sp3.a r11 = r9.f171559m
            qq3.g r11 = (qq3.g) r11
            qq3.h r11 = r11.f248469a
            qq3.i r11 = (qq3.i) r11
            zhm.h0 r12 = zhm.h0.f322473a
            r11.f248473b = r12
            r11 = r10
            it3.b r11 = (it3.b) r11
            r6.u = r11
            r6.f171545x = r7
            java.lang.Object r14 = r9.b3(r6)
            if (r14 != r0) goto L93
        L92:
            return r0
        L93:
            wi0.b r14 = (wi0.b) r14
            it3.b r10 = (it3.b) r10
            it3.d r10 = r10.f168322a
            java.lang.String r11 = r10.f168331n
            if (r11 == 0) goto La5
            j54.b r12 = new j54.b
            java.lang.String r10 = r10.f168323a
            r12.<init>(r10, r11, r14)
            return r12
        La5:
            j54.a r11 = new j54.a
            r11.<init>(r10)
            return r11
        Lab:
            boolean r11 = r10 instanceof it3.a
            if (r11 == 0) goto Lb9
            j54.c r11 = new j54.c
            it3.a r10 = (it3.a) r10
            it3.i r10 = r10.f168321a
            r11.<init>(r10)
            return r11
        Lb9:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.s.Z2(ft3.d1, java.lang.String, com.revolut.feature.credit.application.api.models.IntendedPricingPlan, ft3.a1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j54.r
            if (r0 == 0) goto L13
            r0 = r7
            j54.r r0 = (j54.r) r0
            int r1 = r0.f171549w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171549w = r1
            goto L18
        L13:
            j54.r r0 = new j54.r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171549w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r6.f171560n
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            j3f.d r2 = new j3f.d
            r4 = 14
            r2.<init>(r4)
            j4e.c r4 = new j4e.c
            r5 = 3
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f171549w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j54.s.b3(gim.c):java.lang.Object");
    }
}
