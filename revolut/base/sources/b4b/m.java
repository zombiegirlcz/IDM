package b4b;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Asset f12225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12226b;

    public m(Asset asset, int i) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f12225a = asset;
        this.f12226b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f12225a, mVar.f12225a) && this.f12226b == mVar.f12226b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12226b) + (this.f12225a.hashCode() * 31);
    }
}
