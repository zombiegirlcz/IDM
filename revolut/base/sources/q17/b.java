package q17;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerOrder f241394a;

    public b(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f241394a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f241394a, ((b) obj2).f241394a);
    }

    public final int hashCode() {
        return this.f241394a.hashCode();
    }
}
