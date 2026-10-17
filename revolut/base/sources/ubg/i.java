package ubg;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    public static CellDetailsDelegate.Model a(String str, int i, MoneyClause moneyClause) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), moneyClause, null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
