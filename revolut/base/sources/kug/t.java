package kug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosurePreconditionsStatus f189806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f189807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ltg.a f189808c;

    public t(AccountClosurePreconditionsStatus preconditions, hel.b bVar, ltg.a pendingAssetsCheckResult) {
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        Intrinsics.checkNotNullParameter(pendingAssetsCheckResult, "pendingAssetsCheckResult");
        this.f189806a = preconditions;
        this.f189807b = bVar;
        this.f189808c = pendingAssetsCheckResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f189806a, tVar.f189806a) && this.f189807b == tVar.f189807b && this.f189808c == tVar.f189808c;
    }

    public final int hashCode() {
        int iHashCode = this.f189806a.hashCode() * 31;
        hel.b bVar = this.f189807b;
        return this.f189808c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
