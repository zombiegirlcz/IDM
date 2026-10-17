package so6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f264791b;

    public b(String id10, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f264790a = id10;
        this.f264791b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f264790a, bVar.f264790a) && Intrinsics.f(this.f264791b, bVar.f264791b);
    }

    public final int hashCode() {
        int iHashCode = this.f264790a.hashCode() * 31;
        LocalDate localDate = this.f264791b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
