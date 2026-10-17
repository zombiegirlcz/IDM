package unj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static TextClause a(String str, IntRange intRange, Style style) {
        String strT0 = d0.t0(str, intRange);
        String str2 = strT0.length() > 0 ? strT0 : null;
        if (str2 == null) {
            return null;
        }
        return new TextClause(str2, style, (Integer) null, false, (o9) null, (List) null, 124);
    }
}
