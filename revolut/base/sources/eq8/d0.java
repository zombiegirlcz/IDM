package eq8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128374b;

    public d0(List items, List navBarMenuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f128373a = items;
        this.f128374b = navBarMenuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f128373a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f128373a, d0Var.f128373a) && Intrinsics.f(this.f128374b, d0Var.f128374b);
    }

    public final int hashCode() {
        return this.f128374b.hashCode() + (this.f128373a.hashCode() * 31);
    }
}
