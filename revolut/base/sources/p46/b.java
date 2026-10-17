package p46;

import com.revolut.feature.defi.feed.api.widget.DeFiPortfolioWidgetContext;
import csh.g;
import dsh.e;
import dsh.i;
import java.util.List;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {
    @Override // csh.g
    public final List b(Class cls) {
        if (!cls.equals(DeFiPortfolioWidgetContext.class)) {
            return f0.f322471a;
        }
        e.Companion.getClass();
        return u.c(new i("TransactionsDynamic", dsh.d.a()));
    }
}
