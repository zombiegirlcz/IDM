package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10247c;
    public final Clause d;
    public final Clause e;

    public b4(MoneyClause moneyClause, Clause highClause, Clause averageClause, Clause lowClause, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(highClause, "highClause");
        Intrinsics.checkNotNullParameter(averageClause, "averageClause");
        Intrinsics.checkNotNullParameter(lowClause, "lowClause");
        this.f10245a = moneyClause;
        this.f10246b = highClause;
        this.f10247c = averageClause;
        this.d = lowClause;
        this.e = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f10245a, b4Var.f10245a) && Intrinsics.f(this.f10246b, b4Var.f10246b) && Intrinsics.f(this.f10247c, b4Var.f10247c) && Intrinsics.f(this.d, b4Var.d) && Intrinsics.f(this.e, b4Var.e);
    }

    public final int hashCode() {
        Clause clause = this.f10245a;
        int iA = p.a.a(p.a.a(p.a.a((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f10246b), 31, this.f10247c), 31, this.d);
        Clause clause2 = this.e;
        return iA + (clause2 != null ? clause2.hashCode() : 0);
    }
}
