package bsd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthContract$InputData f18175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mzi.b f18176b;

    public j(TotalWealthContract$InputData inputData, ipd.h performanceMapper, mzi.b intervalMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(performanceMapper, "performanceMapper");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f18175a = inputData;
        this.f18176b = intervalMapper;
    }

    public static String a(yld.c cVar) {
        int i = i.f18172a[cVar.ordinal()];
        if (i == 1) {
            return "PIE_CHART_SELECTION_ID";
        }
        if (i == 2) {
            return "LINE_CHART_SELECTION_ID";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Invalid bar chart style for net worth");
    }
}
