package fq0;

import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f137165a;

    public b(Set dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.f137165a = dates;
    }

    @Override // fq0.a
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return !this.f137165a.contains(date);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f137165a, ((b) obj2).f137165a);
    }

    public final int hashCode() {
        return this.f137165a.hashCode();
    }
}
