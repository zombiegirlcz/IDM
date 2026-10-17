package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f225104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f225105b;

    public b(FavouritesAssetTypeKey assetTypeKey, xi0.b currency) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f225104a = assetTypeKey;
        this.f225105b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f225104a, bVar.f225104a) && Intrinsics.f(this.f225105b, bVar.f225105b);
    }

    public final int hashCode() {
        return this.f225105b.hashCode() + (this.f225104a.f86866a.hashCode() * 31);
    }
}
