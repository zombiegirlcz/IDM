package sb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeDetails f261487a;

    public k(BarcodeDetails barcodeDetails) {
        this.f261487a = barcodeDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f261487a, ((k) obj2).f261487a);
    }

    public final int hashCode() {
        BarcodeDetails barcodeDetails = this.f261487a;
        if (barcodeDetails == null) {
            return 0;
        }
        return barcodeDetails.hashCode();
    }
}
