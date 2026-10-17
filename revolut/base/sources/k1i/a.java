package k1i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final Clause a(mha.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (kVar instanceof mha.i) {
            return new MoneyClause(((mha.i) kVar).f205453a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        if (!(kVar instanceof mha.j)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextClause(((mha.j) kVar).f205454a + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
