package q50;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final y Companion = new y();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f242240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f242241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f242242c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new w(0)), yhm.j.c(kVar, new w(1)), yhm.j.c(kVar, new w(2))};
    }

    public /* synthetic */ l0(int i, b0 b0Var, List list, List list2, List list3) {
        if (15 != (i & 15)) {
            j1.f(x.f242286a.getDescriptor(), i, 15);
            throw null;
        }
        this.f242240a = b0Var;
        this.f242241b = list;
        this.f242242c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f242240a, l0Var.f242240a) && Intrinsics.f(this.f242241b, l0Var.f242241b) && Intrinsics.f(this.f242242c, l0Var.f242242c) && Intrinsics.f(this.d, l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f242240a.hashCode() * 31, 31, this.f242241b), 31, this.f242242c);
    }
}
