package iig;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import java.util.List;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public final aw0.e a(Integer num, String str) {
        if (str == null) {
            return null;
        }
        Clause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (num != null) {
            textClause = new TextLocalisedClause(num.intValue(), u.c(textClause), null, 12);
        }
        return new aw0.e(true, null, null, new n6(textClause, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 54);
    }
}
