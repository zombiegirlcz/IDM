package e8e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f123647b;

    public q(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123646a = items;
        this.f123647b = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f123646a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f123646a, qVar.f123646a) && Intrinsics.f(this.f123647b, qVar.f123647b);
    }

    public final int hashCode() {
        int iHashCode = this.f123646a.hashCode() * 31;
        Clause clause = this.f123647b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
