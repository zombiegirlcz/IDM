package dwc;

import aii.r;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f120359a;

    public f(OutboundTransactionLimit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        LimitType.OutboundLimit limitType = LimitType.OutboundLimit.f85503a;
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f120359a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f) || !Intrinsics.f(this.f120359a, ((f) obj2).f120359a)) {
            return false;
        }
        Object obj3 = LimitType.OutboundLimit.f85503a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return LimitType.OutboundLimit.f85503a.hashCode() + (this.f120359a.hashCode() * 31);
    }
}
