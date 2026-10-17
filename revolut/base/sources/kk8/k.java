package kk8;

import a0e.w;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk8.d f184515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f184516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f184517c;
    public final ang.f d;
    public final w e;
    public final fk3.a f;

    public k(gk8.d repository, xoj.a featuresInteractor, t pricingPlanInteractor, ang.f userInteractor, w userAgeCalculator, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userAgeCalculator, "userAgeCalculator");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f184515a = repository;
        this.f184516b = featuresInteractor;
        this.f184517c = pricingPlanInteractor;
        this.d = userInteractor;
        this.e = userAgeCalculator;
        this.f = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kk8.g
            if (r0 == 0) goto L13
            r0 = r5
            kk8.g r0 = (kk8.g) r0
            int r1 = r0.f184507w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184507w = r1
            goto L18
        L13:
            kk8.g r0 = new kk8.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184507w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ffk.t r5 = r4.f184517c
            ufm.n r5 = r5.k()
            r0.f184507w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kk8.k.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kk8.h
            if (r0 == 0) goto L13
            r0 = r5
            kk8.h r0 = (kk8.h) r0
            int r1 = r0.f184509x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184509x = r1
            goto L18
        L13:
            kk8.h r0 = new kk8.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184509x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a0e.w r0 = r0.u
            yhm.o.b(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ang.f r5 = r4.d
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            a0e.w r2 = r4.e
            r0.u = r2
            r0.f184509x = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r2
        L49:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            do3.n r5 = (do3.n) r5
            r0.getClass()
            java.lang.String r1 = "user"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            org.joda.time.LocalDate r5 = r5.f116413j
            if (r5 == 0) goto L83
            int r1 = r5.getYear()
            int r2 = r5.getMonthOfYear()
            int r5 = r5.getDayOfMonth()
            java.time.LocalDate r5 = java.time.LocalDate.of(r1, r2, r5)
            if (r5 == 0) goto L83
            l80.e r0 = r0.f375a
            l80.f r0 = (l80.f) r0
            java.time.LocalDate r0 = r0.e()
            java.time.Period r5 = java.time.Period.between(r5, r0)
            int r5 = r5.getYears()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L83:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kk8.k.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.util.Map r7, kk8.p r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk8.k.c(java.util.Map, kk8.p, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:24:0x0098). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kk8.j
            if (r0 == 0) goto L13
            r0 = r13
            kk8.j r0 = (kk8.j) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            kk8.j r0 = new kk8.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.B
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            int r12 = r0.A
            int r2 = r0.z
            int r4 = r0.f184514y
            java.util.Map r5 = r0.f184513x
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r6 = r0.f184512w
            java.util.Map r7 = r0.v
            java.util.Map r7 = (java.util.Map) r7
            java.util.Map r8 = r0.u
            java.util.Map r8 = (java.util.Map) r8
            yhm.o.b(r13)
            r10 = r6
            r6 = r12
            r12 = r8
            r8 = r10
            goto L98
        L3f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L47:
            yhm.o.b(r13)
            kotlin.enums.EnumEntries r13 = kk8.p.a()
            r2 = 10
            int r2 = zhm.w.t(r13, r2)
            int r2 = zhm.q0.b(r2)
            r4 = 16
            if (r2 >= r4) goto L5d
            r2 = r4
        L5d:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
            r5 = 0
            r6 = r13
            r13 = r4
            r4 = r5
        L6a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La5
            java.lang.Object r7 = r6.next()
            kk8.p r7 = (kk8.p) r7
            r8 = r12
            java.util.Map r8 = (java.util.Map) r8
            r0.u = r8
            r8 = r13
            java.util.Map r8 = (java.util.Map) r8
            r0.v = r8
            r0.f184512w = r6
            r0.f184513x = r8
            r0.f184514y = r4
            r0.z = r2
            r0.A = r5
            r0.D = r3
            java.io.Serializable r7 = r11.c(r12, r7, r0)
            if (r7 != r1) goto L93
            return r1
        L93:
            r8 = r6
            r6 = r5
            r5 = r13
            r13 = r7
            r7 = r5
        L98:
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r9 = r13.f186385a
            java.lang.Object r13 = r13.f186386b
            r5.put(r9, r13)
            r5 = r6
            r13 = r7
            r6 = r8
            goto L6a
        La5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kk8.k.d(java.util.Map, gim.c):java.lang.Object");
    }
}
