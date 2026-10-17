package z5i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f319628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f319629b;

    public a(Data legalEntityContext, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f319628a = legalEntityContext;
        this.f319629b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319628a, aVar.f319628a) && Intrinsics.f(this.f319629b, aVar.f319629b);
    }

    public final int hashCode() {
        int iHashCode = this.f319628a.hashCode() * 31;
        Clause clause = this.f319629b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
