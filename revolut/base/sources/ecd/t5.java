package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class t5 {

    @NotNull
    public static final p5 Companion = new p5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5 f124681a;

    public /* synthetic */ t5(int i, s5 s5Var) {
        if (1 == (i & 1)) {
            this.f124681a = s5Var;
        } else {
            qlm.j1.f(o5.f124639a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t5) && Intrinsics.f(this.f124681a, ((t5) obj2).f124681a);
    }

    public final int hashCode() {
        return this.f124681a.hashCode();
    }

    public t5(s5 interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f124681a = interest;
    }
}
