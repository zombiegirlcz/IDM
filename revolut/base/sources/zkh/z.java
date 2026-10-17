package zkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vel.f f323045a;

    public z(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f323045a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f323045a, ((z) obj2).f323045a);
    }

    public final int hashCode() {
        return this.f323045a.hashCode();
    }
}
