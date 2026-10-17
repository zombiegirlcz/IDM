package up2;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f281818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn2.d f281819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f281820c;

    public f(mn2.a serviceType, wn2.d dVar, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f281818a = serviceType;
        this.f281819b = dVar;
        this.f281820c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f281818a == fVar.f281818a && this.f281819b == fVar.f281819b && Intrinsics.f(this.f281820c, fVar.f281820c);
    }

    public final int hashCode() {
        int iHashCode = this.f281818a.hashCode() * 31;
        wn2.d dVar = this.f281819b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f281820c;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }
}
