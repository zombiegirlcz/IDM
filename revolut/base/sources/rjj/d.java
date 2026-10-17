package rjj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f254680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f254681b;

    public d(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f254680a = title;
        this.f254681b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f254680a.equals(dVar.f254680a) && Intrinsics.f(this.f254681b, dVar.f254681b);
    }

    public final int hashCode() {
        int iHashCode = this.f254680a.hashCode() * 31;
        Clause clause = this.f254681b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
