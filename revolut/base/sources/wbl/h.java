package wbl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f296265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f296266b;

    public h(nel.n instrument, Instant lastSeen) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(lastSeen, "lastSeen");
        this.f296265a = instrument;
        this.f296266b = lastSeen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f296265a, hVar.f296265a) && Intrinsics.f(this.f296266b, hVar.f296266b);
    }

    public final int hashCode() {
        return this.f296266b.hashCode() + (this.f296265a.hashCode() * 31);
    }
}
