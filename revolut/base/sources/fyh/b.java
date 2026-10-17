package fyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f138996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f138997c;
    public final xi0.b d;
    public final String e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cyh.c f138998g;

    public b(String recurringPaymentId, boolean z, long j2, xi0.b currency, String destinationPocketId, xi0.b destinationPocketCurrency, cyh.c cVar) {
        Intrinsics.checkNotNullParameter(recurringPaymentId, "recurringPaymentId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(destinationPocketId, "destinationPocketId");
        Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
        this.f138995a = recurringPaymentId;
        this.f138996b = z;
        this.f138997c = j2;
        this.d = currency;
        this.e = destinationPocketId;
        this.f = destinationPocketCurrency;
        this.f138998g = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138995a, bVar.f138995a) && this.f138996b == bVar.f138996b && this.f138997c == bVar.f138997c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f138998g, bVar.f138998g);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f, p.a.c(h30.l.j(this.d, a0.d.c(j6.a.c(this.f138995a.hashCode() * 31, 31, this.f138996b), 31, this.f138997c), 31), 31, this.e), 31);
        cyh.c cVar = this.f138998g;
        return iJ + (cVar == null ? 0 : cVar.hashCode());
    }
}
