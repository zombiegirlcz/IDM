package vl4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f290288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f290289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f290290c;
    public final LocalDate d;

    public u(s sVar, n nVar, r rVar, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f290288a = sVar;
        this.f290289b = nVar;
        this.f290290c = rVar;
        this.d = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f290288a, uVar.f290288a) && Intrinsics.f(this.f290289b, uVar.f290289b) && Intrinsics.f(this.f290290c, uVar.f290290c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        s sVar = this.f290288a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        n nVar = this.f290289b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        r rVar = this.f290290c;
        return this.d.hashCode() + ((iHashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31);
    }
}
