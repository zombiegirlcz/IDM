package xf9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f305199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f305200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f305201c;
    public final int d;

    public b(int i, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f305199a = items;
        this.f305200b = z;
        this.f305201c = menuItems;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f305199a, bVar.f305199a) && this.f305200b == bVar.f305200b && Intrinsics.f(this.f305201c, bVar.f305201c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.d(j6.a.c(this.f305199a.hashCode() * 31, 31, this.f305200b), 31, this.f305201c);
    }
}
