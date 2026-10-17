package qy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f250152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f250153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f250154c;

    public g(long j2, Long l2, boolean z) {
        this.f250152a = j2;
        this.f250153b = l2;
        this.f250154c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f250152a == gVar.f250152a && Intrinsics.f(this.f250153b, gVar.f250153b) && this.f250154c == gVar.f250154c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f250152a) * 31;
        Long l2 = this.f250153b;
        return Boolean.hashCode(this.f250154c) + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
