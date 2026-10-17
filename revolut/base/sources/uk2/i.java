package uk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv0.b f280652a;

    public i(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f280652a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f280652a == ((i) obj2).f280652a;
    }

    public final int hashCode() {
        return this.f280652a.hashCode();
    }
}
