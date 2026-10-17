package r9a;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f252550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f252551c;

    public h(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f252549a = items;
        this.f252550b = z;
        this.f252551c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f252549a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f252549a, hVar.f252549a) && this.f252550b == hVar.f252550b && Intrinsics.f(this.f252551c, hVar.f252551c);
    }

    public final int hashCode() {
        return this.f252551c.hashCode() + j6.a.c(this.f252549a.hashCode() * 31, 31, this.f252550b);
    }
}
