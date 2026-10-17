package ccf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f23075a;

    public l(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f23075a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f23075a.equals(((l) obj2).f23075a);
    }

    public final int hashCode() {
        return this.f23075a.hashCode();
    }
}
