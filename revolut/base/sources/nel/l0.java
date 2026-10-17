package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import nel.k0;
import nel.m;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f214591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f214592b;

    public l0() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f214591a, l0Var.f214591a) && Intrinsics.f(this.f214592b, l0Var.f214592b);
    }

    public final int hashCode() {
        return this.f214592b.hashCode() + (this.f214591a.hashCode() * 31);
    }

    public l0(k0 sortingOptions, int i) {
        sortingOptions = (i & 1) != 0 ? new k0.a(0) : sortingOptions;
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        m.a groupingOptions = m.a.f214593a;
        Intrinsics.checkNotNullParameter(groupingOptions, "groupingOptions");
        this.f214591a = sortingOptions;
        this.f214592b = groupingOptions;
    }
}
