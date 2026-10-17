package roh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements poh.j {
    @Override // poh.j
    public final poh.i a(zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        return new poh.i(new TextLocalisedClause(R$string.wealth_trading_home_widget_topMovers_header, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_topMovers_description, null, null, 14), v.k(o.f256024a, j.f256016a));
    }
}
