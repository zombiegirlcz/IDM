package tgb;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f271143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f271144b;

    public i(dj0.d prizeAmount, Instant instant) {
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f271143a = prizeAmount;
        this.f271144b = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f271143a, iVar.f271143a) && Intrinsics.f(this.f271144b, iVar.f271144b);
    }

    public final int hashCode() {
        int iHashCode = this.f271143a.hashCode() * 31;
        Instant instant = this.f271144b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
