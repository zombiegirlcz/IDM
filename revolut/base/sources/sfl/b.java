package sfl;

import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import dj0.d;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public interface b {
    static Clause a(b bVar, BigDecimal quantity, z instrumentType, String symbol) {
        o9 sensitivity = o9.SENSITIVE;
        ((ufl.b) bVar).getClass();
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        switch (ufl.a.f279868a[instrumentType.ordinal()]) {
            case 1:
                return new NumberClause(quantity, new NumberClause.Format.AllDigitsAfterDot(wa.STRIP_ALL_TRAILING_ZEROES, null, 2), null, sensitivity, 4);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return new AssetClause(quantity, new AssetClauseType.Stock(0), symbol, null, sensitivity, 8);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ Clause b(b bVar, d dVar, BigDecimal bigDecimal, o9 o9Var, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            o9Var = o9.NON_SENSITIVE;
        }
        return ((ufl.b) bVar).c(dVar, bigDecimal, z, o9Var, new MoneyClause.Format.Defaults(null, null, false, false, 15));
    }
}
