package fuk;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 {
    public static Clause a(int i, Integer num, k0 yearsLegendStyle) {
        Intrinsics.checkNotNullParameter(yearsLegendStyle, "yearsLegendStyle");
        if (num != null) {
            return new TextClause("Q" + num + "'" + (i % 100), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        int i2 = z.f138277a[yearsLegendStyle.ordinal()];
        if (i2 == 1) {
            return new TextClause(a0.d.n("'", i % 100), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
        return com.revolut.core.ui_kit.models.j.b(jVar, localDateOf, LocalDateClause$DateFormat.Year.f57813a);
    }
}
