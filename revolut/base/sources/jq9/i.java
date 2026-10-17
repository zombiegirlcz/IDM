package jq9;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.domain.models.moneyrequest.TransferLinkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferLinkDetails.Active f177503a;

    public i(TransferLinkDetails.Active paymentLink) {
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        this.f177503a = paymentLink;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177503a.f.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return this.f177503a.f60356g == TransferLinkDirection.INCOMING;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f177503a, ((i) obj2).f177503a);
    }

    public final int hashCode() {
        return this.f177503a.hashCode();
    }
}
