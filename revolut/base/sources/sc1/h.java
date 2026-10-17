package sc1;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f261609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f261610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f261611c;

    public h(ArrayList items, boolean z, aim.e menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f261609a = items;
        this.f261610b = z;
        this.f261611c = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f261609a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f261609a.equals(hVar.f261609a) && this.f261610b == hVar.f261610b && Intrinsics.f(this.f261611c, hVar.f261611c);
    }

    public final int hashCode() {
        return this.f261611c.hashCode() + j6.a.c(this.f261609a.hashCode() * 31, 31, this.f261610b);
    }
}
