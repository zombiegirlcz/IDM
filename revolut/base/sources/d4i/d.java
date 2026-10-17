package d4i;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f111325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Asset f111326b;

    public d(Asset fromAsset, Asset toAsset) {
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(toAsset, "toAsset");
        this.f111325a = fromAsset;
        this.f111326b = toAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f111325a, dVar.f111325a) && Intrinsics.f(this.f111326b, dVar.f111326b);
    }

    public final int hashCode() {
        return this.f111326b.hashCode() + (this.f111325a.hashCode() * 31);
    }
}
