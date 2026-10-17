package o17;

import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAccountDetails f221321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f221322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerOrder f221323c;
    public final List d;

    public j(FreelancerAccountDetails accountDetails, dj0.d dVar, FreelancerOrder order, List timelineEvents) {
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(timelineEvents, "timelineEvents");
        this.f221321a = accountDetails;
        this.f221322b = dVar;
        this.f221323c = order;
        this.d = timelineEvents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f221321a, jVar.f221321a) && Intrinsics.f(this.f221322b, jVar.f221322b) && Intrinsics.f(this.f221323c, jVar.f221323c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f221321a.hashCode() * 31;
        dj0.d dVar = this.f221322b;
        return this.d.hashCode() + ((this.f221323c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31);
    }
}
