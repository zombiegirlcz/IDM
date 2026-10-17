package cm4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f25128b;

    public i(String facilityId, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f25127a = facilityId;
        this.f25128b = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25127a, iVar.f25127a) && Intrinsics.f(this.f25128b, iVar.f25128b);
    }

    public final int hashCode() {
        return this.f25128b.hashCode() + (this.f25127a.hashCode() * 31);
    }
}
