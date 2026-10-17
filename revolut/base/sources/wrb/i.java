package wrb;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wm9.k;
import wp5.w;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_charts_sell_all_shares_title, null, null, 14), new TextLocalisedClause(R$string.trading_advanced_charts_sell_all_shares_subtitle, null, null, 14), null, null, false, 28);
        Data data = domainState.f299536a;
        if (data == null || (list = (List) iii.c.f(data, new w(19), new k(21), new w2a.o(21))) == null) {
            list = null;
        } else {
            yp0.b.k(list, 0, 0, 0, 0, 31);
        }
        if (list == null) {
            list = f0.f322471a;
        }
        Data data2 = domainState.f299536a;
        return new cii.b(data2 != null ? (aw0.g) iii.c.f(data2, new w(20), new k(22), new w2a.o(22)) : null, list, aVar);
    }
}
