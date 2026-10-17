package bjk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f15839c = {null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f15840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15841b;

    public /* synthetic */ e0(int i, u uVar, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(n.f16028a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15840a = uVar;
        this.f15841b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f15840a, e0Var.f15840a) && Intrinsics.f(this.f15841b, e0Var.f15841b);
    }

    public final int hashCode() {
        return this.f15841b.hashCode() + (this.f15840a.hashCode() * 31);
    }
}
