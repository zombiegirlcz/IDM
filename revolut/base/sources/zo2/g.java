package zo2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323864c;

    public g(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323862a = items;
        this.f323863b = z;
        this.f323864c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f323862a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f323862a, gVar.f323862a) && this.f323863b == gVar.f323863b && this.f323864c == gVar.f323864c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f323864c) + j6.a.c(this.f323862a.hashCode() * 31, 31, this.f323863b);
    }
}
