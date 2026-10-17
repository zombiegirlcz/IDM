package iuf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferData f168573a;

    public n(ManualTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f168573a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f168573a, ((n) obj2).f168573a);
    }

    public final int hashCode() {
        return this.f168573a.hashCode();
    }
}
