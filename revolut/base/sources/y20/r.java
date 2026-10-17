package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f310540b;

    public r(UUID uuid, UUID feedId) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        this.f310539a = uuid;
        this.f310540b = feedId;
    }

    @Override // y20.t
    public final boolean a() {
        return this.f310539a == null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f310539a, rVar.f310539a) && Intrinsics.f(this.f310540b, rVar.f310540b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(100) * 961;
        UUID uuid = this.f310539a;
        return this.f310540b.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31);
    }
}
