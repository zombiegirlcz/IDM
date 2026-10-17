package uyg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static TimeClause a(DateTime dateTime, TimeClause.Format format) {
        return new TimeClause(dateTime.getMillis(), format, null, null, 12);
    }

    public static TimeClause.Format.Pretty b(vyg.c cVar) {
        switch (b.f284337a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new TimeClause.Format.Pretty(0);
            case 4:
            case 5:
            case 6:
                return new TimeClause.Format.Pretty(q0.ONLY_DATE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static Clause c(Pair pair, DateTime dateTime, vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        if (pair != null) {
            TimeClause.Format.Pretty prettyB = b(selectedTimeframe);
            List listK = v.k(a((DateTime) pair.f186385a, prettyB), a((DateTime) pair.f186386b, prettyB));
            Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
            return yoj.b.m(new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK);
        }
        if (dateTime != null) {
            return a(dateTime, b(selectedTimeframe));
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
