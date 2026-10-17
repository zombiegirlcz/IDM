package h2j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f148838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f148839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148840c;

    public j(Clause clause, TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f148838a = text;
        this.f148839b = clause;
        this.f148840c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f148838a.equals(jVar.f148838a) && Intrinsics.f(this.f148839b, jVar.f148839b) && this.f148840c == jVar.f148840c;
    }

    public final int hashCode() {
        int iHashCode = this.f148838a.hashCode() * 31;
        Clause clause = this.f148839b;
        return Boolean.hashCode(this.f148840c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
