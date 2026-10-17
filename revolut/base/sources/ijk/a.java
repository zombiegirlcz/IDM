package ijk;

import aw0.k7;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.MoneyClause;
import dj0.d;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static MoneyClause a(d dVar) {
        k7 k7Var = null;
        ScaleMode scaleMode = null;
        boolean z = false;
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, scaleMode, z, false, 15), 0 == true ? 1 : 0, o9.NON_SENSITIVE, 4);
    }
}
