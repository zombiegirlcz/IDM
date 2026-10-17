package l5i;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f192279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f192280b;

    public g() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f192279a, gVar.f192279a) && this.f192280b == gVar.f192280b;
    }

    public final int hashCode() {
        Instant instant = this.f192279a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        z zVar = this.f192280b;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public g(Instant instant, z zVar) {
        this.f192279a = instant;
        this.f192280b = zVar;
    }
}
