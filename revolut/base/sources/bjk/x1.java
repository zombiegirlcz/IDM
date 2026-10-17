package bjk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f16119g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f16120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f16121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f16122c;
    public final c3 d;
    public final String e;
    public final List f;

    public /* synthetic */ x1(int i, n1 n1Var, k1 k1Var, g1 g1Var, c3 c3Var, String str, List list) {
        if (14 != (i & 14)) {
            qlm.j1.f(a1.f15696a.getDescriptor(), i, 14);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f16120a = null;
        } else {
            this.f16120a = n1Var;
        }
        this.f16121b = k1Var;
        this.f16122c = g1Var;
        this.d = c3Var;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f16120a, x1Var.f16120a) && Intrinsics.f(this.f16121b, x1Var.f16121b) && Intrinsics.f(this.f16122c, x1Var.f16122c) && Intrinsics.f(this.d, x1Var.d) && Intrinsics.f(this.e, x1Var.e) && Intrinsics.f(this.f, x1Var.f);
    }

    public final int hashCode() {
        n1 n1Var = this.f16120a;
        int iHashCode = (this.f16121b.hashCode() + ((n1Var == null ? 0 : n1Var.f16031a.hashCode()) * 31)) * 31;
        g1 g1Var = this.f16122c;
        int iHashCode2 = (iHashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        c3 c3Var = this.d;
        int iHashCode3 = (iHashCode2 + (c3Var == null ? 0 : c3Var.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
