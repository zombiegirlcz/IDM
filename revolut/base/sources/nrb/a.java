package nrb;

import aii.r;
import aw0.o9;
import c1b.j;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.crypto.advanced_charts.api.models.CryptoAdvancedChartSymbol;
import com.revolut.feature.retail.trading.advanced.charts.api.models.StockAdvancedChartSymbol;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvancedChartSymbol f218599b;

    public /* synthetic */ a(AdvancedChartSymbol advancedChartSymbol, int i) {
        this.f218598a = i;
        this.f218599b = advancedChartSymbol;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal bigDecimal;
        switch (this.f218598a) {
            case 0:
                BigDecimal price = (BigDecimal) obj2;
                Intrinsics.checkNotNullParameter(price, "price");
                AdvancedChartSymbol advancedChartSymbol = this.f218599b;
                return new j(advancedChartSymbol, price, new MoneyClause(mif.a.R(new ej0.b(price, ((StockAdvancedChartSymbol) advancedChartSymbol).f83400a.i)), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(advancedChartSymbol.S9(), RoundingMode.HALF_UP), false, false, 13), null, o9.NON_SENSITIVE, 4));
            case 1:
                List allExchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(allExchangeRates, "allExchangeRates");
                qta.a aVar = (qta.a) d0.o0(allExchangeRates);
                if (aVar == null || (bigDecimal = aVar.e) == null) {
                    return null;
                }
                AdvancedChartSymbol advancedChartSymbol2 = this.f218599b;
                CryptoAdvancedChartSymbol cryptoAdvancedChartSymbol = (CryptoAdvancedChartSymbol) advancedChartSymbol2;
                return new j(advancedChartSymbol2, bigDecimal, new RateClause(bigDecimal, cryptoAdvancedChartSymbol.f82638b, new RateClause.Format.Default(cryptoAdvancedChartSymbol.f82637a, true), null));
            case 2:
                g0b.c update = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g0b.c.a(update, null, null, this.f218599b, null, null, h0.f322473a, null, null, null, false, null, null, null, 2096983);
            case 3:
                g0b.c update2 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return g0b.c.a(update2, null, null, this.f218599b, null, null, h0.f322473a, null, null, null, false, null, null, null, 2097015);
            case 4:
                g0b.c update3 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return g0b.c.a(update3, null, null, null, null, null, a1.j(update3.f139402h, this.f218599b), null, null, null, false, null, null, null, 2097023);
            case 5:
                g0b.c update4 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return g0b.c.a(update4, null, null, null, null, null, null, null, null, null, false, null, this.f218599b, null, 1966079);
            default:
                r it8 = (r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                t8b.a aVar2 = it8 instanceof t8b.a ? (t8b.a) it8 : null;
                Set set = aVar2 != null ? aVar2.f268876a : null;
                if (set == null) {
                    set = h0.f322473a;
                }
                Set set2 = set;
                ArrayList arrayList = new ArrayList(w.t(set2, 10));
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    arrayList.add(new CryptoAdvancedChartSymbol((xi0.b) it9.next(), ((CryptoAdvancedChartSymbol) this.f218599b).f82638b));
                }
                return d0.i1(arrayList);
        }
    }

    public /* synthetic */ a(b bVar, AdvancedChartSymbol advancedChartSymbol) {
        this.f218598a = 0;
        this.f218599b = advancedChartSymbol;
    }
}
