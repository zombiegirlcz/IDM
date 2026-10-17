package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f16008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f16010c;
    public final d1 d;
    public final t1 e;

    public /* synthetic */ k1(int i, q1 q1Var, String str, i3 i3Var, d1 d1Var, t1 t1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(i1.f15981a.getDescriptor(), i, 15);
            throw null;
        }
        this.f16008a = q1Var;
        this.f16009b = str;
        this.f16010c = i3Var;
        this.d = d1Var;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = t1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f16008a, k1Var.f16008a) && Intrinsics.f(this.f16009b, k1Var.f16009b) && Intrinsics.f(this.f16010c, k1Var.f16010c) && Intrinsics.f(this.d, k1Var.d) && Intrinsics.f(this.e, k1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f16010c.hashCode() + p.a.c(this.f16008a.f16052a.hashCode() * 31, 31, this.f16009b)) * 31;
        d1 d1Var = this.d;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        t1 t1Var = this.e;
        return iHashCode2 + (t1Var != null ? t1Var.f16074a.hashCode() : 0);
    }
}
