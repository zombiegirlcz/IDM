package b88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13124b;

    public f(String juniorId, String productId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f13123a = juniorId;
        this.f13124b = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f13123a, fVar.f13123a) && Intrinsics.f(this.f13124b, fVar.f13124b);
    }

    public final int hashCode() {
        return this.f13124b.hashCode() + (this.f13123a.hashCode() * 31);
    }
}
