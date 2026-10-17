package cu6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderCard;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import dj0.d;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nr6.o;
import nr6.q;
import nr6.y;
import org.joda.time.LocalDateTime;
import t17.i;
import w80.b;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f108814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f108815b;

    public a(b amountFormatter, i dateRangeProvider) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateRangeProvider, "dateRangeProvider");
        this.f108814a = amountFormatter;
        this.f108815b = dateRangeProvider;
    }

    public final boolean a(nr6.b order, AcquiringOrderFilter filter) {
        String str;
        String str2;
        q qVar;
        String str3;
        AcquiringOrderCard acquiringOrderCard;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter instanceof AcquiringOrderFilter.Channel) {
            return d0.T(((AcquiringOrderFilter.Channel) filter).f73346a, order.e);
        }
        if (filter instanceof AcquiringOrderFilter.Currency) {
            return ((AcquiringOrderFilter.Currency) filter).f73347a.contains(order.f218549s.f115083b);
        }
        if (filter instanceof AcquiringOrderFilter.DateRange) {
            Pair pairA = this.f108815b.a(((AcquiringOrderFilter.DateRange) filter).f73348a);
            LocalDateTime localDateTime = (LocalDateTime) pairA.f186385a;
            LocalDateTime localDateTime2 = (LocalDateTime) pairA.f186386b;
            if (order.f218538b.compareTo((ChronoLocalDateTime<?>) jli.b.f(localDateTime)) < 0 || order.f218538b.compareTo((ChronoLocalDateTime<?>) jli.b.f(localDateTime2)) > 0) {
                return false;
            }
        } else {
            if (filter instanceof AcquiringOrderFilter.FractionalAmount) {
                d dVar = order.f218549s;
                long j2 = dVar.f115082a;
                String str6 = dVar.f115083b.f306286a;
                AcquiringOrderFilter.FractionalAmount fractionalAmount = (AcquiringOrderFilter.FractionalAmount) filter;
                String str7 = fractionalAmount.f73349a;
                b bVar = this.f108814a;
                Long lValueOf = str7 != null ? Long.valueOf(bVar.b(str7, str6)) : null;
                String str8 = fractionalAmount.f73350b;
                Long lValueOf2 = str8 != null ? Long.valueOf(bVar.b(str8, str6)) : null;
                if (lValueOf != null && j2 < lValueOf.longValue()) {
                    return false;
                }
                if (lValueOf2 != null && j2 > lValueOf2.longValue()) {
                    return false;
                }
            } else {
                if (filter instanceof AcquiringOrderFilter.Id) {
                    return ((AcquiringOrderFilter.Id) filter).f73351a.contains(new AcquiringOrder$Id(order.f218537a));
                }
                if (filter instanceof AcquiringOrderFilter.InitiationPageId) {
                    Set set = ((AcquiringOrderFilter.InitiationPageId) filter).f73352a;
                    o oVar = order.f218546p;
                    return d0.T(set, oVar != null ? oVar.f218576a : null);
                }
                if (filter instanceof AcquiringOrderFilter.Query) {
                    String str9 = ((AcquiringOrderFilter.Query) filter).f73353a;
                    if (!kotlin.text.d0.W(str9)) {
                        String str10 = order.f218537a;
                        y yVar = order.f218544m;
                        if (!kotlin.text.d0.J(str10, str9, true) && !kotlin.text.d0.J(order.i, str9, true) && (((str = order.f218541h) == null || !kotlin.text.d0.J(str, str9, true)) && (((str2 = order.f218540g) == null || !kotlin.text.d0.J(str2, str9, true)) && ((yVar == null || (str5 = yVar.f218588a) == null || !kotlin.text.d0.J(str5, str9, true)) && ((yVar == null || (acquiringOrderCard = yVar.f218590c) == null || (str4 = acquiringOrderCard.f73344b) == null || !kotlin.text.d0.J(str4, str9, true)) && ((qVar = order.f218548r) == null || (str3 = qVar.f218579b) == null || !kotlin.text.d0.J(str3, str9, true))))))) {
                            return false;
                        }
                    }
                } else {
                    if (filter instanceof AcquiringOrderFilter.Status) {
                        return d0.T(((AcquiringOrderFilter.Status) filter).f73354a, order.d);
                    }
                    if (!(filter instanceof AcquiringOrderFilter.All)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Set set2 = ((AcquiringOrderFilter.All) filter).f73345a;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it8 = set2.iterator();
                        while (it8.hasNext()) {
                            if (!a(order, (AcquiringOrderFilter) it8.next())) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
