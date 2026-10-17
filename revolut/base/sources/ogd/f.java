package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f225112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f225113b;

    public f(FavouritesAssetTypeKey assetTypeKey, int i) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        this.f225112a = assetTypeKey;
        this.f225113b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f225112a, fVar.f225112a) && this.f225113b == fVar.f225113b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f225113b) + (this.f225112a.f86866a.hashCode() * 31);
    }
}
