package fv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f138367b;

    public m(List items, l navBar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f138366a = items;
        this.f138367b = navBar;
    }

    @Override // cli.p
    public final List c() {
        return this.f138366a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f138366a, mVar.f138366a) && Intrinsics.f(this.f138367b, mVar.f138367b);
    }

    public final int hashCode() {
        return this.f138367b.hashCode() + (this.f138366a.hashCode() * 31);
    }
}
