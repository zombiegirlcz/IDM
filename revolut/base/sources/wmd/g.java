package wmd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f298646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnalyticsSpendingPeriod$Interval f298647c;

    public /* synthetic */ g(LocalDate localDate, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, int i) {
        this.f298645a = i;
        this.f298646b = localDate;
        this.f298647c = analyticsSpendingPeriod$Interval;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f298645a
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            java.time.LocalDate r6 = (java.time.LocalDate) r6
            java.lang.String r0 = "date"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.time.LocalDate r0 = r5.f298646b
            boolean r0 = r6.isAfter(r0)
            if (r0 == 0) goto L28
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r0 = r5.f298647c
            java.time.LocalDate r1 = r0.f99210a
            java.time.LocalDate r0 = r0.f99211b
            int r0 = r6.compareTo(r0)
            if (r0 > 0) goto L28
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L2e:
            yld.h r6 = (yld.h) r6
            java.lang.String r0 = "schedule"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List r0 = r6.f314697b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            lim.q r0 = zhm.d0.Q(r0)
            wl3.d r1 = new wl3.d
            r2 = 20
            r1.<init>(r2)
            nkm.d0 r0 = nkm.y.x(r0, r1)
            wmd.g r1 = new wmd.g
            r2 = 1
            java.time.LocalDate r3 = r5.f298646b
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r4 = r5.f298647c
            r1.<init>(r3, r4, r2)
            nkm.h r0 = nkm.y.n(r0, r1)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            nkm.m r1 = new nkm.m
            r1.<init>(r0, r2)
            java.util.List r0 = nkm.y.J(r1)
            java.lang.Object r1 = zhm.d0.d0(r0)
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            if (r1 == 0) goto L78
            wmd.h r2 = new wmd.h
            qua.p r6 = r6.f314696a
            int r0 = r0.size()
            r2.<init>(r6, r0, r1)
            goto L79
        L78:
            r2 = 0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wmd.g.invoke(java.lang.Object):java.lang.Object");
    }
}
