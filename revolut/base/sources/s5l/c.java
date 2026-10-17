package s5l;

import aw0.ka;
import aw0.o9;
import com.revolut.cards.shared.widgets.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static final Clause a(LocalDate localDate, boolean z) {
        return localDate == null ? new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : z ? b(localDate) : new TextLocalisedClause(R$string.card_delivery_widget_estimated_date, u.c(b(localDate)), null, 12);
    }

    public static final TimeClause b(LocalDate localDate) {
        TimeClause.Format dayAndMonth;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateNow = LocalDate.now();
        long jB = jli.b.b(localDate);
        if (localDateNow.getYear() == localDate.getYear()) {
            dayAndMonth = new TimeClause.Format.DayAndMonth(ka.SHORT);
        } else {
            TimeClause.Format.INSTANCE.getClass();
            dayAndMonth = TimeClause.Format.f57959a;
        }
        return new TimeClause(jB, dayAndMonth, null, null, 12);
    }
}
