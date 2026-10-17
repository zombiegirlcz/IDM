package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class n2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f260769c = {null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f260770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260771b;

    public /* synthetic */ n2(int i, o2 o2Var, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(l2.f260760a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260770a = o2Var;
        this.f260771b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f260770a, n2Var.f260770a) && Intrinsics.f(this.f260771b, n2Var.f260771b);
    }

    public final int hashCode() {
        return this.f260771b.hashCode() + (this.f260770a.hashCode() * 31);
    }
}
