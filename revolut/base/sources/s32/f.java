package s32;

import cli.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f259401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f259403c;

    public f(String selectedTabId, ArrayList tabs, List menuItems) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f259401a = tabs;
        this.f259402b = selectedTabId;
        this.f259403c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f259401a.equals(fVar.f259401a) && Intrinsics.f(this.f259402b, fVar.f259402b) && Intrinsics.f(this.f259403c, fVar.f259403c);
    }

    public final int hashCode() {
        return this.f259403c.hashCode() + p.a.c(this.f259401a.hashCode() * 31, 31, this.f259402b);
    }
}
