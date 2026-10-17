package o7e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f222776b;

    public i(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222775a = items;
        this.f222776b = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f222775a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f222775a, iVar.f222775a) && Intrinsics.f(this.f222776b, iVar.f222776b);
    }

    public final int hashCode() {
        int iHashCode = this.f222775a.hashCode() * 31;
        Clause clause = this.f222776b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
