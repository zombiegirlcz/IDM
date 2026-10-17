package a9d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2416c;
    public final TextLocalisedClause d;

    public o(aim.e items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f2414a = title;
        this.f2415b = items;
        this.f2416c = menuItems;
        this.d = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f2415b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f2414a.equals(oVar.f2414a) && Intrinsics.f(this.f2415b, oVar.f2415b) && Intrinsics.f(this.f2416c, oVar.f2416c) && this.d.equals(oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f2414a.hashCode() * 31, 31, this.f2415b), 31, this.f2416c);
    }
}
