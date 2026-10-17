package x8b;

import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.crypto.advanced_charts.api.models.CryptoAdvancedChartSymbol;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements i0b.c {
    @Override // i0b.c
    public final i0b.a a(AdvancedChartSymbol currentChartSymbol, Set selectedChartSymbols) {
        Intrinsics.checkNotNullParameter(currentChartSymbol, "currentChartSymbol");
        Intrinsics.checkNotNullParameter(selectedChartSymbols, "selectedChartSymbols");
        if (!(currentChartSymbol instanceof CryptoAdvancedChartSymbol)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        CryptoAdvancedChartSymbol cryptoAdvancedChartSymbol = (CryptoAdvancedChartSymbol) currentChartSymbol;
        xi0.b[] elements = {cryptoAdvancedChartSymbol.f82637a, cryptoAdvancedChartSymbol.f82638b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        Set<AdvancedChartSymbol> set = selectedChartSymbols;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (AdvancedChartSymbol advancedChartSymbol : set) {
            if (!(advancedChartSymbol instanceof CryptoAdvancedChartSymbol)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(((CryptoAdvancedChartSymbol) advancedChartSymbol).f82637a);
        }
        return new i0b.a(new t8b.b(setY0, d0.i1(arrayList)), new nrb.a(currentChartSymbol, 6));
    }

    @Override // i0b.c
    public final i0b.b b(AdvancedChartSymbol currentChartSymbol) {
        Intrinsics.checkNotNullParameter(currentChartSymbol, "currentChartSymbol");
        if (currentChartSymbol instanceof CryptoAdvancedChartSymbol) {
            return new i0b.b(new ee5.b(((CryptoAdvancedChartSymbol) currentChartSymbol).f82637a), new x64.a(18));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
