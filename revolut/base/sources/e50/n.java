package e50;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f122686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f122687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f122688c;

    public n(ArrayList items, List menuItems, List disclaimerItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(disclaimerItems, "disclaimerItems");
        this.f122686a = items;
        this.f122687b = menuItems;
        this.f122688c = disclaimerItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f122686a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f122686a.equals(nVar.f122686a) && Intrinsics.f(this.f122687b, nVar.f122687b) && Intrinsics.f(this.f122688c, nVar.f122688c);
    }

    public final int hashCode() {
        return this.f122688c.hashCode() + p.a.d(this.f122686a.hashCode() * 31, 31, this.f122687b);
    }
}
