package e8h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzg.z f123701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xzg.b0 f123702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xzg.e0 f123703c;

    public k(xzg.z assetType, xzg.b0 timeSpan, xzg.e0 mostTradedStorageStrategy) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(mostTradedStorageStrategy, "mostTradedStorageStrategy");
        this.f123701a = assetType;
        this.f123702b = timeSpan;
        this.f123703c = mostTradedStorageStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f123701a, kVar.f123701a) && this.f123702b == kVar.f123702b && this.f123703c == kVar.f123703c;
    }

    public final int hashCode() {
        return this.f123703c.hashCode() + ((this.f123702b.hashCode() + (this.f123701a.hashCode() * 31)) * 31);
    }
}
