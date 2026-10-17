package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f225106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f225107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f225108c;

    public c(FavouritesAssetTypeKey assetTypeKey, xi0.b base, xi0.b counter) {
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(counter, "counter");
        this.f225106a = assetTypeKey;
        this.f225107b = base;
        this.f225108c = counter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f225106a, cVar.f225106a) && Intrinsics.f(this.f225107b, cVar.f225107b) && Intrinsics.f(this.f225108c, cVar.f225108c);
    }

    public final int hashCode() {
        return this.f225108c.hashCode() + h30.l.j(this.f225107b, this.f225106a.f86866a.hashCode() * 31, 31);
    }
}
