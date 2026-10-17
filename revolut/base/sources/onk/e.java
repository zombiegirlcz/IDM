package onk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f226956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f226957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f226958c;
    public final NavBarWithContainerBackground d;
    public final ArrayList e;

    public e(Clause title, TextClause navigationTitle, Clause clause, NavBarWithContainerBackground navBarWithContainerBackground, ArrayList menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationTitle, "navigationTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f226956a = title;
        this.f226957b = navigationTitle;
        this.f226958c = clause;
        this.d = navBarWithContainerBackground;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f226956a.equals(eVar.f226956a) && this.f226957b.equals(eVar.f226957b) && Intrinsics.f(this.f226958c, eVar.f226958c) && Intrinsics.f(this.d, eVar.d) && this.e.equals(eVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f226956a.hashCode() * 31, 31, this.f226957b);
        Clause clause = this.f226958c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.d;
        return this.e.hashCode() + ((iHashCode + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0)) * 31);
    }
}
