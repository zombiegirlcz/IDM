package fwk;

import cli.y;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import lrk.o;
import w4l.i;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends oki.h implements dli.b {
    public final RecommendationHistoryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qrk.c f138706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f138707q;

    public e(h mapper, RecommendationHistoryScreenContract$InputData inputData, qrk.c insightsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        this.o = inputData;
        this.f138706p = insightsInteractor;
        this.f138707q = mra.d.b(this, new c(null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        String ref2 = this.o.f104042a;
        qrk.c cVar = this.f138706p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o oVar = cVar.f248737a;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, oVar.f199546h.b(ref2, loadingStrategy), null, new fna.f(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f138707q;
    }
}
