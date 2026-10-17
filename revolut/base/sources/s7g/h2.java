package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f260734c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260736b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f260734c = new Lazy[]{yhm.j.c(kVar, new s77.x(21)), yhm.j.c(kVar, new s77.x(22))};
    }

    public /* synthetic */ h2(List list, int i, List list2) {
        if (3 != (i & 3)) {
            qlm.j1.f(f2.f260721a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260735a = list;
        this.f260736b = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f260735a, h2Var.f260735a) && Intrinsics.f(this.f260736b, h2Var.f260736b);
    }

    public final int hashCode() {
        return this.f260736b.hashCode() + (this.f260735a.hashCode() * 31);
    }
}
