package o27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f221526b;

    public r(TextLocalisedClause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f221525a = title;
        this.f221526b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f221525a.equals(rVar.f221525a) && Intrinsics.f(this.f221526b, rVar.f221526b);
    }

    public final int hashCode() {
        int iHashCode = this.f221525a.hashCode() * 31;
        Clause clause = this.f221526b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
