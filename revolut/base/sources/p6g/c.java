package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f233273a;

    public c(TextLocalisedClause textLocalisedClause) {
        this.f233273a = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233273a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f233273a.equals(((c) obj2).f233273a);
    }

    public final int hashCode() {
        return this.f233273a.hashCode();
    }
}
