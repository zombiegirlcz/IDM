package sia;

import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import ria.a;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f263533a;

    public a(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f263533a = dateProvider;
    }

    public static LocalDate a(LocalDate localDate) {
        return localDate.withDayOfMonth(1).plusDays(((long) YearMonth.of(localDate.getYear(), localDate.getMonth()).lengthOfMonth()) - 1);
    }

    public static kia.a b() {
        a.b bVar = a.b.f254572a;
        Object obj2 = a.C1405a.f254571a;
        if (obj2.equals(bVar)) {
            return kia.a.DAY;
        }
        if (obj2.equals(obj2)) {
            return kia.a.WEEK;
        }
        if (obj2.equals(a.c.f254573a) || obj2.equals(a.d.f254574a)) {
            return kia.a.MONTH;
        }
        throw new NoWhenBranchMatchedException();
    }
}
