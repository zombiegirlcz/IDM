package i6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final alc.d f158983b;

    public u(alc.d action, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f158982a = portfolioId;
        this.f158983b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f158982a, uVar.f158982a) && this.f158983b == uVar.f158983b;
    }

    public final int hashCode() {
        return this.f158983b.hashCode() + (this.f158982a.hashCode() * 31);
    }
}
