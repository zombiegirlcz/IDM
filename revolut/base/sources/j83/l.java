package j83;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f172112b;

    public l(List items, TextLocalisedQuantityClause textLocalisedQuantityClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172111a = items;
        this.f172112b = textLocalisedQuantityClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f172111a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f172111a, lVar.f172111a) && Intrinsics.f(this.f172112b, lVar.f172112b);
    }

    public final int hashCode() {
        int iHashCode = this.f172111a.hashCode() * 31;
        Clause clause = this.f172112b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
