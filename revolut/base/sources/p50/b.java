package p50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f232990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f232991b;

    public b(UUID feedId, UUID uuid) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        this.f232990a = feedId;
        this.f232991b = uuid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f232990a, bVar.f232990a) && Intrinsics.f(this.f232991b, bVar.f232991b);
    }

    public final int hashCode() {
        int iHashCode = this.f232990a.hashCode() * 31;
        UUID uuid = this.f232991b;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }
}
