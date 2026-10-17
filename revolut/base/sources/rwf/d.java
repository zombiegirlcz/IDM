package rwf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f257898b;

    public d(String title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f257897a = title;
        this.f257898b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f257897a, dVar.f257897a) && Intrinsics.f(this.f257898b, dVar.f257898b);
    }

    public final int hashCode() {
        int iHashCode = this.f257897a.hashCode() * 31;
        LocalDate localDate = this.f257898b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
