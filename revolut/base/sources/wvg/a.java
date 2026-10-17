package wvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f300321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f300322c;
    public final xi0.b d;
    public final String e;

    public a(String userId, iwg.a analyticsProductType, boolean z, xi0.b currency, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f300320a = userId;
        this.f300321b = analyticsProductType;
        this.f300322c = z;
        this.d = currency;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f300320a, aVar.f300320a) && this.f300321b == aVar.f300321b && this.f300322c == aVar.f300322c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.d, j6.a.c((this.f300321b.hashCode() + (this.f300320a.hashCode() * 31)) * 31, 31, this.f300322c), 31);
        String str = this.e;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
