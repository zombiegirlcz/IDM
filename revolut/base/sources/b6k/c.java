package b6k;

import aw0.o9;
import b6k.a;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final CellDetailsDelegate.Model a(b6k.a result, String id10, int i) {
        Clause moneyClause;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(result, a.C0091a.f12845a)) {
            moneyClause = new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (!(result instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            moneyClause = new MoneyClause(((b) result).f12846a, new MoneyClause.Format.Defaults(null, null, false, false, 11), null, null, 12);
        }
        return new CellDetailsDelegate.Model(id10, new TextLocalisedClause(i, null, null, 14), moneyClause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
