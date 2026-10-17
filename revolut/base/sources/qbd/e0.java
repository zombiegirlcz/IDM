package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f244182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f244183b;

    public /* synthetic */ e0(int i, d0 d0Var, d0 d0Var2) {
        if (3 != (i & 3)) {
            j1.f(z.f244226a.getDescriptor(), i, 3);
            throw null;
        }
        this.f244182a = d0Var;
        this.f244183b = d0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f244182a, e0Var.f244182a) && Intrinsics.f(this.f244183b, e0Var.f244183b);
    }

    public final int hashCode() {
        int iHashCode = this.f244182a.hashCode() * 31;
        d0 d0Var = this.f244183b;
        return iHashCode + (d0Var == null ? 0 : d0Var.hashCode());
    }

    public e0(d0 primary, d0 d0Var) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f244182a = primary;
        this.f244183b = d0Var;
    }
}
