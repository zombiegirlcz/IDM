package bwf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19331c;

    public h(String selectedTabId, ArrayList tabs, List navBarItems) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(navBarItems, "navBarItems");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f19329a = tabs;
        this.f19330b = navBarItems;
        this.f19331c = selectedTabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f19329a.equals(hVar.f19329a) && Intrinsics.f(this.f19330b, hVar.f19330b) && Intrinsics.f(this.f19331c, hVar.f19331c);
    }

    public final int hashCode() {
        return this.f19331c.hashCode() + p.a.d(this.f19329a.hashCode() * 31, 31, this.f19330b);
    }
}
