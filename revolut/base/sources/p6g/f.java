package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f233281a;

    public f(TextLocalisedClause textLocalisedClause) {
        this.f233281a = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f233281a.equals(((f) obj2).f233281a);
    }

    public final int hashCode() {
        return this.f233281a.hashCode();
    }
}
