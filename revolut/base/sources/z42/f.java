package z42;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f319310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f319311c;
    public final Clause d;

    public /* synthetic */ f(String str, TextClause textClause, int i) {
        this(str, null, (i & 4) != 0 ? null : textClause, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f319309a, fVar.f319309a) && Intrinsics.f(this.f319310b, fVar.f319310b) && Intrinsics.f(this.f319311c, fVar.f319311c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f319309a.hashCode() * 31;
        Clause clause = this.f319310b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f319311c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return iHashCode3 + (clause3 != null ? clause3.hashCode() : 0);
    }

    public f(String name, TextLocalisedClause textLocalisedClause, Clause clause, TextClause textClause) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f319309a = name;
        this.f319310b = textLocalisedClause;
        this.f319311c = clause;
        this.d = textClause;
    }
}
