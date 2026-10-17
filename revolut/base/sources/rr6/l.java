package rr6;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f256719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f256720b;

    public l(int i, LocalDateTime activeUntilDate) {
        Intrinsics.checkNotNullParameter(activeUntilDate, "activeUntilDate");
        this.f256719a = i;
        this.f256720b = activeUntilDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f256719a == lVar.f256719a && Intrinsics.f(this.f256720b, lVar.f256720b);
    }

    public final int hashCode() {
        return this.f256720b.hashCode() + (Integer.hashCode(this.f256719a) * 31);
    }
}
