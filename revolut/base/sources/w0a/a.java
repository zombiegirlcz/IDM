package w0a;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemizationReceiptDeletionData f293672b;

    public a(String uri2, ItemizationReceiptDeletionData itemizationReceiptDeletionData) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f293671a = uri2;
        this.f293672b = itemizationReceiptDeletionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f293671a, aVar.f293671a) && Intrinsics.f(this.f293672b, aVar.f293672b);
    }

    public final int hashCode() {
        int iHashCode = this.f293671a.hashCode() * 31;
        ItemizationReceiptDeletionData itemizationReceiptDeletionData = this.f293672b;
        return iHashCode + (itemizationReceiptDeletionData == null ? 0 : itemizationReceiptDeletionData.hashCode());
    }
}
