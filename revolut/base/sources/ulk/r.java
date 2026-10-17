package ulk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uj6.v;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_switching_confirmation_title, null, null, 14);
        Data data = domainState.f281033a;
        Data data2 = domainState.f281035c;
        Data data3 = domainState.d;
        Clause clause = (Clause) iii.c.f(t1.u(data, data2, data3), new v(20), new uj8.j(13), new u3b.h(this, 19));
        Data data4 = domainState.f281033a;
        Data data5 = domainState.f281034b;
        Data data6 = domainState.e;
        return new n(textLocalisedClause, clause, (List) iii.c.f(t1.v(data4, data5, data3, data6), new v(19), new uj8.j(12), new u3b.h(this, 18)), (Clause) iii.c.f(t1.t(data4, data6), new v(18), new uj8.j(11), new u3b.h(17)));
    }
}
