package lo1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f197375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197376b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197375a = items;
        this.f197376b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f197375a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f197375a, lVar.f197375a) && this.f197376b == lVar.f197376b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197376b) + (this.f197375a.hashCode() * 31);
    }
}
