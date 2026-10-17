package me1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204596b;

    public f(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f204595a = items;
        this.f204596b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f204595a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204595a, fVar.f204595a) && Intrinsics.f(this.f204596b, fVar.f204596b);
    }

    public final int hashCode() {
        return this.f204596b.hashCode() + (this.f204595a.hashCode() * 31);
    }
}
