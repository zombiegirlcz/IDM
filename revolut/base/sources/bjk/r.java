package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f16056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f16057b;

    public /* synthetic */ r(int i, a0 a0Var, a0 a0Var2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p.f16042a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16056a = a0Var;
        this.f16057b = a0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f16056a, rVar.f16056a) && Intrinsics.f(this.f16057b, rVar.f16057b);
    }

    public final int hashCode() {
        a0 a0Var = this.f16056a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        a0 a0Var2 = this.f16057b;
        return iHashCode + (a0Var2 != null ? a0Var2.hashCode() : 0);
    }
}
