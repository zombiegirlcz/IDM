package vzk;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f293556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f293557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f293558c;

    public n(k nextButtonState, Clause clause, List items) {
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f293556a = nextButtonState;
        this.f293557b = clause;
        this.f293558c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f293558c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f293556a, nVar.f293556a) && Intrinsics.f(this.f293557b, nVar.f293557b) && Intrinsics.f(this.f293558c, nVar.f293558c);
    }

    public final int hashCode() {
        int iHashCode = this.f293556a.hashCode() * 31;
        Clause clause = this.f293557b;
        return this.f293558c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
