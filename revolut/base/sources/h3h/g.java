package h3h;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f149131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149132b;

    public g(UUID tradingAccountId, String ref2) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f149131a = tradingAccountId;
        this.f149132b = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f149131a, gVar.f149131a) && Intrinsics.f(this.f149132b, gVar.f149132b);
    }

    public final int hashCode() {
        return this.f149132b.hashCode() + (this.f149131a.hashCode() * 31);
    }
}
