package tv4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f274704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f274705b;

    public l(CompositeClause compositeClause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f274704a = title;
        this.f274705b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f274704a.equals(lVar.f274704a) && Intrinsics.f(this.f274705b, lVar.f274705b);
    }

    public final int hashCode() {
        int iHashCode = this.f274704a.hashCode() * 31;
        Clause clause = this.f274705b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
