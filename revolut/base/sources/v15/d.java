package v15;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f285230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f285231c;

    public d(dj0.d amount, String pocketId, wi0.b countyCode) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countyCode, "countyCode");
        this.f285229a = pocketId;
        this.f285230b = amount;
        this.f285231c = countyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f285229a, dVar.f285229a) && Intrinsics.f(this.f285230b, dVar.f285230b) && Intrinsics.f(this.f285231c, dVar.f285231c);
    }

    public final int hashCode() {
        return this.f285231c.f297794a.hashCode() + v7.c(this.f285229a.hashCode() * 31, 31, this.f285230b);
    }
}
