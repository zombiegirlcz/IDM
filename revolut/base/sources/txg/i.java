package txg;

import cli.y;
import com.revolut.feature.wealth.analytics.ui.complex_analytics.v2.screen.performance.sector.ComplexAnalyticsSectorContributorControllerContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import jel.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kwg.l;
import oxg.q;
import sxg.k;
import tna.p;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends oki.h implements d {
    public final ComplexAnalyticsSectorContributorControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f275428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f275429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f275430r;

    public i(g stateMapper, ComplexAnalyticsSectorContributorControllerContract$InputData inputData, k contributionProvider, q destinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contributionProvider, "contributionProvider");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        this.o = inputData;
        this.f275428p = contributionProvider;
        this.f275429q = destinationProvider;
        this.f275430r = mra.d.b(this, new e(inputData.f95034a, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow flowH;
        ComplexAnalyticsSectorContributorControllerContract$InputData complexAnalyticsSectorContributorControllerContract$InputData = this.o;
        WidgetisedAnalyticsType analyticsType = complexAnalyticsSectorContributorControllerContract$InputData.d;
        eel.c timeSpan = complexAnalyticsSectorContributorControllerContract$InputData.f95035b;
        iwg.c method = complexAnalyticsSectorContributorControllerContract$InputData.f95036c;
        a3 sector = ((e) ((j2) this.f275430r.f22677a).getValue()).f275420a;
        k kVar = this.f275428p;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Continuation continuation = null;
        if (d0.T(k.d, o0.f186429a.b(analyticsType.getClass()))) {
            flowH = vkm.i.f290039a;
        } else {
            iwg.a aVarC = kVar.f266494c.c(analyticsType);
            l lVar = kVar.f266493b;
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(sector, "sector");
            flowH = xam.a.h(new qqj.g(kVar, aVarC, continuation, 15), rd0.e.b(lVar.e(analyticsType, new kwg.f(lVar, timeSpan, method, sector, analyticsType))));
        }
        yji.l.b1(this, flowH, null, new p(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f275430r;
    }
}
