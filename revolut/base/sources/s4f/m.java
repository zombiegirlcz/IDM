package s4f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f259862b;

    public m(List items, l navBar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f259861a = items;
        this.f259862b = navBar;
    }

    @Override // cli.p
    public final List c() {
        return this.f259861a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f259861a, mVar.f259861a) && Intrinsics.f(this.f259862b, mVar.f259862b);
    }

    public final int hashCode() {
        return this.f259862b.hashCode() + (this.f259861a.hashCode() * 31);
    }
}
