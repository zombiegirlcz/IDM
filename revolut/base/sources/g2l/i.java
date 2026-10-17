package g2l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f140140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f140141b;

    public i(Clause clause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f140140a = title;
        this.f140141b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f140140a.equals(iVar.f140140a) && Intrinsics.f(this.f140141b, iVar.f140141b);
    }

    public final int hashCode() {
        int iHashCode = this.f140140a.hashCode() * 31;
        Clause clause = this.f140141b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
