package n8i;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f213447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f213448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f213449c;

    public m0(Clause title, Clause clause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f213447a = title;
        this.f213448b = clause;
        this.f213449c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f213447a, m0Var.f213447a) && Intrinsics.f(this.f213448b, m0Var.f213448b) && Intrinsics.f(this.f213449c, m0Var.f213449c);
    }

    public final int hashCode() {
        int iHashCode = this.f213447a.hashCode() * 31;
        Clause clause = this.f213448b;
        return this.f213449c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
