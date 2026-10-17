package na8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f213835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f213836b;

    public m(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f213835a = title;
        this.f213836b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f213835a.equals(mVar.f213835a) && Intrinsics.f(this.f213836b, mVar.f213836b);
    }

    public final int hashCode() {
        int iHashCode = this.f213835a.hashCode() * 31;
        Clause clause = this.f213836b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
