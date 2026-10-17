package j02;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f169930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f169931b;

    public q(dj0.d dVar, LocalDate localDate) {
        this.f169930a = localDate;
        this.f169931b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f169930a, qVar.f169930a) && Intrinsics.f(this.f169931b, qVar.f169931b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f169930a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        dj0.d dVar = this.f169931b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
