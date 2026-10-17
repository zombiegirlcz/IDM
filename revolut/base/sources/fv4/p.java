package fv4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f138339b;

    public p(TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f138338a = menuItems;
        this.f138339b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f138338a, pVar.f138338a) && Intrinsics.f(this.f138339b, pVar.f138339b);
    }

    public final int hashCode() {
        int iHashCode = this.f138338a.hashCode() * 31;
        Clause clause = this.f138339b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
