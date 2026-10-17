package k5e;

import ael.d0;
import cli.y;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import k50.a4;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements d {
    public final NoteInsightsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f181493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f181494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qrk.c f181495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.k f181496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f181497t;
    public final p4e.a u;
    public final y v;

    public m(NoteInsightsScreenContract$InputData inputData, d0 stocksInteractor, ybl.b instrumentTickerInteractor, qrk.c stockInsightsInteractor, ybl.k tradingAccountsInteractor, gte.a featureToggleInteractor, p4e.a suggestionAggregator, i mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockInsightsInteractor, "stockInsightsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(suggestionAggregator, "suggestionAggregator");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f181493p = stocksInteractor;
        this.f181494q = instrumentTickerInteractor;
        this.f181495r = stockInsightsInteractor;
        this.f181496s = tradingAccountsInteractor;
        this.f181497t = featureToggleInteractor;
        this.u = suggestionAggregator;
        this.v = mra.d.b(this, new c(null, null, null), mapper, null, false, 12);
    }

    public static go.g I2() {
        od0.i.Companion.getClass();
        return new go.g(zi0.c.P(od0.i.f224256b, false, null, 3), 2);
    }

    @Override // yji.l
    public final void T1(long j2) {
        NoteInsightsScreenContract$InputData noteInsightsScreenContract$InputData = this.o;
        yji.l.b1(this, nim.a.v(rd0.e.b(this.f181493p.a(noteInsightsScreenContract$InputData.f88889a, false)), new a4(6)), null, new l(this, null, 0), 3);
        yji.l.b1(this, rd0.e.b(((ael.k) this.f181494q).f(noteInsightsScreenContract$InputData.f88889a)), null, new l(this, null, 1), 3);
        yji.l.b1(this, !((jte.d) this.f181497t).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c) ? I2() : boh.f.e(q.q(ybl.k.j(this.f181496s)), new k(this, 0)), null, new l(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
