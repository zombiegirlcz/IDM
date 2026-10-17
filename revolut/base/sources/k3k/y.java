package k3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceTransferData f180810a;

    public y(RemittanceTransferData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f180810a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f180810a, ((y) obj2).f180810a);
    }

    public final int hashCode() {
        return this.f180810a.hashCode();
    }
}
