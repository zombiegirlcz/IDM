package xs4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f308412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f308413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f308414c;

    public r(dj0.d principal, dj0.d dVar, LocalDate statementMonth) {
        Intrinsics.checkNotNullParameter(principal, "principal");
        Intrinsics.checkNotNullParameter(statementMonth, "statementMonth");
        this.f308412a = principal;
        this.f308413b = dVar;
        this.f308414c = statementMonth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f308412a, rVar.f308412a) && Intrinsics.f(this.f308413b, rVar.f308413b) && Intrinsics.f(this.f308414c, rVar.f308414c);
    }

    public final int hashCode() {
        int iHashCode = this.f308412a.hashCode() * 31;
        dj0.d dVar = this.f308413b;
        return this.f308414c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
