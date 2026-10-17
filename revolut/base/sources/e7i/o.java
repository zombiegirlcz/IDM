package e7i;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f123344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f123345c;
    public final String d;
    public final List e;

    public o(List items, aw0.e actionFooter, ArrayList tabItems, String selectedTabId, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f123343a = items;
        this.f123344b = actionFooter;
        this.f123345c = tabItems;
        this.d = selectedTabId;
        this.e = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f123343a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f123343a, oVar.f123343a) && this.f123344b.equals(oVar.f123344b) && Intrinsics.f(this.f123345c, oVar.f123345c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.d(ehe.n.c(this.f123344b, this.f123343a.hashCode() * 31, 31), 31, this.f123345c), 31, this.d);
    }
}
