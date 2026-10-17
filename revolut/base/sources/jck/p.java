package jck;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f172863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f172864b;

    public p(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f172863a = title;
        this.f172864b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f172863a.equals(pVar.f172863a) && Intrinsics.f(this.f172864b, pVar.f172864b);
    }

    public final int hashCode() {
        int iHashCode = this.f172863a.hashCode() * 31;
        Clause clause = this.f172864b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
