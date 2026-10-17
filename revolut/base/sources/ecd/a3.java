package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f124490c;
    public final g6 d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new ebl.a(9)), yhm.j.c(kVar, new ebl.a(10)), null, null};
    }

    public /* synthetic */ a3(int i, List list, List list2, o oVar, g6 g6Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(y2.f124710a.getDescriptor(), i, 15);
            throw null;
        }
        this.f124488a = list;
        this.f124489b = list2;
        this.f124490c = oVar;
        this.d = g6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f124488a, a3Var.f124488a) && Intrinsics.f(this.f124489b, a3Var.f124489b) && Intrinsics.f(this.f124490c, a3Var.f124490c) && Intrinsics.f(this.d, a3Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f124488a.hashCode() * 31, 31, this.f124489b);
        o oVar = this.f124490c;
        int iHashCode = (iD + (oVar == null ? 0 : oVar.hashCode())) * 31;
        g6 g6Var = this.d;
        return iHashCode + (g6Var != null ? g6Var.hashCode() : 0);
    }

    public a3(ArrayList products, ArrayList groups, o oVar, g6 g6Var) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f124488a = products;
        this.f124489b = groups;
        this.f124490c = oVar;
        this.d = g6Var;
    }
}
