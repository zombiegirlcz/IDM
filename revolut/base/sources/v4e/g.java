package v4e;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LocalTime f286049a;

    static {
        LocalTime localTimeOf = LocalTime.of(23, 59, 0);
        Intrinsics.checkNotNullExpressionValue(localTimeOf, "of(...)");
        f286049a = localTimeOf;
    }

    public static long a(LocalDate localDate) {
        return localDate.atTime(f286049a).toInstant(ZoneOffset.UTC).toEpochMilli();
    }
}
