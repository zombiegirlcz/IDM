package hma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153603a;

    public i(String peerDisplayName) {
        Intrinsics.checkNotNullParameter(peerDisplayName, "peerDisplayName");
        this.f153603a = peerDisplayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f153603a, ((i) obj2).f153603a);
    }

    public final int hashCode() {
        return this.f153603a.hashCode();
    }
}
