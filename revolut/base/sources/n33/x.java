package n33;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f211850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f211851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f211852c;

    public x(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f211850a = title;
        this.f211851b = textLocalisedClause;
        this.f211852c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f211850a.equals(xVar.f211850a) && Intrinsics.f(this.f211851b, xVar.f211851b) && Intrinsics.f(this.f211852c, xVar.f211852c);
    }

    public final int hashCode() {
        int iHashCode = this.f211850a.hashCode() * 31;
        Clause clause = this.f211851b;
        return this.f211852c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
