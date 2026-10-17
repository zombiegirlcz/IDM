package v26;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.y;
import w26.g;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final ej0.b a(w26.d dVar) {
        String str = dVar.f293953b;
        int i = dVar.f293954c;
        BigInteger bigIntegerJ = y.j(str);
        if (bigIntegerJ == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeFiQuoteErrorMapper", "Quote error reason with unparseable amount", null, h0Var);
            return null;
        }
        g gVar = dVar.f293952a;
        String str2 = gVar.f293956a;
        if (str2 != null || (str2 = gVar.d) != null) {
            return new ej0.b(new BigDecimal(bigIntegerJ, i), new xi0.b(4, str2, Integer.valueOf(i)));
        }
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "DeFiQuoteErrorMapper", "Quote error reason without asset currency", null, h0Var2);
        return null;
    }
}
