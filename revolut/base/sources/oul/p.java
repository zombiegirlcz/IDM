package oul;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f229913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f229914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f229915c;

    public p(Clause subtitleClause, TextLocalisedClause titleClause, List menuItems) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f229913a = titleClause;
        this.f229914b = subtitleClause;
        this.f229915c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f229913a.equals(pVar.f229913a) && Intrinsics.f(this.f229914b, pVar.f229914b) && Intrinsics.f(this.f229915c, pVar.f229915c);
    }

    public final int hashCode() {
        return this.f229915c.hashCode() + p.a.a(this.f229913a.hashCode() * 31, 31, this.f229914b);
    }
}
