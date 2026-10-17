package ii4;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f161542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f161543b;

    public p0(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f161542a = title;
        this.f161543b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f161542a, p0Var.f161542a) && Intrinsics.f(this.f161543b, p0Var.f161543b);
    }

    public final int hashCode() {
        int iHashCode = this.f161542a.hashCode() * 31;
        Clause clause = this.f161543b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
