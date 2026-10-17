package bzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f20009b;

    public n(aim.e items, l headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f20008a = items;
        this.f20009b = headerData;
    }

    @Override // cli.p
    public final List c() {
        return this.f20008a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f20008a, nVar.f20008a) && Intrinsics.f(this.f20009b, nVar.f20009b);
    }

    public final int hashCode() {
        return this.f20009b.hashCode() + (this.f20008a.hashCode() * 31);
    }
}
