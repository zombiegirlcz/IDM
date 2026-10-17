package euj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f129624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129625b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f129624a = items;
        this.f129625b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f129624a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f129624a, lVar.f129624a) && this.f129625b == lVar.f129625b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129625b) + (this.f129624a.hashCode() * 31);
    }
}
