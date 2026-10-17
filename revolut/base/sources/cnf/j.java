package cnf;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static Clause a(int i, String str) {
        return yoj.b.w(new TextLocalisedClause(i, null, null, 14), new TextClause(": ".concat(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }
}
