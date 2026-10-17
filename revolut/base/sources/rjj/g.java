package rjj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f254686b;

    public g(List items, d navBarConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f254685a = items;
        this.f254686b = navBarConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f254685a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f254685a, gVar.f254685a) && Intrinsics.f(this.f254686b, gVar.f254686b);
    }

    public final int hashCode() {
        return this.f254686b.hashCode() + (this.f254685a.hashCode() * 31);
    }
}
