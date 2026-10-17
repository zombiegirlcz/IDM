package hzb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157135b;

    public v(List list) {
        this(zhm.f0.f322471a, list);
    }

    @Override // cli.p
    public final List c() {
        return this.f157135b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f157134a, vVar.f157134a) && Intrinsics.f(this.f157135b, vVar.f157135b);
    }

    public final int hashCode() {
        return this.f157135b.hashCode() + (this.f157134a.hashCode() * 31);
    }

    public v(List menuItems, List items) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157134a = menuItems;
        this.f157135b = items;
    }
}
