package r9a;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f252544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f252545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f252546c;

    public d(dj0.d initialAmount, dj0.d currentAmount, dj0.d minimumAmount) {
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
        Intrinsics.checkNotNullParameter(minimumAmount, "minimumAmount");
        this.f252544a = initialAmount;
        this.f252545b = currentAmount;
        this.f252546c = minimumAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f252544a, dVar.f252544a) && Intrinsics.f(this.f252545b, dVar.f252545b) && Intrinsics.f(this.f252546c, dVar.f252546c);
    }

    public final int hashCode() {
        return this.f252546c.hashCode() + v7.c(this.f252544a.hashCode() * 31, 31, this.f252545b);
    }
}
