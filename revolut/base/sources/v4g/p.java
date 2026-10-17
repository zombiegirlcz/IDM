package v4g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f286088b;

    public p(aim.e items, n price) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f286087a = items;
        this.f286088b = price;
    }

    @Override // cli.p
    public final List c() {
        return this.f286087a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f286087a, pVar.f286087a) && Intrinsics.f(this.f286088b, pVar.f286088b);
    }

    public final int hashCode() {
        return this.f286088b.hashCode() + (this.f286087a.hashCode() * 31);
    }
}
