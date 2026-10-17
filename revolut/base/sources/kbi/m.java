package kbi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182607b;

    public m(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182606a = items;
        this.f182607b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f182606a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f182606a, mVar.f182606a) && this.f182607b == mVar.f182607b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182607b) + (this.f182606a.hashCode() * 31);
    }
}
