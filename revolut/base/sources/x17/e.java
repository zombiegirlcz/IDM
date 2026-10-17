package x17;

import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t17.i f302318a;

    public e(t17.i dateRangeProvider) {
        Intrinsics.checkNotNullParameter(dateRangeProvider, "dateRangeProvider");
        this.f302318a = dateRangeProvider;
    }

    public final List a(List list, FilteringDateRange filteringDateRange, Function1 function1) {
        if (list.isEmpty() || filteringDateRange == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            DateTime dateTime = (DateTime) function1.invoke(obj2);
            if (dateTime != null) {
                Pair pairA = this.f302318a.a(filteringDateRange);
                LocalDateTime localDateTime = (LocalDateTime) pairA.f186385a;
                if (dateTime.toLocalDateTime().isBefore((LocalDateTime) pairA.f186386b) && dateTime.toLocalDateTime().isAfter(localDateTime)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }
}
