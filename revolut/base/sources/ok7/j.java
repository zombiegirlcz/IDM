package ok7;

import java.util.List;
import jki.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f225924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f225926c;
    public final List d;
    public final List e;

    public j(int i, String selectedTabId, boolean z, List items, List tabs) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f225924a = i;
        this.f225925b = selectedTabId;
        this.f225926c = z;
        this.d = items;
        this.e = tabs;
    }

    @Override // jki.m
    public final o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof j)) {
            return null;
        }
        return new i(!Intrinsics.f(r5.f225925b, this.f225925b), ((j) oldState).f225924a != this.f225924a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f225924a == jVar.f225924a && Intrinsics.f(this.f225925b, jVar.f225925b) && this.f225926c == jVar.f225926c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(j6.a.c(p.a.c(Integer.hashCode(this.f225924a) * 31, 31, this.f225925b), 31, this.f225926c), 31, this.d);
    }
}
