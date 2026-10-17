package sx4;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract class g {
    public static final TimeClause a(long j2) {
        if (Year.from(Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault())).getValue() == Year.now().getValue()) {
            return new TimeClause(j2, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12);
        }
        TimeClause.Format.INSTANCE.getClass();
        return new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12);
    }

    public static final TimeClause b(LocalDate date, Custom custom) {
        Intrinsics.checkNotNullParameter(date, "date");
        if (date.getYear() == Year.now().getValue()) {
            j jVar = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar.getClass();
            return j.a(date, dayAndMonth, custom);
        }
        j jVar2 = c7.Companion;
        LocalDateClause$DateFormat.INSTANCE.getClass();
        LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
        jVar2.getClass();
        return j.a(date, dateMedium, custom);
    }

    public static TimeClause c(LocalDate date) {
        ka monthStyle = ka.SHORT;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
        if (date.getYear() == Year.now().getValue()) {
            j jVar = c7.Companion;
            LocalDateClause$DateFormat.Month month = new LocalDateClause$DateFormat.Month(monthStyle);
            jVar.getClass();
            return j.a(date, month, null);
        }
        j jVar2 = c7.Companion;
        LocalDateClause$DateFormat.MonthAndYear monthAndYear = new LocalDateClause$DateFormat.MonthAndYear(0);
        jVar2.getClass();
        return j.a(date, monthAndYear, null);
    }

    public static final TextClause d(int i) {
        StringBuilder sb6 = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb6.append("\n");
        }
        return new TextClause(sb6.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final TextClause e(int i) {
        StringBuilder sb6 = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb6.append(" ");
        }
        return new TextClause(sb6.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final Clause f(Clause clause, Style style) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return clause instanceof MoneyClause ? MoneyClause.b((MoneyClause) clause, null, null, style, null, 11) : clause instanceof CompositeClause ? CompositeClause.a((CompositeClause) clause, null, style, 11) : clause instanceof TextLocalisedClause ? TextLocalisedClause.c((TextLocalisedClause) clause, null, style, 27) : new CompositeClause(u.c(clause), null, style, null, 10);
    }

    public static final CompositeClause g(Clause clause, ImageClauseTint imageClauseTint) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        return new CompositeClause(v.k(clause, new ImageClause(R$drawable.uikit_icn_16_info_outline, imageClauseTint, (Float) null, (Float) null, 28)), e(2), null, null, 12);
    }
}
