package xr6;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerOrder f308265a;

    public m(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f308265a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f308265a, ((m) obj2).f308265a);
    }

    public final int hashCode() {
        return this.f308265a.hashCode();
    }
}
