package aaf;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import xi0.b;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final CompositeClause a(TransferInSelectedAsset transferInSelectedAsset) {
        Intrinsics.checkNotNullParameter(transferInSelectedAsset, "<this>");
        NumberClause numberClause = new NumberClause(transferInSelectedAsset.f91511b, (NumberClause.Format.Compact) null, (Custom) null, 6);
        xi0.a aVar = b.Companion;
        String str = transferInSelectedAsset.f91510a.f91508c;
        aVar.getClass();
        List listK = v.k(numberClause, new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4));
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        ej0.b bVar = transferInSelectedAsset.f91512c;
        if (bVar == null) {
            return compositeClause;
        }
        List listK2 = v.k(compositeClause, new MoneyClause(mif.a.P(bVar, 0, 3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
