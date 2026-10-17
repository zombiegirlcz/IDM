package ldc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e f194056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6c.a f194057b;

    public b(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e assetType, n6c.a userCompanyEntity) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(userCompanyEntity, "userCompanyEntity");
        this.f194056a = assetType;
        this.f194057b = userCompanyEntity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f194056a == bVar.f194056a && this.f194057b == bVar.f194057b;
    }

    public final int hashCode() {
        return this.f194057b.hashCode() + (this.f194056a.hashCode() * 31);
    }
}
