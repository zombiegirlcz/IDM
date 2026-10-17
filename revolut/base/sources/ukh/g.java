package ukh;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f280756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f280757b;

    public g(UUID portfolioId, q0 accountHolderType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f280756a = portfolioId;
        this.f280757b = accountHolderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f280756a, gVar.f280756a) && this.f280757b == gVar.f280757b;
    }

    public final int hashCode() {
        return this.f280757b.hashCode() + (this.f280756a.hashCode() * 31);
    }
}
