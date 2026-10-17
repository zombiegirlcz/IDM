package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f260788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260789b;

    public /* synthetic */ r0(int i, o0 o0Var, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(p0.f260780a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260788a = o0Var;
        this.f260789b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f260788a, r0Var.f260788a) && Intrinsics.f(this.f260789b, r0Var.f260789b);
    }

    public final int hashCode() {
        return this.f260789b.hashCode() + (this.f260788a.hashCode() * 31);
    }
}
