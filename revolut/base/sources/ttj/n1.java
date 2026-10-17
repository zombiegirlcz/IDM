package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f274377g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f274380c;
    public final List d;
    public final List e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f274377g = new Lazy[]{yhm.j.c(kVar, new ts1.h(11)), null, null, yhm.j.c(kVar, new ts1.h(12)), yhm.j.c(kVar, new ts1.h(13)), yhm.j.c(kVar, new ts1.h(14))};
    }

    public n1(int i, List list, int i2, int i3, List list2, List list3, List list4) {
        if (31 != (i & 31)) {
            qlm.j1.f(w0.f274420a.getDescriptor(), i, 31);
            throw null;
        }
        this.f274378a = list;
        this.f274379b = i2;
        this.f274380c = i3;
        this.d = list2;
        this.e = list3;
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f274378a, n1Var.f274378a) && this.f274379b == n1Var.f274379b && this.f274380c == n1Var.f274380c && Intrinsics.f(this.d, n1Var.d) && Intrinsics.f(this.e, n1Var.e) && Intrinsics.f(this.f, n1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.d(j6.a.b(this.f274380c, j6.a.b(this.f274379b, this.f274378a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
