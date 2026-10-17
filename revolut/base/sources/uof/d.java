package uof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f281649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f281650b;

    public d(double d, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f281649a = d;
        this.f281650b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Double.compare(this.f281649a, dVar.f281649a) == 0 && Intrinsics.f(this.f281650b, dVar.f281650b);
    }

    public final int hashCode() {
        return this.f281650b.hashCode() + (Double.hashCode(this.f281649a) * 31);
    }
}
