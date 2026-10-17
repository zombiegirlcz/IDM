package ich;

import aw0.e4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f160281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f160282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f160283c;
    public final Clause d;
    public final e4 e;

    public p(Clause clause, TextClause textClause, TextLocalisedClause textLocalisedClause, e4 e4Var) {
        Boolean bool = Boolean.TRUE;
        this.f160281a = clause;
        this.f160282b = textClause;
        this.f160283c = bool;
        this.d = textLocalisedClause;
        this.e = e4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f160281a, pVar.f160281a) && Intrinsics.f(this.f160282b, pVar.f160282b) && Intrinsics.f(this.f160283c, pVar.f160283c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e;
    }

    public final int hashCode() {
        Clause clause = this.f160281a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f160282b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Boolean bool = this.f160283c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        e4 e4Var = this.e;
        return iHashCode4 + (e4Var != null ? e4Var.hashCode() : 0);
    }
}
