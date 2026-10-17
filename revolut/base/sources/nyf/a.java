package nyf;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f220862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f220863b;

    public a(LocalDate localDate, LocalDate localDate2) {
        this.f220862a = localDate;
        this.f220863b = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f220862a, aVar.f220862a) && Intrinsics.f(this.f220863b, aVar.f220863b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f220862a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f220863b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
