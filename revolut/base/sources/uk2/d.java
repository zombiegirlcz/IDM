package uk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv0.b f280646a;

    public d(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f280646a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f280646a == ((d) obj2).f280646a;
    }

    public final int hashCode() {
        return this.f280646a.hashCode();
    }
}
