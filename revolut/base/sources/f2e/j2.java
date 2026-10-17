package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j2 {

    @NotNull
    public static final i2 Companion = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f131632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f131633b;

    public /* synthetic */ j2(int i, u1 u1Var, u1 u1Var2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h2.f131612a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131632a = u1Var;
        this.f131633b = u1Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f131632a, j2Var.f131632a) && Intrinsics.f(this.f131633b, j2Var.f131633b);
    }

    public final int hashCode() {
        return this.f131633b.hashCode() + (this.f131632a.hashCode() * 31);
    }

    public j2(u1 topLeft, u1 bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f131632a = topLeft;
        this.f131633b = bottomRight;
    }
}
