package azd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11445b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f11444a = items;
        this.f11445b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f11444a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f11444a, gVar.f11444a) && this.f11445b == gVar.f11445b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11445b) + (this.f11444a.hashCode() * 31);
    }
}
