package tvk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetStatsId f274780b;

    public a(String nameString, AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(nameString, "nameString");
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        this.f274779a = nameString;
        this.f274780b = assetStatsId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f274779a, aVar.f274779a) && Intrinsics.f(this.f274780b, aVar.f274780b);
    }

    public final int hashCode() {
        return this.f274780b.hashCode() + (this.f274779a.hashCode() * 31);
    }
}
