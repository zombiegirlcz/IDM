package su4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f265652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarMenuItem f265653c;
    public final boolean d;

    public /* synthetic */ l(List list) {
        this(list, null, null, false);
    }

    @Override // cli.p
    public final List c() {
        return this.f265651a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f265651a, lVar.f265651a) && Intrinsics.f(this.f265652b, lVar.f265652b) && Intrinsics.f(this.f265653c, lVar.f265653c) && this.d == lVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f265651a.hashCode() * 31;
        Clause clause = this.f265652b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        NavBarMenuItem navBarMenuItem = this.f265653c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0)) * 31);
    }

    public l(List items, TextLocalisedClause textLocalisedClause, LabelNavBarMenuItem labelNavBarMenuItem, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265651a = items;
        this.f265652b = textLocalisedClause;
        this.f265653c = labelNavBarMenuItem;
        this.d = z;
    }
}
