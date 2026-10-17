package mw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f209338c;

    public k(Clause clause, TextLocalisedClause textLocalisedClause, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f209336a = id10;
        this.f209337b = clause;
        this.f209338c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f209336a, kVar.f209336a) && Intrinsics.f(this.f209337b, kVar.f209337b) && Intrinsics.f(this.f209338c, kVar.f209338c);
    }

    public final int hashCode() {
        int iHashCode = this.f209336a.hashCode() * 31;
        Clause clause = this.f209337b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f209338c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
