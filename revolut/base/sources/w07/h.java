package w07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f293656a;

    public h(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f293656a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f293656a.equals(((h) obj2).f293656a);
    }

    public final int hashCode() {
        return this.f293656a.hashCode();
    }
}
