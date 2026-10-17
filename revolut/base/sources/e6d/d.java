package e6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122976a;

    public d(String ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f122976a = ownerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f122976a, ((d) obj2).f122976a);
    }

    public final int hashCode() {
        return this.f122976a.hashCode();
    }
}
