package vkh;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f289945a;

    public g(UUID portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f289945a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f289945a, ((g) obj2).f289945a);
    }

    public final int hashCode() {
        return this.f289945a.hashCode();
    }
}
