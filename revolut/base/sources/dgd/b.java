package dgd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f114636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f114637b;

    public b(Set allAssetTypeKeys, Set initialSelectedAssetTypeKeys) {
        Intrinsics.checkNotNullParameter(allAssetTypeKeys, "allAssetTypeKeys");
        Intrinsics.checkNotNullParameter(initialSelectedAssetTypeKeys, "initialSelectedAssetTypeKeys");
        this.f114636a = allAssetTypeKeys;
        this.f114637b = initialSelectedAssetTypeKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f114636a, bVar.f114636a) && Intrinsics.f(this.f114637b, bVar.f114637b);
    }

    public final int hashCode() {
        return this.f114637b.hashCode() + (this.f114636a.hashCode() * 31);
    }
}
