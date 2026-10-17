package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f116770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f116771b;

    public /* synthetic */ j0(int i, m0 m0Var, d0 d0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(h0.f116759a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116770a = m0Var;
        this.f116771b = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f116770a, j0Var.f116770a) && Intrinsics.f(this.f116771b, j0Var.f116771b);
    }

    public final int hashCode() {
        return this.f116771b.hashCode() + (this.f116770a.hashCode() * 31);
    }
}
