package xi0;

import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import sd0.g;
import sd0.j;
import zhm.t0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static b a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(code, "code");
        boolean z = a0.H(code, "S:", false) && !a0.y(code, ":CFD", false);
        boolean zH = a0.H(code, "X:", false);
        if (!z && !zH) {
            qd0.b.Companion.getClass();
            code = code.toUpperCase(qd0.a.a());
            Intrinsics.checkNotNullExpressionValue(code, "toUpperCase(...)");
        }
        ConcurrentHashMap concurrentHashMap = d.f306295a;
        b bVar = (b) concurrentHashMap.get(code);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(6, code, null);
        b bVar3 = (b) concurrentHashMap.putIfAbsent(code, bVar2);
        return bVar3 == null ? bVar2 : bVar3;
    }

    public static b b(wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        String currencyCode = Currency.getInstance(new Locale("", country.f297794a)).getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        return new b(6, currencyCode, null);
    }

    public static b c(String ticker) {
        Object next;
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        g.f261792c.getClass();
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        j.a();
        com.bumptech.glide.g gVar = g.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Iterator it8 = t0.C(gVar.f26094a).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((c) ((Pair) next).f186386b).a(), ticker)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        String str = pair != null ? (String) pair.f186385a : null;
        if (str != null) {
            return a(str);
        }
        return null;
    }
}
