package wjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bnh.b f298132a;

    public z(bnh.b roboPortfolioItem) {
        Intrinsics.checkNotNullParameter(roboPortfolioItem, "roboPortfolioItem");
        this.f298132a = roboPortfolioItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f298132a, ((z) obj2).f298132a);
    }

    public final int hashCode() {
        return this.f298132a.hashCode();
    }
}
