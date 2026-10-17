package xs4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f308415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f308416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f308417c;

    public s(dj0.d principal, dj0.d dVar, LocalDate nextInstalmentDate) {
        Intrinsics.checkNotNullParameter(principal, "principal");
        Intrinsics.checkNotNullParameter(nextInstalmentDate, "nextInstalmentDate");
        this.f308415a = principal;
        this.f308416b = dVar;
        this.f308417c = nextInstalmentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f308415a, sVar.f308415a) && Intrinsics.f(this.f308416b, sVar.f308416b) && Intrinsics.f(this.f308417c, sVar.f308417c);
    }

    public final int hashCode() {
        int iHashCode = this.f308415a.hashCode() * 31;
        dj0.d dVar = this.f308416b;
        return this.f308417c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
