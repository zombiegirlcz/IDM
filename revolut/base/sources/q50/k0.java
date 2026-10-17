package q50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f242238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242239b;

    public /* synthetic */ k0(float f, int i, String str) {
        if (3 != (i & 3)) {
            j1.f(i0.f242232a.getDescriptor(), i, 3);
            throw null;
        }
        this.f242238a = f;
        this.f242239b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Float.compare(this.f242238a, k0Var.f242238a) == 0 && Intrinsics.f(this.f242239b, k0Var.f242239b);
    }

    public final int hashCode() {
        return this.f242239b.hashCode() + (Float.hashCode(this.f242238a) * 31);
    }
}
