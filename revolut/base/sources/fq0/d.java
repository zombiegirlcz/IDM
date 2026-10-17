package fq0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f137167a;

    public d(LocalDate maxDate) {
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        this.f137167a = maxDate;
    }

    @Override // fq0.a
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDate = this.f137167a;
        return Intrinsics.f(date, localDate) || date.isBefore(localDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f137167a, ((d) obj2).f137167a);
    }

    public final int hashCode() {
        return this.f137167a.hashCode();
    }
}
