package rlh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f255077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255078b;

    public z(y toolbar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255077a = toolbar;
        this.f255078b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255078b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f255077a, zVar.f255077a) && Intrinsics.f(this.f255078b, zVar.f255078b);
    }

    public final int hashCode() {
        return this.f255078b.hashCode() + (this.f255077a.hashCode() * 31);
    }

    public z() {
        this(x.f255076a, f0.f322471a);
    }
}
