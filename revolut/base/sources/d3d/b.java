package d3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f111083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f111085c;
    public final Data d;

    public b(FavouritesAssetTypeKey assetTypeKey, boolean z, Data rates, Data names) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(names, "names");
        this.f111083a = assetTypeKey;
        this.f111084b = z;
        this.f111085c = rates;
        this.d = names;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f111083a, bVar.f111083a) && this.f111084b == bVar.f111084b && Intrinsics.f(this.f111085c, bVar.f111085c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f111085c, j6.a.c(this.f111083a.f86866a.hashCode() * 31, 31, this.f111084b), 31);
    }
}
