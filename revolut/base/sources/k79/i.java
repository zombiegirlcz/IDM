package k79;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f181922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f181923c;

    public i(List items, int i, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f181921a = items;
        this.f181922b = menuItems;
        this.f181923c = i;
    }

    @Override // cli.p
    public final List c() {
        return this.f181921a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f181921a, iVar.f181921a) && Intrinsics.f(this.f181922b, iVar.f181922b) && this.f181923c == iVar.f181923c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181923c) + p.a.d(this.f181921a.hashCode() * 31, 31, this.f181922b);
    }
}
