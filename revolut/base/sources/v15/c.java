package v15;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f285227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f285228c;
    public final wi0.b d;

    public c(String pocketId, dj0.d amount, int i, wi0.b countyCode) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countyCode, "countyCode");
        this.f285226a = pocketId;
        this.f285227b = amount;
        this.f285228c = i;
        this.d = countyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f285226a, cVar.f285226a) && Intrinsics.f(this.f285227b, cVar.f285227b) && this.f285228c == cVar.f285228c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + j6.a.b(this.f285228c, v7.c(this.f285226a.hashCode() * 31, 31, this.f285227b), 31);
    }
}
