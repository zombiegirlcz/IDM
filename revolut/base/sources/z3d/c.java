package z3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f319248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f319249b;

    public c(FavouritesAssetTypeKey assetTypeKey, dj0.d money) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f319248a = assetTypeKey;
        this.f319249b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f319248a, cVar.f319248a) && Intrinsics.f(this.f319249b, cVar.f319249b);
    }

    public final int hashCode() {
        return this.f319249b.hashCode() + (this.f319248a.f86866a.hashCode() * 31);
    }
}
