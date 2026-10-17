package udi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f279214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f279215b;

    public l(ArrayList items, MoneyClause moneyClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f279214a = items;
        this.f279215b = moneyClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f279214a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f279214a.equals(lVar.f279214a) && Intrinsics.f(this.f279215b, lVar.f279215b);
    }

    public final int hashCode() {
        int iHashCode = this.f279214a.hashCode() * 31;
        Clause clause = this.f279215b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
