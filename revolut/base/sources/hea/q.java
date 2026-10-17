package hea;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f151658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f151659c;
    public final NavBarWithToolbar.b d;

    public q(AbstractList items, Clause navbarTitle, CompositeClause navbarSubtitleToolbar, NavBarWithToolbar.b navBarDescription) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbarTitle, "navbarTitle");
        Intrinsics.checkNotNullParameter(navbarSubtitleToolbar, "navbarSubtitleToolbar");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        this.f151657a = items;
        this.f151658b = navbarTitle;
        this.f151659c = navbarSubtitleToolbar;
        this.d = navBarDescription;
    }

    @Override // cli.p
    public final List c() {
        return this.f151657a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f151657a, qVar.f151657a) && this.f151658b.equals(qVar.f151658b) && this.f151659c.equals(qVar.f151659c) && this.d.equals(qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.c(this.f151659c, p.a.a(this.f151657a.hashCode() * 31, 31, this.f151658b), 31);
    }
}
