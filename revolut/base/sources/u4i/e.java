package u4i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    public static aim.e a(List list, RowDelegate.Model model, ej ejVar) {
        aim.e eVarB = zhm.u.b();
        yp0.b.k(list, 0, 0, 0, 0, 31);
        eVarB.addAll(list);
        if (model != null) {
            eVarB.add(model);
        }
        if (ejVar != null && !eVarB.isEmpty()) {
            int iJ = zhm.v.j(eVarB);
            qv0.n nVar = (qv0.n) eVarB.get(zhm.v.j(eVarB));
            yp0.b.c(nVar, R$attr.uikit_dp0);
            eVarB.set(iJ, nVar);
            int i = R$attr.uikit_dp0;
            yp0.b.r(ejVar, i, i, 0, 0, 12);
            eVarB.add(ejVar);
        }
        return zhm.u.a(eVarB);
    }

    public static boolean b(Breakdown.Fee fee2) {
        ChargeBreakdown f97037a = fee2.getF97037a();
        Amount amount = f97037a != null ? f97037a.f104724c : null;
        if (amount != null) {
            xi0.b f97034b = fee2.getF97034b();
            if (Intrinsics.f(f97034b != null ? f97034b.f306286a : null, amount.f104718b.f104720b)) {
                return true;
            }
        }
        return fee2.getF97036g();
    }

    public static Clause c(Amount amount) {
        AssetClause assetClauseB = e4i.c.b(amount, null, null, o9.NON_SENSITIVE, 15);
        return assetClauseB != null ? assetClauseB : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
