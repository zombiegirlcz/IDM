package f83;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f132718a;

    public e(LocalDate expiryDate) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        this.f132718a = expiryDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f132718a, ((e) obj2).f132718a);
    }

    public final int hashCode() {
        return this.f132718a.hashCode();
    }
}
