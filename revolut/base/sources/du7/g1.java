package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f117679a;

    public /* synthetic */ g1(int i, d1 d1Var) {
        if (1 == (i & 1)) {
            this.f117679a = d1Var;
        } else {
            qlm.j1.f(e1.f117661a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && Intrinsics.f(this.f117679a, ((g1) obj2).f117679a);
    }

    public final int hashCode() {
        d1 d1Var = this.f117679a;
        if (d1Var == null) {
            return 0;
        }
        return d1Var.hashCode();
    }
}
