package w4i;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f294592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Asset f294593b;

    public v(Asset fromAsset, Asset toAsset) {
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(toAsset, "toAsset");
        this.f294592a = fromAsset;
        this.f294593b = toAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f294592a, vVar.f294592a) && Intrinsics.f(this.f294593b, vVar.f294593b);
    }

    public final int hashCode() {
        return this.f294593b.hashCode() + (this.f294592a.hashCode() * 31);
    }
}
