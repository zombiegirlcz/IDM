package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d50 implements i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f163842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f163843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j50 f163844c;
    public final c50 d;

    public d50(TextClause textClause, Clause clause, j50 style, c50 position, int i) {
        textClause = (i & 1) != 0 ? null : textClause;
        clause = (i & 2) != 0 ? null : clause;
        style = (i & 4) != 0 ? j50.PENDING : style;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f163842a = textClause;
        this.f163843b = clause;
        this.f163844c = style;
        this.d = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj2;
        return Intrinsics.f(this.f163842a, d50Var.f163842a) && Intrinsics.f(this.f163843b, d50Var.f163843b) && this.f163844c == d50Var.f163844c && this.d == d50Var.d;
    }

    @Override // ip0.i50
    public final c50 getPosition() {
        return this.d;
    }

    public final int hashCode() {
        Clause clause = this.f163842a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f163843b;
        return this.d.hashCode() + ((this.f163844c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31)) * 31);
    }
}
