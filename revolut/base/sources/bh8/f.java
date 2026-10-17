package bh8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f15242b;

    public f(Data migrationAssetData, Data kycData) {
        Intrinsics.checkNotNullParameter(migrationAssetData, "migrationAssetData");
        Intrinsics.checkNotNullParameter(kycData, "kycData");
        this.f15241a = migrationAssetData;
        this.f15242b = kycData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f15241a, fVar.f15241a) && Intrinsics.f(this.f15242b, fVar.f15242b);
    }

    public final int hashCode() {
        return this.f15242b.hashCode() + (this.f15241a.hashCode() * 31);
    }
}
