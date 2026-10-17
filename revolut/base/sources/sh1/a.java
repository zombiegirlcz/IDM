package sh1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f263339a;

    public a(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f263339a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f263339a.equals(((a) obj2).f263339a);
    }

    public final int hashCode() {
        return this.f263339a.hashCode();
    }
}
