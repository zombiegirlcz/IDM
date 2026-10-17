package c55;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f21469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f21470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f21471c;
    public final b95.a d;

    public y(b95.a product, dj0.d dVar, dj0.d currentAmount, LocalDate newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f21469a = newDate;
        this.f21470b = dVar;
        this.f21471c = currentAmount;
        this.d = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f21469a, yVar.f21469a) && Intrinsics.f(this.f21470b, yVar.f21470b) && Intrinsics.f(this.f21471c, yVar.f21471c) && this.d == yVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f21469a.hashCode() * 31;
        dj0.d dVar = this.f21470b;
        return this.d.hashCode() + v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f21471c);
    }
}
