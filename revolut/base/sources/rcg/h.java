package rcg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f253256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f253257b;

    public h(Clause title, TextLocalisedQuantityClause textLocalisedQuantityClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f253256a = title;
        this.f253257b = textLocalisedQuantityClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f253256a, hVar.f253256a) && Intrinsics.f(this.f253257b, hVar.f253257b);
    }

    public final int hashCode() {
        int iHashCode = this.f253256a.hashCode() * 31;
        Clause clause = this.f253257b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
