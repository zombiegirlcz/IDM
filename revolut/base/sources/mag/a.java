package mag;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final Clause a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String str = card.f150115j;
        TextClause textClause = null;
        TextClause textClause2 = str != null ? new TextClause("··".concat(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        LocalDate localDate = card.f150120q;
        if (localDate != null) {
            String string = localDate.toString("MM/YY");
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            textClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (textClause2 == null && textClause == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (textClause2 != null && textClause == null) {
            return textClause2;
        }
        if (textClause != null && textClause2 == null) {
            return textClause;
        }
        TextClause[] elements = {textClause2, new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }
}
