package i2k;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f158000b;

    public m(CompositeClause compositeClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157999a = items;
        this.f158000b = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f157999a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f157999a, mVar.f157999a) && Intrinsics.f(this.f158000b, mVar.f158000b);
    }

    public final int hashCode() {
        int iHashCode = this.f157999a.hashCode() * 31;
        Clause clause = this.f158000b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
