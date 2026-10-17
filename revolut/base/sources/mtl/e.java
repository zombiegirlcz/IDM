package mtl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f208917b;

    public e(ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208916a = menuItems;
        this.f208917b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f208917b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f208916a, eVar.f208916a) && this.f208917b.equals(eVar.f208917b);
    }

    public final int hashCode() {
        return this.f208917b.hashCode() + (this.f208916a.hashCode() * 31);
    }
}
