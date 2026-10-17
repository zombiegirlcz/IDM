package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f5294b;

    public v(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f5294b = destination;
    }

    public final u b() {
        return this.f5294b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f5294b, ((v) obj2).f5294b);
    }

    public final int hashCode() {
        return this.f5294b.hashCode();
    }
}
