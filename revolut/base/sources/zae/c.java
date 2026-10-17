package zae;

import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qua.u;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final boolean a(qua.p pVar, RecurringPaymentFilter filter, ZonedDateTime nowDate) {
        LocalDate localDateE;
        LocalDate localDateE2;
        LocalDate localDateE3;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(nowDate, "nowDate");
        if (filter instanceof RecurringPaymentFilter.ByIdSet) {
            return ((RecurringPaymentFilter.ByIdSet) filter).f89326a.contains(pVar.f249314a.f160150a);
        }
        if (filter instanceof RecurringPaymentFilter.BySourcePocketIdSet) {
            return d0.T(((RecurringPaymentFilter.BySourcePocketIdSet) filter).f89334a, pVar.W);
        }
        if (filter instanceof RecurringPaymentFilter.BySourcePocketId) {
            return Intrinsics.f(pVar.W, ((RecurringPaymentFilter.BySourcePocketId) filter).f89333a);
        }
        if (filter instanceof RecurringPaymentFilter.ByReceiverId) {
            return d0.T(((RecurringPaymentFilter.ByReceiverId) filter).f89331a, pVar.f249318c);
        }
        if (filter instanceof RecurringPaymentFilter.ByCurrency) {
            return Intrinsics.f(pVar.i, ((RecurringPaymentFilter.ByCurrency) filter).f89325a);
        }
        if (filter instanceof RecurringPaymentFilter.BySourceCurrency) {
            return Intrinsics.f(pVar.f249322h, ((RecurringPaymentFilter.BySourceCurrency) filter).f89332a);
        }
        if (filter instanceof RecurringPaymentFilter.ByNextDateGreaterOrEqualThan) {
            org.joda.time.LocalDate localDate = pVar.f249314a.f;
            if (localDate == null || (localDateE3 = jli.b.e(localDate)) == null) {
                return false;
            }
            return !localDateE3.isBefore(((RecurringPaymentFilter.ByNextDateGreaterOrEqualThan) filter).f89328a);
        }
        if (filter instanceof RecurringPaymentFilter.ByNextDateLessOrEqualThan) {
            org.joda.time.LocalDate localDate2 = pVar.f249314a.f;
            if (localDate2 == null || (localDateE2 = jli.b.e(localDate2)) == null) {
                return false;
            }
            return !localDateE2.isAfter(((RecurringPaymentFilter.ByNextDateLessOrEqualThan) filter).f89329a);
        }
        if (filter instanceof RecurringPaymentFilter.ByNextDateFromNow) {
            org.joda.time.LocalDate localDate3 = pVar.f249314a.f;
            if (localDate3 == null || (localDateE = jli.b.e(localDate3)) == null) {
                return false;
            }
            LocalDate localDate4 = nowDate.toLocalDate();
            LocalDate localDatePlusDays = localDate4.plusDays(((RecurringPaymentFilter.ByNextDateFromNow) filter).f89327a);
            if (localDateE.compareTo((Object) localDate4) < 0) {
                return false;
            }
            Intrinsics.h(localDatePlusDays);
            if (localDateE.compareTo((Object) localDatePlusDays) > 0) {
                return false;
            }
        } else {
            if (filter instanceof RecurringPaymentFilter.ByPendingRefund) {
                return ofm.q.E(pVar);
            }
            if (filter instanceof RecurringPaymentFilter.ByActiveFromNow) {
                return u.h(pVar, nowDate);
            }
            if (!(filter instanceof RecurringPaymentFilter.And)) {
                if (!(filter instanceof RecurringPaymentFilter.Or)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = ((RecurringPaymentFilter.Or) filter).f89335a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (a(pVar, (RecurringPaymentFilter) it8.next(), nowDate)) {
                    }
                }
                return false;
            }
            List list2 = ((RecurringPaymentFilter.And) filter).f89323a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    if (!a(pVar, (RecurringPaymentFilter) it9.next(), nowDate)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final dj0.d b(hce.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Long l2 = c(cVar).f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = xi0.b.Companion;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f150886a.f150883a.i;
        aVar.getClass();
        return new dj0.d(jLongValue, xi0.a.a(str));
    }

    public static final qua.p c(hce.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f150886a.f150883a;
    }
}
