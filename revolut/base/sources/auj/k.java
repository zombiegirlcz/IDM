package auj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9849b;

    public k(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f9848a = items;
        this.f9849b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f9848a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f9848a, kVar.f9848a) && Intrinsics.f(this.f9849b, kVar.f9849b);
    }

    public final int hashCode() {
        return this.f9849b.hashCode() + (this.f9848a.hashCode() * 31);
    }
}
