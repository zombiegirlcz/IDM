package sdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f261963a;

    public /* synthetic */ e0(int i, d0 d0Var) {
        if (1 == (i & 1)) {
            this.f261963a = d0Var;
        } else {
            qlm.j1.f(z.f262075a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f261963a, ((e0) obj2).f261963a);
    }

    public final int hashCode() {
        d0 d0Var = this.f261963a;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.hashCode();
    }

    public e0(d0 d0Var) {
        this.f261963a = d0Var;
    }
}
