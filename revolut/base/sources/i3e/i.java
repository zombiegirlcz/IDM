package i3e;

import aw0.e4;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4 f158193c;
    public final List d;

    public i(List items, String selectedTabId, e4 filtersState, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(filtersState, "filtersState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f158191a = items;
        this.f158192b = selectedTabId;
        this.f158193c = filtersState;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f158191a, iVar.f158191a) && Intrinsics.f(this.f158192b, iVar.f158192b) && this.f158193c == iVar.f158193c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f158193c.hashCode() + p.a.c(this.f158191a.hashCode() * 31, 31, this.f158192b)) * 31);
    }
}
