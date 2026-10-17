package f23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f131398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f131399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131400c;

    public m0(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f131398a = title;
        this.f131399b = textLocalisedClause;
        this.f131400c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f131398a.equals(m0Var.f131398a) && Intrinsics.f(this.f131399b, m0Var.f131399b) && Intrinsics.f(this.f131400c, m0Var.f131400c);
    }

    public final int hashCode() {
        int iHashCode = this.f131398a.hashCode() * 31;
        Clause clause = this.f131399b;
        return this.f131400c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
