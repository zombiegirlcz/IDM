package r77;

import com.revolut.feature.global_markets.domain.Market;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import k77.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s77.j;
import s77.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f252039a = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public static final f a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        BigDecimal bigDecimal = jVar.f260543a;
        String str = jVar.f260544b;
        DateTimeFormatter dateTimeFormatter = f252039a;
        LocalDate localDateFrom = LocalDate.from(dateTimeFormatter.parse(str));
        Intrinsics.checkNotNullExpressionValue(localDateFrom, "from(...)");
        BigDecimal bigDecimal2 = jVar.f260545c;
        String str2 = jVar.d;
        return new f(bigDecimal, localDateFrom, bigDecimal2, str2 != null ? LocalDate.from(dateTimeFormatter.parse(str2)) : null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final k77.n b(s77.w r20) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r77.d.b(s77.w):k77.n");
    }

    public static final j c(f fVar) {
        LocalDateTime localDateTimeAtStartOfDay;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        BigDecimal bigDecimal = fVar.f181831a;
        LocalDateTime localDateTimeAtStartOfDay2 = fVar.f181832b.atStartOfDay();
        DateTimeFormatter dateTimeFormatter = f252039a;
        String str = localDateTimeAtStartOfDay2.format(dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        BigDecimal bigDecimal2 = fVar.f181833c;
        LocalDate localDate = fVar.d;
        return new j(bigDecimal, str, bigDecimal2, (localDate == null || (localDateTimeAtStartOfDay = localDate.atStartOfDay()) == null) ? null : localDateTimeAtStartOfDay.format(dateTimeFormatter));
    }

    public static final z d(Market market) {
        Intrinsics.checkNotNullParameter(market, "<this>");
        int i = c.f252038b[market.ordinal()];
        if (i == 1) {
            return z.US;
        }
        if (i == 2) {
            return z.EUROPE;
        }
        if (i == 3) {
            return z.APAC;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(Market market) {
        Intrinsics.checkNotNullParameter(market, "<this>");
        return j6.a.q("market_details_", market.name());
    }
}
