package wnc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends d8f.s {
    public final TextLocalisedClause e;

    public t(TextLocalisedClause textLocalisedClause) {
        super(textLocalisedClause, true, true, 1);
        this.e = textLocalisedClause;
    }

    @Override // d8f.s
    public final Clause a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.e.equals(((t) obj2).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
