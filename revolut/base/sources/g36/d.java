package g36;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f140212c;
    public final Integer d;
    public final String e;
    public final String f;

    public d(int i, Integer num, String externalAssetId, String displayName, String ticker, String iconUrl) {
        Intrinsics.checkNotNullParameter(externalAssetId, "externalAssetId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f140210a = externalAssetId;
        this.f140211b = displayName;
        this.f140212c = i;
        this.d = num;
        this.e = ticker;
        this.f = iconUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f140210a, dVar.f140210a) && Intrinsics.f(this.f140211b, dVar.f140211b) && this.f140212c == dVar.f140212c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f140212c, p.a.c(this.f140210a.hashCode() * 31, 31, this.f140211b), 31);
        Integer num = this.d;
        return this.f.hashCode() + p.a.c((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }
}
