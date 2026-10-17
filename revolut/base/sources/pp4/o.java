package pp4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f238265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f238266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlusActionNavBarMenuItem f238267c;

    public o(TextLocalisedClause title, List items, PlusActionNavBarMenuItem navBarMenuItem) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarMenuItem, "navBarMenuItem");
        this.f238265a = title;
        this.f238266b = items;
        this.f238267c = navBarMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f238266b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f238265a.equals(oVar.f238265a) && Intrinsics.f(this.f238266b, oVar.f238266b) && this.f238267c.equals(oVar.f238267c);
    }

    public final int hashCode() {
        return this.f238267c.hashCode() + p.a.d(this.f238265a.hashCode() * 31, 31, this.f238266b);
    }
}
