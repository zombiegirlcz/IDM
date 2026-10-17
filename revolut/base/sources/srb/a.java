package srb;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.trading.advanced.charts.api.models.StockAdvancedChartSymbol;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import i0b.b;
import i0b.c;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import y1h.e;
import y1h.f;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {
    public static z1h.a c(e eVar, Set set) {
        f fVar = f.DEFAULT;
        Object[] elements = {new AssetSelectionCategory.Stock(null, fVar), new AssetSelectionCategory.Etp(null, true, fVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new z1h.a(null, eVar, d.y0(elements), set, h0.f322473a, null);
    }

    @Override // i0b.c
    public final i0b.a a(AdvancedChartSymbol currentChartSymbol, Set selectedChartSymbols) {
        Intrinsics.checkNotNullParameter(currentChartSymbol, "currentChartSymbol");
        Intrinsics.checkNotNullParameter(selectedChartSymbols, "selectedChartSymbols");
        e eVar = e.MULTI;
        Set<AdvancedChartSymbol> set = selectedChartSymbols;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (AdvancedChartSymbol advancedChartSymbol : set) {
            if (!(advancedChartSymbol instanceof StockAdvancedChartSymbol)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((StockAdvancedChartSymbol) advancedChartSymbol).f83400a.f214596b);
        }
        return new i0b.a(c(eVar, d0.i1(arrayList)), new soi.a(14));
    }

    @Override // i0b.c
    public final b b(AdvancedChartSymbol currentChartSymbol) {
        Intrinsics.checkNotNullParameter(currentChartSymbol, "currentChartSymbol");
        if (currentChartSymbol instanceof StockAdvancedChartSymbol) {
            return new b(c(e.SINGLE, h0.f322473a), new soi.a(15));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
