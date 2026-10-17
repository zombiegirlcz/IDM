package kqd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f188381c;

    public h(String jointAccountId, Set pendingSelectedDestinationIds) {
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
        this.f188380b = jointAccountId;
        this.f188381c = pendingSelectedDestinationIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f188380b, hVar.f188380b) && Intrinsics.f(this.f188381c, hVar.f188381c);
    }

    public final int hashCode() {
        return this.f188381c.hashCode() + (this.f188380b.hashCode() * 31);
    }
}
