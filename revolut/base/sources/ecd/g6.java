package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g6 {

    @NotNull
    public static final f6 Companion = new f6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f124557a;

    public /* synthetic */ g6(int i, x2 x2Var) {
        if (1 == (i & 1)) {
            this.f124557a = x2Var;
        } else {
            qlm.j1.f(e6.f124542a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g6) && Intrinsics.f(this.f124557a, ((g6) obj2).f124557a);
    }

    public final int hashCode() {
        x2 x2Var = this.f124557a;
        if (x2Var == null) {
            return 0;
        }
        return x2Var.hashCode();
    }

    public g6(x2 x2Var) {
        this.f124557a = x2Var;
    }
}
