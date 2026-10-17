package swe;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f266195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f266197c;
    public final yte.b d;
    public final String e;

    public a(d topUpAmount, String currency, n contextType, yte.b bVar, String str) {
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f266195a = topUpAmount;
        this.f266196b = currency;
        this.f266197c = contextType;
        this.d = bVar;
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
        return Intrinsics.f(this.f266195a, aVar.f266195a) && Intrinsics.f(this.f266196b, aVar.f266196b) && this.f266197c == aVar.f266197c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f266197c.hashCode() + p.a.c(this.f266195a.hashCode() * 31, 31, this.f266196b)) * 31;
        yte.b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
