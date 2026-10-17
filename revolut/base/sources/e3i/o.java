package e3i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122308b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f122307a = items;
        this.f122308b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f122307a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f122307a, oVar.f122307a) && this.f122308b == oVar.f122308b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122308b) + (this.f122307a.hashCode() * 31);
    }
}
