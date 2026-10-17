package y7k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f311564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f311565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f311566c;

    public q(TextLocalisedClause submitButtonClause, CompositeClause compositeClause, boolean z) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f311564a = submitButtonClause;
        this.f311565b = compositeClause;
        this.f311566c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f311564a.equals(qVar.f311564a) && Intrinsics.f(this.f311565b, qVar.f311565b) && this.f311566c == qVar.f311566c;
    }

    public final int hashCode() {
        int iHashCode = this.f311564a.hashCode() * 31;
        Clause clause = this.f311565b;
        return Boolean.hashCode(this.f311566c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
