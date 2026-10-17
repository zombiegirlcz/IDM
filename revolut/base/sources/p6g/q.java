package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f233299a;

    public q(TextLocalisedClause textLocalisedClause) {
        this.f233299a = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233299a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f233299a.equals(((q) obj2).f233299a);
    }

    public final int hashCode() {
        return this.f233299a.hashCode() + (Integer.hashCode(6) * 31);
    }
}
