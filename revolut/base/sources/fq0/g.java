package fq0;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f137170a;

    public g(LocalDate maxDate) {
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        this.f137170a = maxDate;
    }

    @Override // fq0.f
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        ReadablePartial readablePartial = this.f137170a;
        return date.equals(readablePartial) || date.isBefore(readablePartial);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f137170a, ((g) obj2).f137170a);
    }

    public final int hashCode() {
        return this.f137170a.hashCode();
    }
}
