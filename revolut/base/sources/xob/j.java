package xob;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f307774a;

    public j(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        this.f307774a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f307774a, ((j) obj2).f307774a);
    }

    public final int hashCode() {
        return this.f307774a.hashCode();
    }
}
