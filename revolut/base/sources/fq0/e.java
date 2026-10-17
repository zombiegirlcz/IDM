package fq0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f137168a;

    public e(LocalDate minDate) {
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        this.f137168a = minDate;
    }

    @Override // fq0.a
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDate = this.f137168a;
        return Intrinsics.f(date, localDate) || date.isAfter(localDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137168a, ((e) obj2).f137168a);
    }

    public final int hashCode() {
        return this.f137168a.hashCode();
    }
}
