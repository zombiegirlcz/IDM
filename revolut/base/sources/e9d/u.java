package e9d;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f123964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f123965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f123966c;
    public final TextLocalisedClause d;

    public u(TextClause title, aim.e items, List menuItems, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f123964a = title;
        this.f123965b = items;
        this.f123966c = menuItems;
        this.d = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f123965b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f123964a.equals(uVar.f123964a) && Intrinsics.f(this.f123965b, uVar.f123965b) && Intrinsics.f(this.f123966c, uVar.f123966c) && this.d.equals(uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f123964a.hashCode() * 31, 31, this.f123965b), 31, this.f123966c);
    }
}
