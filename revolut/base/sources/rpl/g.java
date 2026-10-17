package rpl;

import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256423b;

    public g(List menuItems, List items) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256422a = menuItems;
        this.f256423b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f256422a, gVar.f256422a) && Intrinsics.f(this.f256423b, gVar.f256423b);
    }

    public final int hashCode() {
        return this.f256423b.hashCode() + (this.f256422a.hashCode() * 31);
    }
}
