package k8d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f182118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f182119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f182120c;
    public final TextLocalisedClause d;

    public m(aim.e items, Clause title, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f182118a = title;
        this.f182119b = items;
        this.f182120c = menuItems;
        this.d = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f182119b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f182118a, mVar.f182118a) && Intrinsics.f(this.f182119b, mVar.f182119b) && Intrinsics.f(this.f182120c, mVar.f182120c) && this.d.equals(mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f182118a.hashCode() * 31, 31, this.f182119b), 31, this.f182120c);
    }
}
