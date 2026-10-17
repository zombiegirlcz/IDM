package pkf;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.o3;
import tof.r3;

/* JADX INFO: loaded from: classes8.dex */
public final class e2 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static f2 a(dj0.d dVar, a3 a3Var, boolean z) {
        r3 r3Var = a3Var.V;
        Double d = r3Var != null ? r3Var.f273025c.f273042a : null;
        xi0.b bVar = r3Var != null ? r3Var.f273025c.f273043b : null;
        dj0.d dVarK = (d == null || bVar == null) ? null : pyd.c.K(dVar, d.doubleValue(), bVar);
        k7 k7Var = k7.NEVER;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12);
        MoneyClause moneyClause2 = dVarK != null ? new MoneyClause(dVarK, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8) : null;
        if (moneyClause2 != null) {
            return new f2(z ? c(moneyClause) : moneyClause, moneyClause2);
        }
        return new f2(moneyClause, null);
    }

    public static f2 b(dj0.d dVar, a3 a3Var, o3 o3Var, boolean z) {
        dj0.d dVarK = pyd.c.K(dVar, a3Var.f272619w, o3Var.f272965a.f115083b);
        k7 k7Var = k7.NEVER;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        MoneyClause moneyClause2 = new MoneyClause(dVarK, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12);
        Clause clauseC = moneyClause2;
        if (z) {
            clauseC = c(moneyClause2);
        }
        return new f2(clauseC, moneyClause);
    }

    public static CompositeClause c(MoneyClause moneyClause) {
        int i = R$drawable.uikit_icn_16_info_outline;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(zhm.v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextClause("\t", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause), null, null, null, 14);
    }
}
