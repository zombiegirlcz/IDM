package cvl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109502a;

    public s(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f109502a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f109502a.equals(((s) obj2).f109502a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f109502a.hashCode() * 31);
    }
}
