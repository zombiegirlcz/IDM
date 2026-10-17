package p5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f233180b;

    public r(double d, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f233179a = amount;
        this.f233180b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f233179a, rVar.f233179a) && Double.compare(this.f233180b, rVar.f233180b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f233180b) + (this.f233179a.hashCode() * 31);
    }
}
