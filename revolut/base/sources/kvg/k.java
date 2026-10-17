package kvg;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ku1.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_analytics_widgetised_benchmarks_title, null, null, 14), null, null, null, false, 30);
        Data data = domainState.f190113a;
        List list = data != null ? (List) iii.c.f(data, new j(0), new f0(12), new kcg.j(this, domainState, 16)) : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        List list2 = list;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        return new cii.b(null, list2, aVar);
    }
}
