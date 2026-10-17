package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f209750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f209752c;

    public i3(m3 m3Var, Clause clause, TextLocalisedClause textLocalisedClause) {
        this.f209750a = m3Var;
        this.f209751b = clause;
        this.f209752c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return this.f209750a == i3Var.f209750a && Intrinsics.f(this.f209751b, i3Var.f209751b) && Intrinsics.f(this.f209752c, i3Var.f209752c);
    }

    public final int hashCode() {
        m3 m3Var = this.f209750a;
        int iHashCode = (m3Var == null ? 0 : m3Var.hashCode()) * 31;
        Clause clause = this.f209751b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f209752c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
