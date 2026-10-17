package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class q1 {

    @NotNull
    public static final p1 Companion = new p1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f177832b;

    public /* synthetic */ q1(int i, Long l2, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(o1.f177815a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177831a = z;
        this.f177832b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return this.f177831a == q1Var.f177831a && Intrinsics.f(this.f177832b, q1Var.f177832b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f177831a) * 31;
        Long l2 = this.f177832b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
