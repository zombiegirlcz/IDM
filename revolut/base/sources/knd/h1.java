package knd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f186087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f186088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoroutineScope f186089c;
    public ukm.j0 d;
    public ukm.j0 e;
    public final j2 f;

    public h1(LocalDate startDate, List initialIntervals) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(initialIntervals, "initialIntervals");
        this.f186087a = startDate;
        List list = initialIntervals;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new m1((AnalyticsSpendingPeriod$Interval) it8.next(), new Data(null, null, false, 2, null)));
        }
        this.f = vkm.q.c(arrayList);
    }

    public static final Map a(h1 h1Var, ukm.b bVar, kotlin.ranges.c cVar, ukm.j0 j0Var, boolean z) {
        if (cVar.isEmpty()) {
            return zhm.r0.g();
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(cVar, 10));
        Iterator<Integer> it8 = cVar.iterator();
        while (it8.hasNext()) {
            arrayList.add((m1) ((List) h1Var.f.getValue()).get(((zhm.l0) it8).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            m1 m1Var = (m1) obj2;
            if (h1Var.f186087a.compareTo((ChronoLocalDate) m1Var.f186113a.f99211b) <= 0 && (z || m1Var.f186114b.getContent() == null)) {
                arrayList2.add(obj2);
            }
        }
        int iB = zhm.q0.b(zhm.w.t(arrayList2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = ((m1) it9.next()).f186113a;
            h1 h1Var2 = h1Var;
            linkedHashMap.put(analyticsSpendingPeriod$Interval, skm.e0.C(bVar, null, null, new km2.n(h1Var2, j0Var, analyticsSpendingPeriod$Interval, (Continuation) null, 1), 3));
            h1Var = h1Var2;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006d -> B:31:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:30:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(knd.h1 r8, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r9, int r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof knd.g1
            if (r0 == 0) goto L13
            r0 = r11
            knd.g1 r0 = (knd.g1) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            knd.g1 r0 = new knd.g1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f186081y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r9 = r0.f186080x
            int r10 = r0.f186079w
            knd.m1 r2 = r0.v
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r4 = r0.u
            yhm.o.b(r11)
            goto L82
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r11)
            r11 = 0
        L3b:
            vkm.j2 r2 = r8.f
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L47:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r2.next()
            r5 = r4
            knd.m1 r5 = (knd.m1) r5
            java.time.LocalDate r6 = r8.f186087a
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r7 = r5.f186113a
            java.time.LocalDate r7 = r7.f99211b
            int r6 = r6.compareTo(r7)
            if (r6 > 0) goto L47
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r5 = r5.f186113a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r9)
            if (r5 == 0) goto L47
            goto L6a
        L69:
            r4 = 0
        L6a:
            r2 = r4
            knd.m1 r2 = (knd.m1) r2
            if (r11 <= 0) goto L84
            r0.u = r9
            r0.v = r2
            r0.f186079w = r10
            r0.f186080x = r11
            r0.A = r3
            java.lang.Object r4 = do3.q.J(r0)
            if (r4 != r1) goto L80
            return r1
        L80:
            r4 = r9
            r9 = r11
        L82:
            r11 = r9
            r9 = r4
        L84:
            int r11 = r11 + r3
            if (r2 != 0) goto L89
            if (r11 <= r10) goto L3b
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: knd.h1.b(knd.h1, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, int, gim.c):java.lang.Object");
    }

    public final Object c(CoroutineScope coroutineScope, ukm.j0 j0Var, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, int i, gim.i frame) {
        skm.h1 h1Var = new skm.h1(skm.e0.t(coroutineScope.getCoroutineContext()));
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        t tVar = this.f186088b;
        Continuation continuation = null;
        if (tVar == null) {
            Intrinsics.r("onIntervalDataLoad");
            throw null;
        }
        vkm.q.G(new vkm.t(vkm.q.P(rd0.e.e(new vkm.v(new vkm.q0(new vkm.y(new h0(this, j0Var, analyticsSpendingPeriod$Interval, continuation, 2), (Flow) tVar.invoke(analyticsSpendingPeriod$Interval)), new a41.j1(analyticsSpendingPeriod$Interval, j0Var, this, lVar, h1Var, (Continuation) null, 19), 1), new im9.h(this, lVar, h1Var, continuation, 20)), zhm.h0.f322473a, new j40.d(this, lVar, h1Var, null)), i), new k3c.k(i, h1Var, (Continuation) null)), skm.e0.c(coroutineScope.getCoroutineContext().plus(h1Var)));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }
}
