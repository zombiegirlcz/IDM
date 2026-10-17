package jxi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f179236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f179237c;

    public y(aim.e items, x navBarState, w wVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f179235a = items;
        this.f179236b = navBarState;
        this.f179237c = wVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f179235a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f179235a, yVar.f179235a) && Intrinsics.f(this.f179236b, yVar.f179236b) && Intrinsics.f(this.f179237c, yVar.f179237c);
    }

    public final int hashCode() {
        int iHashCode = (this.f179236b.hashCode() + (this.f179235a.hashCode() * 31)) * 31;
        w wVar = this.f179237c;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }
}
