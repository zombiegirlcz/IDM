package dv5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pt5.u;
import pt5.v;
import pt5.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f118030a;

    public a(t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f118030a = currenciesLocalization;
    }

    public final boolean a(w order, String query) {
        String str;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(query, "query");
        if (d0.W(query)) {
            return true;
        }
        boolean z = order instanceof u;
        t70.b bVar = this.f118030a;
        if (z) {
            ExchangeOrder.Active active = ((u) order).f239625a;
            return jli.g.h(bVar.c(active.f72129a.e), query) || jli.g.h(bVar.c(active.f72129a.f), query);
        }
        if (!(order instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        qua.p pVar = ((v) order).f239626a;
        xi0.a aVar = xi0.b.Companion;
        String str2 = pVar.i;
        aVar.getClass();
        if (jli.g.h(bVar.c(xi0.a.a(str2)), query)) {
            return true;
        }
        wua.a aVar2 = pVar.f249328q;
        return pd.b.j((aVar2 == null || (str = aVar2.f300093b) == null) ? null : Boolean.valueOf(jli.g.h(bVar.c(xi0.a.a(str)), query)));
    }
}
