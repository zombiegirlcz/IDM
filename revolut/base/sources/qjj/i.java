package qjj;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    public static CellDetailsDelegate.Model a(String str, Clause clause, dj0.d dVar) {
        t0 t0Var = new t0(clause, (Image) null, 0, false, 30);
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        int i = R$attr.uikit_dp12;
        return new CellDetailsDelegate.Model(str, t0Var, moneyClause, null, null, null, null, null, 0, null, false, false, null, null, null, null, i, i, 0, 0, 54525944);
    }
}
