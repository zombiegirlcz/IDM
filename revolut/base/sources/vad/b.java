package vad;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f287264c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f287265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f287266b;

    static {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now(...)");
        f287264c = new b(localDateTimeNow, LocalDateTime.now());
    }

    public b(LocalDateTime from, LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f287265a = from;
        this.f287266b = localDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f287265a, bVar.f287265a) && Intrinsics.f(this.f287266b, bVar.f287266b);
    }

    public final int hashCode() {
        int iHashCode = this.f287265a.hashCode() * 31;
        LocalDateTime localDateTime = this.f287266b;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }
}
