package cm9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f25171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f25172c;
    public final List d;

    public i(TextLocalisedClause title, TextLocalisedClause description, List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f25170a = items;
        this.f25171b = title;
        this.f25172c = description;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f25170a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25170a, iVar.f25170a) && this.f25171b.equals(iVar.f25171b) && this.f25172c.equals(iVar.f25172c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f25170a.hashCode() * 31, 31, this.f25171b), 31, this.f25172c);
    }
}
