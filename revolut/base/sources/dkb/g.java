package dkb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115499b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f115498a = items;
        this.f115499b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f115498a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f115498a, gVar.f115498a) && this.f115499b == gVar.f115499b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115499b) + (this.f115498a.hashCode() * 31);
    }
}
