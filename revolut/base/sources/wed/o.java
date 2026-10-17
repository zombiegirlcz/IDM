package wed;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f296750a;

    public o(FavouritesAssetTypeKey assetTypeKey) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f296750a = assetTypeKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f296750a, ((o) obj2).f296750a);
    }

    public final int hashCode() {
        return this.f296750a.f86866a.hashCode();
    }
}
