package ujb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final i0 Companion = new i0();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f280600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f280601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f280602c;
    public final List d;
    public final Integer e;

    public /* synthetic */ y0(int i, r0 r0Var, l0 l0Var, x0 x0Var, List list, Integer num) {
        if (31 != (i & 31)) {
            j1.f(h0.f280561a.getDescriptor(), i, 31);
            throw null;
        }
        this.f280600a = r0Var;
        this.f280601b = l0Var;
        this.f280602c = x0Var;
        this.d = list;
        this.e = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f280600a, y0Var.f280600a) && Intrinsics.f(this.f280601b, y0Var.f280601b) && Intrinsics.f(this.f280602c, y0Var.f280602c) && Intrinsics.f(this.d, y0Var.d) && Intrinsics.f(this.e, y0Var.e);
    }

    public final int hashCode() {
        r0 r0Var = this.f280600a;
        int iHashCode = (this.f280601b.hashCode() + ((r0Var == null ? 0 : r0Var.hashCode()) * 31)) * 31;
        x0 x0Var = this.f280602c;
        int iD = p.a.d((iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public y0(r0 r0Var, l0 entryPoint, x0 x0Var, ArrayList rewards, Integer num) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f280600a = r0Var;
        this.f280601b = entryPoint;
        this.f280602c = x0Var;
        this.d = rewards;
        this.e = num;
    }
}
