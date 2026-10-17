package otd;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.List;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final dj0.d a(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        long jRint = dVar.f115082a;
        long jAbs = Math.abs(jRint);
        xi0.b bVar = dVar.f115083b;
        if (jAbs >= cp5.d.k(bVar) * ((long) 11)) {
            jRint = ((long) Math.rint(jRint / cp5.d.k(bVar))) * cp5.d.k(bVar);
        }
        return dj0.d.c(dVar, jRint, null, 2);
    }

    public static final dj0.d b(dj0.d dVar, List rates, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        if (Intrinsics.f(dVar.f115083b, targetCurrency)) {
            return dVar;
        }
        Double dM = l.m(rates, dVar.f115083b, targetCurrency);
        if (dM != null) {
            return pyd.c.K(dVar, dM.doubleValue(), targetCurrency);
        }
        return null;
    }

    public static MoneyClause c(int i, Custom custom, MoneyClause.Format format, dj0.d dVar) {
        MoneyClause.Format format2 = (i & 1) != 0 ? new MoneyClause.Format.Defaults(null, null, false, false, 15) : format;
        if ((i & 2) != 0) {
            custom = null;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format2, "format");
        return new MoneyClause(dVar, format2, custom, null, 8);
    }

    public static MoneyClause d(dj0.d dVar) {
        MoneyClause.Format.Defaults format = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return sx4.f.a(a(dVar), format, null);
    }

    public static final dj0.d e(dj0.d dVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return dVar.f115083b.f306286a.length() == 0 ? dj0.d.c(dVar, 0L, currency, 1) : dVar;
    }
}
