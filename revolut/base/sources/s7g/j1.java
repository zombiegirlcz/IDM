package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f260746g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f260748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f260749c;
    public final n2 d;
    public final List e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f260746g = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new s77.x(17)), yhm.j.c(kVar, new s77.x(18))};
    }

    public j1(int i, String str, d1 d1Var, s1 s1Var, n2 n2Var, List list, List list2) {
        if (15 != (i & 15)) {
            qlm.j1.f(h1.f260733a.getDescriptor(), i, 15);
            throw null;
        }
        this.f260747a = str;
        this.f260748b = d1Var;
        this.f260749c = s1Var;
        this.d = n2Var;
        if ((i & 16) == 0) {
            this.e = zhm.f0.f322471a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f260747a, j1Var.f260747a) && Intrinsics.f(this.f260748b, j1Var.f260748b) && Intrinsics.f(this.f260749c, j1Var.f260749c) && Intrinsics.f(this.d, j1Var.d) && Intrinsics.f(this.e, j1Var.e) && Intrinsics.f(this.f, j1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d((this.d.hashCode() + ((this.f260749c.hashCode() + ((this.f260748b.hashCode() + (this.f260747a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }
}
