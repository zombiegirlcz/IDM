package a40;

import aii.s;
import hlm.c;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f1184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f1185c;
    public final s d;

    public a(c seed, UUID uuid, c0 feedType, s sVar) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f1183a = seed;
        this.f1184b = uuid;
        this.f1185c = feedType;
        this.d = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f1183a, aVar.f1183a) && Intrinsics.f(this.f1184b, aVar.f1184b) && this.f1185c == aVar.f1185c && this.d == aVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f1183a.hashCode() * 31;
        UUID uuid = this.f1184b;
        int iHashCode2 = (this.f1185c.hashCode() + ((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31)) * 31;
        s sVar = this.d;
        return iHashCode2 + (sVar != null ? sVar.hashCode() : 0);
    }
}
