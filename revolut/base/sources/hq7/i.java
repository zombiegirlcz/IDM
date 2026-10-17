package hq7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f154615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154616c;

    public i(TextLocalisedClause title, List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f154614a = items;
        this.f154615b = title;
        this.f154616c = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f154614a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154614a, iVar.f154614a) && this.f154615b.equals(iVar.f154615b) && Intrinsics.f(this.f154616c, iVar.f154616c);
    }

    public final int hashCode() {
        return this.f154616c.hashCode() + t61.a.a(this.f154614a.hashCode() * 31, 31, this.f154615b);
    }
}
