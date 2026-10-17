package kw6;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f190295a;

    public b(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f190295a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f190295a, ((b) obj2).f190295a);
    }

    public final int hashCode() {
        return this.f190295a.hashCode();
    }
}
