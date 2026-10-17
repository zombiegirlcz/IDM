package prh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f239025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f239026b;

    public h(int i, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f239025a = title;
        this.f239026b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f239025a.equals(hVar.f239025a) && Intrinsics.f(this.f239026b, hVar.f239026b);
    }

    public final int hashCode() {
        int iHashCode = this.f239025a.hashCode() * 961;
        Clause clause = this.f239026b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
