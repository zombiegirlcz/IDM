package l1k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f191564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f191565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f191566c;

    public k(TextClause textClause, CompositeClause compositeClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f191564a = textClause;
        this.f191565b = compositeClause;
        this.f191566c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f191566c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f191564a, kVar.f191564a) && Intrinsics.f(this.f191565b, kVar.f191565b) && Intrinsics.f(this.f191566c, kVar.f191566c);
    }

    public final int hashCode() {
        Clause clause = this.f191564a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f191565b;
        return this.f191566c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
