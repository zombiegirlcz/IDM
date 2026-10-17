package f83;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f132720b;

    public f(String last4, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(last4, "last4");
        this.f132719a = last4;
        this.f132720b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f132719a, fVar.f132719a) && Intrinsics.f(this.f132720b, fVar.f132720b);
    }

    public final int hashCode() {
        int iHashCode = this.f132719a.hashCode() * 31;
        LocalDate localDate = this.f132720b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
