package eol;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f127999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128000b;

    public g(List navBarMenuItems, List items) {
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f127999a = navBarMenuItems;
        this.f128000b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f128000b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f127999a, gVar.f127999a) && Intrinsics.f(this.f128000b, gVar.f128000b);
    }

    public final int hashCode() {
        return this.f128000b.hashCode() + (this.f127999a.hashCode() * 31);
    }
}
