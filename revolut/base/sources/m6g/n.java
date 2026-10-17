package m6g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.j f203101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f203102c;

    public n(String reference, m7g.j type, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f203100a = reference;
        this.f203101b = type;
        this.f203102c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f203100a, nVar.f203100a) && this.f203101b == nVar.f203101b && Intrinsics.f(this.f203102c, nVar.f203102c);
    }

    public final int hashCode() {
        int iHashCode = (this.f203101b.hashCode() + (this.f203100a.hashCode() * 31)) * 31;
        LocalDate localDate = this.f203102c;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
