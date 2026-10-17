package znd;

import aw0.j4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsDetailsController f323769b;

    public /* synthetic */ k(AnalyticsDetailsController analyticsDetailsController, int i) {
        this.f323768a = i;
        this.f323769b = analyticsDetailsController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f323768a;
        ?? smallSegments = 0;
        ?? r110 = 0;
        int i2 = 1;
        AnalyticsDetailsController analyticsDetailsController = this.f323769b;
        ind.f it8 = (ind.f) obj2;
        switch (i) {
            case 0:
                AnalyticsDetailsController.Companion companion = AnalyticsDetailsController.INSTANCE;
                b bVarR2 = analyticsDetailsController.R2();
                Object obj3 = it8.f162802b;
                List list = obj3 instanceof List ? (List) obj3 : null;
                if (list != null) {
                    smallSegments = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof j4) {
                            smallSegments.add(obj4);
                        }
                    }
                }
                if (smallSegments == 0) {
                    smallSegments = zhm.f0.f322471a;
                }
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) bVarR2;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(smallSegments, "smallSegments");
                HashSet hashSet = new HashSet();
                Iterator it9 = ((Iterable) smallSegments).iterator();
                while (it9.hasNext()) {
                    hashSet.add(((j4) it9.next()).a());
                }
                bVar.H2(bVar.N, new jci.h(hashSet, 3));
                return Unit.f186387a;
            case 1:
                AnalyticsDetailsController.Companion companion2 = AnalyticsDetailsController.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!Intrinsics.f(it8.f162801a, analyticsDetailsController.f87560h0));
            default:
                if (analyticsDetailsController.f87560h0 != null) {
                    b bVarR22 = analyticsDetailsController.R2();
                    AnalyticsSpendingPeriod$Interval interval = it8.f162801a;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) bVarR22;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(interval, "interval");
                    bVar2.l2(new q0(bVar2, interval, r110 == true ? 1 : 0, i2), new yi5.b(26));
                    int i3 = it8.f162803c;
                    ipd.c cVar = analyticsDetailsController.K;
                    AnalyticsContext analyticsContextA = cVar.a(Integer.valueOf(i3), cVar.f167732b);
                    if (analyticsContextA != null) {
                        cVar.f167734g = analyticsContextA;
                        cVar.f167731a++;
                    }
                }
                analyticsDetailsController.f87560h0 = it8.f162801a;
                return Unit.f186387a;
        }
    }
}
