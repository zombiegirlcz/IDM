package mw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209298b;

    public p(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f209297a = items;
        this.f209298b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f209297a, pVar.f209297a) && Intrinsics.f(this.f209298b, pVar.f209298b);
    }

    public final int hashCode() {
        int iHashCode = this.f209297a.hashCode() * 31;
        Clause clause = this.f209298b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
