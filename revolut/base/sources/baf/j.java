package baf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferUserAccountInformation f14057a;

    public j(TransferUserAccountInformation userAccountInformation) {
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        this.f14057a = userAccountInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f14057a, ((j) obj2).f14057a);
    }

    public final int hashCode() {
        return this.f14057a.hashCode();
    }
}
