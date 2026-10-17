package sdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f261991a;

    public /* synthetic */ n1(int i, m1 m1Var) {
        if (1 == (i & 1)) {
            this.f261991a = m1Var;
        } else {
            qlm.j1.f(i1.f261973a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && Intrinsics.f(this.f261991a, ((n1) obj2).f261991a);
    }

    public final int hashCode() {
        return this.f261991a.hashCode();
    }

    public n1(m1 management) {
        Intrinsics.checkNotNullParameter(management, "management");
        this.f261991a = management;
    }
}
