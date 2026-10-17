package y7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f311516g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f311519c;
    public final List d;
    public final z7g.c e;
    public final List f;

    static {
        k kVar = k.PUBLICATION;
        f311516g = new Lazy[]{null, j.c(kVar, new y4f.c(20)), j.c(kVar, new y4f.c(21)), j.c(kVar, new y4f.c(22)), null, j.c(kVar, new y4f.c(23))};
    }

    public f(int i, String str, List list, List list2, List list3, z7g.c cVar, List list4) {
        if (31 != (i & 31)) {
            j1.f(d.f311515a.getDescriptor(), i, 31);
            throw null;
        }
        this.f311517a = str;
        this.f311518b = list;
        this.f311519c = list2;
        this.d = list3;
        this.e = cVar;
        if ((i & 32) == 0) {
            this.f = f0.f322471a;
        } else {
            this.f = list4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f311517a, fVar.f311517a) && Intrinsics.f(this.f311518b, fVar.f311518b) && Intrinsics.f(this.f311519c, fVar.f311519c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.d(p.a.d(this.f311517a.hashCode() * 31, 31, this.f311518b), 31, this.f311519c), 31, this.d)) * 31);
    }
}
