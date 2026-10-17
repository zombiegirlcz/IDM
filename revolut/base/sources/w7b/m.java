package w7b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f295502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f295503b;

    public m(TextClause textClause, TextClause textClause2) {
        this.f295502a = textClause;
        this.f295503b = textClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f295502a, mVar.f295502a) && Intrinsics.f(this.f295503b, mVar.f295503b);
    }

    public final int hashCode() {
        Clause clause = this.f295502a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f295503b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
