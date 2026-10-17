package sb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeDetails f261480a;

    public h() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f261480a, ((h) obj2).f261480a);
    }

    public final int hashCode() {
        BarcodeDetails barcodeDetails = this.f261480a;
        if (barcodeDetails == null) {
            return 0;
        }
        return barcodeDetails.hashCode();
    }

    public h(BarcodeDetails barcodeDetails) {
        this.f261480a = barcodeDetails;
    }
}
