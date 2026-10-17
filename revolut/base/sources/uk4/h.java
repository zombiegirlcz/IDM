package uk4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f280683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280684b;

    public h(g toolbar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280683a = toolbar;
        this.f280684b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f280684b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f280683a, hVar.f280683a) && Intrinsics.f(this.f280684b, hVar.f280684b);
    }

    public final int hashCode() {
        return this.f280684b.hashCode() + (this.f280683a.hashCode() * 31);
    }
}
