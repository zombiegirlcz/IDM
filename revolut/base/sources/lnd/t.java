package lnd;

import aw0.d5;
import aw0.x1;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.hd0;
import ip0.yi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f197202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f197203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f197204c;
    public final l80.e d;
    public final p0 e;
    public final gte.a f;

    public t(h0 pieChartMapper, d barChartMapper, f0 lineChartMapper, l80.e dateProvider, p0 categoryGroupMapper, knd.o0 screenTypeInfoProvider, z analyticsInlineTransactionMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pieChartMapper, "pieChartMapper");
        Intrinsics.checkNotNullParameter(barChartMapper, "barChartMapper");
        Intrinsics.checkNotNullParameter(lineChartMapper, "lineChartMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(screenTypeInfoProvider, "screenTypeInfoProvider");
        Intrinsics.checkNotNullParameter(analyticsInlineTransactionMapper, "analyticsInlineTransactionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f197202a = pieChartMapper;
        this.f197203b = barChartMapper;
        this.f197204c = lineChartMapper;
        this.d = dateProvider;
        this.e = categoryGroupMapper;
        this.f = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.ga a(int r28, com.revolut.retail.feature.api.AnalyticsAccountsSelection r29, yld.d r30, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r31, yld.c r32) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnd.t.a(int, com.revolut.retail.feature.api.AnalyticsAccountsSelection, yld.d, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, yld.c):ip0.ga");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i b(int r45, ind.c r46, ind.e r47, yld.c r48, com.revolut.retail.feature.api.AnalyticsAccountsSelection r49, yld.d r50, ind.y r51, lzi.i r52, java.util.List r53, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r54, int r55, dj0.d r56, dj0.d r57, java.lang.String r58, com.revolut.feature.spending_analytics.api.models.GroupingExtraData r59, java.lang.String r60, com.revolut.core.ui_kit.models.Clause r61, jnd.d r62) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lnd.t.b(int, ind.c, ind.e, yld.c, com.revolut.retail.feature.api.AnalyticsAccountsSelection, yld.d, ind.y, lzi.i, java.util.List, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, int, dj0.d, dj0.d, java.lang.String, com.revolut.feature.spending_analytics.api.models.GroupingExtraData, java.lang.String, com.revolut.core.ui_kit.models.Clause, jnd.d):qv0.i");
    }

    public final qv0.i c(int i, ind.d dVar, yld.c analyticsChartStyle, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsChartStyle, "analyticsChartStyle");
        int i2 = s.f197199a[analyticsChartStyle.ordinal()];
        if (i2 == 1) {
            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = dVar != null ? dVar.f162798a : null;
            return new hd0(String.valueOf(i), analyticsSpendingPeriod$Interval != null ? new ind.f(analyticsSpendingPeriod$Interval, null, i) : null, 2);
        }
        gte.a aVar = this.f;
        if (i2 != 2) {
            if (i2 == 3) {
                return f0.j(i, dVar != null ? dVar.f162798a : null, !((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? x1.REGULAR : z ? x1.TALL : x1.MATCH_PARENT);
            }
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = dVar != null ? dVar.f162798a : null;
        d5 heightMode = !((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c) ? d5.REGULAR : z ? d5.TALL : d5.MATCH_PARENT;
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        return new yi(String.valueOf(i), analyticsSpendingPeriod$Interval2 != null ? new ind.f(analyticsSpendingPeriod$Interval2, null, i) : null, heightMode);
    }
}
