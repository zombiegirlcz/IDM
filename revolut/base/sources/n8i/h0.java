package n8i;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f213429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213430b;

    public h0(Clause title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f213429a = title;
        this.f213430b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f213429a, h0Var.f213429a) && this.f213430b == h0Var.f213430b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213430b) + (this.f213429a.hashCode() * 31);
    }
}
