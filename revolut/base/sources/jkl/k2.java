package jkl;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final g2 Companion = new g2();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f175314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f175315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f175316c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new jj9.b(10)), yhm.j.c(kVar, new jj9.b(11)), yhm.j.c(kVar, new jj9.b(12))};
    }

    public /* synthetic */ k2(int i, List list, Map map, Map map2) {
        if (7 != (i & 7)) {
            qlm.j1.f(c2.f175227a.getDescriptor(), i, 7);
            throw null;
        }
        this.f175314a = list;
        this.f175315b = map;
        this.f175316c = map2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f175314a, k2Var.f175314a) && Intrinsics.f(this.f175315b, k2Var.f175315b) && Intrinsics.f(this.f175316c, k2Var.f175316c);
    }

    public final int hashCode() {
        return this.f175316c.hashCode() + p.a.e(this.f175314a.hashCode() * 31, 31, this.f175315b);
    }
}
