package a7g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f1901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1902b;

    public y(Clause secondaryClause, CompositeClause primaryClause) {
        Intrinsics.checkNotNullParameter(primaryClause, "primaryClause");
        Intrinsics.checkNotNullParameter(secondaryClause, "secondaryClause");
        this.f1901a = primaryClause;
        this.f1902b = secondaryClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f1901a.equals(yVar.f1901a) && this.f1902b.equals(yVar.f1902b);
    }

    public final int hashCode() {
        return this.f1902b.hashCode() + (this.f1901a.hashCode() * 31);
    }
}
