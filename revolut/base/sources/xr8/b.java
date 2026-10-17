package xr8;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f308296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308297c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f308298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f308299h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f308300j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f308301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f308302m;

    public b(String id10, long j2, String currency, String transactionId, String transactionWalletId, String transactionPocketId, String state, long j3, String str, String str2, a sender, a recipient, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionWalletId, "transactionWalletId");
        Intrinsics.checkNotNullParameter(transactionPocketId, "transactionPocketId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f308295a = id10;
        this.f308296b = j2;
        this.f308297c = currency;
        this.d = transactionId;
        this.e = transactionWalletId;
        this.f = transactionPocketId;
        this.f308298g = state;
        this.f308299h = j3;
        this.i = str;
        this.f308300j = str2;
        this.k = sender;
        this.f308301l = recipient;
        this.f308302m = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f308295a, bVar.f308295a) && this.f308296b == bVar.f308296b && Intrinsics.f(this.f308297c, bVar.f308297c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f308298g, bVar.f308298g) && this.f308299h == bVar.f308299h && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f308300j, bVar.f308300j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f308301l, bVar.f308301l) && Intrinsics.f(this.f308302m, bVar.f308302m);
    }

    public final int hashCode() {
        int iC = d.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(d.c(this.f308295a.hashCode() * 31, 31, this.f308296b), 31, this.f308297c), 31, this.d), 31, this.e), 31, this.f), 31, this.f308298g), 31, this.f308299h);
        String str = this.i;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f308300j;
        int iHashCode2 = (this.f308301l.hashCode() + ((this.k.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        c cVar = this.f308302m;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
