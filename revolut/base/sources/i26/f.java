package i26;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157864c;

    public f(String assetId, String fiatCurrency) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f157862a = assetId;
        this.f157863b = fiatCurrency;
        this.f157864c = a0.d.s("DEFI_ASSET_DETAILS_", assetId, "_", fiatCurrency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f157862a, fVar.f157862a) && Intrinsics.f(this.f157863b, fVar.f157863b);
    }

    public final int hashCode() {
        return this.f157863b.hashCode() + (this.f157862a.hashCode() * 31);
    }
}
