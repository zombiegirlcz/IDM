package zzb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f326660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f326661c;
    public final List d;

    public p(List items, o headerState, aw0.i iVar, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f326659a = items;
        this.f326660b = headerState;
        this.f326661c = iVar;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f326659a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f326659a, pVar.f326659a) && Intrinsics.f(this.f326660b, pVar.f326660b) && Intrinsics.f(this.f326661c, pVar.f326661c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f326660b.hashCode() + (this.f326659a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f326661c;
        return this.d.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
