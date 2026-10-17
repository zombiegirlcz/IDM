package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5i.a f213414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5i.a f213415b;

    public d0(x5i.a sourceAccount, x5i.a targetAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        this.f213414a = sourceAccount;
        this.f213415b = targetAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f213414a, d0Var.f213414a) && Intrinsics.f(this.f213415b, d0Var.f213415b);
    }

    public final int hashCode() {
        return this.f213415b.hashCode() + (this.f213414a.hashCode() * 31);
    }
}
