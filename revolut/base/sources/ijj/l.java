package ijj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f161815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f161816c;
    public final j d;

    public l(List items, k kVar, List menuItems, j twinActionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(twinActionButtonState, "twinActionButtonState");
        this.f161814a = items;
        this.f161815b = kVar;
        this.f161816c = menuItems;
        this.d = twinActionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f161814a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f161814a, lVar.f161814a) && Intrinsics.f(this.f161815b, lVar.f161815b) && Intrinsics.f(this.f161816c, lVar.f161816c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f161814a.hashCode() * 31;
        k kVar = this.f161815b;
        return this.d.hashCode() + p.a.d((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f161816c);
    }
}
