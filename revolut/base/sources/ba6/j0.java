package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f13936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f13937b;

    public j0(double d, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f13936a = amount;
        this.f13937b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f13936a, j0Var.f13936a) && Double.compare(this.f13937b, j0Var.f13937b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f13937b) + (this.f13936a.hashCode() * 31);
    }
}
