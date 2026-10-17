package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f177790b;

    public /* synthetic */ h1(int i, boolean z, Double d) {
        if (3 != (i & 3)) {
            qlm.j1.f(f1.f177786a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177789a = z;
        this.f177790b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f177789a == h1Var.f177789a && Intrinsics.f(this.f177790b, h1Var.f177790b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f177789a) * 31;
        Double d = this.f177790b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}
