package urj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f282326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f282327b;

    public f(CompositeClause compositeClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f282326a = items;
        this.f282327b = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f282326a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f282326a, fVar.f282326a) && Intrinsics.f(this.f282327b, fVar.f282327b);
    }

    public final int hashCode() {
        int iHashCode = this.f282326a.hashCode() * 31;
        Clause clause = this.f282327b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
