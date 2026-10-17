package eqj;

import jqj.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lzi.i;
import lzi.j;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f128475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f128476b;

    public d(h repository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f128475a = repository;
        this.f128476b = dateProvider;
    }

    public static vkm.d d(d dVar) {
        return dVar.f128475a.e.c(Unit.f186387a, false);
    }

    public static vkm.d e(d dVar) {
        return dVar.f128475a.f.c(Unit.f186387a, false);
    }

    public final j a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        h hVar = this.f128475a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return (j) v1.c.s("KEY_CUSTOM_PERIOD_", key, hVar.f177737b);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lzi.j r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eqj.a
            if (r0 == 0) goto L13
            r0 = r6
            eqj.a r0 = (eqj.a) r0
            int r1 = r0.f128470w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128470w = r1
            goto L18
        L13:
            eqj.a r0 = new eqj.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128470w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            if (r5 != 0) goto L40
            r0.f128470w = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            r5 = r6
            lzi.j r5 = (lzi.j) r5
        L40:
            if (r5 == 0) goto L5c
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r6 = new com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r5 = r5.f200981b
            java.time.LocalDate r0 = r5.f99210a
            java.time.LocalDate r5 = r5.f99211b
            l80.e r1 = r4.f128476b
            l80.f r1 = (l80.f) r1
            java.time.LocalDate r1 = r1.e()
            java.lang.Comparable r5 = kotlin.ranges.f.d(r5, r1)
            java.time.LocalDate r5 = (java.time.LocalDate) r5
            r6.<init>(r0, r5)
            return r6
        L5c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eqj.d.b(lzi.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof eqj.b
            if (r0 == 0) goto L13
            r0 = r8
            eqj.b r0 = (eqj.b) r0
            int r1 = r0.f128471w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128471w = r1
            goto L18
        L13:
            eqj.b r0 = new eqj.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128471w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L4f
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            jqj.h r8 = r7.f128475a
            x4l.c r8 = r8.f
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r5 = 0
            vkm.d r8 = r8.c(r2, r5)
            d4f.m r2 = new d4f.m
            r5 = 2
            r6 = 11
            r2.<init>(r5, r6, r3)
            r0.f128471w = r4
            java.lang.Object r8 = vkm.q.A(r8, r2, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r8.getContent()
            lzi.j r8 = (lzi.j) r8
            return r8
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eqj.d.c(gim.c):java.lang.Object");
    }

    public final void f(String key, j jVar) {
        Intrinsics.checkNotNullParameter(key, "key");
        ne0.d dVar = this.f128475a.f177737b;
        String strT = a10.b.t(key, "key", "KEY_CUSTOM_PERIOD_", key);
        if (jVar == null || jVar.f200980a != i.CUSTOM) {
            dVar.remove(strT);
        } else {
            dVar.f(strT, jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r6.a(r10, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(lzi.h r10, boolean r11, boolean r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof eqj.c
            if (r0 == 0) goto L13
            r0 = r13
            eqj.c r0 = (eqj.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            eqj.c r0 = new eqj.c
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f128473x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 0
            r4 = 2
            r5 = 1
            jqj.h r6 = r9.f128475a
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r13)
            goto L8a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            boolean r12 = r0.f128472w
            boolean r11 = r0.v
            lzi.h r10 = r0.u
            yhm.o.b(r13)
            goto L79
        L3f:
            yhm.o.b(r13)
            r6.getClass()
            x4l.c r13 = r6.e
            java.lang.String r2 = "analyticsSpendingCycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r13.g(r2, r10)
            jpl.e r7 = new jpl.e
            r8 = 8
            r7.<init>(r8)
            x4l.c.a(r13, r7)
            if (r12 == 0) goto L79
            r0.u = r10
            r0.v = r11
            r0.f128472w = r12
            r0.z = r5
            x4l.c r13 = r6.f
            kzi.a r5 = r6.d
            gqj.c r5 = (gqj.c) r5
            lzi.j r5 = r5.d(r3, r10)
            java.lang.Object r13 = r13.f(r2, r5, r0)
            if (r13 != r1) goto L76
            r2 = r13
        L76:
            if (r2 != r1) goto L79
            goto L89
        L79:
            if (r11 != 0) goto L8d
            r0.u = r3
            r0.v = r11
            r0.f128472w = r12
            r0.z = r4
            java.lang.Object r10 = r6.a(r10, r0)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: eqj.d.g(lzi.h, boolean, boolean, gim.c):java.lang.Object");
    }

    public final void h(j analyticsSpendingPeriod) {
        Intrinsics.checkNotNullParameter(analyticsSpendingPeriod, "analyticsSpendingPeriod");
        this.f128475a.b(analyticsSpendingPeriod);
    }
}
