package pc1;

import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReceiptInfo f234784a;

    public d(ReceiptInfo receiptInfo) {
        Intrinsics.checkNotNullParameter(receiptInfo, "receiptInfo");
        this.f234784a = receiptInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f234784a, ((d) obj2).f234784a);
    }

    public final int hashCode() {
        return this.f234784a.hashCode();
    }
}
