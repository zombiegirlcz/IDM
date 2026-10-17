package xsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f308563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrk.f f308564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vrk.c f308565c;

    public g(n selectedTab, vrk.f annualSelectedBar, vrk.c quarterSelectedBar) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(annualSelectedBar, "annualSelectedBar");
        Intrinsics.checkNotNullParameter(quarterSelectedBar, "quarterSelectedBar");
        this.f308563a = selectedTab;
        this.f308564b = annualSelectedBar;
        this.f308565c = quarterSelectedBar;
    }

    public static g a(g gVar, n selectedTab, vrk.f annualSelectedBar, vrk.c quarterSelectedBar, int i) {
        if ((i & 1) != 0) {
            selectedTab = gVar.f308563a;
        }
        if ((i & 2) != 0) {
            annualSelectedBar = gVar.f308564b;
        }
        if ((i & 4) != 0) {
            quarterSelectedBar = gVar.f308565c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(annualSelectedBar, "annualSelectedBar");
        Intrinsics.checkNotNullParameter(quarterSelectedBar, "quarterSelectedBar");
        return new g(selectedTab, annualSelectedBar, quarterSelectedBar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f308563a == gVar.f308563a && Intrinsics.f(this.f308564b, gVar.f308564b) && Intrinsics.f(this.f308565c, gVar.f308565c);
    }

    public final int hashCode() {
        return this.f308565c.hashCode() + ((this.f308564b.hashCode() + (this.f308563a.hashCode() * 31)) * 31);
    }
}
