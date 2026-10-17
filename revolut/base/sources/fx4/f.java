package fx4;

import dx4.d1;
import dx4.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f138728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f138729c;

    public f(String label, d1 d1Var, l action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f138727a = label;
        this.f138728b = d1Var;
        this.f138729c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f138727a, fVar.f138727a) && Intrinsics.f(this.f138728b, fVar.f138728b) && Intrinsics.f(this.f138729c, fVar.f138729c);
    }

    public final int hashCode() {
        int iHashCode = this.f138727a.hashCode() * 31;
        d1 d1Var = this.f138728b;
        return this.f138729c.hashCode() + ((iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31);
    }
}
