package zc0;

import com.revolut.feature.backend_flow.domain.models.DateOption;
import com.revolut.feature.backend_flow.domain.models.Filter;
import com.revolut.feature.backend_flow.domain.models.FilterValue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Filter f321031a;

    public c3(Filter filter) {
        this.f321031a = filter;
    }

    public static boolean a(Date date, Filter.Between between) {
        LocalDate localDateFromDateFields = LocalDate.fromDateFields(date);
        LocalDate localDateC = c((FilterValue.DateValue) between.f63443c);
        LocalDate localDateC2 = c((FilterValue.DateValue) between.d);
        boolean z = localDateFromDateFields.isAfter(localDateC) && localDateFromDateFields.isBefore(localDateC2);
        if (between.f63441a) {
            z = z || localDateFromDateFields.isEqual(localDateC);
        }
        return between.f63442b ? z || localDateFromDateFields.isEqual(localDateC2) : z;
    }

    public static boolean b(Date date, Filter.In in10) {
        Object next;
        Set set = in10.f63448a;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((FilterValue.DateValue) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (((LocalDate) next).isEqual(LocalDate.fromDateFields(date))) {
                break;
            }
        }
        return ((LocalDate) next) != null;
    }

    public static LocalDate c(FilterValue.DateValue dateValue) {
        DateOption dateOption = dateValue.f63454a;
        if (dateOption instanceof DateOption.Now) {
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            return localDateNow;
        }
        if (dateOption instanceof DateOption.Specific) {
            return ((DateOption.Specific) dateOption).f63384a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
