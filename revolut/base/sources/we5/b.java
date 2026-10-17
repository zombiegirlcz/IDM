package we5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f296625a;

    public b(a stakeableAsset) {
        Intrinsics.checkNotNullParameter(stakeableAsset, "stakeableAsset");
        this.f296625a = stakeableAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f296625a, ((b) obj2).f296625a);
    }

    public final int hashCode() {
        return this.f296625a.hashCode();
    }
}
