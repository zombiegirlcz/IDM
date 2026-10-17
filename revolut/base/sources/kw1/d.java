package kw1;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190201b;

    public d(dj0.d initialAmount, dj0.d amount) {
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f190200a = initialAmount;
        this.f190201b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f190200a, dVar.f190200a) && Intrinsics.f(this.f190201b, dVar.f190201b);
    }

    public final int hashCode() {
        return this.f190201b.hashCode() + (this.f190200a.hashCode() * 31);
    }
}
