package na8;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f213827a;

    public j(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f213827a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f213827a, ((j) obj2).f213827a);
    }

    @Override // na8.k
    public final LocalDate getDate() {
        return this.f213827a;
    }

    public final int hashCode() {
        return this.f213827a.hashCode();
    }
}
