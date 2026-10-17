package gd1;

import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReceiptInfo f143032a;

    public c(ReceiptInfo receiptInfo) {
        Intrinsics.checkNotNullParameter(receiptInfo, "receiptInfo");
        this.f143032a = receiptInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f143032a, ((c) obj2).f143032a);
    }

    public final int hashCode() {
        return this.f143032a.hashCode();
    }
}
