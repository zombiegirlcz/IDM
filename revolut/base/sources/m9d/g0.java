package m9d;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f203696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f203697b;

    public g0(Clause toolbarTitle, Clause bigTitle) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        this.f203696a = toolbarTitle;
        this.f203697b = bigTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f203696a, g0Var.f203696a) && Intrinsics.f(this.f203697b, g0Var.f203697b);
    }

    public final int hashCode() {
        return this.f203697b.hashCode() + (this.f203696a.hashCode() * 31);
    }
}
