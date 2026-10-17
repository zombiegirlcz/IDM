package v8b;

import akg.n;
import c1b.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.crypto.advanced_charts.api.models.CryptoAdvancedChartSymbol;
import i0b.d;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n9l.b;
import ppk.f;
import rd0.e;
import vkm.i;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f286732a;

    public a(f ratesInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f286732a = ratesInteractor;
    }

    @Override // i0b.d
    public final n a(AdvancedChartSymbol chartSymbol, h chartInterval) {
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        if (!(chartSymbol instanceof CryptoAdvancedChartSymbol)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        CryptoAdvancedChartSymbol cryptoAdvancedChartSymbol = (CryptoAdvancedChartSymbol) chartSymbol;
        return nim.a.v(e.b(this.f286732a.c(u.c(new Pair(cryptoAdvancedChartSymbol.f82637a, cryptoAdvancedChartSymbol.f82638b)), b.SEC_3)), new nrb.a(chartSymbol, 1));
    }

    @Override // i0b.d
    public final Clause b(AdvancedChartSymbol chartSymbol) {
        Intrinsics.checkNotNullParameter(chartSymbol, "chartSymbol");
        if (chartSymbol instanceof CryptoAdvancedChartSymbol) {
            return new CurrencyClause(((CryptoAdvancedChartSymbol) chartSymbol).f82637a, CurrencyClause.Format.Ticker.f57756a, null, 4);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // i0b.d
    public final Flow c(String ref2, h chartInterval) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartInterval, "chartInterval");
        return i.f290039a;
    }

    @Override // i0b.d
    public final c1b.f d() {
        return c1b.f.V_0_0_1;
    }
}
