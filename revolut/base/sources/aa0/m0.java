package aa0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f2735a;

    public m0(LocalDate localDate) {
        this.f2735a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f2735a, ((m0) obj2).f2735a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f2735a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
