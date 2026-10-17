package k1g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180255c;

    public l(j navigation, String selectedTabId, List menuItems) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f180253a = navigation;
        this.f180254b = selectedTabId;
        this.f180255c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f180253a, lVar.f180253a) && Intrinsics.f(this.f180254b, lVar.f180254b) && Intrinsics.f(this.f180255c, lVar.f180255c);
    }

    public final int hashCode() {
        return this.f180255c.hashCode() + p.a.c(this.f180253a.f180252a.hashCode() * 31, 31, this.f180254b);
    }
}
