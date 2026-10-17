package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z2 extends t2 {

    @NotNull
    public static final y2 Companion = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f117924a;

    public z2(int i, p2 p2Var) {
        if (1 == (i & 1)) {
            this.f117924a = p2Var;
        } else {
            qlm.j1.f(x2.f117898a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z2) && Intrinsics.f(this.f117924a, ((z2) obj2).f117924a);
    }

    public final int hashCode() {
        return this.f117924a.hashCode();
    }
}
