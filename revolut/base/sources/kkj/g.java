package kkj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f185073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f185074b;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f185073a = title;
        this.f185074b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f185073a.equals(gVar.f185073a) && Intrinsics.f(this.f185074b, gVar.f185074b);
    }

    public final int hashCode() {
        int iHashCode = this.f185073a.hashCode() * 31;
        Clause clause = this.f185074b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
