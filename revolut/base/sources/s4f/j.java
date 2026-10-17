package s4f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f259857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259859c;

    public j(TextClause textClause, Clause clause, boolean z) {
        this.f259857a = textClause;
        this.f259858b = clause;
        this.f259859c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f259857a.equals(jVar.f259857a) && Intrinsics.f(this.f259858b, jVar.f259858b) && this.f259859c == jVar.f259859c;
    }

    public final int hashCode() {
        int iHashCode = this.f259857a.hashCode() * 31;
        Clause clause = this.f259858b;
        return Boolean.hashCode(this.f259859c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
