package uv5;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f283321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f283322b;

    public i(xi0.b currency, Instant lastSeen) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(lastSeen, "lastSeen");
        this.f283321a = currency;
        this.f283322b = lastSeen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f283321a, iVar.f283321a) && Intrinsics.f(this.f283322b, iVar.f283322b);
    }

    public final int hashCode() {
        return this.f283322b.hashCode() + (this.f283321a.hashCode() * 31);
    }
}
