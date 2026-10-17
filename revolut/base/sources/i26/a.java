package i26;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157853c;
    public final String d;

    public a(String assetId, String fiatCurrency, String range) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f157851a = assetId;
        this.f157852b = fiatCurrency;
        this.f157853c = range;
        StringBuilder sbM = v0.a.m("DEFI_ASSET_CHART_", assetId, "_", fiatCurrency, "_");
        sbM.append(range);
        this.d = sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f157851a, aVar.f157851a) && Intrinsics.f(this.f157852b, aVar.f157852b) && Intrinsics.f(this.f157853c, aVar.f157853c);
    }

    public final int hashCode() {
        return this.f157853c.hashCode() + p.a.c(this.f157851a.hashCode() * 31, 31, this.f157852b);
    }
}
