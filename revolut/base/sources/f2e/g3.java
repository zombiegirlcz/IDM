package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g3 {

    @NotNull
    public static final f3 Companion = new f3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f131601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f131602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5 f131603c;

    public /* synthetic */ g3(int i, x1 x1Var, i1 i1Var, a5 a5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(e3.f131576a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131601a = x1Var;
        this.f131602b = i1Var;
        this.f131603c = a5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f131601a, g3Var.f131601a) && Intrinsics.f(this.f131602b, g3Var.f131602b) && Intrinsics.f(this.f131603c, g3Var.f131603c);
    }

    public final int hashCode() {
        x1 x1Var = this.f131601a;
        int iHashCode = (x1Var == null ? 0 : x1Var.f131762a.hashCode()) * 31;
        i1 i1Var = this.f131602b;
        int iHashCode2 = (iHashCode + (i1Var == null ? 0 : i1Var.f131621a.hashCode())) * 31;
        a5 a5Var = this.f131603c;
        return iHashCode2 + (a5Var != null ? a5Var.hashCode() : 0);
    }

    public g3(x1 x1Var, i1 i1Var, a5 a5Var) {
        this.f131601a = x1Var;
        this.f131602b = i1Var;
        this.f131603c = a5Var;
    }
}
