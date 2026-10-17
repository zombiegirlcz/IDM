package yfd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313221a;

    public o(List selectedFavouritesAssetIdPairs) {
        Intrinsics.checkNotNullParameter(selectedFavouritesAssetIdPairs, "selectedFavouritesAssetIdPairs");
        this.f313221a = selectedFavouritesAssetIdPairs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f313221a, ((o) obj2).f313221a);
    }

    public final int hashCode() {
        return this.f313221a.hashCode();
    }
}
