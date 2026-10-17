package r47;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.List;
import oc.c;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1387a Companion = new C1387a();

    /* JADX INFO: renamed from: r47.a$a, reason: collision with other inner class name */
    public static final class C1387a {
        private C1387a() {
        }
    }

    public static int a(LocalDate localDate, List list) {
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period) it8.next();
            if (localDate.compareTo((ChronoLocalDate) period.f74404a) >= 0 && localDate.compareTo((ChronoLocalDate) period.f74405b) <= 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static TextClause b(TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period, TimeClause.Format.Year year) {
        return new TextClause("%1$s – %2$s", (Style) null, (Integer) null, false, (o9) null, v.k(new TimeClause(c.N(period.f74404a), year, null, null, 12), new TimeClause(c.N(period.f74405b), year, null, null, 12)), 94);
    }
}
