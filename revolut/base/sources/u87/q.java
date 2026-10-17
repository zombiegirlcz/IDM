package u87;

import cli.y;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import u4i.u;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements f {
    public final IndexOverviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aah.h f278136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ecm.q f278137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zhl.k f278138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f278139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0h.a f278140t;
    public final ybl.l u;
    public final b4h.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.c f278141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f278142x;

    public q(IndexOverviewScreenContract$InputData inputData, cli.n stateMapper, aah.h disclaimersExtension, ecm.q indexDetailsInteractor, zhl.k historicalPricesInteractor, ybl.b instrumentTickerInteractor, k0h.a collectionsExtension, ybl.l tradingConfigInteractor, b4h.e chartSettingsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(indexDetailsInteractor, "indexDetailsInteractor");
        Intrinsics.checkNotNullParameter(historicalPricesInteractor, "historicalPricesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(collectionsExtension, "collectionsExtension");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(chartSettingsInteractor, "chartSettingsInteractor");
        this.o = inputData;
        this.f278136p = disclaimersExtension;
        this.f278137q = indexDetailsInteractor;
        this.f278138r = historicalPricesInteractor;
        this.f278139s = instrumentTickerInteractor;
        this.f278140t = collectionsExtension;
        this.u = tradingConfigInteractor;
        this.v = chartSettingsInteractor;
        this.f278141w = new vii.c();
        this.f278142x = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mo3.a.g(ybl.l.d(this.u), null, new u(7), 1), null, null, new o(this, null), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, yh5.b.d(mo3.a.g(ybl.l.d(this.u), null, new u(8), 1), this.v.a()), null, new p(this, null), 3);
        yji.l.b1(this, vkm.q.Q(this.f278141w.a(Unit.f186387a, w4l.h.f294642c), new tik.b((Continuation) null, this, 28)), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278142x;
    }
}
