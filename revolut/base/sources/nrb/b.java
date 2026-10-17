package nrb;

import akg.n;
import aw0.o9;
import c1b.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.trading.advanced.charts.api.models.StockAdvancedChartSymbol;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kpj.f;
import mp6.j;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements i0b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f218600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f218601b;

    public b(ybl.b instrumentTickerInteractor, f liveCandleInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(liveCandleInteractor, "liveCandleInteractor");
        this.f218600a = instrumentTickerInteractor;
        this.f218601b = liveCandleInteractor;
    }

    @Override // i0b.d
    public final n a(AdvancedChartSymbol chartSymbol, h chartInterval) {
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        if (chartSymbol instanceof StockAdvancedChartSymbol) {
            return nim.a.v(new v1(new j(this, chartSymbol, chartInterval, (Continuation) null, 7)), new a(this, chartSymbol));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // i0b.d
    public final Clause b(AdvancedChartSymbol chartSymbol) {
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        if (chartSymbol instanceof StockAdvancedChartSymbol) {
            return new TextClause(((StockAdvancedChartSymbol) chartSymbol).f83400a.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // i0b.d
    public final Flow c(String ref2, h chartInterval) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        return this.f218601b.j(ref2, chartInterval);
    }

    @Override // i0b.d
    public final c1b.f d() {
        return c1b.f.V_1_0_0;
    }
}
