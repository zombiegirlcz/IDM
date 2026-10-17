package dl6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115709b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f115708a = items;
        this.f115709b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f115708a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f115708a, gVar.f115708a) && this.f115709b == gVar.f115709b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115709b) + (this.f115708a.hashCode() * 31);
    }
}
