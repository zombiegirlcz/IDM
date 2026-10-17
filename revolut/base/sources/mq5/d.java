package mq5;

import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoWithdrawFeesBreakdownDetail f207888a;

    public d(CryptoWithdrawFeesBreakdownDetail detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.f207888a = detail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207888a, ((d) obj2).f207888a);
    }

    public final int hashCode() {
        return this.f207888a.hashCode();
    }
}
