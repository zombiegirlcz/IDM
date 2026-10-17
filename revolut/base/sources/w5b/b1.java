package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f294785b;

    public /* synthetic */ b1(int i, String str, y0 y0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(z0.f295087a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294784a = str;
        this.f294785b = y0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f294784a, b1Var.f294784a) && Intrinsics.f(this.f294785b, b1Var.f294785b);
    }

    public final int hashCode() {
        return this.f294785b.hashCode() + (this.f294784a.hashCode() * 31);
    }
}
