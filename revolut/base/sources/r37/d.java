package r37;

import do3.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.k f251192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f251193b;

    public d(ds6.k taxTypeInfo, n user) {
        Intrinsics.checkNotNullParameter(taxTypeInfo, "taxTypeInfo");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f251192a = taxTypeInfo;
        this.f251193b = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f251192a, dVar.f251192a) && Intrinsics.f(this.f251193b, dVar.f251193b);
    }

    public final int hashCode() {
        return this.f251193b.hashCode() + (this.f251192a.hashCode() * 31);
    }
}
