package fw4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f138573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f138574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f138575c;

    public d(dj0.d downPayment, dj0.d minDownPayment, dj0.d maxDownPayment) {
        Intrinsics.checkNotNullParameter(downPayment, "downPayment");
        Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
        Intrinsics.checkNotNullParameter(maxDownPayment, "maxDownPayment");
        this.f138573a = downPayment;
        this.f138574b = minDownPayment;
        this.f138575c = maxDownPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f138573a, dVar.f138573a) && Intrinsics.f(this.f138574b, dVar.f138574b) && Intrinsics.f(this.f138575c, dVar.f138575c);
    }

    public final int hashCode() {
        return this.f138575c.hashCode() + v7.c(this.f138573a.hashCode() * 31, 31, this.f138574b);
    }
}
