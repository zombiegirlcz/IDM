package i4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f158527a;

    public g(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f158527a = text;
    }

    @Override // i4k.j
    public final boolean X0() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f158527a.equals(((g) obj2).f158527a);
    }

    @Override // i4k.j
    public final Clause getText() {
        return this.f158527a;
    }

    public final int hashCode() {
        return this.f158527a.hashCode();
    }
}
