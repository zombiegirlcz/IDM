package i2m;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import k1m.l;
import k1m.q;
import k1m.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158062a;

    private final Object d(q reader) {
        LocalDate localDate;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String strM = reader.m();
            Intrinsics.checkNotNullExpressionValue(strM, "nextString(...)");
            DateTimeFormatter dateTimeFormatter = d2m.a.f110885a;
            Intrinsics.checkNotNullParameter(strM, "<this>");
            localDate = LocalDate.parse(strM);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        }
        return localDate;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.time.ZonedDateTime] */
    private final Object e(q reader) {
        ChronoLocalDateTime<LocalDate> localDateTime;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String strM = reader.m();
            Intrinsics.checkNotNullExpressionValue(strM, "nextString(...)");
            DateTimeFormatter dateTimeFormatter = d2m.a.f110885a;
            Intrinsics.checkNotNullParameter(strM, "<this>");
            localDateTime = ZonedDateTime.parse(strM).withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
            Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        }
        return localDateTime;
    }

    private final void f(t writer, Object obj2) {
        String str;
        LocalDate localDate = (LocalDate) obj2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (localDate != null) {
                DateTimeFormatter dateTimeFormatter = d2m.a.f110885a;
                Intrinsics.checkNotNullParameter(localDate, "<this>");
                str = localDate.format(d2m.a.f110885a);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = null;
            }
            writer.l(str);
        }
    }

    private final void g(t writer, Object obj2) {
        String string;
        LocalDateTime localDateTime = (LocalDateTime) obj2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (localDateTime != null) {
                DateTimeFormatter dateTimeFormatter = d2m.a.f110885a;
                Intrinsics.checkNotNullParameter(localDateTime, "<this>");
                Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
                Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
                string = instant.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            } else {
                string = null;
            }
            writer.l(string);
        }
    }

    public final Object a(q qVar) {
        switch (this.f158062a) {
            case 0:
                return d(qVar);
            default:
                return e(qVar);
        }
    }

    public final void c(t tVar, Object obj2) {
        switch (this.f158062a) {
            case 0:
                f(tVar, obj2);
                break;
            default:
                g(tVar, obj2);
                break;
        }
    }
}
