package g6a;

import cli.p;
import cli.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140912c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public l(List items, ArrayList arrayList, String selectedTab, String searchQuery, boolean z, boolean z3, int i) {
        List tabs = arrayList;
        tabs = (i & 2) != 0 ? f0.f322471a : tabs;
        selectedTab = (i & 4) != 0 ? "" : selectedTab;
        searchQuery = (i & 8) != 0 ? "" : searchQuery;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f140910a = items;
        this.f140911b = tabs;
        this.f140912c = selectedTab;
        this.d = searchQuery;
        this.e = z;
        this.f = z3;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof l)) {
            return null;
        }
        l lVar = (l) oldState;
        return new k(!Intrinsics.f(lVar.f140912c, this.f140912c), !Intrinsics.f(lVar.d, this.d));
    }

    @Override // cli.p
    public final List c() {
        return this.f140910a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140910a, lVar.f140910a) && Intrinsics.f(this.f140911b, lVar.f140911b) && Intrinsics.f(this.f140912c, lVar.f140912c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(p.a.c(p.a.c(p.a.d(this.f140910a.hashCode() * 31, 31, this.f140911b), 31, this.f140912c), 31, this.d), 31, this.e);
    }
}
