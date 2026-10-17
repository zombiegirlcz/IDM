package t90;

import com.revolut.feature.backend_flow.domain.models.DateOption;
import com.revolut.feature.backend_flow.domain.models.DateTimeOption;
import com.revolut.feature.backend_flow.domain.models.FilterValue;
import com.revolut.feature.backend_flow.domain.models.TimeOption;
import java.util.Date;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import q90.e2;
import q90.f2;
import q90.g2;
import q90.x;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    private static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f268934a = yhm.j.b(new ru0.d(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f268935b = yhm.j.b(new ru0.d(3));

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a {
        private a() {
        }

        public a(int i) {
        }
    }

    public static x b(FilterValue filterValue) {
        g2 cVar;
        e2 cVar2;
        f2 cVar3;
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        if (filterValue instanceof FilterValue.StringValue) {
            return new x.g(((FilterValue.StringValue) filterValue).getF63457a());
        }
        if (filterValue instanceof FilterValue.BooleanValue) {
            return new x.a(((FilterValue.BooleanValue) filterValue).getF63452a());
        }
        if (filterValue instanceof FilterValue.IntValue) {
            return new x.e(((FilterValue.IntValue) filterValue).getF63455a());
        }
        if (filterValue instanceof FilterValue.LongValue) {
            return new x.f(((FilterValue.LongValue) filterValue).getF63456a());
        }
        if (filterValue instanceof FilterValue.DateTimeValue) {
            DateTimeOption f63453a = ((FilterValue.DateTimeValue) filterValue).getF63453a();
            if (f63453a instanceof DateTimeOption.Now) {
                cVar3 = f2.b.f243298a;
            } else {
                if (!(f63453a instanceof DateTimeOption.Specific)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar3 = new f2.c(((DateTimeOption.Specific) f63453a).getF63386a().toDateTime().getMillis());
            }
            return new x.c(cVar3);
        }
        if (filterValue instanceof FilterValue.DateValue) {
            DateOption f63454a = ((FilterValue.DateValue) filterValue).getF63454a();
            if (f63454a instanceof DateOption.Now) {
                cVar2 = e2.b.f243281a;
            } else {
                if (!(f63454a instanceof DateOption.Specific)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string = ((DateOption.Specific) f63454a).getF63384a().toString("yyyy-MM-dd");
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                cVar2 = new e2.c(string);
            }
            return new x.d(cVar2);
        }
        if (!(filterValue instanceof FilterValue.TimeValue)) {
            throw new NoWhenBranchMatchedException();
        }
        TimeOption f63458a = ((FilterValue.TimeValue) filterValue).getF63458a();
        if (f63458a instanceof TimeOption.Now) {
            cVar = g2.b.f243316a;
        } else {
            if (!(f63458a instanceof TimeOption.Specific)) {
                throw new NoWhenBranchMatchedException();
            }
            String string2 = ((TimeOption.Specific) f63458a).getF63698a().toString("HH:mm:ssZZ");
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            cVar = new g2.c(string2);
        }
        return new x.h(cVar);
    }

    public final FilterValue a(x filterValue) {
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        if (filterValue instanceof x.g) {
            return new FilterValue.StringValue(((x.g) filterValue).getValue());
        }
        if (filterValue instanceof x.a) {
            return new FilterValue.BooleanValue(((x.a) filterValue).getValue());
        }
        if (filterValue instanceof x.c) {
            x.c cVar = (x.c) filterValue;
            f2 value = cVar.getValue();
            if (value instanceof f2.b) {
                return new FilterValue.DateTimeValue(DateTimeOption.Now.f63385a);
            }
            if (!(value instanceof f2.c)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDateTime localDateTimeFromDateFields = LocalDateTime.fromDateFields(new Date(((f2.c) cVar.getValue()).getValue()));
            Intrinsics.checkNotNullExpressionValue(localDateTimeFromDateFields, "fromDateFields(...)");
            return new FilterValue.DateTimeValue(new DateTimeOption.Specific(localDateTimeFromDateFields));
        }
        if (filterValue instanceof x.d) {
            x.d dVar = (x.d) filterValue;
            e2 value2 = dVar.getValue();
            if (value2 instanceof e2.b) {
                return new FilterValue.DateValue(DateOption.Now.f63383a);
            }
            if (!(value2 instanceof e2.c)) {
                throw new NoWhenBranchMatchedException();
            }
            String value3 = ((e2.c) dVar.getValue()).getValue();
            Object value4 = this.f268935b.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            LocalDate localDate = LocalDate.parse(value3, (DateTimeFormatter) value4);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            return new FilterValue.DateValue(new DateOption.Specific(localDate));
        }
        if (filterValue instanceof x.e) {
            return new FilterValue.IntValue(((x.e) filterValue).getValue());
        }
        if (filterValue instanceof x.f) {
            return new FilterValue.LongValue(((x.f) filterValue).getValue());
        }
        if (!(filterValue instanceof x.h)) {
            throw new NoWhenBranchMatchedException();
        }
        x.h hVar = (x.h) filterValue;
        g2 value5 = hVar.getValue();
        if (value5 instanceof g2.b) {
            return new FilterValue.TimeValue(TimeOption.Now.f63697a);
        }
        if (!(value5 instanceof g2.c)) {
            throw new NoWhenBranchMatchedException();
        }
        String value6 = ((g2.c) hVar.getValue()).getValue();
        Object value7 = this.f268934a.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        LocalTime localTime = LocalTime.parse(value6, (DateTimeFormatter) value7);
        Intrinsics.checkNotNullExpressionValue(localTime, "parse(...)");
        return new FilterValue.TimeValue(new TimeOption.Specific(localTime));
    }
}
