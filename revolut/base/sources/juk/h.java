package juk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.w;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends oki.h implements dli.b {
    public final qrk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f178675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f61.a f178676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f178677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f178678s;

    public h(IndexMarketSentimentControllerContract$InputData inputData, j stateMapper, qrk.c insightsInteractor, w referenceIndexNameProvider, f61.a disclaimersProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        Intrinsics.checkNotNullParameter(referenceIndexNameProvider, "referenceIndexNameProvider");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        this.o = insightsInteractor;
        this.f178675p = referenceIndexNameProvider;
        this.f178676q = disclaimersProvider;
        this.f178677r = new vii.c();
        this.f178678s = mra.d.b(this, new e(new Data(null, null, false, 7, null), null, null, inputData.f103866a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.Q(this.f178677r.a(Unit.f186387a, w4l.h.f294642c), new iw6.l((Continuation) null, this, 26)), null, new g(this, null, 0), 3);
        String indexRef = ((e) ((j2) this.f178678s.f22677a).getValue()).f178670a;
        w wVar = this.f178675p;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(indexRef, "indexRef");
        l.b1(this, nim.a.v(((ecm.q) wVar.f250866b).k(indexRef), new iui.a(8)), null, new g(this, null, 1), 3);
        l.b1(this, this.f178676q.G(iuk.a.SENTIMENT), null, new g(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178678s;
    }
}
