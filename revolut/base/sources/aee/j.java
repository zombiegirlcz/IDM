package aee;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f3562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f3563b;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f3562a = title;
        this.f3563b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f3562a.equals(jVar.f3562a) && Intrinsics.f(this.f3563b, jVar.f3563b);
    }

    public final int hashCode() {
        int iHashCode = this.f3562a.hashCode() * 31;
        Clause clause = this.f3563b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
