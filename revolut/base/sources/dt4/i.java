package dt4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f117369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f117370b;

    public i(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f117369a = title;
        this.f117370b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f117369a.equals(iVar.f117369a) && Intrinsics.f(this.f117370b, iVar.f117370b);
    }

    public final int hashCode() {
        int iHashCode = this.f117369a.hashCode() * 31;
        Clause clause = this.f117370b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
