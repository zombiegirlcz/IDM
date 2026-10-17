package agh;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4832b;

    public g(f navBarState, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4831a = navBarState;
        this.f4832b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f4832b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f4831a, gVar.f4831a) && Intrinsics.f(this.f4832b, gVar.f4832b);
    }

    public final int hashCode() {
        return this.f4832b.hashCode() + (this.f4831a.hashCode() * 31);
    }
}
