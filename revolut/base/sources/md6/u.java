package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements ld6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f204500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f204501b;

    public u(t fromAccount, t toAccount) {
        Intrinsics.checkNotNullParameter(fromAccount, "fromAccount");
        Intrinsics.checkNotNullParameter(toAccount, "toAccount");
        this.f204500a = fromAccount;
        this.f204501b = toAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f204500a, uVar.f204500a) && Intrinsics.f(this.f204501b, uVar.f204501b);
    }

    public final int hashCode() {
        return this.f204501b.hashCode() + (this.f204500a.hashCode() * 31);
    }
}
