package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v30.c0 f310503b;

    public h1(UUID uuid, v30.c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f310502a = uuid;
        this.f310503b = feedType;
    }

    @Override // y20.i1
    public final UUID a() {
        return this.f310502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f310502a, h1Var.f310502a) && this.f310503b == h1Var.f310503b;
    }

    @Override // y20.i1
    public final int getCount() {
        return 100;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(100) * 31;
        UUID uuid = this.f310502a;
        return this.f310503b.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31);
    }
}
