package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260803b;

    public /* synthetic */ u0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(s0.f260794a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260802a = str;
        this.f260803b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f260802a, u0Var.f260802a) && Intrinsics.f(this.f260803b, u0Var.f260803b);
    }

    public final int hashCode() {
        return this.f260803b.hashCode() + (this.f260802a.hashCode() * 31);
    }
}
