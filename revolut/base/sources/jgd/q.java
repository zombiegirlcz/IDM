package jgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f173981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f173982b;

    public q(FavouritesAssetTypeKey assetTypeKey, xi0.b currency) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f173981a = assetTypeKey;
        this.f173982b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f173981a, qVar.f173981a) && Intrinsics.f(this.f173982b, qVar.f173982b);
    }

    public final int hashCode() {
        return this.f173982b.hashCode() + (this.f173981a.f86866a.hashCode() * 31);
    }
}
