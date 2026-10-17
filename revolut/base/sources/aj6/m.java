package aj6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f5417b;

    public m(Set accountIds, Set loansIds) {
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        Intrinsics.checkNotNullParameter(loansIds, "loansIds");
        this.f5416a = accountIds;
        this.f5417b = loansIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f5416a, mVar.f5416a) && Intrinsics.f(this.f5417b, mVar.f5417b);
    }

    public final int hashCode() {
        return this.f5417b.hashCode() + (this.f5416a.hashCode() * 31);
    }
}
