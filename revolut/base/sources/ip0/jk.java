package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PercentageClause f164854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f164855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164856c;
    public final ik d;
    public final float e;

    public jk(PercentageClause title, TextLocalisedClause textLocalisedClause, MoneyClause moneyClause, ik ikVar, float f) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f164854a = title;
        this.f164855b = textLocalisedClause;
        this.f164856c = moneyClause;
        this.d = ikVar;
        this.e = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jk)) {
            return false;
        }
        jk jkVar = (jk) obj2;
        return this.f164854a.equals(jkVar.f164854a) && Intrinsics.f(this.f164855b, jkVar.f164855b) && Intrinsics.f(this.f164856c, jkVar.f164856c) && Intrinsics.f(this.d, jkVar.d) && Float.compare(this.e, jkVar.e) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f164854a.hashCode() * 31;
        Clause clause = this.f164855b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f164856c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        ik ikVar = this.d;
        return Float.hashCode(this.e) + ((iHashCode3 + (ikVar != null ? ikVar.hashCode() : 0)) * 31);
    }
}
