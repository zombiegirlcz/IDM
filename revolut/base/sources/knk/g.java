package knk;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f186176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f186177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f186178c;
    public final NavBarMenuItem d;

    public g(TextClause title, TextClause textClause, TextClause toolbarTitle, NavBarMenuItem navBarMenuItem) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f186176a = title;
        this.f186177b = textClause;
        this.f186178c = toolbarTitle;
        this.d = navBarMenuItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f186176a.equals(gVar.f186176a) && this.f186177b.equals(gVar.f186177b) && this.f186178c.equals(gVar.f186178c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iB = v7.b(v7.b(this.f186176a.hashCode() * 31, 31, this.f186177b), 31, this.f186178c);
        NavBarMenuItem navBarMenuItem = this.d;
        return iB + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode());
    }
}
