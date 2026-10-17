package bxg;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f19692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f19693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19694c;

    public l(TextClause title, TextClause description, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f19692a = title;
        this.f19693b = description;
        this.f19694c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f19692a.equals(lVar.f19692a) && this.f19693b.equals(lVar.f19693b) && Intrinsics.f(this.f19694c, lVar.f19694c);
    }

    public final int hashCode() {
        return this.f19694c.hashCode() + v7.b(this.f19692a.hashCode() * 31, 31, this.f19693b);
    }
}
