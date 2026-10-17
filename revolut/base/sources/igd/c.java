package igd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f161160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161161b;

    public c(FavouritesAssetTypeKey assetTypeKey, String selectedAssetCode) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(selectedAssetCode, "selectedAssetCode");
        this.f161160a = assetTypeKey;
        this.f161161b = selectedAssetCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161160a, cVar.f161160a) && Intrinsics.f(this.f161161b, cVar.f161161b);
    }

    public final int hashCode() {
        return this.f161161b.hashCode() + (this.f161160a.f86866a.hashCode() * 31);
    }
}
