package snc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f264505a;

    public f(CompositeClause compositeClause) {
        this.f264505a = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f264505a, ((f) obj2).f264505a);
    }

    public final int hashCode() {
        Clause clause = this.f264505a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
