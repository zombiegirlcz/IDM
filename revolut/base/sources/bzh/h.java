package bzh;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f20033a = v.k(10L, 25L, 50L, 100L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f20034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f20035c;
    public static final List d;
    public static final List e;
    public static final Object f;

    static {
        List listK = v.k(10L, 100L, 500L, 1000L);
        f20034b = listK;
        List listK2 = v.k(100L, 1000L, 5000L, 10000L);
        f20035c = listK2;
        List listK3 = v.k(100L, 500L, 1000L, 5000L);
        d = listK3;
        List listK4 = v.k(5000L, 10000L, 50000L, 100000L);
        e = listK4;
        f = r0.k(new Pair("AUD", listK), new Pair("BGN", listK), new Pair("CHF", listK), new Pair("EUR", listK), new Pair("GBP", listK), new Pair("AED", listK), new Pair("NZD", listK), new Pair("SGD", listK), new Pair("USD", listK), new Pair("CZK", listK2), new Pair("DKK", listK2), new Pair("HKD", listK2), new Pair("ILS", listK2), new Pair("MAD", listK2), new Pair("MXN", listK2), new Pair("NOK", listK2), new Pair("SEK", listK2), new Pair("THB", listK2), new Pair("TRY", listK2), new Pair("ZAR", listK2), new Pair("HUF", listK4), new Pair("JPY", listK4), new Pair("PLN", listK3), new Pair("RON", listK3), new Pair("QAR", listK3), new Pair("SAR", listK3));
    }

    public static ArrayList b() {
        List list = f20033a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            long jLongValue = ((Number) it8.next()).longValue();
            arrayList.add(new d01.b(p.a.m(jLongValue, "PERCENT_SUGGESTION_"), jLongValue == 100 ? new TextLocalisedClause(R$string.cryptobuysell_editor_suggestion_sell_all, null, null, 14) : new PercentageClause(jLongValue, (PercentageClause.Format) null, (Custom) null, 6), new e(jLongValue), false, null, null, 56));
        }
        return arrayList;
    }

    public static Amount c(f8l.d dVar, xi0.b bVar) {
        Amount f104747b;
        Asset asset;
        if (Intrinsics.f((dVar == null || (f104747b = dVar.getF104747b()) == null || (asset = f104747b.f104718b) == null) ? null : asset.f104720b, bVar.f306286a)) {
            return dVar.getF104747b();
        }
        if (dVar != null) {
            return dVar.getF104748c();
        }
        return null;
    }

    public final Amount a(Amount amount, BigDecimal bigDecimal, xi0.b bVar) {
        return (bigDecimal == null || amount == null || Intrinsics.f(amount.f104718b.f104720b, bVar.f306286a)) ? amount : l4i.a.e(pyd.c.L(l4i.a.b(amount), bigDecimal, bVar));
    }
}
