package as1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8770b;

    public n(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f8769a = items;
        this.f8770b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f8769a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f8769a.equals(nVar.f8769a) && this.f8770b == nVar.f8770b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8770b) + (this.f8769a.hashCode() * 31);
    }
}
