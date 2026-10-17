package z3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f319246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319247b;

    public b(FavouritesAssetTypeKey assetTypeKey, int i) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f319246a = assetTypeKey;
        this.f319247b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319246a, bVar.f319246a) && this.f319247b == bVar.f319247b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f319247b) + (this.f319246a.f86866a.hashCode() * 31);
    }
}
