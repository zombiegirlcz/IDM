package k2k;

import aw0.k7;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final MoneyClause a(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.k()) {
            return null;
        }
        return dVar.f(dj0.d.e) ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254), null, 8) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254), null, 8);
    }
}
