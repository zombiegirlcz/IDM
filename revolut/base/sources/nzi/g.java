package nzi;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f221071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f221072b;

    public g(long j2, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f221071a = date;
        this.f221072b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f221071a, gVar.f221071a) && this.f221072b == gVar.f221072b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f221072b) + (this.f221071a.hashCode() * 31);
    }
}
