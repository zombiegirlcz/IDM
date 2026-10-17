package i7g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f159290b;

    public a(CompositeClause compositeClause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f159289a = title;
        this.f159290b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f159289a.equals(aVar.f159289a) && Intrinsics.f(this.f159290b, aVar.f159290b);
    }

    public final int hashCode() {
        int iHashCode = this.f159289a.hashCode() * 31;
        Clause clause = this.f159290b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
