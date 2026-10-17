package vkh;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f289944a;

    public f(UUID portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f289944a = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f289944a, ((f) obj2).f289944a);
    }

    public final int hashCode() {
        return this.f289944a.hashCode();
    }
}
