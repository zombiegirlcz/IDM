package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10380c;

    public ja(Clause topLabel, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        this.f10378a = topLabel;
        this.f10379b = clause;
        this.f10380c = clause2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static ja a(ja jaVar, TextLocalisedClause topLabel) {
        ?? r06 = jaVar.f10379b;
        Clause clause = jaVar.f10380c;
        jaVar.getClass();
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        return new ja(topLabel, r06, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj2;
        return this.f10378a.equals(jaVar.f10378a) && this.f10379b.equals(jaVar.f10379b) && Intrinsics.f(this.f10380c, jaVar.f10380c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f10378a.hashCode() * 31, 31, this.f10379b);
        Clause clause = this.f10380c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
