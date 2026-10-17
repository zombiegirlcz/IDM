package nqf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218445b;

    public n(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218444a = items;
        this.f218445b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f218444a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f218444a, nVar.f218444a) && this.f218445b == nVar.f218445b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218445b) + (this.f218444a.hashCode() * 31);
    }
}
