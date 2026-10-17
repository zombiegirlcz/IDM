package ara;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f8616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f8617c;

    public r(aim.e items, n navbar, h buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f8615a = items;
        this.f8616b = navbar;
        this.f8617c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f8615a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f8615a, rVar.f8615a) && Intrinsics.f(this.f8616b, rVar.f8616b) && Intrinsics.f(this.f8617c, rVar.f8617c);
    }

    public final int hashCode() {
        return this.f8617c.hashCode() + ((this.f8616b.hashCode() + (this.f8615a.hashCode() * 31)) * 31);
    }
}
