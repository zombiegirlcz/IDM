package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v30.c0 f310545b;

    public s(UUID uuid, v30.c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f310544a = uuid;
        this.f310545b = feedType;
    }

    @Override // y20.t
    public final boolean a() {
        return this.f310544a == null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f310544a, sVar.f310544a) && this.f310545b == sVar.f310545b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(100) * 961;
        UUID uuid = this.f310544a;
        return this.f310545b.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31);
    }
}
