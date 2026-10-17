package ix0;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d0 {
    public static final CurrencyClause a(xi0.b bVar, Custom custom) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, custom);
    }
}
