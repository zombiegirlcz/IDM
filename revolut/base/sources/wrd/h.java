package wrd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f299559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299560c;

    public h(aim.e items, b headerModel, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f299558a = items;
        this.f299559b = headerModel;
        this.f299560c = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f299558a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f299558a, hVar.f299558a) && Intrinsics.f(this.f299559b, hVar.f299559b) && Intrinsics.f(this.f299560c, hVar.f299560c);
    }

    public final int hashCode() {
        return this.f299560c.hashCode() + ((this.f299559b.hashCode() + (this.f299558a.hashCode() * 31)) * 31);
    }
}
