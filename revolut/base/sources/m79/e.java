package m79;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f203356a;

    public e(TextClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f203356a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f203356a.equals(((e) obj2).f203356a);
    }

    public final int hashCode() {
        return this.f203356a.hashCode();
    }
}
