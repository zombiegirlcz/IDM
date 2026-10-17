package l2i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f191803a = v.k(10, 25, 50, 100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f191804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f191805c;
    public static final List d;
    public static final List e;
    public static final Object f;

    static {
        List listK = v.k(10L, 100L, 500L, 1000L);
        f191804b = listK;
        List listK2 = v.k(100L, 1000L, 5000L, 10000L);
        f191805c = listK2;
        List listK3 = v.k(100L, 500L, 1000L, 5000L);
        d = listK3;
        List listK4 = v.k(5000L, 10000L, 50000L, 100000L);
        e = listK4;
        f = r0.k(new Pair("AUD", listK), new Pair("BGN", listK), new Pair("CHF", listK), new Pair("EUR", listK), new Pair("GBP", listK), new Pair("AED", listK), new Pair("NZD", listK), new Pair("SGD", listK), new Pair("USD", listK), new Pair("CZK", listK2), new Pair("DKK", listK2), new Pair("HKD", listK2), new Pair("ILS", listK2), new Pair("MAD", listK2), new Pair("MXN", listK2), new Pair("NOK", listK2), new Pair("SEK", listK2), new Pair("THB", listK2), new Pair("TRY", listK2), new Pair("ZAR", listK2), new Pair("HUF", listK4), new Pair("JPY", listK4), new Pair("PLN", listK3), new Pair("RON", listK3), new Pair("QAR", listK3), new Pair("SAR", listK3));
    }

    public static ArrayList a() {
        List list = f191803a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            arrayList.add(new d01.b(a0.d.n("PERCENT_SUGGESTION_", iIntValue), iIntValue == 100 ? new TextLocalisedClause(R$string.fx_orders_editor_suggestion_sell_all, null, null, 14) : new TextClause(a0.d.h(iIntValue, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new g(iIntValue), false, null, null, 56));
        }
        return arrayList;
    }
}
