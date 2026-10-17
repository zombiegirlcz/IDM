package hbf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferRequest f150670a;

    public m(TransferRequest transferRequest) {
        Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
        this.f150670a = transferRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f150670a, ((m) obj2).f150670a);
    }

    public final int hashCode() {
        return this.f150670a.hashCode();
    }
}
