package rr6;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f256699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f256700b;

    public d(i tierConfig, LocalDateTime activeUntilDate) {
        Intrinsics.checkNotNullParameter(tierConfig, "tierConfig");
        Intrinsics.checkNotNullParameter(activeUntilDate, "activeUntilDate");
        this.f256699a = tierConfig;
        this.f256700b = activeUntilDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f256699a, dVar.f256699a) && Intrinsics.f(this.f256700b, dVar.f256700b);
    }

    public final int hashCode() {
        return this.f256700b.hashCode() + (this.f256699a.hashCode() * 31);
    }
}
