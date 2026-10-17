package xed;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f304616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f304617b;

    public e(FavouritesAssetTypeKey selectedAssetTypeKey, Data alertItems) {
        Intrinsics.checkNotNullParameter(selectedAssetTypeKey, "selectedAssetTypeKey");
        Intrinsics.checkNotNullParameter(alertItems, "alertItems");
        this.f304616a = selectedAssetTypeKey;
        this.f304617b = alertItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f304616a, eVar.f304616a) && Intrinsics.f(this.f304617b, eVar.f304617b);
    }

    public final int hashCode() {
        return this.f304617b.hashCode() + (this.f304616a.f86866a.hashCode() * 31);
    }
}
