package au0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface k4 extends a {
    void setHint(Clause clause);

    default void setHint(String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(new TextClause(hint, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
    }

    void setHints(List list);
}
