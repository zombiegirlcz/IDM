package j1e;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.stock_lending.impl.R$string;
import dj0.d;
import i1e.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements i {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CounterTextDelegate.Model a(CounterTextDelegate.c cVar) {
        return new CounterTextDelegate.Model("ID_TOTAL_RETURN", new TextLocalisedClause(R$string.wealth_stock_lending_details_total_return, null, null, 14), cVar, null, false, null, null, 0, 0, 0, 0, 2040);
    }

    public static CounterTextDelegate.Model b() {
        xi0.b.Companion.getClass();
        return a(new t4(new MoneyClause(new d(0L, xi0.b.i), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)));
    }
}
