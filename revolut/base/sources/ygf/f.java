package ygf;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313651b;

    public f(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f313650a = items;
        this.f313651b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f313650a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f313650a, fVar.f313650a) && Intrinsics.f(this.f313651b, fVar.f313651b);
    }

    public final int hashCode() {
        return this.f313651b.hashCode() + (this.f313650a.hashCode() * 31);
    }
}
