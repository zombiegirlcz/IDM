package ss4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f265281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f265283c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    public k(xi0.b currency, dj0.d dVar, dj0.d remainingTotalAmount, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        this.f265281a = currency;
        this.f265282b = dVar;
        this.f265283c = remainingTotalAmount;
        this.d = dVar2;
        this.e = dVar3;
        this.f = dVar4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f265281a, kVar.f265281a) && Intrinsics.f(this.f265282b, kVar.f265282b) && Intrinsics.f(this.f265283c, kVar.f265283c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f265281a.hashCode() * 31;
        dj0.d dVar = this.f265282b;
        int iC = v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f265283c);
        dj0.d dVar2 = this.d;
        int iHashCode2 = (iC + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }
}
