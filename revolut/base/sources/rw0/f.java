package rw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f257801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f257802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f257803c;

    public f(TextLocalisedClause startText, CompositeClause pointsAmount, MoneyClause moneyClause) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        this.f257801a = startText;
        this.f257802b = pointsAmount;
        this.f257803c = moneyClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f257801a.equals(fVar.f257801a) && this.f257802b.equals(fVar.f257802b) && Intrinsics.f(this.f257803c, fVar.f257803c);
    }

    public final int hashCode() {
        int iC = h30.l.c(this.f257802b, this.f257801a.hashCode() * 31, 31);
        Clause clause = this.f257803c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
