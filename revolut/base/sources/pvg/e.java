package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f240111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f240112c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f240114h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ko3.b f240115j;
    public final ko3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f240116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f240117m;

    public e(float f, iwg.a assetType, String accountTypesCombined, String currency, String asset, String quantity, String str, String str2, String str3, jo3.b value, ko3.b bVar, ko3.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(accountTypesCombined, "accountTypesCombined");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240110a = accountTypesCombined;
        this.f240111b = assetType;
        this.f240112c = z;
        this.d = currency;
        this.e = asset;
        this.f = quantity;
        this.f240113g = value;
        this.f240114h = f;
        this.i = str;
        this.f240115j = bVar;
        this.k = bVar2;
        this.f240116l = str2;
        this.f240117m = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f240110a, eVar.f240110a) && this.f240111b == eVar.f240111b && this.f240112c == eVar.f240112c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f240113g, eVar.f240113g) && Float.compare(this.f240114h, eVar.f240114h) == 0 && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f240115j, eVar.f240115j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f240116l, eVar.f240116l) && Intrinsics.f(this.f240117m, eVar.f240117m);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f240114h, wp5.y.e(this.f240113g, p.a.c(p.a.c(p.a.c(j6.a.c((this.f240111b.hashCode() + (this.f240110a.hashCode() * 31)) * 31, 31, this.f240112c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
        String str = this.i;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240115j;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ko3.b bVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.f240116l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f240117m;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
