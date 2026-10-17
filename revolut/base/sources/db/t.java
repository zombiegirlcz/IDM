package db;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f112631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112632c;
    public final List d;
    public final String e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f112633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112634h;

    public t(List items, s toolbarState, boolean z, List tabs, String selectedTabId, Integer num, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f112630a = items;
        this.f112631b = toolbarState;
        this.f112632c = z;
        this.d = tabs;
        this.e = selectedTabId;
        this.f = num;
        this.f112633g = i;
        this.f112634h = z3;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if ((oldState instanceof t ? (t) oldState : null) == null) {
            return null;
        }
        return new p(!Intrinsics.f(this.f, r3.f));
    }

    @Override // cli.p
    public final List c() {
        return this.f112630a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f112630a, tVar.f112630a) && Intrinsics.f(this.f112631b, tVar.f112631b) && this.f112632c == tVar.f112632c && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && this.f112633g == tVar.f112633g && this.f112634h == tVar.f112634h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(j6.a.c((this.f112631b.hashCode() + (this.f112630a.hashCode() * 31)) * 31, 31, this.f112632c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.f112634h) + j6.a.b(this.f112633g, (iC + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "UIState(items=" + this.f112630a + ", toolbarState=" + this.f112631b + ", showTabs=" + this.f112632c + ", tabs=" + this.d + ", selectedTabId=" + this.e + ", positionToScroll=" + this.f + ", largeActionButtonVisible=" + this.f112633g + ", largeActionButtonEnabled=" + this.f112634h + ")";
    }
}
