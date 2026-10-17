package ejb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f126844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f126845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f126846c;

    public f(ej0.b grossAmount, ej0.b feesAmount, ej0.b taxAmount) {
        Intrinsics.checkNotNullParameter(grossAmount, "grossAmount");
        Intrinsics.checkNotNullParameter(feesAmount, "feesAmount");
        Intrinsics.checkNotNullParameter(taxAmount, "taxAmount");
        this.f126844a = grossAmount;
        this.f126845b = feesAmount;
        this.f126846c = taxAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f126844a, fVar.f126844a) && Intrinsics.f(this.f126845b, fVar.f126845b) && Intrinsics.f(this.f126846c, fVar.f126846c);
    }

    public final int hashCode() {
        return this.f126846c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.f126845b, this.f126844a.hashCode() * 31, 31);
    }
}
