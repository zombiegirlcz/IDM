package x8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wel.j f303364b;

    public m0(String portfolioId, wel.j state) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f303363a = portfolioId;
        this.f303364b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f303363a, m0Var.f303363a) && this.f303364b == m0Var.f303364b;
    }

    public final int hashCode() {
        return this.f303364b.hashCode() + (this.f303363a.hashCode() * 31);
    }
}
