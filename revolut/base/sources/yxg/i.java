package yxg;

import cli.y;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.totalvalue.sector.ComplexAnalyticsSectorAllocationControllerContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import jel.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import oxg.q;
import xxg.m;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements d {
    public final ComplexAnalyticsSectorAllocationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f317693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f317694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317695r;

    public i(g stateMapper, ComplexAnalyticsSectorAllocationControllerContract$InputData inputData, m allocationProvider, q destinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(allocationProvider, "allocationProvider");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        this.o = inputData;
        this.f317693p = allocationProvider;
        this.f317694q = destinationProvider;
        this.f317695r = mra.d.b(this, new e(inputData.f95037a, inputData.f95038b, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        ComplexAnalyticsSectorAllocationControllerContract$InputData complexAnalyticsSectorAllocationControllerContract$InputData = this.o;
        WidgetisedAnalyticsType analyticsType = complexAnalyticsSectorAllocationControllerContract$InputData.f95038b;
        a3 sector = complexAnalyticsSectorAllocationControllerContract$InputData.f95037a;
        m mVar = this.f317693p;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        iwg.a aVarC = mVar.f309525c.c(analyticsType);
        l lVar = mVar.f309524b;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Continuation continuation = null;
        yji.l.b1(this, xam.a.h(new wo2.l(aVarC, mVar, continuation, 18), rd0.e.b(lVar.e(analyticsType, new a0i.a(lVar, 28, sector, analyticsType)))), null, new yk6.m(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317695r;
    }
}
