package tsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f274062b;

    public c(dj0.d amount, dj0.d balance) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f274061a = amount;
        this.f274062b = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274061a, cVar.f274061a) && Intrinsics.f(this.f274062b, cVar.f274062b);
    }

    public final int hashCode() {
        return this.f274062b.hashCode() + (this.f274061a.hashCode() * 31);
    }
}
