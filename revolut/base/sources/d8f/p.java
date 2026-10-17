package d8f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f112251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f112252b;

    public p(TextLocalisedClause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f112251a = title;
        this.f112252b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f112251a.equals(pVar.f112251a) && Intrinsics.f(this.f112252b, pVar.f112252b);
    }

    public final int hashCode() {
        int iHashCode = this.f112251a.hashCode() * 31;
        Clause clause = this.f112252b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
