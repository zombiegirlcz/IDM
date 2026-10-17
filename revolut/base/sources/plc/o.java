package plc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237352a;

    public o(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f237352a = portfolioId;
    }

    @Override // plc.p
    public final String a() {
        return j6.a.q("portfolio:", this.f237352a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f237352a, ((o) obj2).f237352a);
    }

    public final int hashCode() {
        return this.f237352a.hashCode();
    }
}
