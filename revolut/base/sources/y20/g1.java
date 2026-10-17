package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f310499b;

    public g1(UUID uuid, UUID feedId) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        this.f310498a = uuid;
        this.f310499b = feedId;
    }

    @Override // y20.i1
    public final UUID a() {
        return this.f310498a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f310498a, g1Var.f310498a) && Intrinsics.f(this.f310499b, g1Var.f310499b);
    }

    @Override // y20.i1
    public final int getCount() {
        return 100;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(100) * 31;
        UUID uuid = this.f310498a;
        return this.f310499b.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31);
    }
}
