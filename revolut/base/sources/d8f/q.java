package d8f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends s {
    public final TextLocalisedClause e;

    public q(TextLocalisedClause textLocalisedClause) {
        super(textLocalisedClause, true, true, 0);
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
        return (obj2 instanceof q) && this.e.equals(((q) obj2).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
