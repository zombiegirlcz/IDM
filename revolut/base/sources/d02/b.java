package d02;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f110281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110282c;
    public final long d;
    public final d e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f110283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f110284h;
    public final String i;

    public b(String id10, a type, long j2, long j3, d amount, boolean z, String merchantName, String operationId, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        this.f110280a = id10;
        this.f110281b = type;
        this.f110282c = j2;
        this.d = j3;
        this.e = amount;
        this.f = z;
        this.f110283g = merchantName;
        this.f110284h = operationId;
        this.i = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110280a, bVar.f110280a) && this.f110281b == bVar.f110281b && this.f110282c == bVar.f110282c && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f110283g, bVar.f110283g) && Intrinsics.f(this.f110284h, bVar.f110284h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(v7.c(a0.d.c(a0.d.c((this.f110281b.hashCode() + (this.f110280a.hashCode() * 31)) * 31, 31, this.f110282c), 31, this.d), 31, this.e), 31, this.f), 31, this.f110283g), 31, this.f110284h);
        String str = this.i;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
