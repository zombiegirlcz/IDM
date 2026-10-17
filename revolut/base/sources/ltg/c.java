package ltg;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosurePreconditionsStatus f199877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f199878b;

    public c(AccountClosurePreconditionsStatus status, a pendingAssetsCheckResult) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pendingAssetsCheckResult, "pendingAssetsCheckResult");
        this.f199877a = status;
        this.f199878b = pendingAssetsCheckResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f199877a, cVar.f199877a) && this.f199878b == cVar.f199878b;
    }

    public final int hashCode() {
        return this.f199878b.hashCode() + (this.f199877a.hashCode() * 31);
    }
}
