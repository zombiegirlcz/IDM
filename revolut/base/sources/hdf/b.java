package hdf;

import aii.r;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f151427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f151428b;

    public b(r0 orderType, Amount targetPrice) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        this.f151427a = orderType;
        this.f151428b = targetPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f151427a == bVar.f151427a && Intrinsics.f(this.f151428b, bVar.f151428b);
    }

    public final int hashCode() {
        return this.f151428b.hashCode() + (this.f151427a.hashCode() * 31);
    }
}
