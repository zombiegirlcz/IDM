package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f124560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f124561b;

    public /* synthetic */ h2(int i, b2 b2Var, b2 b2Var2) {
        if (3 != (i & 3)) {
            qlm.j1.f(f2.f124545a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124560a = b2Var;
        this.f124561b = b2Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f124560a, h2Var.f124560a) && Intrinsics.f(this.f124561b, h2Var.f124561b);
    }

    public final int hashCode() {
        b2 b2Var = this.f124560a;
        int iHashCode = (b2Var == null ? 0 : b2Var.hashCode()) * 31;
        b2 b2Var2 = this.f124561b;
        return iHashCode + (b2Var2 != null ? b2Var2.hashCode() : 0);
    }

    public h2(b2 b2Var, b2 b2Var2) {
        this.f124560a = b2Var;
        this.f124561b = b2Var2;
    }
}
