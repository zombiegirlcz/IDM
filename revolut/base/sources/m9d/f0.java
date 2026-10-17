package m9d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TrackableClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackableClause f203694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f203695b;

    public f0(TrackableClause bigHeaderTitle, Clause toolbarTitle) {
        Intrinsics.checkNotNullParameter(bigHeaderTitle, "bigHeaderTitle");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f203694a = bigHeaderTitle;
        this.f203695b = toolbarTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f203694a.equals(f0Var.f203694a) && this.f203695b.equals(f0Var.f203695b);
    }

    public final int hashCode() {
        return this.f203695b.hashCode() + (this.f203694a.hashCode() * 31);
    }
}
