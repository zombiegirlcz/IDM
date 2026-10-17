package j02;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f169928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f169929b;

    public p(dj0.d dVar, LocalDate localDate) {
        this.f169928a = localDate;
        this.f169929b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f169928a, pVar.f169928a) && Intrinsics.f(this.f169929b, pVar.f169929b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f169928a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        dj0.d dVar = this.f169929b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
