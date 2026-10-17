package sba;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261519b;

    public d(dj0.d initialAmount, dj0.d currentAmount) {
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
        this.f261518a = initialAmount;
        this.f261519b = currentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261518a, dVar.f261518a) && Intrinsics.f(this.f261519b, dVar.f261519b);
    }

    public final int hashCode() {
        return this.f261519b.hashCode() + (this.f261518a.hashCode() * 31);
    }
}
