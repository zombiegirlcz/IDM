package mfl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfl.a f205028b;

    public i(String portfolioId, kfl.a assetType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f205027a = portfolioId;
        this.f205028b = assetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205027a, iVar.f205027a) && this.f205028b == iVar.f205028b;
    }

    public final int hashCode() {
        return this.f205028b.hashCode() + (this.f205027a.hashCode() * 31);
    }
}
