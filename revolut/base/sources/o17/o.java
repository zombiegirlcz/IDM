package o17;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f221330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f221331b;

    public o(n navBar, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f221330a = navBar;
        this.f221331b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f221331b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f221330a, oVar.f221330a) && Intrinsics.f(this.f221331b, oVar.f221331b);
    }

    public final int hashCode() {
        return this.f221331b.hashCode() + (this.f221330a.hashCode() * 31);
    }
}
