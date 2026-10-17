package hk6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f152858b;

    public j(String fieldId, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        this.f152857a = fieldId;
        this.f152858b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f152857a, jVar.f152857a) && Intrinsics.f(this.f152858b, jVar.f152858b);
    }

    public final int hashCode() {
        int iHashCode = this.f152857a.hashCode() * 31;
        LocalDate localDate = this.f152858b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
