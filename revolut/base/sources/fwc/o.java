package fwc;

import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundTransactionLimit f138611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitType f138612b;

    public o(OutboundTransactionLimit limit, LimitType limitType) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f138611a = limit;
        this.f138612b = limitType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f138611a, oVar.f138611a) && Intrinsics.f(this.f138612b, oVar.f138612b);
    }

    public final int hashCode() {
        return this.f138612b.hashCode() + (this.f138611a.hashCode() * 31);
    }
}
