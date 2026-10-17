package nr6;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f218573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f218574b;

    public l0() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f218573a, l0Var.f218573a) && Intrinsics.f(this.f218574b, l0Var.f218574b);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.f218573a;
        int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
        LocalDateTime localDateTime2 = this.f218574b;
        return iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    public l0(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f218573a = localDateTime;
        this.f218574b = localDateTime2;
    }
}
