package b6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f12798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f12799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12800c;

    public m(Clause title, CompositeClause compositeClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f12798a = title;
        this.f12799b = compositeClause;
        this.f12800c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f12798a.equals(mVar.f12798a) && Intrinsics.f(this.f12799b, mVar.f12799b) && Intrinsics.f(this.f12800c, mVar.f12800c);
    }

    public final int hashCode() {
        int iHashCode = this.f12798a.hashCode() * 31;
        Clause clause = this.f12799b;
        return p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f12800c);
    }
}
