package p50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f232992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f232993b;

    public c() {
        this((c0) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f232992a == cVar.f232992a && Intrinsics.f(this.f232993b, cVar.f232993b);
    }

    public final int hashCode() {
        int iHashCode = this.f232992a.hashCode() * 31;
        UUID uuid = this.f232993b;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public c(UUID uuid, c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f232992a = feedType;
        this.f232993b = uuid;
    }

    public /* synthetic */ c(c0 c0Var, int i) {
        this((UUID) null, (i & 1) != 0 ? c0.SUPPORT : c0Var);
    }
}
