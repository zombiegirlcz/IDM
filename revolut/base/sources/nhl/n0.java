package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new s(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f215541c;

    public /* synthetic */ n0(int i, int i2, List list, w0 w0Var) {
        if (7 != (i & 7)) {
            j1.f(l0.f215535a.getDescriptor(), i, 7);
            throw null;
        }
        this.f215539a = i2;
        this.f215540b = list;
        this.f215541c = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f215539a == n0Var.f215539a && Intrinsics.f(this.f215540b, n0Var.f215540b) && Intrinsics.f(this.f215541c, n0Var.f215541c);
    }

    public final int hashCode() {
        return this.f215541c.hashCode() + p.a.d(Integer.hashCode(this.f215539a) * 31, 31, this.f215540b);
    }

    public n0(int i, ArrayList instruments, w0 sortingOptions) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        this.f215539a = i;
        this.f215540b = instruments;
        this.f215541c = sortingOptions;
    }
}
