package sl2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f264090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f264091b;

    public l(TextClause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f264090a = title;
        this.f264091b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f264090a.equals(lVar.f264090a) && Intrinsics.f(this.f264091b, lVar.f264091b);
    }

    public final int hashCode() {
        int iHashCode = this.f264090a.hashCode() * 31;
        Clause clause = this.f264091b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
