package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f233308a;

    public x(TextLocalisedClause textLocalisedClause) {
        this.f233308a = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233308a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f233308a.equals(((x) obj2).f233308a);
    }

    public final int hashCode() {
        return this.f233308a.hashCode();
    }
}
