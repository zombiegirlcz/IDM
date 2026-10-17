package ugd;

import aii.e;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f280024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetTypeKey f280025b;

    public d(FavouritesAssetTypeKey assetTypeKey, Pair assetIdPair) {
        Intrinsics.checkNotNullParameter(assetIdPair, "assetIdPair");
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f280024a = assetIdPair;
        this.f280025b = assetTypeKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f280024a, dVar.f280024a) && Intrinsics.f(this.f280025b, dVar.f280025b);
    }

    public final int hashCode() {
        return this.f280025b.f86866a.hashCode() + (this.f280024a.hashCode() * 31);
    }
}
