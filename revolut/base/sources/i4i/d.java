package i4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3i.b f158498b;

    public d(String breakdownId, z3i.b endpoint) {
        Intrinsics.checkNotNullParameter(breakdownId, "breakdownId");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f158497a = breakdownId;
        this.f158498b = endpoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f158497a, dVar.f158497a) && this.f158498b == dVar.f158498b;
    }

    public final int hashCode() {
        return this.f158498b.hashCode() + (this.f158497a.hashCode() * 31);
    }
}
