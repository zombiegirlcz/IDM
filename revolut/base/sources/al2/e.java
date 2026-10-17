package al2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t0;
import mha.n;
import mha.o;
import mha.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Clause a(p pVar) {
        if (pVar instanceof n) {
            return new MoneyClause(((n) pVar).f205461a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        if (pVar instanceof o) {
            return new TextClause(String.valueOf(((o) pVar).f205462a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (pVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
