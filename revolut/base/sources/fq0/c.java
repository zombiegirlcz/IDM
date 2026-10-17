package fq0;

import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f137166a;

    public c(Set daysOfWeek) {
        Intrinsics.checkNotNullParameter(daysOfWeek, "daysOfWeek");
        this.f137166a = daysOfWeek;
    }

    @Override // fq0.a
    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return !this.f137166a.contains(date.getDayOfWeek());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f137166a, ((c) obj2).f137166a);
    }

    public final int hashCode() {
        return this.f137166a.hashCode();
    }
}
