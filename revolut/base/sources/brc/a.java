package brc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final Clause a(Long l2) {
        if (l2 != null) {
            return new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(0), null, null, 12);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
