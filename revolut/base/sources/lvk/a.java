package lvk;

import kotlin.jvm.internal.Intrinsics;
import qsk.c;
import qsk.h;
import qsk.k;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f200378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f200379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f200380c;

    public a(c balanceSheetToBarChartMapper, h cashFlowsToBarChartMapper, k incomeStatementToBarChartMapper, b stockFinancialsMapper) {
        Intrinsics.checkNotNullParameter(balanceSheetToBarChartMapper, "balanceSheetToBarChartMapper");
        Intrinsics.checkNotNullParameter(cashFlowsToBarChartMapper, "cashFlowsToBarChartMapper");
        Intrinsics.checkNotNullParameter(incomeStatementToBarChartMapper, "incomeStatementToBarChartMapper");
        Intrinsics.checkNotNullParameter(stockFinancialsMapper, "stockFinancialsMapper");
        this.f200378a = balanceSheetToBarChartMapper;
        this.f200379b = cashFlowsToBarChartMapper;
        this.f200380c = incomeStatementToBarChartMapper;
    }
}
