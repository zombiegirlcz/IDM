package x84;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f303285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f303286b;

    public n(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f303285a = z;
        this.f303286b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f303286b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f303285a == nVar.f303285a && Intrinsics.f(this.f303286b, nVar.f303286b);
    }

    public final int hashCode() {
        return this.f303286b.hashCode() + (Boolean.hashCode(this.f303285a) * 31);
    }
}
