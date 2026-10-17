package f83;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f132698a;

    public b(LocalDate expiryDate) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f132698a = expiryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f132698a, ((b) obj2).f132698a);
    }

    public final int hashCode() {
        return this.f132698a.hashCode();
    }
}
