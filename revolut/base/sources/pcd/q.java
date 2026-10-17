package pcd;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f234878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f234879b;

    public q(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f234878a = localDateTime;
        this.f234879b = localDateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f234878a, qVar.f234878a) && Intrinsics.f(this.f234879b, qVar.f234879b);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.f234878a;
        int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
        LocalDateTime localDateTime2 = this.f234879b;
        return iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }
}
