package fyk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f139027c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new fyh.k(8)), yhm.j.c(kVar, new fyh.k(9)), null};
    }

    public /* synthetic */ c0(int i, List list, List list2, boolean z) {
        if (7 != (i & 7)) {
            j1.f(a0.f139023a.getDescriptor(), i, 7);
            throw null;
        }
        this.f139025a = list;
        this.f139026b = list2;
        this.f139027c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f139025a, c0Var.f139025a) && Intrinsics.f(this.f139026b, c0Var.f139026b) && this.f139027c == c0Var.f139027c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139027c) + p.a.d(this.f139025a.hashCode() * 31, 31, this.f139026b);
    }
}
