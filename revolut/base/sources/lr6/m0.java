package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f199413c;
    public final xi0.b d;

    public m0(long j2, String fromPocketId, String toPocketId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
        Intrinsics.checkNotNullParameter(toPocketId, "toPocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f199411a = fromPocketId;
        this.f199412b = toPocketId;
        this.f199413c = j2;
        this.d = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f199411a, m0Var.f199411a) && Intrinsics.f(this.f199412b, m0Var.f199412b) && this.f199413c == m0Var.f199413c && Intrinsics.f(this.d, m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(p.a.c(this.f199411a.hashCode() * 31, 31, this.f199412b), 31, this.f199413c);
    }
}
