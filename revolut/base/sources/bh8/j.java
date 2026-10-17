package bh8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f15249b;

    public j(List items, g navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f15248a = items;
        this.f15249b = navBarConfig;
    }

    @Override // jki.n
    public final List c() {
        return this.f15248a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f15248a, jVar.f15248a) && Intrinsics.f(this.f15249b, jVar.f15249b);
    }

    public final int hashCode() {
        return this.f15249b.hashCode() + (this.f15248a.hashCode() * 31);
    }
}
