package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u8 {
    private u8() {
    }

    public static t8 a(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (clause instanceof MoneyClause) {
            dj0.d dVar = ((MoneyClause) clause).f57821a;
            return new t8(dVar.f115083b.f306286a, pyd.c.Y(dVar));
        }
        if (clause instanceof NumberClause) {
            return new t8(null, ((NumberClause) clause).f57894a);
        }
        if (clause instanceof CompositeClause) {
            List list = ((CompositeClause) clause).f57747a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                t8 t8VarA = a((Clause) list.get(i));
                if (t8VarA != null) {
                    return t8VarA;
                }
            }
        }
        return null;
    }
}
