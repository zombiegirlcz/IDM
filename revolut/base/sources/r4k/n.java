package r4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankTransferData f251489a;

    public n(BankTransferData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f251489a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f251489a, ((n) obj2).f251489a);
    }

    public final int hashCode() {
        return this.f251489a.hashCode();
    }
}
