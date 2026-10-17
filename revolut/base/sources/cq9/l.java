package cq9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f108056c;
    public final aw0.e d;

    public l(List items, List menuItems, TextLocalisedClause title, aw0.e footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f108054a = items;
        this.f108055b = menuItems;
        this.f108056c = title;
        this.d = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f108054a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f108054a, lVar.f108054a) && Intrinsics.f(this.f108055b, lVar.f108055b) && this.f108056c.equals(lVar.f108056c) && this.d.equals(lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(p.a.d(this.f108054a.hashCode() * 31, 31, this.f108055b), 31, this.f108056c);
    }
}
