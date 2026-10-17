package u4e;

import ael.d0;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f277333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f277334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f277335n;
    public final qrk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.k f277336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f277337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p4e.a f277338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vki.a f277339s;

    public m(e inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor, qrk.c stockInsightsInteractor, ybl.k tradingAccountsInteractor, gte.a featureToggleInteractor, p4e.a suggestionAggregator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockInsightsInteractor, "stockInsightsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(suggestionAggregator, "suggestionAggregator");
        this.f277333l = inputData;
        this.f277334m = stocksInteractor;
        this.f277335n = instrumentTickerInteractor;
        this.o = stockInsightsInteractor;
        this.f277336p = tradingAccountsInteractor;
        this.f277337q = featureToggleInteractor;
        this.f277338r = suggestionAggregator;
        this.f277339s = pyd.c.a(this, new d(null, null, null));
    }

    public static go.g b3() {
        od0.i.Companion.getClass();
        return new go.g(zi0.c.P(od0.i.f224256b, false, null, 3), 2);
    }

    @Override // yji.n
    public final void H2() {
        e eVar = this.f277333l;
        yji.n.l2(this, nim.a.v(rd0.e.b(this.f277334m.a(eVar.f277324a, false)), new i(0)), null, new k(this, null, 0), 3);
        yji.n.l2(this, rd0.e.b(((ael.k) this.f277335n).f(eVar.f277324a)), null, new k(this, null, 1), 3);
        yji.n.l2(this, !((jte.d) this.f277337q).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c) ? b3() : boh.f.e(q.q(ybl.k.j(this.f277336p)), new j(this, 0)), null, new k(this, null, 2), 3);
    }

    @Override // u4e.b
    public final void Z2() {
        A2(new NoteInsightsScreenContract$Destination(new NoteInsightsScreenContract$InputData(this.f277333l.f277324a)));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f277339s;
    }
}
