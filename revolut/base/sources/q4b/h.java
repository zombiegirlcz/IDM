package q4b;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {
    public static lw0.a a(boolean z) {
        return new lw0.a(new TextLocalisedClause(z ? R$string.wealth_cfd_order_confirmation_opening_spread_title : R$string.wealth_cfd_order_confirmation_closing_spread_title, null, null, 14), new TextLocalisedClause(z ? R$string.wealth_cfd_order_confirmation_opening_spread_description : R$string.wealth_cfd_order_confirmation_closing_spread_description, null, null, 14), null, null, false, 28);
    }

    public static CellDetailsDelegate.Model b(int i, dj0.d dVar, String str) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cii.b bVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f242120a;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new q03.h(this, domainState), new pu4.d(this, domainState), new p40.n(this, domainState, 24))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }
}
