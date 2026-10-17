package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5 f131763a;

    public /* synthetic */ x2(int i, a5 a5Var) {
        if (1 == (i & 1)) {
            this.f131763a = a5Var;
        } else {
            qlm.j1.f(v2.f131736a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x2) && Intrinsics.f(this.f131763a, ((x2) obj2).f131763a);
    }

    public final int hashCode() {
        a5 a5Var = this.f131763a;
        if (a5Var == null) {
            return 0;
        }
        return a5Var.hashCode();
    }

    public x2(a5 a5Var) {
        this.f131763a = a5Var;
    }
}
