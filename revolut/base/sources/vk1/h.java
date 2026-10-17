package vk1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f289852c;
    public final Clause d;
    public final List e;

    public h(List pagerItems, String str, Clause scanTabClause, Clause showCodeTabClause, List menuItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(scanTabClause, "scanTabClause");
        Intrinsics.checkNotNullParameter(showCodeTabClause, "showCodeTabClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f289850a = pagerItems;
        this.f289851b = str;
        this.f289852c = scanTabClause;
        this.d = showCodeTabClause;
        this.e = menuItems;
    }

    @Override // oki.a
    public final List W() {
        return this.f289850a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f289850a, hVar.f289850a) && Intrinsics.f(this.f289851b, hVar.f289851b) && Intrinsics.f(this.f289852c, hVar.f289852c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f289850a.hashCode() * 31;
        String str = this.f289851b;
        return this.e.hashCode() + p.a.a(p.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f289852c), 31, this.d);
    }

    @Override // oki.a
    public final String z() {
        return this.f289851b;
    }
}
