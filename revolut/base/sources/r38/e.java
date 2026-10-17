package r38;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId.Joint f251206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4l.k f251207b;

    public e(AccountId.Joint accountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f251206a = accountId;
        this.f251207b = loadingStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f251206a, eVar.f251206a) && Intrinsics.f(this.f251207b, eVar.f251207b);
    }

    public final int hashCode() {
        return this.f251207b.hashCode() + (this.f251206a.hashCode() * 31);
    }
}
