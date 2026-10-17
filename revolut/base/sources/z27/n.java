package z27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f318988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f318989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f318990c;

    public n(TextLocalisedClause title, TextLocalisedClause caption, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f318988a = title;
        this.f318989b = caption;
        this.f318990c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f318988a.equals(nVar.f318988a) && this.f318989b.equals(nVar.f318989b) && Intrinsics.f(this.f318990c, nVar.f318990c);
    }

    public final int hashCode() {
        return this.f318990c.hashCode() + t61.a.a(this.f318988a.hashCode() * 31, 31, this.f318989b);
    }
}
