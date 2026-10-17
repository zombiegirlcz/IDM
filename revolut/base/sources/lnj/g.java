package lnj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f197273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f197274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197275c;

    public g(Clause clause, TextLocalisedClause textLocalisedClause, boolean z) {
        this.f197273a = textLocalisedClause;
        this.f197274b = clause;
        this.f197275c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f197273a, gVar.f197273a) && Intrinsics.f(this.f197274b, gVar.f197274b) && this.f197275c == gVar.f197275c;
    }

    public final int hashCode() {
        Clause clause = this.f197273a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f197274b;
        return Boolean.hashCode(this.f197275c) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
