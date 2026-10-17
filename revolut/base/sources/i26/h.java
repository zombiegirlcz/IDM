package i26;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157867c;

    public h(String str, String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f157865a = str;
        this.f157866b = fiatCurrency;
        this.f157867c = a0.d.s("DEFI_DEFAULT_ASSET_", str == null ? "" : str, "_", fiatCurrency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f157865a, hVar.f157865a) && Intrinsics.f(this.f157866b, hVar.f157866b);
    }

    public final int hashCode() {
        String str = this.f157865a;
        return this.f157866b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
