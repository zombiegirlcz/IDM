package cnc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f25395a;

    public j(CompositeClause compositeClause) {
        this.f25395a = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f25395a, ((j) obj2).f25395a);
    }

    public final int hashCode() {
        Clause clause = this.f25395a;
        if (clause == null) {
            return 0;
        }
        return clause.hashCode();
    }
}
