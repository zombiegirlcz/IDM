package imh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knh.h f162478a;

    public k(knh.h assetListSource) {
        Intrinsics.checkNotNullParameter(assetListSource, "assetListSource");
        this.f162478a = assetListSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f162478a, ((k) obj2).f162478a);
    }

    public final int hashCode() {
        return this.f162478a.hashCode();
    }
}
