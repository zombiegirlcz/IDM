package fq0;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f137171a;

    public h(LocalDate minDate) {
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        this.f137171a = minDate;
    }

    @Override // fq0.f
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        ReadablePartial readablePartial = this.f137171a;
        return date.equals(readablePartial) || date.isAfter(readablePartial);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f137171a, ((h) obj2).f137171a);
    }

    public final int hashCode() {
        return this.f137171a.hashCode();
    }
}
