package x8h;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f303379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f303380b;

    public s(Instant to6, Instant from) {
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(from, "from");
        this.f303379a = to6;
        this.f303380b = from;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f303379a, sVar.f303379a) && Intrinsics.f(this.f303380b, sVar.f303380b);
    }

    public final int hashCode() {
        return this.f303380b.hashCode() + (this.f303379a.hashCode() * 31);
    }
}
