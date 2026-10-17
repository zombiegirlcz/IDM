package jnd;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f176707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f176708b;

    public b(LocalDate historyAvailableFrom, List snapshots) {
        Intrinsics.checkNotNullParameter(historyAvailableFrom, "historyAvailableFrom");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        this.f176707a = historyAvailableFrom;
        this.f176708b = snapshots;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r11.b() == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(lzi.j r11) {
        /*
            r10 = this;
            java.lang.String r0 = "period"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            lzi.i r0 = r11.f200980a
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r1 = r11.f200981b
            int[] r2 = jnd.a.f176706a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L89
            r2 = 2
            if (r0 == r2) goto L89
            r2 = 3
            if (r0 == r2) goto L89
            r2 = 4
            r3 = 1
            if (r0 == r2) goto L31
            r2 = 5
            if (r0 != r2) goto L2b
            long r5 = r11.b()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L89
            goto L31
        L2b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L31:
            java.time.LocalDate r0 = r1.f99211b
            java.time.LocalDate r0 = r0.plusDays(r3)
            java.time.LocalDate r2 = r10.f176707a
            int r3 = r0.compareTo(r2)
            if (r3 > 0) goto L42
            zhm.f0 r11 = zhm.f0.f322471a
            return r11
        L42:
            java.time.LocalDate r1 = r1.f99210a
            java.lang.Comparable r1 = cim.c.k(r1, r2)
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            java.util.List r2 = r10.f176708b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L57:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r2.next()
            r5 = r4
            lzi.p r5 = (lzi.p) r5
            lzi.h r6 = r5.f200997c
            lzi.i r7 = r11.f200980a
            long r8 = r11.b()
            lzi.h r6 = xam.a.n(r6, r7, r8)
            if (r6 == 0) goto L57
            java.time.LocalDate r6 = r5.f200995a
            int r6 = r6.compareTo(r0)
            if (r6 >= 0) goto L57
            java.time.LocalDate r5 = r5.f200996b
            if (r5 == 0) goto L84
            int r5 = r5.compareTo(r1)
            if (r5 <= 0) goto L57
        L84:
            r3.add(r4)
            goto L57
        L88:
            return r3
        L89:
            zhm.f0 r11 = zhm.f0.f322471a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: jnd.b.a(lzi.j):java.util.List");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f176707a, bVar.f176707a) && Intrinsics.f(this.f176708b, bVar.f176708b);
    }

    public final int hashCode() {
        return this.f176708b.hashCode() + (this.f176707a.hashCode() * 31);
    }
}
