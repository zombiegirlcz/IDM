package opf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f227608a = r0.k(new Pair("HUF", zhm.v.k(1000L, 2000L, 5000L, 10000L)), new Pair("JPY", zhm.v.k(1000L, 2000L, 5000L, 10000L)), new Pair("RUB", zhm.v.k(1000L, 2000L, 5000L, 10000L)), new Pair("THB", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("CZK", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("MXN", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("ZAR", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("NOK", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("SEK", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("DKK", zhm.v.k(100L, 200L, 500L, 1000L)), new Pair("MAD", zhm.v.k(50L, 100L, 200L, 500L)), new Pair("TRY", zhm.v.k(50L, 100L, 200L, 500L)), new Pair("HKD", zhm.v.k(50L, 100L, 200L, 500L)), new Pair("HRK", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("RON", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("PLN", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("SAR", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("AED", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("QAR", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("ILS", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("BGN", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("NZD", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("AUD", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("SGD", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("CAD", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("USD", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("CHF", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("EUR", zhm.v.k(10L, 20L, 50L, 100L)), new Pair("GBP", zhm.v.k(10L, 20L, 50L, 100L)));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final ArrayList a(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(money, "money");
        xi0.b bVar = money.f115083b;
        Iterable iterable = (List) f227608a.get(bVar.f306286a);
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new dj0.d(cp5.d.k(bVar) * ((Number) it8.next()).longValue(), bVar));
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new bw0.d(6, new MoneyClause((dj0.d) it9.next(), new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4), (Clause) null));
        }
        return arrayList2;
    }
}
