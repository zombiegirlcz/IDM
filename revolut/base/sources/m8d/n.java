package m8d;

import kotlin.jvm.internal.Intrinsics;
import v20.d1;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f203516b;

    public n(boolean z, d1 d1Var) {
        this.f203515a = z;
        this.f203516b = d1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f203515a == nVar.f203515a && Intrinsics.f(this.f203516b, nVar.f203516b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f203515a) * 31;
        d1 d1Var = this.f203516b;
        return iHashCode + (d1Var == null ? 0 : d1Var.hashCode());
    }
}
