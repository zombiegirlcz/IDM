package du;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f117491a;

    public d(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f117491a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f117491a, ((d) obj2).f117491a);
    }

    public final int hashCode() {
        return this.f117491a.hashCode();
    }
}
