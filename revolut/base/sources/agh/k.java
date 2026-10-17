package agh;

import a2f.q;
import a9d.p;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(k kVar, String str, int i, int i2, BigDecimal bigDecimal, Integer num, int i3) {
        BigDecimal bigDecimal2 = (i3 & 8) != 0 ? null : bigDecimal;
        Integer num2 = (i3 & 16) != 0 ? null : num;
        Clause percentageClause = bigDecimal2 != null ? new PercentageClause(e1.Z(bigDecimal2), (PercentageClause.Format) null, (Style) null, 6) : num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
        if (percentageClause == null) {
            return null;
        }
        RowDelegate.Model model = new RowDelegate.Model(str, null, new TextLocalisedClause(i, null, null, 14), null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(percentageClause, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f fVar = new f(new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_fees_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_fees_description, null, null, 14));
        Data data = domainState.f4826a;
        Data data2 = domainState.f4828c;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        List list = dataT != null ? (List) iii.c.f(dataT, new h(this, 2), new p(28), new q(this, 12)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new g(fVar, list);
    }
}
