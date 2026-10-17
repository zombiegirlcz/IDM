package tsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xsk.n f274156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrk.f f274157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vrk.c f274158c;

    public h(xsk.n selectedTab, vrk.f annualSelectedBar, vrk.c quarterSelectedBar) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(annualSelectedBar, "annualSelectedBar");
        Intrinsics.checkNotNullParameter(quarterSelectedBar, "quarterSelectedBar");
        this.f274156a = selectedTab;
        this.f274157b = annualSelectedBar;
        this.f274158c = quarterSelectedBar;
    }

    public static h a(h hVar, xsk.n selectedTab, vrk.f annualSelectedBar, vrk.c quarterSelectedBar, int i) {
        if ((i & 1) != 0) {
            selectedTab = hVar.f274156a;
        }
        if ((i & 2) != 0) {
            annualSelectedBar = hVar.f274157b;
        }
        if ((i & 4) != 0) {
            quarterSelectedBar = hVar.f274158c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(annualSelectedBar, "annualSelectedBar");
        Intrinsics.checkNotNullParameter(quarterSelectedBar, "quarterSelectedBar");
        return new h(selectedTab, annualSelectedBar, quarterSelectedBar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f274156a == hVar.f274156a && Intrinsics.f(this.f274157b, hVar.f274157b) && Intrinsics.f(this.f274158c, hVar.f274158c);
    }

    public final int hashCode() {
        return this.f274158c.hashCode() + ((this.f274157b.hashCode() + (this.f274156a.hashCode() * 31)) * 31);
    }
}
