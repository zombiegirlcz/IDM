package u2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f276654c;
    public final String d;

    public p(String accountId, int i, o rate, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f276652a = accountId;
        this.f276653b = i;
        this.f276654c = rate;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f276652a, pVar.f276652a) && this.f276653b == pVar.f276653b && Intrinsics.f(this.f276654c, pVar.f276654c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.f276653b, this.f276652a.hashCode() * 31, 31), 31, this.f276654c.f276651a);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
