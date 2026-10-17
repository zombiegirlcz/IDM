package wed;

import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetIdWithSymbol f296748b;

    public m(List assetTypeKeys, AssetIdWithSymbol assetIdWithSymbol) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f296747a = assetTypeKeys;
        this.f296748b = assetIdWithSymbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f296747a, mVar.f296747a) && Intrinsics.f(this.f296748b, mVar.f296748b);
    }

    public final int hashCode() {
        int iHashCode = this.f296747a.hashCode() * 31;
        AssetIdWithSymbol assetIdWithSymbol = this.f296748b;
        return iHashCode + (assetIdWithSymbol == null ? 0 : assetIdWithSymbol.hashCode());
    }
}
