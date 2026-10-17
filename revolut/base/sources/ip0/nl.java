package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nl extends ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f165532a;

    public nl(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f165532a = text;
    }

    @Override // ip0.ul
    public final Integer a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof nl) && this.f165532a.equals(((nl) obj2).f165532a);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getE() {
        return null;
    }

    public final int hashCode() {
        return this.f165532a.hashCode() * 961;
    }
}
