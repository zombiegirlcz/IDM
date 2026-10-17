package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f125611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125612b;

    public /* synthetic */ q0(int i, p0 p0Var, String str) {
        if (3 != (i & 3)) {
            j1.f(k0.f125601a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125611a = p0Var;
        this.f125612b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f125611a, q0Var.f125611a) && Intrinsics.f(this.f125612b, q0Var.f125612b);
    }

    public final int hashCode() {
        return this.f125612b.hashCode() + (this.f125611a.hashCode() * 31);
    }
}
