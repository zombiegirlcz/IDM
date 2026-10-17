package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class eh implements gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f164098a;

    public eh(TextClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f164098a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof eh) && this.f164098a.equals(((eh) obj2).f164098a);
    }

    public final int hashCode() {
        return this.f164098a.hashCode();
    }
}
