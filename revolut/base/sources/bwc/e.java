package bwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f19311a;

    public e(OutboundTransactionLimit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f19311a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f19311a, ((e) obj2).f19311a);
    }

    public final int hashCode() {
        return this.f19311a.hashCode();
    }
}
