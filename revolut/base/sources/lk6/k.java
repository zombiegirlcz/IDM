package lk6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f196248b;

    public k(String fieldId, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        this.f196247a = fieldId;
        this.f196248b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f196247a, kVar.f196247a) && Intrinsics.f(this.f196248b, kVar.f196248b);
    }

    public final int hashCode() {
        int iHashCode = this.f196247a.hashCode() * 31;
        LocalDate localDate = this.f196248b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
