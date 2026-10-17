package x8h;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.g f303352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f303353b;

    public j0(vel.g asset, Instant lastSeen) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(lastSeen, "lastSeen");
        this.f303352a = asset;
        this.f303353b = lastSeen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f303352a, j0Var.f303352a) && Intrinsics.f(this.f303353b, j0Var.f303353b);
    }

    public final int hashCode() {
        return this.f303353b.hashCode() + (this.f303352a.hashCode() * 31);
    }
}
