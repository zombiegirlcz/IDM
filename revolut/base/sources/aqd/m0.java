package aqd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f8372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f8373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tx0.l0 f8374c;

    public m0(TextLocalisedClause toolbarTitle, Clause clause, tx0.l0 headerModel) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f8372a = toolbarTitle;
        this.f8373b = clause;
        this.f8374c = headerModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f8372a.equals(m0Var.f8372a) && Intrinsics.f(this.f8373b, m0Var.f8373b) && this.f8374c.equals(m0Var.f8374c);
    }

    public final int hashCode() {
        int iHashCode = this.f8372a.hashCode() * 31;
        Clause clause = this.f8373b;
        return this.f8374c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
