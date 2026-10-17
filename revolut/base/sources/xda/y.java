package xda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f304378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.l f304379c;
    public final io3.i d;
    public final String e;
    public final wi0.b f;

    public y(String walletId, xi0.b currency, io3.l pocketType, io3.i pocketOriginType, String str, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(pocketOriginType, "pocketOriginType");
        this.f304377a = walletId;
        this.f304378b = currency;
        this.f304379c = pocketType;
        this.d = pocketOriginType;
        this.e = str;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f304377a, yVar.f304377a) && Intrinsics.f(this.f304378b, yVar.f304378b) && this.f304379c == yVar.f304379c && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + t61.a.c(this.f304379c, h30.l.j(this.f304378b, this.f304377a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        wi0.b bVar = this.f;
        return iHashCode2 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
