package kl4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f185284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f185285c;
    public final dj0.d d;
    public final a e;

    public b(boolean z, dj0.d minCreditLimit, dj0.d maxCreditLimit, dj0.d nonSelectableMinCreditLimit, a aVar) {
        Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
        Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
        Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
        this.f185283a = z;
        this.f185284b = minCreditLimit;
        this.f185285c = maxCreditLimit;
        this.d = nonSelectableMinCreditLimit;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f185283a == bVar.f185283a && Intrinsics.f(this.f185284b, bVar.f185284b) && Intrinsics.f(this.f185285c, bVar.f185285c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(Boolean.hashCode(this.f185283a) * 31, 31, this.f185284b), 31, this.f185285c), 31, this.d);
        a aVar = this.e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
