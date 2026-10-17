package bgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f15176a;

    public d(FavouritesAssetTypeKey assetTypeKey) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f15176a = assetTypeKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f15176a, ((d) obj2).f15176a);
    }

    public final int hashCode() {
        return this.f15176a.f86866a.hashCode();
    }
}
