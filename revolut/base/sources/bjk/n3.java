package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class n3 {

    @NotNull
    public static final m3 Companion = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f16034a;

    public /* synthetic */ n3(int i, q3 q3Var) {
        if (1 == (i & 1)) {
            this.f16034a = q3Var;
        } else {
            qlm.j1.f(l3.f16019a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n3) && Intrinsics.f(this.f16034a, ((n3) obj2).f16034a);
    }

    public final int hashCode() {
        q3 q3Var = this.f16034a;
        if (q3Var == null) {
            return 0;
        }
        return q3Var.hashCode();
    }
}
