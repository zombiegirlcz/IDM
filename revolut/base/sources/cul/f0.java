package cul;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f109098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f109099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109100c;

    public f0(Clause titleClause, Clause clause, List menuItems) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f109098a = titleClause;
        this.f109099b = clause;
        this.f109100c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f109098a, f0Var.f109098a) && Intrinsics.f(this.f109099b, f0Var.f109099b) && Intrinsics.f(this.f109100c, f0Var.f109100c);
    }

    public final int hashCode() {
        int iHashCode = this.f109098a.hashCode() * 31;
        Clause clause = this.f109099b;
        return this.f109100c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 961);
    }
}
