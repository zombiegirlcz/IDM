package egb;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f125582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f125583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f125584c;
    public final q0 d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new ebl.a(24)), yhm.j.c(kVar, new ebl.a(25)), null};
    }

    public /* synthetic */ c(int i, j0 j0Var, List list, List list2, q0 q0Var) {
        if (3 != (i & 3)) {
            j1.f(a.f125578a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125582a = j0Var;
        this.f125583b = list;
        if ((i & 4) == 0) {
            this.f125584c = null;
        } else {
            this.f125584c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f125582a, cVar.f125582a) && Intrinsics.f(this.f125583b, cVar.f125583b) && Intrinsics.f(this.f125584c, cVar.f125584c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f125582a.hashCode() * 31, 31, this.f125583b);
        List list = this.f125584c;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        q0 q0Var = this.d;
        return iHashCode + (q0Var != null ? q0Var.hashCode() : 0);
    }

    public c(j0 header, List blocks, List list, q0 q0Var) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f125582a = header;
        this.f125583b = blocks;
        this.f125584c = list;
        this.d = q0Var;
    }
}
