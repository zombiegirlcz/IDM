package wnc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f298812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f298813b;

    public s(TextLocalisedClause title, TextClause textClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f298812a = title;
        this.f298813b = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f298812a.equals(sVar.f298812a) && Intrinsics.f(this.f298813b, sVar.f298813b);
    }

    public final int hashCode() {
        int iHashCode = this.f298812a.hashCode() * 31;
        Clause clause = this.f298813b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
