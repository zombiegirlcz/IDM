package l5i;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f192289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Asset f192290b;

    public m(Asset fromAsset, Asset toAsset) {
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(toAsset, "toAsset");
        this.f192289a = fromAsset;
        this.f192290b = toAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f192289a, mVar.f192289a) && Intrinsics.f(this.f192290b, mVar.f192290b);
    }

    public final int hashCode() {
        return this.f192290b.hashCode() + (this.f192289a.hashCode() * 31);
    }
}
