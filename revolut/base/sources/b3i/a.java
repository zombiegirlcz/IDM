package b3i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static Clause a(mha.k fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        if (fee2 instanceof mha.i) {
            return new MoneyClause(((mha.i) fee2).f205453a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        if (!(fee2 instanceof mha.j)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextClause(((mha.j) fee2).f205454a + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
