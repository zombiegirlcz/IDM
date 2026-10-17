package mgd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f205260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f205261b;

    public c(FavouritesAssetTypeKey assetTypeKey, Data items) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f205260a = assetTypeKey;
        this.f205261b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f205260a, cVar.f205260a) && Intrinsics.f(this.f205261b, cVar.f205261b);
    }

    public final int hashCode() {
        return this.f205261b.hashCode() + (this.f205260a.f86866a.hashCode() * 31);
    }
}
